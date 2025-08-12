package com.kitawadesu.create_mpnt.blocks.entities.util.depots;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.simibubi.create.content.logistics.depot.DepotBehaviour;
import com.simibubi.create.content.logistics.depot.DepotBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

public class BrassDepotBlockEntity extends DepotBlockEntity {

    DepotBehaviour depotBehaviour;

    public BrassDepotBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(
                Capabilities.ItemHandler.BLOCK,
                CreateMPNTBlockEntities.BRASS_DEPOT.get(),
                (be, context) -> be.depotBehaviour.itemHandler
        );
    }
}
