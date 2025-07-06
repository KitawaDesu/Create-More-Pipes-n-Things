package com.kitawadesu.create_mpnt.blocks.util;

import com.kitawadesu.create_mpnt.CreateMPNT;
import com.simibubi.create.Create;
import com.simibubi.create.foundation.block.connected.AllCTTypes;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.block.connected.CTSpriteShifter;
import com.simibubi.create.foundation.block.connected.CTType;
import net.createmod.catnip.data.Couple;
import net.createmod.catnip.render.SpriteShiftEntry;
import net.createmod.catnip.render.SpriteShifter;

public class MPNTSpriteShifts {

    public static final CTSpriteShiftEntry
            ZINC_FLUID_TANK = getCT(AllCTTypes.RECTANGLE, "zinc/zinc_fluid_tank"),
            ZINC_FLUID_TANK_TOP = getCT(AllCTTypes.RECTANGLE, "zinc/zinc_fluid_tank_top"),
            ZINC_FLUID_TANK_INNER = getCT(AllCTTypes.RECTANGLE, "zinc/zinc_fluid_tank_inner"),

            GOLDEN_FLUID_TANK = getCT(AllCTTypes.RECTANGLE, "gold/golden_fluid_tank"),
            GOLDEN_FLUID_TANK_TOP = getCT(AllCTTypes.RECTANGLE, "gold/golden_fluid_tank_top"),
            GOLDEN_FLUID_TANK_INNER = getCT(AllCTTypes.RECTANGLE, "gold/golden_fluid_tank_inner"),

            ANDESITE_FLUID_TANK = getCT(AllCTTypes.RECTANGLE, "andesite/andesite_fluid_tank"),
            ANDESITE_FLUID_TANK_TOP = getCT(AllCTTypes.RECTANGLE, "andesite/andesite_fluid_tank_top"),
            ANDESITE_FLUID_TANK_INNER = getCT(AllCTTypes.RECTANGLE, "andesite/andesite_fluid_tank_inner"),

            BRASS_FLUID_TANK = getCT(AllCTTypes.RECTANGLE, "brass/brass_fluid_tank"),
            BRASS_FLUID_TANK_TOP = getCT(AllCTTypes.RECTANGLE, "brass/brass_fluid_tank_top"),
            BRASS_FLUID_TANK_INNER = getCT(AllCTTypes.RECTANGLE, "brass/brass_fluid_tank_inner"),

    IRON_FLUID_TANK = getCT(AllCTTypes.RECTANGLE, "iron/iron_fluid_tank"),
            IRON_FLUID_TANK_TOP = getCT(AllCTTypes.RECTANGLE, "iron/iron_fluid_tank_top"),
            IRON_FLUID_TANK_INNER = getCT(AllCTTypes.RECTANGLE, "iron/iron_fluid_tank_inner"),

            NETHERITE_FLUID_TANK = getCT(AllCTTypes.RECTANGLE, "netherite/netherite_fluid_tank"),
            NETHERITE_FLUID_TANK_TOP = getCT(AllCTTypes.RECTANGLE, "netherite/netherite_fluid_tank_top"),
            NETHERITE_FLUID_TANK_INNER = getCT(AllCTTypes.RECTANGLE, "netherite/netherite_fluid_tank_inner");

    private static Couple<CTSpriteShiftEntry> vault(String name) {
        final String prefixed = "block/vault/vault_" + name;
        return Couple.createWithContext(
                medium -> CTSpriteShifter.getCT(AllCTTypes.RECTANGLE, Create.asResource(prefixed + "_small"),
                        Create.asResource(medium ? prefixed + "_medium" : prefixed + "_large")));
    }

    //

    private static CTSpriteShiftEntry omni(String name) {
        return getCT(AllCTTypes.OMNIDIRECTIONAL, name);
    }

    private static CTSpriteShiftEntry horizontal(String name) {
        return getCT(AllCTTypes.HORIZONTAL, name);
    }

    private static CTSpriteShiftEntry vertical(String name) {
        return getCT(AllCTTypes.VERTICAL, name);
    }

    //

    private static SpriteShiftEntry get(String originalLocation, String targetLocation) {
        return SpriteShifter.get(Create.asResource(originalLocation), Create.asResource(targetLocation));
    }

    private static CTSpriteShiftEntry getCT(CTType type, String blockTextureName, String connectedTextureName) {
        return CTSpriteShifter.getCT(type, CreateMPNT.asResource("block/tank/" + blockTextureName),
                CreateMPNT.asResource("block/tank/" + connectedTextureName + "_connected"));
    }

    private static CTSpriteShiftEntry getCT(CTType type, String blockTextureName) {
        return getCT(type, blockTextureName, blockTextureName);
    }

}
