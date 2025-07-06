package com.kitawadesu.create_mpnt.compat.more_stuff.blocks.util.tanks.rose_gold;

import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.entities.MoreStuffCompatBlockEntities;
import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.entities.util.tanks.RoseGoldenFluidTankBlockEntity;
import com.simibubi.create.content.fluids.tank.FluidTankBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class RoseGoldenFluidTankBlock extends FluidTankBlock {
    public static RoseGoldenFluidTankBlock regular(Properties p_i48440_1_) {
        return new RoseGoldenFluidTankBlock(p_i48440_1_, false);
    }

    private boolean creative;

    protected RoseGoldenFluidTankBlock(Properties p_i48440_1_, boolean creative) {
        super(p_i48440_1_, creative);
        this.creative = creative;
        registerDefaultState(defaultBlockState().setValue(TOP, true)
                .setValue(BOTTOM, true)
                .setValue(SHAPE, Shape.WINDOW));
    }

    @Override
    public BlockEntityType<? extends RoseGoldenFluidTankBlockEntity> getBlockEntityType() {
        return MoreStuffCompatBlockEntities.ROSE_GOLDEN_FLUID_TANK.get();
    }
}
