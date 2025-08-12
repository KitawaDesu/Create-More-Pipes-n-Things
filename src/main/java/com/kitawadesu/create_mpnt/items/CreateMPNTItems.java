package com.kitawadesu.create_mpnt.items;

import com.kitawadesu.create_mpnt.CreateMPNT;
import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.Create;
import com.simibubi.create.content.kinetics.gearbox.VerticalGearboxItem;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreateMPNTItems {

    private static final CreateRegistrate REGISTRATE = CreateMPNT.registrate();

    // Define your items here
    public static final ItemEntry<Item> ZINC_SHEET = REGISTRATE.item("zinc_sheet", Item::new)
            .register();
    public static final ItemEntry<Item> ANDESITE_ALLOY_SHEET = REGISTRATE.item("andesite_alloy_sheet", Item::new)
            .register();
    public static final ItemEntry<Item> NETHERITE_SHEET = REGISTRATE.item("netherite_sheet", Item::new)
            .properties(Item.Properties::fireResistant)
            .register();

    // Additional item definitions go here...

    // Force class load and static initialization
    public static void register() {
    }
}

