package com.kitawadesu.create_mpnt.blocks.util.depots;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.kitawadesu.create_mpnt.blocks.entities.util.depots.ZincDepotBlockEntity;
import com.simibubi.create.content.logistics.depot.DepotBlock;
import com.simibubi.create.content.logistics.depot.DepotBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ZincDepotBlock extends DepotBlock {
    public ZincDepotBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @Override
    public BlockEntityType<? extends ZincDepotBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.ZINC_DEPOT.get();
    }
}
