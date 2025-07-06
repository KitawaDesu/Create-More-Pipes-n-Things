package com.kitawadesu.create_mpnt.blocks.entities;

import com.kitawadesu.create_mpnt.CreateMPNT;
import com.kitawadesu.create_mpnt.blocks.CreateMPNTBlocks;
import com.kitawadesu.create_mpnt.blocks.entities.util.tanks.*;
import com.simibubi.create.content.fluids.pipes.FluidPipeBlockEntity;
import com.simibubi.create.content.fluids.pipes.GlassPipeVisual;
import com.simibubi.create.content.fluids.pipes.StraightPipeBlockEntity;
import com.simibubi.create.content.fluids.pipes.TransparentStraightPipeRenderer;
import com.simibubi.create.content.fluids.tank.FluidTankRenderer;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

public class CreateMPNTBlockEntities {

    private static final CreateRegistrate REGISTRATE = CreateMPNT.registrate();

    // Register your block entity type here:
    public static final BlockEntityEntry<FluidPipeBlockEntity> ZINC_FLUID_PIPE = REGISTRATE
            .blockEntity("zinc_fluid_pipe", FluidPipeBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.ZINC_FLUID_PIPE)
            .register();

    public static final BlockEntityEntry<StraightPipeBlockEntity> GLASS_ZINC_FLUID_PIPE = REGISTRATE
            .blockEntity("glass_zinc_fluid_pipe", StraightPipeBlockEntity::new)
            .visual(() -> GlassPipeVisual::new, false)
            .validBlocks(CreateMPNTBlocks.GLASS_ZINC_FLUID_PIPE)
            .renderer(() -> TransparentStraightPipeRenderer::new)
            .register();

    public static final BlockEntityEntry<FluidPipeBlockEntity> GOLDEN_FLUID_PIPE = REGISTRATE
            .blockEntity("golden_fluid_pipe", FluidPipeBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.GOLDEN_FLUID_PIPE)
            .register();

    public static final BlockEntityEntry<StraightPipeBlockEntity> GLASS_GOLDEN_FLUID_PIPE = REGISTRATE
            .blockEntity("glass_golden_fluid_pipe", StraightPipeBlockEntity::new)
            .visual(() -> GlassPipeVisual::new, false)
            .validBlocks(CreateMPNTBlocks.GLASS_GOLDEN_FLUID_PIPE)
            .renderer(() -> TransparentStraightPipeRenderer::new)
            .register();

    public static final BlockEntityEntry<FluidPipeBlockEntity> ANDESITE_FLUID_PIPE = REGISTRATE
            .blockEntity("andesite_fluid_pipe", FluidPipeBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.ANDESITE_FLUID_PIPE)
            .register();

    public static final BlockEntityEntry<StraightPipeBlockEntity> GLASS_ANDESITE_FLUID_PIPE = REGISTRATE
            .blockEntity("glass_andesite_fluid_pipe", StraightPipeBlockEntity::new)
            .visual(() -> GlassPipeVisual::new, false)
            .validBlocks(CreateMPNTBlocks.GLASS_ANDESITE_FLUID_PIPE)
            .renderer(() -> TransparentStraightPipeRenderer::new)
            .register();

    public static final BlockEntityEntry<FluidPipeBlockEntity> BRASS_FLUID_PIPE = REGISTRATE
            .blockEntity("brass_fluid_pipe", FluidPipeBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.BRASS_FLUID_PIPE)
            .register();

    public static final BlockEntityEntry<StraightPipeBlockEntity> GLASS_BRASS_FLUID_PIPE = REGISTRATE
            .blockEntity("glass_brass_fluid_pipe", StraightPipeBlockEntity::new)
            .visual(() -> GlassPipeVisual::new, false)
            .validBlocks(CreateMPNTBlocks.GLASS_BRASS_FLUID_PIPE)
            .renderer(() -> TransparentStraightPipeRenderer::new)
            .register();

    public static final BlockEntityEntry<FluidPipeBlockEntity> IRON_FLUID_PIPE = REGISTRATE
            .blockEntity("iron_fluid_pipe", FluidPipeBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.IRON_FLUID_PIPE)
            .register();

    public static final BlockEntityEntry<StraightPipeBlockEntity> GLASS_IRON_FLUID_PIPE = REGISTRATE
            .blockEntity("glass_iron_fluid_pipe", StraightPipeBlockEntity::new)
            .visual(() -> GlassPipeVisual::new, false)
            .validBlocks(CreateMPNTBlocks.GLASS_IRON_FLUID_PIPE)
            .renderer(() -> TransparentStraightPipeRenderer::new)
            .register();

    public static final BlockEntityEntry<FluidPipeBlockEntity> NETHERITE_FLUID_PIPE = REGISTRATE
            .blockEntity("netherite_fluid_pipe", FluidPipeBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.NETHERITE_FLUID_PIPE)
            .register();

    public static final BlockEntityEntry<StraightPipeBlockEntity> GLASS_NETHERITE_FLUID_PIPE = REGISTRATE
            .blockEntity("glass_netherite_fluid_pipe", StraightPipeBlockEntity::new)
            .visual(() -> GlassPipeVisual::new, false)
            .validBlocks(CreateMPNTBlocks.GLASS_NETHERITE_FLUID_PIPE)
            .renderer(() -> TransparentStraightPipeRenderer::new)
            .register();

    public static final BlockEntityEntry<ZincFluidTankBlockEntity> ZINC_FLUID_TANK = REGISTRATE
            .blockEntity("zinc_fluid_tank", ZincFluidTankBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.ZINC_FLUID_TANK)
            .renderer(() -> FluidTankRenderer::new)
            .register();

    public static final BlockEntityEntry<GoldenFluidTankBlockEntity> GOLDEN_FLUID_TANK = REGISTRATE
            .blockEntity("golden_fluid_tank", GoldenFluidTankBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.GOLDEN_FLUID_TANK)
            .renderer(() -> FluidTankRenderer::new)
            .register();

    public static final BlockEntityEntry<AndesiteFluidTankBlockEntity> ANDESITE_FLUID_TANK = REGISTRATE
            .blockEntity("andesite_fluid_tank", AndesiteFluidTankBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.ANDESITE_FLUID_TANK)
            .renderer(() -> FluidTankRenderer::new)
            .register();

    public static final BlockEntityEntry<BrassFluidTankBlockEntity> BRASS_FLUID_TANK = REGISTRATE
            .blockEntity("brass_fluid_tank", BrassFluidTankBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.BRASS_FLUID_TANK)
            .renderer(() -> FluidTankRenderer::new)
            .register();

    public static final BlockEntityEntry<IronFluidTankBlockEntity> IRON_FLUID_TANK = REGISTRATE
            .blockEntity("iron_fluid_tank", IronFluidTankBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.IRON_FLUID_TANK)
            .renderer(() -> FluidTankRenderer::new)
            .register();

    public static final BlockEntityEntry<NetheriteFluidTankBlockEntity> NETHERITE_FLUID_TANK = REGISTRATE
            .blockEntity("netherite_fluid_tank", NetheriteFluidTankBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.NETHERITE_FLUID_TANK)
            .renderer(() -> FluidTankRenderer::new)
            .register();

    public static void register() {
    }
}

