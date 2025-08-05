package com.kitawadesu.create_mpnt.blocks.util;

import com.kitawadesu.create_mpnt.CreateMPNT;
import com.simibubi.create.content.fluids.FluidTransportBehaviour;
import dev.engine_room.flywheel.lib.model.baked.PartialModel;
import net.createmod.catnip.data.Iterate;
import net.createmod.catnip.lang.Lang;
import net.minecraft.core.Direction;

import java.util.EnumMap;
import java.util.Map;

public class MPNTPartialModels {

    public static final PartialModel
            ZINC_FLUID_PIPE_CASING = block("zinc_fluid_pipe/casing"),
            GOLD_FLUID_PIPE_CASING = block("gold_fluid_pipe/casing"),
            ANDESITE_FLUID_PIPE_CASING = block("andesite_fluid_pipe/casing"),
            BRASS_FLUID_PIPE_CASING = block("brass_fluid_pipe/casing"),
            IRON_FLUID_PIPE_CASING = block("iron_fluid_pipe/casing"),
            NETHERITE_FLUID_PIPE_CASING = block("netherite_fluid_pipe/casing"),
            ZINC_MECHANICAL_PUMP_COG = block("zinc_mechanical_pump/cog"),
            GOLDEN_MECHANICAL_PUMP_COG = block("gold_mechanical_pump/cog"),
            ANDESITE_MECHANICAL_PUMP_COG = block("andesite_mechanical_pump/cog"),
            BRASS_MECHANICAL_PUMP_COG = block("brass_mechanical_pump/cog"),
            IRON_MECHANICAL_PUMP_COG = block("iron_mechanical_pump/cog"),
            NETHERITE_MECHANICAL_PUMP_COG = block("netherite_mechanical_pump/cog"),
            BRASS_BOILER_GAUGE = block("brass_fluid_tank/gauge"),
            ZINC_BOILER_GAUGE = block("zinc_fluid_tank/gauge"),
            ANDESITE_BOILER_GAUGE = block("andesite_fluid_tank/gauge"),
            GOLDEN_BOILER_GAUGE = block("gold_fluid_tank/gauge"),
            IRON_BOILER_GAUGE = block("iron_fluid_tank/gauge"),
            NETHERITE_BOILER_GAUGE = block("netherite_fluid_tank/gauge"),
            ROSE_GOLDEN_BOILER_GAUGE = block("rose_gold_fluid_tank/gauge"),
            ROSARITE_BOILER_GAUGE = block("rosarite_fluid_tank/gauge"),
            VALKYRUM_BOILER_GAUGE = block("valkyrum_fluid_tank/gauge"),
            PYRAL_BOILER_GAUGE = block("pyral_fluid_tank/gauge");

    public static final Map<FluidTransportBehaviour.AttachmentTypes.ComponentPartials, Map<Direction, PartialModel>> ZINC_PIPE_ATTACHMENTS =
            new EnumMap<>(FluidTransportBehaviour.AttachmentTypes.ComponentPartials.class);

    static {
        for (FluidTransportBehaviour.AttachmentTypes.ComponentPartials type : FluidTransportBehaviour.AttachmentTypes.ComponentPartials.values()) {
            Map<Direction, PartialModel> map = new EnumMap<>(Direction.class);
            for (Direction d : Iterate.directions) {
                String asId = Lang.asId(type.name());
                map.put(d, block("zinc_fluid_pipe/" + asId + "/" + Lang.asId(d.getSerializedName())));
            }
            ZINC_PIPE_ATTACHMENTS.put(type, map);
        }
    }

    public static final Map<FluidTransportBehaviour.AttachmentTypes.ComponentPartials, Map<Direction, PartialModel>> GOLD_PIPE_ATTACHMENTS =
            new EnumMap<>(FluidTransportBehaviour.AttachmentTypes.ComponentPartials.class);

    static {
        for (FluidTransportBehaviour.AttachmentTypes.ComponentPartials type : FluidTransportBehaviour.AttachmentTypes.ComponentPartials.values()) {
            Map<Direction, PartialModel> map = new EnumMap<>(Direction.class);
            for (Direction d : Iterate.directions) {
                String asId = Lang.asId(type.name());
                map.put(d, block("gold_fluid_pipe/" + asId + "/" + Lang.asId(d.getSerializedName())));
            }
            GOLD_PIPE_ATTACHMENTS.put(type, map);
        }
    }

    public static final Map<FluidTransportBehaviour.AttachmentTypes.ComponentPartials, Map<Direction, PartialModel>> ANDESITE_PIPE_ATTACHMENTS =
            new EnumMap<>(FluidTransportBehaviour.AttachmentTypes.ComponentPartials.class);

    static {
        for (FluidTransportBehaviour.AttachmentTypes.ComponentPartials type : FluidTransportBehaviour.AttachmentTypes.ComponentPartials.values()) {
            Map<Direction, PartialModel> map = new EnumMap<>(Direction.class);
            for (Direction d : Iterate.directions) {
                String asId = Lang.asId(type.name());
                map.put(d, block("andesite_fluid_pipe/" + asId + "/" + Lang.asId(d.getSerializedName())));
            }
            ANDESITE_PIPE_ATTACHMENTS.put(type, map);
        }
    }

    public static final Map<FluidTransportBehaviour.AttachmentTypes.ComponentPartials, Map<Direction, PartialModel>> BRASS_PIPE_ATTACHMENTS =
            new EnumMap<>(FluidTransportBehaviour.AttachmentTypes.ComponentPartials.class);

    static {
        for (FluidTransportBehaviour.AttachmentTypes.ComponentPartials type : FluidTransportBehaviour.AttachmentTypes.ComponentPartials.values()) {
            Map<Direction, PartialModel> map = new EnumMap<>(Direction.class);
            for (Direction d : Iterate.directions) {
                String asId = Lang.asId(type.name());
                map.put(d, block("brass_fluid_pipe/" + asId + "/" + Lang.asId(d.getSerializedName())));
            }
            BRASS_PIPE_ATTACHMENTS.put(type, map);
        }
    }

    public static final Map<FluidTransportBehaviour.AttachmentTypes.ComponentPartials, Map<Direction, PartialModel>> IRON_PIPE_ATTACHMENTS =
            new EnumMap<>(FluidTransportBehaviour.AttachmentTypes.ComponentPartials.class);

    static {
        for (FluidTransportBehaviour.AttachmentTypes.ComponentPartials type : FluidTransportBehaviour.AttachmentTypes.ComponentPartials.values()) {
            Map<Direction, PartialModel> map = new EnumMap<>(Direction.class);
            for (Direction d : Iterate.directions) {
                String asId = Lang.asId(type.name());
                map.put(d, block("iron_fluid_pipe/" + asId + "/" + Lang.asId(d.getSerializedName())));
            }
            IRON_PIPE_ATTACHMENTS.put(type, map);
        }
    }

    public static final Map<FluidTransportBehaviour.AttachmentTypes.ComponentPartials, Map<Direction, PartialModel>> NETHERITE_PIPE_ATTACHMENTS =
            new EnumMap<>(FluidTransportBehaviour.AttachmentTypes.ComponentPartials.class);

    static {
        for (FluidTransportBehaviour.AttachmentTypes.ComponentPartials type : FluidTransportBehaviour.AttachmentTypes.ComponentPartials.values()) {
            Map<Direction, PartialModel> map = new EnumMap<>(Direction.class);
            for (Direction d : Iterate.directions) {
                String asId = Lang.asId(type.name());
                map.put(d, block("netherite_fluid_pipe/" + asId + "/" + Lang.asId(d.getSerializedName())));
            }
            NETHERITE_PIPE_ATTACHMENTS.put(type, map);
        }
    }

    private static PartialModel block(String path) {
        return PartialModel.of(CreateMPNT.asResource("block/" + path));
    }

    public static void init() {
        // init static fields
    }

}
