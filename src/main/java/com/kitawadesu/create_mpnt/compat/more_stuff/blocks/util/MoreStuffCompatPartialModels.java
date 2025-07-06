package com.kitawadesu.create_mpnt.compat.more_stuff.blocks.util;

import com.kitawadesu.create_mpnt.CreateMPNT;
import com.simibubi.create.content.fluids.FluidTransportBehaviour;
import dev.engine_room.flywheel.lib.model.baked.PartialModel;
import net.createmod.catnip.data.Iterate;
import net.createmod.catnip.lang.Lang;
import net.minecraft.core.Direction;

import java.util.EnumMap;
import java.util.Map;

public class MoreStuffCompatPartialModels {

    public static final PartialModel
            ROSE_GOLD_FLUID_PIPE_CASING = block("rose_gold_fluid_pipe/casing"),
            ROSARITE_FLUID_PIPE_CASING = block("rosarite_fluid_pipe/casing");

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

    private static PartialModel block(String path) {
        return PartialModel.of(CreateMPNT.asResource("block/" + path));
    }

    public static void init() {
        // init static fields
    }

}
