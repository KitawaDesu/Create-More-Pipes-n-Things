package com.kitawadesu.create_mpnt.compat.blocks.util;

import com.kitawadesu.create_mpnt.CreateMPNT;
import com.simibubi.create.content.fluids.FluidTransportBehaviour;
import dev.engine_room.flywheel.lib.model.baked.PartialModel;
import net.createmod.catnip.data.Iterate;
import net.createmod.catnip.lang.Lang;
import net.minecraft.core.Direction;

import java.util.EnumMap;
import java.util.Map;

public class CompatPartialModels {

    public static final PartialModel
            ROSE_GOLD_FLUID_PIPE_CASING = block("rose_gold_fluid_pipe/casing"),
            ROSARITE_FLUID_PIPE_CASING = block("rosarite_fluid_pipe/casing"),
            ROSE_GOLDEN_MECHANICAL_PUMP_COG = block("rose_gold_mechanical_pump/cog"),
            ROSARITE_MECHANICAL_PUMP_COG = block("rosarite_mechanical_pump/cog"),
            VALKYRUM_FLUID_PIPE_CASING = block("valkyrum_fluid_pipe/casing"),
            VALKYRUM_MECHANICAL_PUMP_COG = block("valkyrum_mechanical_pump/cog"),
            PYRAL_FLUID_PIPE_CASING = block("pyral_fluid_pipe/casing"),
            PYRAL_MECHANICAL_PUMP_COG = block("pyral_mechanical_pump/cog");

    public static final Map<FluidTransportBehaviour.AttachmentTypes.ComponentPartials, Map<Direction, PartialModel>> ROSE_GOLD_PIPE_ATTACHMENTS =
            new EnumMap<>(FluidTransportBehaviour.AttachmentTypes.ComponentPartials.class);

    static {
        for (FluidTransportBehaviour.AttachmentTypes.ComponentPartials type : FluidTransportBehaviour.AttachmentTypes.ComponentPartials.values()) {
            Map<Direction, PartialModel> map = new EnumMap<>(Direction.class);
            for (Direction d : Iterate.directions) {
                String asId = Lang.asId(type.name());
                map.put(d, block("rose_gold_fluid_pipe/" + asId + "/" + Lang.asId(d.getSerializedName())));
            }
            ROSE_GOLD_PIPE_ATTACHMENTS.put(type, map);
        }
    }

    public static final Map<FluidTransportBehaviour.AttachmentTypes.ComponentPartials, Map<Direction, PartialModel>> ROSARITE_PIPE_ATTACHMENTS =
            new EnumMap<>(FluidTransportBehaviour.AttachmentTypes.ComponentPartials.class);

    static {
        for (FluidTransportBehaviour.AttachmentTypes.ComponentPartials type : FluidTransportBehaviour.AttachmentTypes.ComponentPartials.values()) {
            Map<Direction, PartialModel> map = new EnumMap<>(Direction.class);
            for (Direction d : Iterate.directions) {
                String asId = Lang.asId(type.name());
                map.put(d, block("rosarite_fluid_pipe/" + asId + "/" + Lang.asId(d.getSerializedName())));
            }
            ROSARITE_PIPE_ATTACHMENTS.put(type, map);
        }
    }

    public static final Map<FluidTransportBehaviour.AttachmentTypes.ComponentPartials, Map<Direction, PartialModel>> VALKYRUM_PIPE_ATTACHMENTS =
            new EnumMap<>(FluidTransportBehaviour.AttachmentTypes.ComponentPartials.class);

    static {
        for (FluidTransportBehaviour.AttachmentTypes.ComponentPartials type : FluidTransportBehaviour.AttachmentTypes.ComponentPartials.values()) {
            Map<Direction, PartialModel> map = new EnumMap<>(Direction.class);
            for (Direction d : Iterate.directions) {
                String asId = Lang.asId(type.name());
                map.put(d, block("valkyrum_fluid_pipe/" + asId + "/" + Lang.asId(d.getSerializedName())));
            }
            VALKYRUM_PIPE_ATTACHMENTS.put(type, map);
        }
    }

    public static final Map<FluidTransportBehaviour.AttachmentTypes.ComponentPartials, Map<Direction, PartialModel>> PYRAL_PIPE_ATTACHMENTS =
            new EnumMap<>(FluidTransportBehaviour.AttachmentTypes.ComponentPartials.class);

    static {
        for (FluidTransportBehaviour.AttachmentTypes.ComponentPartials type : FluidTransportBehaviour.AttachmentTypes.ComponentPartials.values()) {
            Map<Direction, PartialModel> map = new EnumMap<>(Direction.class);
            for (Direction d : Iterate.directions) {
                String asId = Lang.asId(type.name());
                map.put(d, block("pyral_fluid_pipe/" + asId + "/" + Lang.asId(d.getSerializedName())));
            }
            PYRAL_PIPE_ATTACHMENTS.put(type, map);
        }
    }

    private static PartialModel block(String path) {
        return PartialModel.of(CreateMPNT.asResource("block/" + path));
    }

    public static void init() {
        // init static fields
    }

}
