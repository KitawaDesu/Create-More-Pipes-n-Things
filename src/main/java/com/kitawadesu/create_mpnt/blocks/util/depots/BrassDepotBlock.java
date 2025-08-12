package com.kitawadesu.create_mpnt.blocks.util.depots;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.kitawadesu.create_mpnt.blocks.entities.util.depots.BrassDepotBlockEntity;
import com.simibubi.create.content.logistics.depot.DepotBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class BrassDepotBlock extends DepotBlock {
    public BrassDepotBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @Override
    public BlockEntityType<? extends BrassDepotBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.BRASS_DEPOT.get();
    }
}
