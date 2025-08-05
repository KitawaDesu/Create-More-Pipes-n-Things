package com.kitawadesu.create_mpnt.compat.blocks.util.tanks.pyral;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.kitawadesu.create_mpnt.compat.blocks.entities.util.tanks.entity.PyralFluidTankBlockEntity;
import com.simibubi.create.content.fluids.tank.FluidTankBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class PyralFluidTankBlock extends FluidTankBlock {
    public static PyralFluidTankBlock regular(Properties p_i48440_1_) {
        return new PyralFluidTankBlock(p_i48440_1_, false);
    }

    private boolean creative;

    protected PyralFluidTankBlock(Properties p_i48440_1_, boolean creative) {
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
            if (be instanceof PyralFluidTankBlockEntity netheriteTank)
                netheriteTank.updateConnectivity();
        });
    }

    @Override
    public BlockEntityType<? extends PyralFluidTankBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.PYRAL_FLUID_TANK.get();
    }
}
