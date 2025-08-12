package com.kitawadesu.create_mpnt.util.mixins;

import com.kitawadesu.create_mpnt.blocks.CreateMPNTBlocks;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.kinetics.belt.BeltBlock;
import com.simibubi.create.content.kinetics.belt.BeltBlockEntity;
import com.simibubi.create.content.kinetics.belt.BeltHelper;
import com.simibubi.create.content.kinetics.belt.BeltSlope;
import com.simibubi.create.content.kinetics.belt.behaviour.DirectBeltInputBehaviour;
import com.simibubi.create.content.kinetics.belt.transport.BeltInventory;
import com.simibubi.create.content.kinetics.belt.transport.BeltTunnelInteractionHandler;
import com.simibubi.create.content.kinetics.belt.transport.TransportedItemStack;
import com.simibubi.create.content.logistics.tunnel.BeltTunnelBlock;
import com.simibubi.create.content.logistics.tunnel.BeltTunnelBlockEntity;
import com.simibubi.create.content.logistics.tunnel.BrassTunnelBlock;
import com.simibubi.create.content.logistics.tunnel.BrassTunnelBlockEntity;
import com.simibubi.create.content.redstone.displayLink.DisplayLinkBlock;
import com.simibubi.create.content.redstone.displayLink.source.AccumulatedItemCountDisplaySource;
import com.simibubi.create.foundation.blockEntity.behaviour.BlockEntityBehaviour;
import net.createmod.catnip.data.Iterate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(BeltTunnelInteractionHandler.class)
public class BeltTunnelInteractionHandlerMixin {
    @Overwrite
    public static boolean flapTunnelsAndCheckIfStuck(BeltInventory beltInventory, TransportedItemStack current,
                                                     float nextOffset) {

        BeltBlockEntity belt = ((BeltInventoryAccessor) beltInventory).getBelt();
        boolean positive = ((BeltInventoryAccessor) beltInventory).isBeltMovementPositive();

        int currentSegment = (int) current.beltPosition;
        int upcomingSegment = (int) nextOffset;

        Direction movementFacing = belt.getMovementFacing();
        if (!positive && nextOffset == 0)
            upcomingSegment = -1;
        if (currentSegment == upcomingSegment)
            return false;

        if (stuckAtTunnel(beltInventory, upcomingSegment, current.stack, movementFacing)) {
            current.beltPosition = currentSegment + (positive ? .99f : .01f);
            return true;
        }

        Level world = belt.getLevel();
        boolean onServer = !world.isClientSide || belt.isVirtual();
        boolean removed = false;
        BeltTunnelBlockEntity nextTunnel = getTunnelOnSegment(beltInventory, upcomingSegment);
        int transferred = current.stack.getCount();

        if (nextTunnel instanceof BrassTunnelBlockEntity brassTunnel) {
            if (brassTunnel.hasDistributionBehaviour()) {
                if (!brassTunnel.canTakeItems())
                    return true;
                if (onServer) {
                    brassTunnel.setStackToDistribute(current.stack, movementFacing.getOpposite());
                    current.stack = ItemStack.EMPTY;
                    belt.notifyUpdate();
                }
                removed = true;
            }
        } else if (nextTunnel != null) {
            BlockState blockState = nextTunnel.getBlockState();
            if (current.stack.getCount() > 1 && isRecognizedTunnelBlock(blockState)
                    && BeltTunnelBlock.isJunction(blockState)
                    && movementFacing.getAxis() == blockState.getValue(BeltTunnelBlock.HORIZONTAL_AXIS)) {

                for (Direction d : Iterate.horizontalDirections) {
                    if (d.getAxis() == blockState.getValue(BeltTunnelBlock.HORIZONTAL_AXIS))
                        continue;
                    if (!nextTunnel.flaps.containsKey(d))
                        continue;
                    BlockPos outpos = nextTunnel.getBlockPos()
                            .below()
                            .relative(d);
                    if (!world.isLoaded(outpos))
                        return true;
                    DirectBeltInputBehaviour behaviour =
                            BlockEntityBehaviour.get(world, outpos, DirectBeltInputBehaviour.TYPE);
                    if (behaviour == null)
                        continue;
                    if (!behaviour.canInsertFromSide(d))
                        continue;

                    ItemStack toinsert = current.stack.copyWithCount(1);
                    if (!behaviour.handleInsertion(toinsert, d, false)
                            .isEmpty())
                        return true;
                    if (onServer)
                        flapTunnel(beltInventory, upcomingSegment, d, false);

                    current.stack.shrink(1);
                    belt.notifyUpdate();
                    if (current.stack.getCount() <= 1)
                        break;
                }
            }
        }

        if (onServer) {
            flapTunnel(beltInventory, currentSegment, movementFacing, false);
            flapTunnel(beltInventory, upcomingSegment, movementFacing.getOpposite(), true);

            if (nextTunnel != null)
                DisplayLinkBlock.sendToGatherers(world, nextTunnel.getBlockPos(),
                        (dgte, b) -> b.itemReceived(dgte, transferred), AccumulatedItemCountDisplaySource.class);
        }

        if (removed)
            return true;

        return false;
    }

    @Shadow
    public static boolean stuckAtTunnel(BeltInventory beltInventory, int offset, ItemStack stack,
                                        Direction movementDirection) {
        BeltBlockEntity belt = ((BeltInventoryAccessor) beltInventory).getBelt();
        BlockPos pos = BeltHelper.getPositionForOffset(belt, offset)
                .above();
        if (!(belt.getLevel()
                .getBlockState(pos)
                .getBlock() instanceof BrassTunnelBlock))
            return false;
        BlockEntity be = belt.getLevel()
                .getBlockEntity(pos);
        if (be == null || !(be instanceof BrassTunnelBlockEntity tunnel))
            return false;
        return !tunnel.canInsert(movementDirection.getOpposite(), stack);
    }

    @Shadow
    public static void flapTunnel(BeltInventory beltInventory, int offset, Direction side, boolean inward) {
        BeltTunnelBlockEntity be = getTunnelOnSegment(beltInventory, offset);
        if (be == null)
            return;
        be.flap(side, inward);
    }

    @Shadow
    protected static BeltTunnelBlockEntity getTunnelOnSegment(BeltInventory beltInventory, int offset) {
        BeltBlockEntity belt = ((BeltInventoryAccessor) beltInventory).getBelt();
        if (belt.getBlockState()
                .getValue(BeltBlock.SLOPE) != BeltSlope.HORIZONTAL)
            return null;
        return getTunnelOnPosition(belt.getLevel(), BeltHelper.getPositionForOffset(belt, offset));
    }

    @Shadow
    public static BeltTunnelBlockEntity getTunnelOnPosition(Level world, BlockPos pos) {
        pos = pos.above();
        if (!(world.getBlockState(pos)
                .getBlock() instanceof BeltTunnelBlock))
            return null;
        BlockEntity be = world.getBlockEntity(pos);
        if (be == null || !(be instanceof BeltTunnelBlockEntity))
            return null;
        return ((BeltTunnelBlockEntity) be);
    }

    // Replace this with whatever logic you need
    private static boolean isRecognizedTunnelBlock(BlockState state) {
        return AllBlocks.ANDESITE_TUNNEL.has(state)
                || state.is(CreateMPNTBlocks.NORMAL_NETHERITE_TUNNEL.get())
                || state.is(CreateMPNTBlocks.NORMAL_BRASS_TUNNEL.get())
                || state.is(CreateMPNTBlocks.NORMAL_COPPER_TUNNEL.get())
                || state.is(CreateMPNTBlocks.NORMAL_GOLDEN_TUNNEL.get())
                || state.is(CreateMPNTBlocks.NORMAL_IRON_TUNNEL.get())
                || state.is(CreateMPNTBlocks.NORMAL_ZINC_TUNNEL.get());
    }
}
