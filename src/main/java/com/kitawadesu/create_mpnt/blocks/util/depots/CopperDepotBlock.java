package com.kitawadesu.create_mpnt.blocks.util.depots;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.kitawadesu.create_mpnt.blocks.entities.util.depots.CopperDepotBlockEntity;
import com.kitawadesu.create_mpnt.blocks.entities.util.depots.GoldenDepotBlockEntity;
import com.simibubi.create.content.logistics.depot.DepotBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class CopperDepotBlock extends DepotBlock {
    public CopperDepotBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @Override
    public BlockEntityType<? extends CopperDepotBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.COPPER_DEPOT.get();
    }
}
