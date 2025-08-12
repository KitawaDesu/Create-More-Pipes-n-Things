package com.kitawadesu.create_mpnt.blocks.entities;

import com.kitawadesu.create_mpnt.CreateMPNT;
import com.kitawadesu.create_mpnt.blocks.CreateMPNTBlocks;
import com.kitawadesu.create_mpnt.blocks.entities.util.depots.*;
import com.kitawadesu.create_mpnt.blocks.entities.util.tanks.entity.*;
import com.kitawadesu.create_mpnt.blocks.entities.util.tanks.renderer.*;
import com.kitawadesu.create_mpnt.blocks.entities.util.tunnels.NormalBeltTunnelBlockEntity;
import com.kitawadesu.create_mpnt.blocks.entities.util.tunnels.SmartBeltTunnelBlockEntity;
import com.kitawadesu.create_mpnt.blocks.util.MPNTPartialModels;
import com.kitawadesu.create_mpnt.compat.blocks.entities.util.tanks.entity.PyralFluidTankBlockEntity;
import com.kitawadesu.create_mpnt.compat.blocks.entities.util.tanks.entity.RosariteFluidTankBlockEntity;
import com.kitawadesu.create_mpnt.compat.blocks.entities.util.tanks.entity.RoseGoldenFluidTankBlockEntity;
import com.kitawadesu.create_mpnt.compat.blocks.entities.util.tanks.entity.ValkyrumFluidTankBlockEntity;
import com.kitawadesu.create_mpnt.compat.blocks.entities.util.tanks.renderer.PyralFluidTankRenderer;
import com.kitawadesu.create_mpnt.compat.blocks.entities.util.tanks.renderer.RosariteFluidTankRenderer;
import com.kitawadesu.create_mpnt.compat.blocks.entities.util.tanks.renderer.RoseGoldenFluidTankRenderer;
import com.kitawadesu.create_mpnt.compat.blocks.entities.util.tanks.renderer.ValkyrumFluidTankRenderer;
import com.kitawadesu.create_mpnt.compat.blocks.util.CompatPartialModels;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.fluids.pipes.FluidPipeBlockEntity;
import com.simibubi.create.content.fluids.pipes.GlassPipeVisual;
import com.simibubi.create.content.fluids.pipes.StraightPipeBlockEntity;
import com.simibubi.create.content.fluids.pipes.TransparentStraightPipeRenderer;
import com.simibubi.create.content.fluids.pump.PumpBlockEntity;
import com.simibubi.create.content.fluids.pump.PumpRenderer;
import com.simibubi.create.content.kinetics.base.KineticBlockEntity;
import com.simibubi.create.content.kinetics.base.ShaftRenderer;
import com.simibubi.create.content.kinetics.base.SingleAxisRotatingVisual;
import com.simibubi.create.content.kinetics.gearbox.GearboxBlockEntity;
import com.simibubi.create.content.kinetics.gearbox.GearboxRenderer;
import com.simibubi.create.content.kinetics.gearbox.GearboxVisual;
import com.simibubi.create.content.logistics.depot.DepotRenderer;
import com.simibubi.create.content.logistics.funnel.FunnelBlockEntity;
import com.simibubi.create.content.logistics.funnel.FunnelRenderer;
import com.simibubi.create.content.logistics.funnel.FunnelVisual;
import com.simibubi.create.content.logistics.tunnel.BeltTunnelBlockEntity;
import com.simibubi.create.content.logistics.tunnel.BeltTunnelRenderer;
import com.simibubi.create.content.logistics.tunnel.BeltTunnelVisual;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

public class CreateMPNTBlockEntities {

    private static final CreateRegistrate REGISTRATE = CreateMPNT.registrate();

    public static final BlockEntityEntry<KineticBlockEntity> CMPNT_ENCASED_SHAFT = REGISTRATE
            .blockEntity("cmpnt_encased_shaft", KineticBlockEntity::new)
            .visual(() -> SingleAxisRotatingVisual::shaft, false)
            .validBlocks(CreateMPNTBlocks.ZINC_ENCASED_SHAFT,
                    CreateMPNTBlocks.GOLD_ENCASED_SHAFT,
                    CreateMPNTBlocks.COPPER_ENCASED_SHAFT,
                    CreateMPNTBlocks.IRON_ENCASED_SHAFT,
                    CreateMPNTBlocks.RAILWAY_ENCASED_SHAFT,
                    CreateMPNTBlocks.NETHERITE_ENCASED_SHAFT,
                    CreateMPNTBlocks.ROSE_GOLD_ENCASED_SHAFT,
                    CreateMPNTBlocks.ROSARITE_ENCASED_SHAFT,
                    CreateMPNTBlocks.VALKYRUM_ENCASED_SHAFT,
                    CreateMPNTBlocks.PYRAL_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<GearboxBlockEntity> CMPNT_GEARBOX = REGISTRATE
            .blockEntity("cmpnt_gearbox", GearboxBlockEntity::new)
            .visual(() -> GearboxVisual::new, false)
            .validBlocks(CreateMPNTBlocks.ZINC_GEARBOX,
                    CreateMPNTBlocks.GOLDEN_GEARBOX,
                    CreateMPNTBlocks.COPPER_GEARBOX,
                    CreateMPNTBlocks.BRASS_GEARBOX,
                    CreateMPNTBlocks.IRON_GEARBOX,
                    CreateMPNTBlocks.RAILWAY_GEARBOX,
                    CreateMPNTBlocks.NETHERITE_GEARBOX,
                    CreateMPNTBlocks.ROSE_GOLDEN_GEARBOX,
                    CreateMPNTBlocks.ROSARITE_GEARBOX,
                    CreateMPNTBlocks.VALKYRUM_GEARBOX,
                    CreateMPNTBlocks.PYRAL_GEARBOX)
            .renderer(() -> GearboxRenderer::new)
            .register();

    public static final BlockEntityEntry<ZincDepotBlockEntity> ZINC_DEPOT = REGISTRATE
            .blockEntity("zinc_depot", ZincDepotBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.ZINC_DEPOT)
            .renderer(() -> DepotRenderer::new)
            .register();

    public static final BlockEntityEntry<GoldenDepotBlockEntity> GOLDEN_DEPOT = REGISTRATE
            .blockEntity("golden_depot", GoldenDepotBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.GOLDEN_DEPOT)
            .renderer(() -> DepotRenderer::new)
            .register();

    public static final BlockEntityEntry<IronDepotBlockEntity> IRON_DEPOT = REGISTRATE
            .blockEntity("iron_depot", IronDepotBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.IRON_DEPOT)
            .renderer(() -> DepotRenderer::new)
            .register();

    public static final BlockEntityEntry<CopperDepotBlockEntity> COPPER_DEPOT = REGISTRATE
            .blockEntity("copper_depot", CopperDepotBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.COPPER_DEPOT)
            .renderer(() -> DepotRenderer::new)
            .register();

    public static final BlockEntityEntry<BrassDepotBlockEntity> BRASS_DEPOT = REGISTRATE
            .blockEntity("brass_depot", BrassDepotBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.BRASS_DEPOT)
            .renderer(() -> DepotRenderer::new)
            .register();

    public static final BlockEntityEntry<RailwayDepotBlockEntity> RAILWAY_DEPOT = REGISTRATE
            .blockEntity("railway_depot", RailwayDepotBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.RAILWAY_DEPOT)
            .renderer(() -> DepotRenderer::new)
            .register();

    public static final BlockEntityEntry<NetheriteDepotBlockEntity> NETHERITE_DEPOT = REGISTRATE
            .blockEntity("netherite_depot", NetheriteDepotBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.NETHERITE_DEPOT)
            .renderer(() -> DepotRenderer::new)
            .register();

    public static final BlockEntityEntry<RoseGoldenDepotBlockEntity> ROSE_GOLDEN_DEPOT = REGISTRATE
            .blockEntity("rose_golden_depot", RoseGoldenDepotBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.ROSE_GOLDEN_DEPOT)
            .renderer(() -> DepotRenderer::new)
            .register();

    public static final BlockEntityEntry<RosariteDepotBlockEntity> ROSARITE_DEPOT = REGISTRATE
            .blockEntity("rosarite_depot", RosariteDepotBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.ROSARITE_DEPOT)
            .renderer(() -> DepotRenderer::new)
            .register();

    public static final BlockEntityEntry<ValkyrumDepotBlockEntity> VALKYRUM_DEPOT = REGISTRATE
            .blockEntity("valkyrum_depot", ValkyrumDepotBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.VALKYRUM_DEPOT)
            .renderer(() -> DepotRenderer::new)
            .register();

    public static final BlockEntityEntry<PyralDepotBlockEntity> PYRAL_DEPOT = REGISTRATE
            .blockEntity("pyral_depot", PyralDepotBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.PYRAL_DEPOT)
            .renderer(() -> DepotRenderer::new)
            .register();

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

    public static final BlockEntityEntry<PumpBlockEntity> ZINC_MECHANICAL_PUMP = REGISTRATE
            .blockEntity("zinc_mechanical_pump", PumpBlockEntity::new)
            .visual(() -> SingleAxisRotatingVisual.ofZ(MPNTPartialModels.ZINC_MECHANICAL_PUMP_COG))
            .validBlocks(CreateMPNTBlocks.ZINC_MECHANICAL_PUMP)
            .renderer(() -> PumpRenderer::new)
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

    public static final BlockEntityEntry<PumpBlockEntity> GOLDEN_MECHANICAL_PUMP = REGISTRATE
            .blockEntity("golden_mechanical_pump", PumpBlockEntity::new)
            .visual(() -> SingleAxisRotatingVisual.ofZ(MPNTPartialModels.GOLDEN_MECHANICAL_PUMP_COG))
            .validBlocks(CreateMPNTBlocks.GOLDEN_MECHANICAL_PUMP)
            .renderer(() -> PumpRenderer::new)
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

    public static final BlockEntityEntry<PumpBlockEntity> ANDESITE_MECHANICAL_PUMP = REGISTRATE
            .blockEntity("andesite_mechanical_pump", PumpBlockEntity::new)
            .visual(() -> SingleAxisRotatingVisual.ofZ(MPNTPartialModels.ANDESITE_MECHANICAL_PUMP_COG))
            .validBlocks(CreateMPNTBlocks.ANDESITE_MECHANICAL_PUMP)
            .renderer(() -> PumpRenderer::new)
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

    public static final BlockEntityEntry<PumpBlockEntity> BRASS_MECHANICAL_PUMP = REGISTRATE
            .blockEntity("brass_mechanical_pump", PumpBlockEntity::new)
            .visual(() -> SingleAxisRotatingVisual.ofZ(MPNTPartialModels.BRASS_MECHANICAL_PUMP_COG))
            .validBlocks(CreateMPNTBlocks.BRASS_MECHANICAL_PUMP)
            .renderer(() -> PumpRenderer::new)
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

    public static final BlockEntityEntry<PumpBlockEntity> IRON_MECHANICAL_PUMP = REGISTRATE
            .blockEntity("iron_mechanical_pump", PumpBlockEntity::new)
            .visual(() -> SingleAxisRotatingVisual.ofZ(MPNTPartialModels.IRON_MECHANICAL_PUMP_COG))
            .validBlocks(CreateMPNTBlocks.IRON_MECHANICAL_PUMP)
            .renderer(() -> PumpRenderer::new)
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

    public static final BlockEntityEntry<PumpBlockEntity> NETHERITE_MECHANICAL_PUMP = REGISTRATE
            .blockEntity("netherite_mechanical_pump", PumpBlockEntity::new)
            .visual(() -> SingleAxisRotatingVisual.ofZ(MPNTPartialModels.NETHERITE_MECHANICAL_PUMP_COG))
            .validBlocks(CreateMPNTBlocks.NETHERITE_MECHANICAL_PUMP)
            .renderer(() -> PumpRenderer::new)
            .register();

    public static final BlockEntityEntry<ZincFluidTankBlockEntity> ZINC_FLUID_TANK = REGISTRATE
            .blockEntity("zinc_fluid_tank", ZincFluidTankBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.ZINC_FLUID_TANK)
            .renderer(() -> ZincFluidTankRenderer::new)
            .register();

    public static final BlockEntityEntry<GoldenFluidTankBlockEntity> GOLDEN_FLUID_TANK = REGISTRATE
            .blockEntity("golden_fluid_tank", GoldenFluidTankBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.GOLDEN_FLUID_TANK)
            .renderer(() -> GoldenFluidTankRenderer::new)
            .register();

    public static final BlockEntityEntry<AndesiteFluidTankBlockEntity> ANDESITE_FLUID_TANK = REGISTRATE
            .blockEntity("andesite_fluid_tank", AndesiteFluidTankBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.ANDESITE_FLUID_TANK)
            .renderer(() -> AndesiteFluidTankRenderer::new)
            .register();

    public static final BlockEntityEntry<BrassFluidTankBlockEntity> BRASS_FLUID_TANK = REGISTRATE
            .blockEntity("brass_fluid_tank", BrassFluidTankBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.BRASS_FLUID_TANK)
            .renderer(() -> BrassFluidTankRenderer::new)
            .register();

    public static final BlockEntityEntry<IronFluidTankBlockEntity> IRON_FLUID_TANK = REGISTRATE
            .blockEntity("iron_fluid_tank", IronFluidTankBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.IRON_FLUID_TANK)
            .renderer(() -> IronFluidTankRenderer::new)
            .register();

    public static final BlockEntityEntry<NetheriteFluidTankBlockEntity> NETHERITE_FLUID_TANK = REGISTRATE
            .blockEntity("netherite_fluid_tank", NetheriteFluidTankBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.NETHERITE_FLUID_TANK)
            .renderer(() -> NetheriteFluidTankRenderer::new)
            .register();

    public static final BlockEntityEntry<FunnelBlockEntity> FUNNEL = REGISTRATE
            .blockEntity("funnel", FunnelBlockEntity::new)
            .visual(() -> FunnelVisual::new)
            .validBlocks(
                    AllBlocks.BRASS_FUNNEL,
                    AllBlocks.BRASS_BELT_FUNNEL,
                    AllBlocks.ANDESITE_FUNNEL,
                    AllBlocks.ANDESITE_BELT_FUNNEL,
                    CreateMPNTBlocks.NORMAL_ZINC_FUNNEL,
                    CreateMPNTBlocks.NORMAL_ZINC_BELT_FUNNEL,
                    CreateMPNTBlocks.NORMAL_BRASS_FUNNEL,
                    CreateMPNTBlocks.NORMAL_BRASS_BELT_FUNNEL,
                    CreateMPNTBlocks.NORMAL_COPPER_FUNNEL,
                    CreateMPNTBlocks.NORMAL_COPPER_BELT_FUNNEL,
                    CreateMPNTBlocks.NORMAL_GOLDEN_FUNNEL,
                    CreateMPNTBlocks.NORMAL_GOLDEN_BELT_FUNNEL,
                    CreateMPNTBlocks.NORMAL_IRON_FUNNEL,
                    CreateMPNTBlocks.NORMAL_IRON_BELT_FUNNEL,
                    CreateMPNTBlocks.NORMAL_NETHERITE_FUNNEL,
                    CreateMPNTBlocks.NORMAL_NETHERITE_BELT_FUNNEL,
                    CreateMPNTBlocks.SMART_ZINC_FUNNEL,
                    CreateMPNTBlocks.SMART_ZINC_BELT_FUNNEL,
                    CreateMPNTBlocks.SMART_ANDESITE_FUNNEL,
                    CreateMPNTBlocks.SMART_ANDESITE_BELT_FUNNEL,
                    CreateMPNTBlocks.SMART_COPPER_FUNNEL,
                    CreateMPNTBlocks.SMART_COPPER_BELT_FUNNEL,
                    CreateMPNTBlocks.SMART_GOLDEN_FUNNEL,
                    CreateMPNTBlocks.SMART_GOLDEN_BELT_FUNNEL,
                    CreateMPNTBlocks.SMART_IRON_FUNNEL,
                    CreateMPNTBlocks.SMART_IRON_BELT_FUNNEL,
                    CreateMPNTBlocks.SMART_NETHERITE_FUNNEL,
                    CreateMPNTBlocks.SMART_NETHERITE_BELT_FUNNEL,

                    CreateMPNTBlocks.NORMAL_ROSARITE_FUNNEL,
                    CreateMPNTBlocks.NORMAL_ROSARITE_BELT_FUNNEL,
                    CreateMPNTBlocks.NORMAL_ROSE_GOLDEN_FUNNEL,
                    CreateMPNTBlocks.NORMAL_ROSE_GOLDEN_BELT_FUNNEL,
                    CreateMPNTBlocks.NORMAL_VALKYRUM_FUNNEL,
                    CreateMPNTBlocks.NORMAL_VALKYRUM_BELT_FUNNEL,
                    CreateMPNTBlocks.NORMAL_PYRAL_FUNNEL,
                    CreateMPNTBlocks.NORMAL_PYRAL_BELT_FUNNEL,
                    CreateMPNTBlocks.SMART_ROSARITE_FUNNEL,
                    CreateMPNTBlocks.SMART_ROSARITE_BELT_FUNNEL,
                    CreateMPNTBlocks.SMART_ROSE_GOLDEN_FUNNEL,
                    CreateMPNTBlocks.SMART_ROSE_GOLDEN_BELT_FUNNEL,
                    CreateMPNTBlocks.SMART_VALKYRUM_FUNNEL,
                    CreateMPNTBlocks.SMART_VALKYRUM_BELT_FUNNEL,
                    CreateMPNTBlocks.SMART_PYRAL_FUNNEL,
                    CreateMPNTBlocks.SMART_PYRAL_BELT_FUNNEL
            )
            .renderer(() -> FunnelRenderer::new)
            .register();

    public static final BlockEntityEntry<NormalBeltTunnelBlockEntity> NORMAL_TUNNEL = REGISTRATE
            .blockEntity("normal_tunnel", NormalBeltTunnelBlockEntity::new)
            .visual(() -> BeltTunnelVisual::new)
            .validBlocks(
                    CreateMPNTBlocks.NORMAL_ZINC_TUNNEL,
                    CreateMPNTBlocks.NORMAL_BRASS_TUNNEL,
                    CreateMPNTBlocks.NORMAL_COPPER_TUNNEL,
                    CreateMPNTBlocks.NORMAL_NETHERITE_TUNNEL,
                    CreateMPNTBlocks.NORMAL_IRON_TUNNEL,
                    CreateMPNTBlocks.NORMAL_GOLDEN_TUNNEL
            )
            .renderer(() -> BeltTunnelRenderer::new)
            .register();

    public static final BlockEntityEntry<SmartBeltTunnelBlockEntity> SMART_TUNNEL = REGISTRATE
            .blockEntity("brass_tunnel", SmartBeltTunnelBlockEntity::new)
            .visual(() -> BeltTunnelVisual::new)
            .validBlocks(
                    CreateMPNTBlocks.SMART_ANDESITE_TUNNEL,
                    CreateMPNTBlocks.SMART_ZINC_TUNNEL,
                    CreateMPNTBlocks.SMART_COPPER_TUNNEL,
                    CreateMPNTBlocks.SMART_NETHERITE_TUNNEL,
                    CreateMPNTBlocks.SMART_IRON_TUNNEL,
                    CreateMPNTBlocks.SMART_GOLDEN_TUNNEL
            )
            .renderer(() -> BeltTunnelRenderer::new)
            .register();

    // Register your block entity type here:
    public static final BlockEntityEntry<FluidPipeBlockEntity> ROSE_GOLDEN_FLUID_PIPE = REGISTRATE
            .blockEntity("rose_golden_fluid_pipe", FluidPipeBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.ROSE_GOLDEN_FLUID_PIPE)
            .register();

    public static final BlockEntityEntry<StraightPipeBlockEntity> GLASS_ROSE_GOLDEN_FLUID_PIPE = REGISTRATE
            .blockEntity("glass_rose_golden_fluid_pipe", StraightPipeBlockEntity::new)
            .visual(() -> GlassPipeVisual::new, false)
            .validBlocks(CreateMPNTBlocks.GLASS_ROSE_GOLDEN_FLUID_PIPE)
            .renderer(() -> TransparentStraightPipeRenderer::new)
            .register();

    public static final BlockEntityEntry<PumpBlockEntity> ROSE_GOLDEN_MECHANICAL_PUMP = REGISTRATE
            .blockEntity("rose_golden_mechanical_pump", PumpBlockEntity::new)
            .visual(() -> SingleAxisRotatingVisual.ofZ(CompatPartialModels.ROSE_GOLDEN_MECHANICAL_PUMP_COG))
            .validBlocks(CreateMPNTBlocks.ROSE_GOLDEN_MECHANICAL_PUMP)
            .renderer(() -> PumpRenderer::new)
            .register();

    public static final BlockEntityEntry<FluidPipeBlockEntity> ROSARITE_FLUID_PIPE = REGISTRATE
            .blockEntity("rosarite_fluid_pipe", FluidPipeBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.ROSARITE_FLUID_PIPE)
            .register();

    public static final BlockEntityEntry<StraightPipeBlockEntity> GLASS_ROSARITE_FLUID_PIPE = REGISTRATE
            .blockEntity("glass_rosarite_fluid_pipe", StraightPipeBlockEntity::new)
            .visual(() -> GlassPipeVisual::new, false)
            .validBlocks(CreateMPNTBlocks.GLASS_ROSARITE_FLUID_PIPE)
            .renderer(() -> TransparentStraightPipeRenderer::new)
            .register();

    public static final BlockEntityEntry<PumpBlockEntity> ROSARITE_MECHANICAL_PUMP = REGISTRATE
            .blockEntity("rosarite_mechanical_pump", PumpBlockEntity::new)
            .visual(() -> SingleAxisRotatingVisual.ofZ(CompatPartialModels.ROSARITE_MECHANICAL_PUMP_COG))
            .validBlocks(CreateMPNTBlocks.ROSARITE_MECHANICAL_PUMP)
            .renderer(() -> PumpRenderer::new)
            .register();

    public static final BlockEntityEntry<FluidPipeBlockEntity> VALKYRUM_FLUID_PIPE = REGISTRATE
            .blockEntity("valkyrum_fluid_pipe", FluidPipeBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.VALKYRUM_FLUID_PIPE)
            .register();

    public static final BlockEntityEntry<StraightPipeBlockEntity> GLASS_VALKYRUM_FLUID_PIPE = REGISTRATE
            .blockEntity("glass_valkyrum_fluid_pipe", StraightPipeBlockEntity::new)
            .visual(() -> GlassPipeVisual::new, false)
            .validBlocks(CreateMPNTBlocks.GLASS_VALKYRUM_FLUID_PIPE)
            .renderer(() -> TransparentStraightPipeRenderer::new)
            .register();

    public static final BlockEntityEntry<PumpBlockEntity> VALKYRUM_MECHANICAL_PUMP = REGISTRATE
            .blockEntity("valkyrum_mechanical_pump", PumpBlockEntity::new)
            .visual(() -> SingleAxisRotatingVisual.ofZ(CompatPartialModels.VALKYRUM_MECHANICAL_PUMP_COG))
            .validBlocks(CreateMPNTBlocks.VALKYRUM_MECHANICAL_PUMP)
            .renderer(() -> PumpRenderer::new)
            .register();

    public static final BlockEntityEntry<FluidPipeBlockEntity> PYRAL_FLUID_PIPE = REGISTRATE
            .blockEntity("pyral_fluid_pipe", FluidPipeBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.PYRAL_FLUID_PIPE)
            .register();

    public static final BlockEntityEntry<StraightPipeBlockEntity> GLASS_PYRAL_FLUID_PIPE = REGISTRATE
            .blockEntity("glass_pyral_fluid_pipe", StraightPipeBlockEntity::new)
            .visual(() -> GlassPipeVisual::new, false)
            .validBlocks(CreateMPNTBlocks.GLASS_PYRAL_FLUID_PIPE)
            .renderer(() -> TransparentStraightPipeRenderer::new)
            .register();

    public static final BlockEntityEntry<PumpBlockEntity> PYRAL_MECHANICAL_PUMP = REGISTRATE
            .blockEntity("pyral_mechanical_pump", PumpBlockEntity::new)
            .visual(() -> SingleAxisRotatingVisual.ofZ(CompatPartialModels.PYRAL_MECHANICAL_PUMP_COG))
            .validBlocks(CreateMPNTBlocks.PYRAL_MECHANICAL_PUMP)
            .renderer(() -> PumpRenderer::new)
            .register();

    public static final BlockEntityEntry<RoseGoldenFluidTankBlockEntity> ROSE_GOLDEN_FLUID_TANK = REGISTRATE
            .blockEntity("rose_golden_fluid_tank", RoseGoldenFluidTankBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.ROSE_GOLDEN_FLUID_TANK)
            .renderer(() -> RoseGoldenFluidTankRenderer::new)
            .register();

    public static final BlockEntityEntry<RosariteFluidTankBlockEntity> ROSARITE_FLUID_TANK = REGISTRATE
            .blockEntity("rosarite_fluid_tank", RosariteFluidTankBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.ROSARITE_FLUID_TANK)
            .renderer(() -> RosariteFluidTankRenderer::new)
            .register();

    public static final BlockEntityEntry<ValkyrumFluidTankBlockEntity> VALKYRUM_FLUID_TANK = REGISTRATE
            .blockEntity("valkyrum_fluid_tank", ValkyrumFluidTankBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.VALKYRUM_FLUID_TANK)
            .renderer(() -> ValkyrumFluidTankRenderer::new)
            .register();

    public static final BlockEntityEntry<PyralFluidTankBlockEntity> PYRAL_FLUID_TANK = REGISTRATE
            .blockEntity("pyral_fluid_tank", PyralFluidTankBlockEntity::new)
            .validBlocks(CreateMPNTBlocks.PYRAL_FLUID_TANK)
            .renderer(() -> PyralFluidTankRenderer::new)
            .register();

    public static void register() {
    }
}

