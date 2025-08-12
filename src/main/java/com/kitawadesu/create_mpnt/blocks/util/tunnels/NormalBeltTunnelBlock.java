package com.kitawadesu.create_mpnt.blocks.util.tunnels;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.simibubi.create.content.logistics.tunnel.BeltTunnelBlock;
import com.simibubi.create.content.logistics.tunnel.BeltTunnelBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class NormalBeltTunnelBlock extends BeltTunnelBlock {


    public NormalBeltTunnelBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntityType<? extends BeltTunnelBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.NORMAL_TUNNEL.get();
    }
}
