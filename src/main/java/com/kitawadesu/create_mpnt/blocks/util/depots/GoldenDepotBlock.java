package com.kitawadesu.create_mpnt.blocks.util.depots;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.kitawadesu.create_mpnt.blocks.entities.util.depots.GoldenDepotBlockEntity;
import com.kitawadesu.create_mpnt.blocks.entities.util.depots.ZincDepotBlockEntity;
import com.simibubi.create.content.logistics.depot.DepotBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class GoldenDepotBlock extends DepotBlock {
    public GoldenDepotBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @Override
    public BlockEntityType<? extends GoldenDepotBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.GOLDEN_DEPOT.get();
    }
}
