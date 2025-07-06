package com.kitawadesu.create_mpnt.blocks.util.tanks.gold;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.kitawadesu.create_mpnt.blocks.entities.util.tanks.GoldenFluidTankBlockEntity;
import com.simibubi.create.content.fluids.tank.FluidTankBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class GoldenFluidTankBlock extends FluidTankBlock {
    public static GoldenFluidTankBlock regular(Properties p_i48440_1_) {
        return new GoldenFluidTankBlock(p_i48440_1_, false);
    }

    private boolean creative;

    protected GoldenFluidTankBlock(Properties p_i48440_1_, boolean creative) {
        super(p_i48440_1_, creative);
        this.creative = creative;
        registerDefaultState(defaultBlockState().setValue(TOP, true)
                .setValue(BOTTOM, true)
                .setValue(SHAPE, Shape.WINDOW));
    }

    @Override
    public BlockEntityType<? extends GoldenFluidTankBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.GOLDEN_FLUID_TANK.get();
    }
}
