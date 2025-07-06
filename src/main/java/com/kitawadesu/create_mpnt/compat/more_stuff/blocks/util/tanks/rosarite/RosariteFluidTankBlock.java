package com.kitawadesu.create_mpnt.compat.more_stuff.blocks.util.tanks.rosarite;

import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.entities.MoreStuffCompatBlockEntities;
import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.entities.util.tanks.RosariteFluidTankBlockEntity;
import com.simibubi.create.content.fluids.tank.FluidTankBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class RosariteFluidTankBlock extends FluidTankBlock {
    public static RosariteFluidTankBlock regular(Properties p_i48440_1_) {
        return new RosariteFluidTankBlock(p_i48440_1_, false);
    }

    private boolean creative;

    protected RosariteFluidTankBlock(Properties p_i48440_1_, boolean creative) {
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
            if (be instanceof RosariteFluidTankBlockEntity netheriteTank)
                netheriteTank.updateConnectivity();
        });
    }

    @Override
    public BlockEntityType<? extends RosariteFluidTankBlockEntity> getBlockEntityType() {
        return MoreStuffCompatBlockEntities.ROSARITE_FLUID_TANK.get();
    }
}
