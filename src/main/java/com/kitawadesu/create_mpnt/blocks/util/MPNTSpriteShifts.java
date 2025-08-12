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
            ZINC_FLUID_TANK = getCTTank(AllCTTypes.RECTANGLE, "zinc/zinc_fluid_tank"),
            ZINC_FLUID_TANK_TOP = getCTTank(AllCTTypes.RECTANGLE, "zinc/zinc_fluid_tank_top"),
            ZINC_FLUID_TANK_INNER = getCTTank(AllCTTypes.RECTANGLE, "zinc/zinc_fluid_tank_inner"),

            GOLDEN_FLUID_TANK = getCTTank(AllCTTypes.RECTANGLE, "gold/golden_fluid_tank"),
            GOLDEN_FLUID_TANK_TOP = getCTTank(AllCTTypes.RECTANGLE, "gold/golden_fluid_tank_top"),
            GOLDEN_FLUID_TANK_INNER = getCTTank(AllCTTypes.RECTANGLE, "gold/golden_fluid_tank_inner"),

            ANDESITE_FLUID_TANK = getCTTank(AllCTTypes.RECTANGLE, "andesite/andesite_fluid_tank"),
            ANDESITE_FLUID_TANK_TOP = getCTTank(AllCTTypes.RECTANGLE, "andesite/andesite_fluid_tank_top"),
            ANDESITE_FLUID_TANK_INNER = getCTTank(AllCTTypes.RECTANGLE, "andesite/andesite_fluid_tank_inner"),

            BRASS_FLUID_TANK = getCTTank(AllCTTypes.RECTANGLE, "brass/brass_fluid_tank"),
            BRASS_FLUID_TANK_TOP = getCTTank(AllCTTypes.RECTANGLE, "brass/brass_fluid_tank_top"),
            BRASS_FLUID_TANK_INNER = getCTTank(AllCTTypes.RECTANGLE, "brass/brass_fluid_tank_inner"),

            IRON_FLUID_TANK = getCTTank(AllCTTypes.RECTANGLE, "iron/iron_fluid_tank"),
            IRON_FLUID_TANK_TOP = getCTTank(AllCTTypes.RECTANGLE, "iron/iron_fluid_tank_top"),
            IRON_FLUID_TANK_INNER = getCTTank(AllCTTypes.RECTANGLE, "iron/iron_fluid_tank_inner"),

            NETHERITE_FLUID_TANK = getCTTank(AllCTTypes.RECTANGLE, "netherite/netherite_fluid_tank"),
            NETHERITE_FLUID_TANK_TOP = getCTTank(AllCTTypes.RECTANGLE, "netherite/netherite_fluid_tank_top"),
            NETHERITE_FLUID_TANK_INNER = getCTTank(AllCTTypes.RECTANGLE, "netherite/netherite_fluid_tank_inner"),

            ZINC_CASING = getCTCasing(AllCTTypes.OMNIDIRECTIONAL, "zinc/casing"),
            GOLD_CASING = getCTCasing(AllCTTypes.OMNIDIRECTIONAL, "gold/casing"),
            IRON_CASING = getCTCasing(AllCTTypes.OMNIDIRECTIONAL, "iron/casing"),
            NETHERITE_CASING = getCTCasing(AllCTTypes.OMNIDIRECTIONAL, "netherite/casing"),
            ROSE_GOLD_CASING = getCTCasing(AllCTTypes.OMNIDIRECTIONAL, "rose_gold/casing"),
            ROSARITE_CASING = getCTCasing(AllCTTypes.OMNIDIRECTIONAL, "rosarite/casing"),
            VALKYRUM_CASING = getCTCasing(AllCTTypes.OMNIDIRECTIONAL, "valkyrum/casing"),
            VALKYRUM_CASING_SIDE = getCTCasing(AllCTTypes.OMNIDIRECTIONAL, "valkyrum/casing_side"),
            PYRAL_CASING = getCTCasing(AllCTTypes.OMNIDIRECTIONAL, "pyral/casing"),
            ZINC_TUNNEL_TOP = getCTTunnel(AllCTTypes.VERTICAL, "zinc/tunnel_top"),
            ANDESITE_TUNNEL_TOP = getCTTunnel(AllCTTypes.VERTICAL, "andesite/tunnel_top"),
            COPPER_TUNNEL_TOP = getCTTunnel(AllCTTypes.VERTICAL, "copper/tunnel_top"),
            GOLDEN_TUNNEL_TOP = getCTTunnel(AllCTTypes.VERTICAL, "gold/tunnel_top"),
            IRON_TUNNEL_TOP = getCTTunnel(AllCTTypes.VERTICAL, "iron/tunnel_top"),
            NETHERITE_TUNNEL_TOP = getCTTunnel(AllCTTypes.VERTICAL, "netherite/tunnel_top");

    private static Couple<CTSpriteShiftEntry> vault(String name) {
        final String prefixed = "block/vault/vault_" + name;
        return Couple.createWithContext(
                medium -> CTSpriteShifter.getCT(AllCTTypes.RECTANGLE, Create.asResource(prefixed + "_small"),
                        Create.asResource(medium ? prefixed + "_medium" : prefixed + "_large")));
    }

    //

    private static CTSpriteShiftEntry horizontal(String name) {
        return getCTTank(AllCTTypes.HORIZONTAL, name);
    }

    private static CTSpriteShiftEntry vertical(String name) {
        return getCTTank(AllCTTypes.VERTICAL, name);
    }

    //

    private static SpriteShiftEntry get(String originalLocation, String targetLocation) {
        return SpriteShifter.get(Create.asResource(originalLocation), Create.asResource(targetLocation));
    }

    private static CTSpriteShiftEntry getCTTank(CTType type, String blockTextureName, String connectedTextureName) {
        return CTSpriteShifter.getCT(type, CreateMPNT.asResource("block/tank/" + blockTextureName),
                CreateMPNT.asResource("block/tank/" + connectedTextureName + "_connected"));
    }

    private static CTSpriteShiftEntry getCTTank(CTType type, String blockTextureName) {
        return getCTTank(type, blockTextureName, blockTextureName);
    }

    private static CTSpriteShiftEntry getCTCasing(CTType type, String blockTextureName, String connectedTextureName) {
        return CTSpriteShifter.getCT(type, CreateMPNT.asResource("block/casing/" + blockTextureName),
                CreateMPNT.asResource("block/casing/" + connectedTextureName + "_connected"));
    }

    private static CTSpriteShiftEntry getCTCasing(CTType type, String blockTextureName) {
        return getCTCasing(type, blockTextureName, blockTextureName);
    }

    private static CTSpriteShiftEntry getCTTunnel(CTType type, String blockTextureName, String connectedTextureName) {
        return CTSpriteShifter.getCT(type, CreateMPNT.asResource("block/tunnel/smart/" + blockTextureName),
                CreateMPNT.asResource("block/tunnel/smart/" + connectedTextureName + "_connected"));
    }

    private static CTSpriteShiftEntry getCTTunnel(CTType type, String blockTextureName) {
        return getCTTunnel(type, blockTextureName, blockTextureName);
    }

}
