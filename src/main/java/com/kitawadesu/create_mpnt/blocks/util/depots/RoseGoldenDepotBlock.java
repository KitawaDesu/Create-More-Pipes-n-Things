package com.kitawadesu.create_mpnt.blocks.util.depots;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.kitawadesu.create_mpnt.blocks.entities.util.depots.IronDepotBlockEntity;
import com.kitawadesu.create_mpnt.blocks.entities.util.depots.RoseGoldenDepotBlockEntity;
import com.simibubi.create.content.logistics.depot.DepotBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class RoseGoldenDepotBlock extends DepotBlock {
    public RoseGoldenDepotBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @Override
    public BlockEntityType<? extends RoseGoldenDepotBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.ROSE_GOLDEN_DEPOT.get();
    }
}
