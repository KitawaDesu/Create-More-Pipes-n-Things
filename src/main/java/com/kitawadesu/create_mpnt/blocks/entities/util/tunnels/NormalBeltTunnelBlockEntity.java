package com.kitawadesu.create_mpnt.blocks.entities.util.tunnels;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.simibubi.create.AllBlockEntityTypes;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.logistics.tunnel.BeltTunnelBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.items.IItemHandler;

public class NormalBeltTunnelBlockEntity extends BeltTunnelBlockEntity {
    public NormalBeltTunnelBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(
                Capabilities.ItemHandler.BLOCK,
                CreateMPNTBlockEntities.NORMAL_TUNNEL.get(),
                (be, context) ->  {
                    if (be.cap == null) {
                        if (AllBlocks.BELT.has(be.level.getBlockState(be.worldPosition.below()))) {
                            BlockEntity beBelow = be.level.getBlockEntity(be.worldPosition.below());
                            if (beBelow != null) {
                                IItemHandler capBelow = be.level.getCapability(Capabilities.ItemHandler.BLOCK, be.worldPosition.below(), Direction.UP);
                                if (capBelow != null) {
                                    be.cap = capBelow;
                                }
                            }
                        }
                    }
                    return be.cap;
                }
        );
    }
}
