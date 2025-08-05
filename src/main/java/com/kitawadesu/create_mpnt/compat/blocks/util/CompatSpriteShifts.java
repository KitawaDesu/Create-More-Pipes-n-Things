package com.kitawadesu.create_mpnt.compat.blocks.util;

import com.kitawadesu.create_mpnt.CreateMPNT;
import com.simibubi.create.Create;
import com.simibubi.create.foundation.block.connected.AllCTTypes;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.block.connected.CTSpriteShifter;
import com.simibubi.create.foundation.block.connected.CTType;
import net.createmod.catnip.data.Couple;
import net.createmod.catnip.render.SpriteShiftEntry;
import net.createmod.catnip.render.SpriteShifter;

public class CompatSpriteShifts {

    public static final CTSpriteShiftEntry

            ROSE_GOLDEN_FLUID_TANK = getCT(AllCTTypes.RECTANGLE, "rose_gold/rose_golden_fluid_tank"),
            ROSE_GOLDEN_FLUID_TANK_TOP = getCT(AllCTTypes.RECTANGLE, "rose_gold/rose_golden_fluid_tank_top"),
            ROSE_GOLDEN_FLUID_TANK_INNER = getCT(AllCTTypes.RECTANGLE, "rose_gold/rose_golden_fluid_tank_inner"),

            ROSARITE_FLUID_TANK = getCT(AllCTTypes.RECTANGLE, "rosarite/rosarite_fluid_tank"),
            ROSARITE_FLUID_TANK_TOP = getCT(AllCTTypes.RECTANGLE, "rosarite/rosarite_fluid_tank_top"),
            ROSARITE_FLUID_TANK_INNER = getCT(AllCTTypes.RECTANGLE, "rosarite/rosarite_fluid_tank_inner"),

            VALKYRUM_FLUID_TANK = getCT(AllCTTypes.RECTANGLE, "valkyrum/valkyrum_fluid_tank"),
            VALKYRUM_FLUID_TANK_TOP = getCT(AllCTTypes.RECTANGLE, "valkyrum/valkyrum_fluid_tank_top"),
            VALKYRUM_FLUID_TANK_INNER = getCT(AllCTTypes.RECTANGLE, "valkyrum/valkyrum_fluid_tank_inner"),

            PYRAL_FLUID_TANK = getCT(AllCTTypes.RECTANGLE, "pyral/pyral_fluid_tank"),
            PYRAL_FLUID_TANK_TOP = getCT(AllCTTypes.RECTANGLE, "pyral/pyral_fluid_tank_top"),
            PYRAL_FLUID_TANK_INNER = getCT(AllCTTypes.RECTANGLE, "pyral/pyral_fluid_tank_inner");

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
