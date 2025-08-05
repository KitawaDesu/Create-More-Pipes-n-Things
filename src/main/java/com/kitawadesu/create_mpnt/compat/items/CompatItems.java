package com.kitawadesu.create_mpnt.compat.items;

import com.kitawadesu.create_mpnt.CreateMPNT;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

public class CompatItems {

    private static final CreateRegistrate REGISTRATE = CreateMPNT.registrate();

    // Define your items here
    public static final ItemEntry<Item> ROSE_GOLDEN_SHEET = REGISTRATE.item("rose_golden_sheet", Item::new)
            .register();

    public static final ItemEntry<Item> ROSARITE_SHEET = REGISTRATE.item("rosarite_sheet", Item::new)
            .properties(Item.Properties::fireResistant)
            .register();

    public static final ItemEntry<Item> VALKYRUM_NUGGET = REGISTRATE.item("valkyrum_nugget", Item::new)
            .register();

    public static final ItemEntry<Item> VALKYRUM_SHEET = REGISTRATE.item("valkyrum_sheet", Item::new)
            .register();

    public static final ItemEntry<Item> PYRAL_NUGGET = REGISTRATE.item("pyral_nugget", Item::new)
            .properties(Item.Properties::fireResistant)
            .register();

    public static final ItemEntry<Item> PYRAL_SHEET = REGISTRATE.item("pyral_sheet", Item::new)
            .properties(Item.Properties::fireResistant)
            .register();

    // Force class load and static initialization
    public static void register() {
    }
}

