package com.kitawadesu.create_mpnt.compat.blocks.util.pumps;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.simibubi.create.content.fluids.pump.PumpBlock;
import com.simibubi.create.content.fluids.pump.PumpBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class PyralPumpBlock extends PumpBlock {
    public PyralPumpBlock(Properties p_i48415_1_) {
        super(p_i48415_1_);
    }

    @Override
    public BlockEntityType<? extends PumpBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.PYRAL_MECHANICAL_PUMP.get();
    }
}
