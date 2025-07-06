package com.kitawadesu.create_mpnt.compat.more_stuff.items;

import com.kitawadesu.create_mpnt.CreateMPNT;
import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MoreStuffCompatItems {

    private static final CreateRegistrate REGISTRATE = CreateMPNT.registrate();

    // Define your items here
    public static final ItemEntry<Item> ROSE_GOLDEN_SHEET = REGISTRATE.item("rose_golden_sheet", Item::new)
            .register();
    public static final ItemEntry<Item> ROSARITE_SHEET = REGISTRATE.item("rosarite_sheet", Item::new)
            .properties(Item.Properties::fireResistant)
            .register();

    // Additional item definitions go here...

    // Force class load and static initialization
    public static void register() {
    }
}

