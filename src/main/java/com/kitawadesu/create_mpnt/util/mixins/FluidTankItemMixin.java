package com.kitawadesu.create_mpnt.util.mixins;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.simibubi.create.AllBlockEntityTypes;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.api.connectivity.ConnectivityHandler;
import com.simibubi.create.content.equipment.symmetryWand.SymmetryWandItem;
import com.simibubi.create.content.fluids.tank.FluidTankBlock;
import com.simibubi.create.content.fluids.tank.FluidTankBlockEntity;
import com.simibubi.create.content.fluids.tank.FluidTankItem;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.fml.ModList;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(FluidTankItem.class)
public class FluidTankItemMixin extends BlockItem {

    public FluidTankItemMixin(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public InteractionResult place(BlockPlaceContext ctx) {
        InteractionResult initialResult = super.place(ctx);
        if (!initialResult.consumesAction())
            return initialResult;
        tryMultiPlace(ctx);
        return initialResult;
    }


    private void tryMultiPlace(BlockPlaceContext ctx) {
        Player player = ctx.getPlayer();
        if (player == null)
            return;
        if (player.isShiftKeyDown())
            return;
        Direction face = ctx.getClickedFace();
        if (!face.getAxis()
                .isVertical())
            return;
        ItemStack stack = ctx.getItemInHand();
        Level world = ctx.getLevel();
        BlockPos pos = ctx.getClickedPos();
        BlockPos placedOnPos = pos.relative(face.getOpposite());
        BlockState placedOnState = world.getBlockState(placedOnPos);

        if (!FluidTankBlock.isTank(placedOnState))
            return;
        if (SymmetryWandItem.presentInHotbar(player))
            return;
        boolean creative = getBlock().equals(AllBlocks.CREATIVE_FLUID_TANK.get());
        FluidTankBlockEntity tankAt = null;

        if (creative) {
            tankAt = ConnectivityHandler.partAt(AllBlockEntityTypes.CREATIVE_FLUID_TANK.get(), world, placedOnPos);
        } else {
            tankAt = ConnectivityHandler.partAt(AllBlockEntityTypes.FLUID_TANK.get(), world, placedOnPos);
            if (tankAt == null)
                tankAt = ConnectivityHandler.partAt(CreateMPNTBlockEntities.ZINC_FLUID_TANK.get(), world, placedOnPos);
            if (tankAt == null)
                tankAt = ConnectivityHandler.partAt(CreateMPNTBlockEntities.GOLDEN_FLUID_TANK.get(), world, placedOnPos);
            if (tankAt == null)
                tankAt = ConnectivityHandler.partAt(CreateMPNTBlockEntities.ANDESITE_FLUID_TANK.get(), world, placedOnPos);
            if (tankAt == null)
                tankAt = ConnectivityHandler.partAt(CreateMPNTBlockEntities.BRASS_FLUID_TANK.get(), world, placedOnPos);
            if (tankAt == null)
                tankAt = ConnectivityHandler.partAt(CreateMPNTBlockEntities.IRON_FLUID_TANK.get(), world, placedOnPos);
            if (tankAt == null)
                tankAt = ConnectivityHandler.partAt(CreateMPNTBlockEntities.NETHERITE_FLUID_TANK.get(), world, placedOnPos);
            if (tankAt == null)
                tankAt = ConnectivityHandler.partAt(CreateMPNTBlockEntities.ROSE_GOLDEN_FLUID_TANK.get(), world, placedOnPos);
            if (tankAt == null)
                tankAt = ConnectivityHandler.partAt(CreateMPNTBlockEntities.ROSARITE_FLUID_TANK.get(), world, placedOnPos);
            if (tankAt == null)
                tankAt = ConnectivityHandler.partAt(CreateMPNTBlockEntities.VALKYRUM_FLUID_TANK.get(), world, placedOnPos);
            if (tankAt == null)
                tankAt = ConnectivityHandler.partAt(CreateMPNTBlockEntities.PYRAL_FLUID_TANK.get(), world, placedOnPos);
        }
        if (tankAt == null)
            return;
        FluidTankBlockEntity controllerBE = tankAt.getControllerBE();
        if (controllerBE == null)
            return;

        int width = controllerBE.getWidth();
        if (width == 1)
            return;

        int tanksToPlace = 0;
        BlockPos startPos = face == Direction.DOWN ? controllerBE.getBlockPos()
                .below()
                : controllerBE.getBlockPos()
                .above(controllerBE.getHeight());

        if (startPos.getY() != pos.getY())
            return;

        for (int xOffset = 0; xOffset < width; xOffset++) {
            for (int zOffset = 0; zOffset < width; zOffset++) {
                BlockPos offsetPos = startPos.offset(xOffset, 0, zOffset);
                BlockState blockState = world.getBlockState(offsetPos);
                if (FluidTankBlock.isTank(blockState))
                    continue;
                if (!blockState.canBeReplaced())
                    return;
                tanksToPlace++;
            }
        }

        if (!player.isCreative() && stack.getCount() < tanksToPlace)
            return;

        for (int xOffset = 0; xOffset < width; xOffset++) {
            for (int zOffset = 0; zOffset < width; zOffset++) {
                BlockPos offsetPos = startPos.offset(xOffset, 0, zOffset);
                BlockState blockState = world.getBlockState(offsetPos);
                if (FluidTankBlock.isTank(blockState))
                    continue;
                BlockPlaceContext context = BlockPlaceContext.at(ctx, offsetPos, face);
                player.getPersistentData()
                        .putBoolean("SilenceTankSound", true);
                super.place(context);
                player.getPersistentData()
                        .remove("SilenceTankSound");
            }
        }
    }
}
