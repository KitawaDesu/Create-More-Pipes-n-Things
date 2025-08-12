package com.kitawadesu.create_mpnt.util.mixins;

import com.simibubi.create.content.logistics.depot.DepotBlock;
import com.simibubi.create.content.logistics.funnel.BeltFunnelBlock;
import com.simibubi.create.content.logistics.funnel.FunnelBlock;
import com.simibubi.create.content.logistics.funnel.FunnelItem;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(FunnelItem.class)
public class FunnelItemMixin extends BlockItem {

    public FunnelItemMixin(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    protected BlockState getPlacementState(BlockPlaceContext ctx) {
        Level world = ctx.getLevel();
        BlockPos pos = ctx.getClickedPos();
        BlockPos belowPos = pos.below();
        BlockState belowState = world.getBlockState(belowPos);

        BlockState state = super.getPlacementState(ctx);
        if (state == null)
            return null;

        // Cancel placement only if facing is UP and the block below is a DepotBlock
        if (state.hasProperty(FunnelBlock.FACING)
                && state.getValue(FunnelBlock.FACING) == Direction.UP || state.getValue(FunnelBlock.FACING) == Direction.DOWN
                && belowState.getBlock() instanceof DepotBlock) {
            return null;
        }

        Direction direction = state.getValue(FunnelBlock.FACING);
        FunnelBlock block = (FunnelBlock) getBlock();
        Block beltFunnelBlock = block.getEquivalentBeltFunnel(world, pos, state).getBlock();
        BlockState equivalentBeltFunnel = beltFunnelBlock.getStateForPlacement(ctx)
                .setValue(BeltFunnelBlock.HORIZONTAL_FACING, direction);
        if (BeltFunnelBlock.isOnValidBelt(equivalentBeltFunnel, world, pos))
            return equivalentBeltFunnel;

        return state;
    }
}
