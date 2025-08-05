package com.kitawadesu.create_mpnt.blocks.util.pumps;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.simibubi.create.content.fluids.pump.PumpBlock;
import com.simibubi.create.content.fluids.pump.PumpBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class GoldPumpBlock extends PumpBlock {
    public GoldPumpBlock(Properties p_i48415_1_) {
        super(p_i48415_1_);
    }

    @Override
    public BlockEntityType<? extends PumpBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.GOLDEN_MECHANICAL_PUMP.get();
    }
}
