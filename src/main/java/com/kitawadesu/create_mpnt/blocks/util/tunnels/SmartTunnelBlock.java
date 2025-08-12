package com.kitawadesu.create_mpnt.blocks.util.tunnels;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.simibubi.create.content.logistics.tunnel.BeltTunnelBlockEntity;
import com.simibubi.create.content.logistics.tunnel.BrassTunnelBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class SmartTunnelBlock extends BrassTunnelBlock {
    public SmartTunnelBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntityType<? extends BeltTunnelBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.SMART_TUNNEL.get();
    }
}
