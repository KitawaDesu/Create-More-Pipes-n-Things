package com.kitawadesu.create_mpnt.blocks.util.tanks.iron;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.kitawadesu.create_mpnt.blocks.entities.util.tanks.IronFluidTankBlockEntity;
import com.kitawadesu.create_mpnt.blocks.entities.util.tanks.ZincFluidTankBlockEntity;
import com.simibubi.create.content.fluids.tank.FluidTankBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class IronFluidTankBlock extends FluidTankBlock {
    public static IronFluidTankBlock regular(Properties p_i48440_1_) {
        return new IronFluidTankBlock(p_i48440_1_, false);
    }

    private boolean creative;

    protected IronFluidTankBlock(Properties p_i48440_1_, boolean creative) {
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
            if (be instanceof IronFluidTankBlockEntity ironTank)
                ironTank.updateConnectivity();
        });
    }

    @Override
    public BlockEntityType<? extends IronFluidTankBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.IRON_FLUID_TANK.get();
    }
}
