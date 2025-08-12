package com.kitawadesu.create_mpnt.blocks.entities.util.depots;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.simibubi.create.AllBlockEntityTypes;
import com.simibubi.create.content.logistics.depot.DepotBehaviour;
import com.simibubi.create.content.logistics.depot.DepotBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

public class ZincDepotBlockEntity extends DepotBlockEntity {

    DepotBehaviour depotBehaviour;

    public ZincDepotBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(
                Capabilities.ItemHandler.BLOCK,
                CreateMPNTBlockEntities.ZINC_DEPOT.get(),
                (be, context) -> be.depotBehaviour.itemHandler
        );
    }
}
