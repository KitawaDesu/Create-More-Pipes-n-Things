package com.kitawadesu.create_mpnt.blocks.util.depots;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.kitawadesu.create_mpnt.blocks.entities.util.depots.BrassDepotBlockEntity;
import com.kitawadesu.create_mpnt.blocks.entities.util.depots.NetheriteDepotBlockEntity;
import com.simibubi.create.content.logistics.depot.DepotBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class NetheriteDepotBlock extends DepotBlock {
    public NetheriteDepotBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @Override
    public BlockEntityType<? extends NetheriteDepotBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.NETHERITE_DEPOT.get();
    }
}
