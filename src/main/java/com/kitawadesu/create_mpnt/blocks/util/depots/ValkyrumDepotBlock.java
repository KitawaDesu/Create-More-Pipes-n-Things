package com.kitawadesu.create_mpnt.blocks.util.depots;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.kitawadesu.create_mpnt.blocks.entities.util.depots.NetheriteDepotBlockEntity;
import com.kitawadesu.create_mpnt.blocks.entities.util.depots.ValkyrumDepotBlockEntity;
import com.simibubi.create.content.logistics.depot.DepotBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ValkyrumDepotBlock extends DepotBlock {
    public ValkyrumDepotBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @Override
    public BlockEntityType<? extends ValkyrumDepotBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.VALKYRUM_DEPOT.get();
    }
}
