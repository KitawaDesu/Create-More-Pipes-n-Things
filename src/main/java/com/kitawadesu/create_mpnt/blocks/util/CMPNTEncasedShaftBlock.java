package com.kitawadesu.create_mpnt.blocks.util;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.simibubi.create.AllBlockEntityTypes;
import com.simibubi.create.content.kinetics.base.KineticBlockEntity;
import com.simibubi.create.content.kinetics.simpleRelays.encased.EncasedShaftBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public class CMPNTEncasedShaftBlock extends EncasedShaftBlock {
    public CMPNTEncasedShaftBlock(Properties properties, Supplier<Block> casing) {
        super(properties, casing);
    }

    @Override
    public BlockEntityType<? extends KineticBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.CMPNT_ENCASED_SHAFT.get();
    }
}
