package com.kitawadesu.create_mpnt.compat.more_stuff.blocks.entities;

import com.kitawadesu.create_mpnt.CreateMPNT;
import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.MoreStuffCompatBlocks;
import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.entities.util.tanks.*;
import com.simibubi.create.content.fluids.pipes.FluidPipeBlockEntity;
import com.simibubi.create.content.fluids.pipes.GlassPipeVisual;
import com.simibubi.create.content.fluids.pipes.StraightPipeBlockEntity;
import com.simibubi.create.content.fluids.pipes.TransparentStraightPipeRenderer;
import com.simibubi.create.content.fluids.tank.FluidTankRenderer;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

public class MoreStuffCompatBlockEntities {

    private static final CreateRegistrate REGISTRATE = CreateMPNT.registrate();

    // Register your block entity type here:
    public static final BlockEntityEntry<FluidPipeBlockEntity> ROSE_GOLDEN_FLUID_PIPE = REGISTRATE
            .blockEntity("rose_golden_fluid_pipe", FluidPipeBlockEntity::new)
            .validBlocks(MoreStuffCompatBlocks.ROSE_GOLDEN_FLUID_PIPE)
            .register();

    public static final BlockEntityEntry<StraightPipeBlockEntity> GLASS_ROSE_GOLDEN_FLUID_PIPE = REGISTRATE
            .blockEntity("glass_rose_golden_fluid_pipe", StraightPipeBlockEntity::new)
            .visual(() -> GlassPipeVisual::new, false)
            .validBlocks(MoreStuffCompatBlocks.GLASS_ROSE_GOLDEN_FLUID_PIPE)
            .renderer(() -> TransparentStraightPipeRenderer::new)
            .register();

    public static final BlockEntityEntry<FluidPipeBlockEntity> ROSARITE_FLUID_PIPE = REGISTRATE
            .blockEntity("rosaerite_fluid_pipe", FluidPipeBlockEntity::new)
            .validBlocks(MoreStuffCompatBlocks.ROSARITE_FLUID_PIPE)
            .register();

    public static final BlockEntityEntry<StraightPipeBlockEntity> GLASS_ROSARITE_FLUID_PIPE = REGISTRATE
            .blockEntity("glass_rosaerite_fluid_pipe", StraightPipeBlockEntity::new)
            .visual(() -> GlassPipeVisual::new, false)
            .validBlocks(MoreStuffCompatBlocks.GLASS_ROSARITE_FLUID_PIPE)
            .renderer(() -> TransparentStraightPipeRenderer::new)
            .register();

    public static final BlockEntityEntry<RoseGoldenFluidTankBlockEntity> ROSE_GOLDEN_FLUID_TANK = REGISTRATE
            .blockEntity("rose_golden_fluid_tank", RoseGoldenFluidTankBlockEntity::new)
            .validBlocks(MoreStuffCompatBlocks.ROSE_GOLDEN_FLUID_TANK)
            .renderer(() -> FluidTankRenderer::new)
            .register();

    public static final BlockEntityEntry<RosariteFluidTankBlockEntity> ROSARITE_FLUID_TANK = REGISTRATE
            .blockEntity("rosarite_fluid_tank", RosariteFluidTankBlockEntity::new)
            .validBlocks(MoreStuffCompatBlocks.ROSARITE_FLUID_TANK)
            .renderer(() -> FluidTankRenderer::new)
            .register();

    public static void register() {
    }
}

