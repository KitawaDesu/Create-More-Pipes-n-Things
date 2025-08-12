package com.kitawadesu.create_mpnt.blocks.util.depots;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.kitawadesu.create_mpnt.blocks.entities.util.depots.GoldenDepotBlockEntity;
import com.kitawadesu.create_mpnt.blocks.entities.util.depots.IronDepotBlockEntity;
import com.simibubi.create.content.logistics.depot.DepotBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class IronDepotBlock extends DepotBlock {
    public IronDepotBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @Override
    public BlockEntityType<? extends IronDepotBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.IRON_DEPOT.get();
    }
}
