package com.kitawadesu.create_mpnt.blocks.util.tanks.Netherite;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.kitawadesu.create_mpnt.blocks.entities.util.tanks.entity.NetheriteFluidTankBlockEntity;
import com.simibubi.create.content.fluids.tank.FluidTankBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class NetheriteFluidTankBlock extends FluidTankBlock {
    public static NetheriteFluidTankBlock regular(Properties p_i48440_1_) {
        return new NetheriteFluidTankBlock(p_i48440_1_, false);
    }

    private boolean creative;

    protected NetheriteFluidTankBlock(Properties p_i48440_1_, boolean creative) {
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
            if (be instanceof NetheriteFluidTankBlockEntity netheriteTank)
                netheriteTank.updateConnectivity();
        });
    }

    @Override
    public BlockEntityType<? extends NetheriteFluidTankBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.NETHERITE_FLUID_TANK.get();
    }
}
