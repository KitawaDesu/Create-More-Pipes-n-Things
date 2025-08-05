package com.kitawadesu.create_mpnt.compat.blocks.util.tanks.valkyrum;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.kitawadesu.create_mpnt.compat.blocks.entities.util.tanks.entity.ValkyrumFluidTankBlockEntity;
import com.simibubi.create.content.fluids.tank.FluidTankBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class ValkyrumFluidTankBlock extends FluidTankBlock {
    public static ValkyrumFluidTankBlock regular(Properties p_i48440_1_) {
        return new ValkyrumFluidTankBlock(p_i48440_1_, false);
    }

    private boolean creative;

    protected ValkyrumFluidTankBlock(Properties p_i48440_1_, boolean creative) {
        super(p_i48440_1_, creative);
        this.creative = creative;
        registerDefaultState(defaultBlockState().setValue(TOP, true)
                .setValue(BOTTOM, true)
                .setValue(SHAPE, Shape.WINDOW));
    }

    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean moved) {
        if (oldState.getBlock() == state.getBlock())
            return;
        if (moved)
            return;
        withBlockEntityDo(world, pos, be -> {
            if (be instanceof ValkyrumFluidTankBlockEntity netheriteTank)
                netheriteTank.updateConnectivity();
        });
    }

    @Override
    public BlockEntityType<? extends ValkyrumFluidTankBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.VALKYRUM_FLUID_TANK.get();
    }
}
