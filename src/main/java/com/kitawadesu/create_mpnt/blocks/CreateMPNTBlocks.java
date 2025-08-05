package com.kitawadesu.create_mpnt.blocks;

import com.kitawadesu.create_mpnt.CreateMPNT;
import com.kitawadesu.create_mpnt.blocks.util.CMPNTSharedProperties;
import com.kitawadesu.create_mpnt.blocks.util.funnels.*;
import com.kitawadesu.create_mpnt.blocks.util.pipes.andesite.AndesiteFluidPipeBlock;
import com.kitawadesu.create_mpnt.blocks.util.pipes.andesite.AndesitePipeAttachmentModel;
import com.kitawadesu.create_mpnt.blocks.util.pipes.andesite.GlassAndesiteFluidPipeBlock;
import com.kitawadesu.create_mpnt.blocks.util.pipes.brass.BrassFluidPipeBlock;
import com.kitawadesu.create_mpnt.blocks.util.pipes.brass.BrassPipeAttachmentModel;
import com.kitawadesu.create_mpnt.blocks.util.pipes.brass.GlassBrassFluidPipeBlock;
import com.kitawadesu.create_mpnt.blocks.util.pipes.gold.GlassGoldFluidPipeBlock;
import com.kitawadesu.create_mpnt.blocks.util.pipes.gold.GoldFluidPipeBlock;
import com.kitawadesu.create_mpnt.blocks.util.pipes.gold.GoldPipeAttachmentModel;
import com.kitawadesu.create_mpnt.blocks.util.pipes.iron.GlassIronFluidPipeBlock;
import com.kitawadesu.create_mpnt.blocks.util.pipes.iron.IronFluidPipeBlock;
import com.kitawadesu.create_mpnt.blocks.util.pipes.iron.IronPipeAttachmentModel;
import com.kitawadesu.create_mpnt.blocks.util.pipes.netherite.GlassNetheriteFluidPipeBlock;
import com.kitawadesu.create_mpnt.blocks.util.pipes.netherite.NetheriteFluidPipeBlock;
import com.kitawadesu.create_mpnt.blocks.util.pipes.netherite.NetheritePipeAttachmentModel;
import com.kitawadesu.create_mpnt.blocks.util.pipes.zinc.GlassZincFluidPipeBlock;
import com.kitawadesu.create_mpnt.blocks.util.pipes.zinc.ZincFluidPipeBlock;
import com.kitawadesu.create_mpnt.blocks.util.pipes.zinc.ZincPipeAttachmentModel;
import com.kitawadesu.create_mpnt.blocks.util.pumps.*;
import com.kitawadesu.create_mpnt.blocks.util.smart_funnels.*;
import com.kitawadesu.create_mpnt.blocks.util.stress.CMPNTStress;
import com.kitawadesu.create_mpnt.blocks.util.tanks.Netherite.NetheriteFluidTankBlock;
import com.kitawadesu.create_mpnt.blocks.util.tanks.Netherite.NetheriteFluidTankModel;
import com.kitawadesu.create_mpnt.blocks.util.tanks.andesite.AndesiteFluidTankBlock;
import com.kitawadesu.create_mpnt.blocks.util.tanks.andesite.AndesiteFluidTankModel;
import com.kitawadesu.create_mpnt.blocks.util.tanks.brass.BrassFluidTankBlock;
import com.kitawadesu.create_mpnt.blocks.util.tanks.brass.BrassFluidTankModel;
import com.kitawadesu.create_mpnt.blocks.util.tanks.gold.GoldenFluidTankBlock;
import com.kitawadesu.create_mpnt.blocks.util.tanks.gold.GoldenFluidTankModel;
import com.kitawadesu.create_mpnt.blocks.util.tanks.iron.IronFluidTankBlock;
import com.kitawadesu.create_mpnt.blocks.util.tanks.iron.IronFluidTankModel;
import com.kitawadesu.create_mpnt.blocks.util.tanks.zinc.ZincFluidTankBlock;
import com.kitawadesu.create_mpnt.blocks.util.tanks.zinc.ZincFluidTankModel;
import com.kitawadesu.create_mpnt.compat.blocks.util.funnels.PyralFunnel;
import com.kitawadesu.create_mpnt.compat.blocks.util.funnels.RosariteFunnel;
import com.kitawadesu.create_mpnt.compat.blocks.util.funnels.RoseGoldenFunnel;
import com.kitawadesu.create_mpnt.compat.blocks.util.funnels.ValkyrumFunnel;
import com.kitawadesu.create_mpnt.compat.blocks.util.pipes.pyral.GlassPyralFluidPipeBlock;
import com.kitawadesu.create_mpnt.compat.blocks.util.pipes.pyral.PyralFluidPipeBlock;
import com.kitawadesu.create_mpnt.compat.blocks.util.pipes.pyral.PyralPipeAttachmentModel;
import com.kitawadesu.create_mpnt.compat.blocks.util.pipes.rosarite.GlassRosariteFluidPipeBlock;
import com.kitawadesu.create_mpnt.compat.blocks.util.pipes.rosarite.RosariteFluidPipeBlock;
import com.kitawadesu.create_mpnt.compat.blocks.util.pipes.rosarite.RosaritePipeAttachmentModel;
import com.kitawadesu.create_mpnt.compat.blocks.util.pipes.rose_gold.GlassRoseGoldFluidPipeBlock;
import com.kitawadesu.create_mpnt.compat.blocks.util.pipes.rose_gold.RoseGoldFluidPipeBlock;
import com.kitawadesu.create_mpnt.compat.blocks.util.pipes.rose_gold.RoseGoldPipeAttachmentModel;
import com.kitawadesu.create_mpnt.compat.blocks.util.pipes.valkyrum.GlassValkyrumFluidPipeBlock;
import com.kitawadesu.create_mpnt.compat.blocks.util.pipes.valkyrum.ValkyrumFluidPipeBlock;
import com.kitawadesu.create_mpnt.compat.blocks.util.pipes.valkyrum.ValkyrumPipeAttachmentModel;
import com.kitawadesu.create_mpnt.compat.blocks.util.pumps.PyralPumpBlock;
import com.kitawadesu.create_mpnt.compat.blocks.util.pumps.RosaritePumpBlock;
import com.kitawadesu.create_mpnt.compat.blocks.util.pumps.RoseGoldPumpBlock;
import com.kitawadesu.create_mpnt.compat.blocks.util.pumps.ValkyrumPumpBlock;
import com.kitawadesu.create_mpnt.compat.blocks.util.smart_funnels.SmartPyralFunnel;
import com.kitawadesu.create_mpnt.compat.blocks.util.smart_funnels.SmartRosariteFunnel;
import com.kitawadesu.create_mpnt.compat.blocks.util.smart_funnels.SmartRoseGoldenFunnel;
import com.kitawadesu.create_mpnt.compat.blocks.util.smart_funnels.SmartValkyrumFunnel;
import com.kitawadesu.create_mpnt.compat.blocks.util.tanks.pyral.PyralFluidTankBlock;
import com.kitawadesu.create_mpnt.compat.blocks.util.tanks.pyral.PyralFluidTankModel;
import com.kitawadesu.create_mpnt.compat.blocks.util.tanks.rosarite.RosariteFluidTankBlock;
import com.kitawadesu.create_mpnt.compat.blocks.util.tanks.rosarite.RosariteFluidTankModel;
import com.kitawadesu.create_mpnt.compat.blocks.util.tanks.rose_gold.RoseGoldenFluidTankBlock;
import com.kitawadesu.create_mpnt.compat.blocks.util.tanks.rose_gold.RoseGoldenFluidTankModel;
import com.kitawadesu.create_mpnt.compat.blocks.util.tanks.valkyrum.ValkyrumFluidTankBlock;
import com.kitawadesu.create_mpnt.compat.blocks.util.tanks.valkyrum.ValkyrumFluidTankModel;
import com.simibubi.create.*;
import com.simibubi.create.content.decoration.MetalLadderBlock;
import com.simibubi.create.content.fluids.drain.ItemDrainBlock;
import com.simibubi.create.content.fluids.tank.*;
import com.simibubi.create.content.logistics.funnel.*;
import com.simibubi.create.foundation.block.render.ReducedDestroyEffects;
import com.simibubi.create.foundation.data.*;
import com.tterrag.registrate.util.DataIngredient;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;

import static com.simibubi.create.api.behaviour.display.DisplaySource.displaySource;
import static com.simibubi.create.api.behaviour.movement.MovementBehaviour.movementBehaviour;
import static com.simibubi.create.api.contraption.storage.fluid.MountedFluidStorageType.mountedFluidStorage;
import static com.simibubi.create.foundation.data.ModelGen.customItemModel;
import static com.simibubi.create.foundation.data.TagGen.pickaxeOnly;
import static net.minecraft.world.item.Items.*;

@SuppressWarnings("removal")
public class CreateMPNTBlocks {
    // Don't duplicate! Assume REGISTRATE is passed in from main mod class
    private static final CreateRegistrate REGISTRATE = CreateMPNT.registrate();

    public static final BlockEntry<ZincFluidPipeBlock> ZINC_FLUID_PIPE = REGISTRATE
            .block("zinc_fluid_pipe", ZincFluidPipeBlock::new)
            .initialProperties(CMPNTSharedProperties::regularMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> ZincPipeAttachmentModel::withAO))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<GlassZincFluidPipeBlock> GLASS_ZINC_FLUID_PIPE =
            REGISTRATE.block("glass_zinc_fluid_pipe", GlassZincFluidPipeBlock::new)
                    .initialProperties(CMPNTSharedProperties::regularMetal)
                    .properties(p -> p.sound(SoundType.COPPER))
                    .properties(p -> p.noOcclusion())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(pickaxeOnly())
                    .onRegister(CreateRegistrate.blockModel(() -> ZincPipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, ZINC_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<ZincPumpBlock> ZINC_MECHANICAL_PUMP = REGISTRATE
            .block("zinc_mechanical_pump", ZincPumpBlock::new)
            .initialProperties(CMPNTSharedProperties::regularMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.mapColor(MapColor.STONE))
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> ZincPipeAttachmentModel::withAO))
            .transform(CMPNTStress.setImpact(4.0))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<GoldFluidPipeBlock> GOLDEN_FLUID_PIPE = REGISTRATE
            .block("golden_fluid_pipe", GoldFluidPipeBlock::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> GoldPipeAttachmentModel::withAO))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<GlassGoldFluidPipeBlock> GLASS_GOLDEN_FLUID_PIPE =
            REGISTRATE.block("glass_golden_fluid_pipe", GlassGoldFluidPipeBlock::new)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.sound(SoundType.COPPER))
                    .properties(p -> p.noOcclusion())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(pickaxeOnly())
                    .onRegister(CreateRegistrate.blockModel(() -> GoldPipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, GOLDEN_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<GoldPumpBlock> GOLDEN_MECHANICAL_PUMP = REGISTRATE
            .block("golden_mechanical_pump", GoldPumpBlock::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.mapColor(MapColor.STONE))
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> GoldPipeAttachmentModel::withAO))
            .transform(CMPNTStress.setImpact(4.0))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<AndesiteFluidPipeBlock> ANDESITE_FLUID_PIPE = REGISTRATE
            .block("andesite_fluid_pipe", AndesiteFluidPipeBlock::new)
            .initialProperties(SharedProperties::stone)
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> AndesitePipeAttachmentModel::withAO))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<GlassAndesiteFluidPipeBlock> GLASS_ANDESITE_FLUID_PIPE =
            REGISTRATE.block("glass_andesite_fluid_pipe", GlassAndesiteFluidPipeBlock::new)
                    .initialProperties(SharedProperties::stone)
                    .properties(p -> p.noOcclusion())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(pickaxeOnly())
                    .onRegister(CreateRegistrate.blockModel(() -> AndesitePipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, ANDESITE_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<AndesitePumpBlock> ANDESITE_MECHANICAL_PUMP = REGISTRATE
            .block("andesite_mechanical_pump", AndesitePumpBlock::new)
            .initialProperties(SharedProperties::stone)
            .properties(p -> p.mapColor(MapColor.STONE))
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> AndesitePipeAttachmentModel::withAO))
            .transform(CMPNTStress.setImpact(4.0))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<BrassFluidPipeBlock> BRASS_FLUID_PIPE = REGISTRATE
            .block("brass_fluid_pipe", BrassFluidPipeBlock::new)
            .initialProperties(CMPNTSharedProperties::regularMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> BrassPipeAttachmentModel::withAO))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<GlassBrassFluidPipeBlock> GLASS_BRASS_FLUID_PIPE =
            REGISTRATE.block("glass_brass_fluid_pipe", GlassBrassFluidPipeBlock::new)
                    .initialProperties(CMPNTSharedProperties::regularMetal)
                    .properties(p -> p.sound(SoundType.COPPER))
                    .properties(p -> p.noOcclusion())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(pickaxeOnly())
                    .onRegister(CreateRegistrate.blockModel(() -> BrassPipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, BRASS_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<BrassPumpBlock> BRASS_MECHANICAL_PUMP = REGISTRATE
            .block("brass_mechanical_pump", BrassPumpBlock::new)
            .initialProperties(CMPNTSharedProperties::regularMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.mapColor(MapColor.STONE))
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> BrassPipeAttachmentModel::withAO))
            .transform(CMPNTStress.setImpact(4.0))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<IronFluidPipeBlock> IRON_FLUID_PIPE = REGISTRATE
            .block("iron_fluid_pipe", IronFluidPipeBlock::new)
            .initialProperties(CMPNTSharedProperties::regularMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> IronPipeAttachmentModel::withAO))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<GlassIronFluidPipeBlock> GLASS_IRON_FLUID_PIPE =
            REGISTRATE.block("glass_iron_fluid_pipe", GlassIronFluidPipeBlock::new)
                    .initialProperties(CMPNTSharedProperties::regularMetal)
                    .properties(p -> p.sound(SoundType.COPPER))
                    .properties(p -> p.noOcclusion())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(pickaxeOnly())
                    .onRegister(CreateRegistrate.blockModel(() -> IronPipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, IRON_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<IronPumpBlock> IRON_MECHANICAL_PUMP = REGISTRATE
            .block("iron_mechanical_pump", IronPumpBlock::new)
            .initialProperties(CMPNTSharedProperties::regularMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.mapColor(MapColor.STONE))
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> IronPipeAttachmentModel::withAO))
            .transform(CMPNTStress.setImpact(4.0))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<NetheriteFluidPipeBlock> NETHERITE_FLUID_PIPE = REGISTRATE
            .block("netherite_fluid_pipe", NetheriteFluidPipeBlock::new)
            .initialProperties(SharedProperties::netheriteMetal)
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> NetheritePipeAttachmentModel::withAO))
            .item()
            .properties(Item.Properties::fireResistant)
            .transform(customItemModel())
            .register();

    public static final BlockEntry<GlassNetheriteFluidPipeBlock> GLASS_NETHERITE_FLUID_PIPE =
            REGISTRATE.block("glass_netherite_fluid_pipe", GlassNetheriteFluidPipeBlock::new)
                    .initialProperties(SharedProperties::netheriteMetal)
                    .properties(p -> p.noOcclusion())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(pickaxeOnly())
                    .onRegister(CreateRegistrate.blockModel(() -> NetheritePipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, NETHERITE_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<NetheritePumpBlock> NETHERITE_MECHANICAL_PUMP = REGISTRATE
            .block("netherite_mechanical_pump", NetheritePumpBlock::new)
            .initialProperties(SharedProperties::netheriteMetal)
            .properties(p -> p.mapColor(MapColor.STONE))
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> NetheritePipeAttachmentModel::withAO))
            .transform(CMPNTStress.setImpact(4.0))
            .item()
            .properties(Item.Properties::fireResistant)
            .transform(customItemModel())
            .register();

    public static final BlockEntry<ZincFluidTankBlock> ZINC_FLUID_TANK = REGISTRATE
            .block("zinc_fluid_tank", ZincFluidTankBlock::regular)
            .initialProperties(CMPNTSharedProperties::regularMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.noOcclusion()
                    .isRedstoneConductor((p1, p2, p3) -> true))
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> ZincFluidTankModel::standard))
            .transform(displaySource(AllDisplaySources.BOILER))
            .transform(mountedFluidStorage(AllMountedStorageTypes.FLUID_TANK))
            .onRegister(movementBehaviour(new FluidTankMovementBehavior()))
            .addLayer(() -> RenderType::cutoutMipped)
            .item(FluidTankItem::new)
            .model(AssetLookup.customBlockItemModel("_", "block_single_window"))
            .build()
            .register();

    public static final BlockEntry<GoldenFluidTankBlock> GOLDEN_FLUID_TANK = REGISTRATE
            .block("golden_fluid_tank", GoldenFluidTankBlock::regular)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.noOcclusion()
                    .isRedstoneConductor((p1, p2, p3) -> true))
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> GoldenFluidTankModel::standard))
            .transform(displaySource(AllDisplaySources.BOILER))
            .transform(mountedFluidStorage(AllMountedStorageTypes.FLUID_TANK))
            .onRegister(movementBehaviour(new FluidTankMovementBehavior()))
            .addLayer(() -> RenderType::cutoutMipped)
            .item(FluidTankItem::new)
            .model(AssetLookup.customBlockItemModel("_", "block_single_window"))
            .build()
            .register();

    public static final BlockEntry<AndesiteFluidTankBlock> ANDESITE_FLUID_TANK = REGISTRATE
            .block("andesite_fluid_tank", AndesiteFluidTankBlock::regular)
            .initialProperties(SharedProperties::stone)
            .properties(p -> p.noOcclusion()
                    .isRedstoneConductor((p1, p2, p3) -> true))
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> AndesiteFluidTankModel::standard))
            .transform(displaySource(AllDisplaySources.BOILER))
            .transform(mountedFluidStorage(AllMountedStorageTypes.FLUID_TANK))
            .onRegister(movementBehaviour(new FluidTankMovementBehavior()))
            .addLayer(() -> RenderType::cutoutMipped)
            .item(FluidTankItem::new)
            .model(AssetLookup.customBlockItemModel("_", "block_single_window"))
            .build()
            .register();

    public static final BlockEntry<BrassFluidTankBlock> BRASS_FLUID_TANK = REGISTRATE
            .block("brass_fluid_tank", BrassFluidTankBlock::regular)
            .initialProperties(CMPNTSharedProperties::regularMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.noOcclusion()
                    .isRedstoneConductor((p1, p2, p3) -> true))
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> BrassFluidTankModel::standard))
            .transform(displaySource(AllDisplaySources.BOILER))
            .transform(mountedFluidStorage(AllMountedStorageTypes.FLUID_TANK))
            .onRegister(movementBehaviour(new FluidTankMovementBehavior()))
            .addLayer(() -> RenderType::cutoutMipped)
            .item(FluidTankItem::new)
            .model(AssetLookup.customBlockItemModel("_", "block_single_window"))
            .build()
            .register();

    public static final BlockEntry<IronFluidTankBlock> IRON_FLUID_TANK = REGISTRATE
            .block("iron_fluid_tank", IronFluidTankBlock::regular)
            .initialProperties(CMPNTSharedProperties::regularMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.noOcclusion()
                    .isRedstoneConductor((p1, p2, p3) -> true))
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> IronFluidTankModel::standard))
            .transform(displaySource(AllDisplaySources.BOILER))
            .transform(mountedFluidStorage(AllMountedStorageTypes.FLUID_TANK))
            .onRegister(movementBehaviour(new FluidTankMovementBehavior()))
            .addLayer(() -> RenderType::cutoutMipped)
            .item(FluidTankItem::new)
            .model(AssetLookup.customBlockItemModel("_", "block_single_window"))
            .build()
            .register();

    public static final BlockEntry<NetheriteFluidTankBlock> NETHERITE_FLUID_TANK = REGISTRATE
            .block("netherite_fluid_tank", NetheriteFluidTankBlock::regular)
            .initialProperties(SharedProperties::netheriteMetal)
            .properties(p -> p.noOcclusion()
                    .isRedstoneConductor((p1, p2, p3) -> true))
            .transform(pickaxeOnly())
            .onRegister(CreateRegistrate.blockModel(() -> NetheriteFluidTankModel::standard))
            .transform(displaySource(AllDisplaySources.BOILER))
            .transform(mountedFluidStorage(AllMountedStorageTypes.FLUID_TANK))
            .onRegister(movementBehaviour(new FluidTankMovementBehavior()))
            .addLayer(() -> RenderType::cutoutMipped)
            .item(FluidTankItem::new)
            .properties(Item.Properties::fireResistant)
            .model(AssetLookup.customBlockItemModel("_", "block_single_window"))
            .build()
            .register();

    public static final BlockEntry<NormalZincFunnel> NORMAL_ZINC_FUNNEL =
            REGISTRATE.block("normal_zinc_funnel", NormalZincFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(CMPNTSharedProperties::regularMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.andesite()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> NORMAL_ZINC_BELT_FUNNEL =
            REGISTRATE.block("normal_zinc_belt_funnel", p -> new BeltFunnelBlock(NORMAL_ZINC_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(CMPNTSharedProperties::regularMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, NORMAL_ZINC_FUNNEL.get()))
                    .register();

    public static final BlockEntry<NormalBrassFunnel> NORMAL_BRASS_FUNNEL =
            REGISTRATE.block("normal_brass_funnel", NormalBrassFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(CMPNTSharedProperties::regularMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.andesite()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> NORMAL_BRASS_BELT_FUNNEL =
            REGISTRATE.block("normal_brass_belt_funnel", p -> new BeltFunnelBlock(NORMAL_BRASS_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(CMPNTSharedProperties::regularMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, NORMAL_BRASS_FUNNEL.get()))
                    .register();

    public static final BlockEntry<NormalCopperFunnel> NORMAL_COPPER_FUNNEL =
            REGISTRATE.block("normal_copper_funnel", NormalCopperFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::copperMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.andesite()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> NORMAL_COPPER_BELT_FUNNEL =
            REGISTRATE.block("normal_copper_belt_funnel", p -> new BeltFunnelBlock(NORMAL_COPPER_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::copperMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, NORMAL_COPPER_FUNNEL.get()))
                    .register();

    public static final BlockEntry<NormalGoldenFunnel> NORMAL_GOLDEN_FUNNEL =
            REGISTRATE.block("normal_golden_funnel", NormalGoldenFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.andesite()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> NORMAL_GOLDEN_BELT_FUNNEL =
            REGISTRATE.block("normal_golden_belt_funnel", p -> new BeltFunnelBlock(NORMAL_GOLDEN_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, NORMAL_GOLDEN_FUNNEL.get()))
                    .register();

    public static final BlockEntry<NormalIronFunnel> NORMAL_IRON_FUNNEL =
            REGISTRATE.block("normal_iron_funnel", NormalIronFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(CMPNTSharedProperties::regularMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.andesite()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> NORMAL_IRON_BELT_FUNNEL =
            REGISTRATE.block("normal_iron_belt_funnel", p -> new BeltFunnelBlock(NORMAL_IRON_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(CMPNTSharedProperties::regularMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, NORMAL_IRON_FUNNEL.get()))
                    .register();

    public static final BlockEntry<NormalNetheriteFunnel> NORMAL_NETHERITE_FUNNEL =
            REGISTRATE.block("normal_netherite_funnel", NormalNetheriteFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::netheriteMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.andesite()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .properties(Item.Properties::fireResistant)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> NORMAL_NETHERITE_BELT_FUNNEL =
            REGISTRATE.block("normal_netherite_belt_funnel", p -> new BeltFunnelBlock(NORMAL_NETHERITE_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::netheriteMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, NORMAL_NETHERITE_FUNNEL.get()))
                    .register();

    public static final BlockEntry<SmartZincFunnel> SMART_ZINC_FUNNEL =
            REGISTRATE.block("smart_zinc_funnel", SmartZincFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(CMPNTSharedProperties::regularMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.brass()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> SMART_ZINC_BELT_FUNNEL =
            REGISTRATE.block("smart_zinc_belt_funnel", p -> new BeltFunnelBlock(SMART_ZINC_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(CMPNTSharedProperties::regularMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, SMART_ZINC_FUNNEL.get()))
                    .register();

    public static final BlockEntry<SmartAndesiteFunnel> SMART_ANDESITE_FUNNEL =
            REGISTRATE.block("smart_andesite_funnel", SmartAndesiteFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::stone)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.brass()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> SMART_ANDESITE_BELT_FUNNEL =
            REGISTRATE.block("smart_andesite_belt_funnel", p -> new BeltFunnelBlock(SMART_ANDESITE_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::stone)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, SMART_ANDESITE_FUNNEL.get()))
                    .register();

    public static final BlockEntry<SmartCopperFunnel> SMART_COPPER_FUNNEL =
            REGISTRATE.block("smart_copper_funnel", SmartCopperFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::copperMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.brass()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> SMART_COPPER_BELT_FUNNEL =
            REGISTRATE.block("smart_copper_belt_funnel", p -> new BeltFunnelBlock(SMART_COPPER_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::copperMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, SMART_COPPER_FUNNEL.get()))
                    .register();

    public static final BlockEntry<SmartGoldenFunnel> SMART_GOLDEN_FUNNEL =
            REGISTRATE.block("smart_golden_funnel", SmartGoldenFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.brass()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> SMART_GOLDEN_BELT_FUNNEL =
            REGISTRATE.block("smart_golden_belt_funnel", p -> new BeltFunnelBlock(SMART_GOLDEN_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, SMART_GOLDEN_FUNNEL.get()))
                    .register();

    public static final BlockEntry<SmartIronFunnel> SMART_IRON_FUNNEL =
            REGISTRATE.block("smart_iron_funnel", SmartIronFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(CMPNTSharedProperties::regularMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.brass()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> SMART_IRON_BELT_FUNNEL =
            REGISTRATE.block("smart_iron_belt_funnel", p -> new BeltFunnelBlock(SMART_IRON_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(CMPNTSharedProperties::regularMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, SMART_IRON_FUNNEL.get()))
                    .register();

    public static final BlockEntry<SmartNetheriteFunnel> SMART_NETHERITE_FUNNEL =
            REGISTRATE.block("smart_netherite_funnel", SmartNetheriteFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::netheriteMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.brass()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .properties(Item.Properties::fireResistant)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> SMART_NETHERITE_BELT_FUNNEL =
            REGISTRATE.block("smart_netherite_belt_funnel", p -> new BeltFunnelBlock(SMART_NETHERITE_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::netheriteMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, SMART_NETHERITE_FUNNEL.get()))
                    .register();


    public static final BlockEntry<MetalLadderBlock> ZINC_LADDER =
            REGISTRATE.block("zinc_ladder", MetalLadderBlock::new)
                    .transform(BuilderTransformers.ladder("zinc", () -> DataIngredient.items(AllItems.ZINC_INGOT.get()),
                            MapColor.GLOW_LICHEN))
                    .register();

    public static final BlockEntry<MetalLadderBlock> GOLDEN_LADDER =
            REGISTRATE.block("golden_ladder", MetalLadderBlock::new)
                    .transform(BuilderTransformers.ladder("golden", () -> DataIngredient.items(GOLD_INGOT),
                            MapColor.GOLD))
                    .register();

    public static final BlockEntry<MetalLadderBlock> IRON_LADDER =
            REGISTRATE.block("iron_ladder", MetalLadderBlock::new)
                    .transform(BuilderTransformers.ladder("iron", () -> DataIngredient.items(IRON_INGOT),
                            MapColor.WOOL))
                    .register();

    public static final BlockEntry<MetalLadderBlock> NETHERITE_LADDER =
            REGISTRATE.block("netherite_ladder", MetalLadderBlock::new)
                    .transform(BuilderTransformers.ladder("netherite", () -> DataIngredient.items(NETHERITE_INGOT),
                            MapColor.COLOR_BLACK))
                    .properties(p -> p.sound(SoundType.NETHERITE_BLOCK))
                    .register();






    public static final BlockEntry<RoseGoldFluidPipeBlock> ROSE_GOLDEN_FLUID_PIPE = REGISTRATE
            .block("rose_golden_fluid_pipe", RoseGoldFluidPipeBlock::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.pipe())
            .onRegister(CreateRegistrate.blockModel(() -> RoseGoldPipeAttachmentModel::withAO))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<GlassRoseGoldFluidPipeBlock> GLASS_ROSE_GOLDEN_FLUID_PIPE =
            REGISTRATE.block("glass_rose_golden_fluid_pipe", GlassRoseGoldFluidPipeBlock::new)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.sound(SoundType.COPPER))
                    .properties(p -> p.noOcclusion())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(pickaxeOnly())
                    .blockstate((c, p) -> {
                        p.getVariantBuilder(c.getEntry())
                                .forAllStatesExcept(state -> {
                                    Direction.Axis axis = state.getValue(BlockStateProperties.AXIS);
                                    return ConfiguredModel.builder()
                                            .modelFile(p.models()
                                                    .getExistingFile(p.modLoc("block/rose_gold_fluid_pipe/window")))
                                            .uvLock(false)
                                            .rotationX(axis == Direction.Axis.Y ? 0 : 90)
                                            .rotationY(axis == Direction.Axis.X ? 90 : 0)
                                            .build();
                                }, BlockStateProperties.WATERLOGGED);
                    })
                    .onRegister(CreateRegistrate.blockModel(() -> RoseGoldPipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, ROSE_GOLDEN_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<RoseGoldPumpBlock> ROSE_GOLDEN_MECHANICAL_PUMP = REGISTRATE
            .block("rose_golden_mechanical_pump", RoseGoldPumpBlock::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.mapColor(MapColor.STONE))
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.directionalBlockProviderIgnoresWaterlogged(true))
            .onRegister(CreateRegistrate.blockModel(() -> RoseGoldPipeAttachmentModel::withAO))
            .transform(CMPNTStress.setImpact(4.0))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<RosariteFluidPipeBlock> ROSARITE_FLUID_PIPE = REGISTRATE
            .block("rosarite_fluid_pipe", RosariteFluidPipeBlock::new)
            .initialProperties(SharedProperties::netheriteMetal)
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.pipe())
            .onRegister(CreateRegistrate.blockModel(() -> RosaritePipeAttachmentModel::withAO))
            .item()
            .properties(Item.Properties::fireResistant)
            .transform(customItemModel())
            .register();

    public static final BlockEntry<GlassRosariteFluidPipeBlock> GLASS_ROSARITE_FLUID_PIPE =
            REGISTRATE.block("glass_rosarite_fluid_pipe", GlassRosariteFluidPipeBlock::new)
                    .initialProperties(SharedProperties::netheriteMetal)
                    .properties(p -> p.noOcclusion())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(pickaxeOnly())
                    .blockstate((c, p) -> {
                        p.getVariantBuilder(c.getEntry())
                                .forAllStatesExcept(state -> {
                                    Direction.Axis axis = state.getValue(BlockStateProperties.AXIS);
                                    return ConfiguredModel.builder()
                                            .modelFile(p.models()
                                                    .getExistingFile(p.modLoc("block/rosarite_fluid_pipe/window")))
                                            .uvLock(false)
                                            .rotationX(axis == Direction.Axis.Y ? 0 : 90)
                                            .rotationY(axis == Direction.Axis.X ? 90 : 0)
                                            .build();
                                }, BlockStateProperties.WATERLOGGED);
                    })
                    .onRegister(CreateRegistrate.blockModel(() -> RosaritePipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, ROSARITE_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<RosaritePumpBlock> ROSARITE_MECHANICAL_PUMP = REGISTRATE
            .block("rosarite_mechanical_pump", RosaritePumpBlock::new)
            .initialProperties(SharedProperties::netheriteMetal)
            .properties(p -> p.mapColor(MapColor.STONE))
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.directionalBlockProviderIgnoresWaterlogged(true))
            .onRegister(CreateRegistrate.blockModel(() -> RosaritePipeAttachmentModel::withAO))
            .transform(CMPNTStress.setImpact(4.0))
            .item()
            .properties(Item.Properties::fireResistant)
            .transform(customItemModel())
            .register();

    public static final BlockEntry<ValkyrumFluidPipeBlock> VALKYRUM_FLUID_PIPE = REGISTRATE
            .block("valkyrum_fluid_pipe", ValkyrumFluidPipeBlock::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.pipe())
            .onRegister(CreateRegistrate.blockModel(() -> ValkyrumPipeAttachmentModel::withAO))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<GlassValkyrumFluidPipeBlock> GLASS_VALKYRUM_FLUID_PIPE =
            REGISTRATE.block("glass_valkyrum_fluid_pipe", GlassValkyrumFluidPipeBlock::new)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.sound(SoundType.COPPER))
                    .properties(p -> p.noOcclusion())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(pickaxeOnly())
                    .blockstate((c, p) -> {
                        p.getVariantBuilder(c.getEntry())
                                .forAllStatesExcept(state -> {
                                    Direction.Axis axis = state.getValue(BlockStateProperties.AXIS);
                                    return ConfiguredModel.builder()
                                            .modelFile(p.models()
                                                    .getExistingFile(p.modLoc("block/rose_gold_fluid_pipe/window")))
                                            .uvLock(false)
                                            .rotationX(axis == Direction.Axis.Y ? 0 : 90)
                                            .rotationY(axis == Direction.Axis.X ? 90 : 0)
                                            .build();
                                }, BlockStateProperties.WATERLOGGED);
                    })
                    .onRegister(CreateRegistrate.blockModel(() -> ValkyrumPipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, VALKYRUM_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<ValkyrumPumpBlock> VALKYRUM_MECHANICAL_PUMP = REGISTRATE
            .block("valkyrum_mechanical_pump", ValkyrumPumpBlock::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.mapColor(MapColor.STONE))
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.directionalBlockProviderIgnoresWaterlogged(true))
            .onRegister(CreateRegistrate.blockModel(() -> ValkyrumPipeAttachmentModel::withAO))
            .transform(CMPNTStress.setImpact(4.0))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<PyralFluidPipeBlock> PYRAL_FLUID_PIPE = REGISTRATE
            .block("pyral_fluid_pipe", PyralFluidPipeBlock::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.pipe())
            .onRegister(CreateRegistrate.blockModel(() -> PyralPipeAttachmentModel::withAO))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<GlassPyralFluidPipeBlock> GLASS_PYRAL_FLUID_PIPE =
            REGISTRATE.block("glass_pyral_fluid_pipe", GlassPyralFluidPipeBlock::new)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.sound(SoundType.COPPER))
                    .properties(p -> p.noOcclusion())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(pickaxeOnly())
                    .blockstate((c, p) -> {
                        p.getVariantBuilder(c.getEntry())
                                .forAllStatesExcept(state -> {
                                    Direction.Axis axis = state.getValue(BlockStateProperties.AXIS);
                                    return ConfiguredModel.builder()
                                            .modelFile(p.models()
                                                    .getExistingFile(p.modLoc("block/rose_gold_fluid_pipe/window")))
                                            .uvLock(false)
                                            .rotationX(axis == Direction.Axis.Y ? 0 : 90)
                                            .rotationY(axis == Direction.Axis.X ? 90 : 0)
                                            .build();
                                }, BlockStateProperties.WATERLOGGED);
                    })
                    .onRegister(CreateRegistrate.blockModel(() -> PyralPipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, PYRAL_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<PyralPumpBlock> PYRAL_MECHANICAL_PUMP = REGISTRATE
            .block("pyral_mechanical_pump", PyralPumpBlock::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.mapColor(MapColor.STONE))
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.directionalBlockProviderIgnoresWaterlogged(true))
            .onRegister(CreateRegistrate.blockModel(() -> PyralPipeAttachmentModel::withAO))
            .transform(CMPNTStress.setImpact(4.0))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<RoseGoldenFluidTankBlock> ROSE_GOLDEN_FLUID_TANK = REGISTRATE
            .block("rose_golden_fluid_tank", RoseGoldenFluidTankBlock::regular)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.noOcclusion()
                    .isRedstoneConductor((p1, p2, p3) -> true))
            .transform(pickaxeOnly())
            .blockstate(new FluidTankGenerator()::generate)
            .onRegister(CreateRegistrate.blockModel(() -> RoseGoldenFluidTankModel::standard))
            .transform(displaySource(AllDisplaySources.BOILER))
            .transform(mountedFluidStorage(AllMountedStorageTypes.FLUID_TANK))
            .onRegister(movementBehaviour(new FluidTankMovementBehavior()))
            .addLayer(() -> RenderType::cutoutMipped)
            .item(FluidTankItem::new)
            .model(AssetLookup.customBlockItemModel("_", "block_single_window"))
            .build()
            .register();

    public static final BlockEntry<RosariteFluidTankBlock> ROSARITE_FLUID_TANK = REGISTRATE
            .block("rosarite_fluid_tank", RosariteFluidTankBlock::regular)
            .initialProperties(SharedProperties::netheriteMetal)
            .properties(p -> p.noOcclusion()
                    .isRedstoneConductor((p1, p2, p3) -> true))
            .transform(pickaxeOnly())
            .blockstate(new FluidTankGenerator()::generate)
            .onRegister(CreateRegistrate.blockModel(() -> RosariteFluidTankModel::standard))
            .transform(displaySource(AllDisplaySources.BOILER))
            .transform(mountedFluidStorage(AllMountedStorageTypes.FLUID_TANK))
            .onRegister(movementBehaviour(new FluidTankMovementBehavior()))
            .addLayer(() -> RenderType::cutoutMipped)
            .item(FluidTankItem::new)
            .properties(Item.Properties::fireResistant)
            .model(AssetLookup.customBlockItemModel("_", "block_single_window"))
            .build()
            .register();

    public static final BlockEntry<ValkyrumFluidTankBlock> VALKYRUM_FLUID_TANK = REGISTRATE
            .block("valkyrum_fluid_tank", ValkyrumFluidTankBlock::regular)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.noOcclusion()
                    .isRedstoneConductor((p1, p2, p3) -> true))
            .transform(pickaxeOnly())
            .blockstate(new FluidTankGenerator()::generate)
            .onRegister(CreateRegistrate.blockModel(() -> ValkyrumFluidTankModel::standard))
            .transform(displaySource(AllDisplaySources.BOILER))
            .transform(mountedFluidStorage(AllMountedStorageTypes.FLUID_TANK))
            .onRegister(movementBehaviour(new FluidTankMovementBehavior()))
            .addLayer(() -> RenderType::cutoutMipped)
            .item(FluidTankItem::new)
            .model(AssetLookup.customBlockItemModel("_", "block_single_window"))
            .build()
            .register();

    public static final BlockEntry<PyralFluidTankBlock> PYRAL_FLUID_TANK = REGISTRATE
            .block("pyral_fluid_tank", PyralFluidTankBlock::regular)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.sound(SoundType.COPPER))
            .properties(p -> p.noOcclusion()
                    .isRedstoneConductor((p1, p2, p3) -> true))
            .transform(pickaxeOnly())
            .blockstate(new FluidTankGenerator()::generate)
            .onRegister(CreateRegistrate.blockModel(() -> PyralFluidTankModel::standard))
            .transform(displaySource(AllDisplaySources.BOILER))
            .transform(mountedFluidStorage(AllMountedStorageTypes.FLUID_TANK))
            .onRegister(movementBehaviour(new FluidTankMovementBehavior()))
            .addLayer(() -> RenderType::cutoutMipped)
            .item(FluidTankItem::new)
            .properties(Item.Properties::fireResistant)
            .model(AssetLookup.customBlockItemModel("_", "block_single_window"))
            .build()
            .register();

    public static final BlockEntry<MetalLadderBlock> ROSE_GOLDEN_LADDER =
            REGISTRATE.block("rose_golden_ladder", MetalLadderBlock::new)
                    .transform(BuilderTransformers.ladder(
                            "rose_gold",
                            () -> DataIngredient.items(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("more_stuff", "rose_gold_ingot"))),
                            MapColor.COLOR_PINK
                    ))
                    .register();

    public static final BlockEntry<MetalLadderBlock> ROSARITE_LADDER =
            REGISTRATE.block("rosarite_ladder", MetalLadderBlock::new)
                    .transform(BuilderTransformers.ladder(
                            "rosarite",
                            () -> DataIngredient.items(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("more_stuff", "rosarite_ingot"))),
                            MapColor.COLOR_PINK
                    ))
                    .properties(p -> p.sound(SoundType.NETHERITE_BLOCK))
                    .register();

    public static final BlockEntry<RoseGoldenFunnel> NORMAL_ROSE_GOLDEN_FUNNEL =
            REGISTRATE.block("normal_rose_golden_funnel", RoseGoldenFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.andesite()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> NORMAL_ROSE_GOLDEN_BELT_FUNNEL =
            REGISTRATE.block("normal_rose_golden_belt_funnel", p -> new BeltFunnelBlock(NORMAL_ROSE_GOLDEN_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, NORMAL_ROSE_GOLDEN_FUNNEL.get()))
                    .register();

    public static final BlockEntry<RosariteFunnel> NORMAL_ROSARITE_FUNNEL =
            REGISTRATE.block("normal_rosarite_funnel", RosariteFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::netheriteMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.andesite()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .properties(Item.Properties::fireResistant)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> NORMAL_ROSARITE_BELT_FUNNEL =
            REGISTRATE.block("normal_rosarite_belt_funnel", p -> new BeltFunnelBlock(NORMAL_ROSARITE_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::netheriteMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, NORMAL_ROSARITE_FUNNEL.get()))
                    .register();

    public static final BlockEntry<ValkyrumFunnel> NORMAL_VALKYRUM_FUNNEL =
            REGISTRATE.block("normal_valkyrum_funnel", ValkyrumFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.andesite()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> NORMAL_VALKYRUM_BELT_FUNNEL =
            REGISTRATE.block("normal_valkyrum_belt_funnel", p -> new BeltFunnelBlock(NORMAL_VALKYRUM_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, NORMAL_VALKYRUM_FUNNEL.get()))
                    .register();

    public static final BlockEntry<PyralFunnel> NORMAL_PYRAL_FUNNEL =
            REGISTRATE.block("normal_pyral_funnel", PyralFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.andesite()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .properties(Item.Properties::fireResistant)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> NORMAL_PYRAL_BELT_FUNNEL =
            REGISTRATE.block("normal_pyral_belt_funnel", p -> new BeltFunnelBlock(NORMAL_PYRAL_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, NORMAL_PYRAL_FUNNEL.get()))
                    .register();

    public static final BlockEntry<SmartRoseGoldenFunnel> SMART_ROSE_GOLDEN_FUNNEL =
            REGISTRATE.block("smart_rose_golden_funnel", SmartRoseGoldenFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.brass()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> SMART_ROSE_GOLDEN_BELT_FUNNEL =
            REGISTRATE.block("smart_rose_golden_belt_funnel", p -> new BeltFunnelBlock(SMART_ROSE_GOLDEN_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, SMART_ROSE_GOLDEN_FUNNEL.get()))
                    .register();

    public static final BlockEntry<SmartRosariteFunnel> SMART_ROSARITE_FUNNEL =
            REGISTRATE.block("smart_rosarite_funnel", SmartRosariteFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::netheriteMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.brass()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .properties(Item.Properties::fireResistant)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> SMART_ROSARITE_BELT_FUNNEL =
            REGISTRATE.block("smart_rosarite_belt_funnel", p -> new BeltFunnelBlock(SMART_ROSARITE_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::netheriteMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, SMART_ROSARITE_FUNNEL.get()))
                    .register();

    public static final BlockEntry<SmartValkyrumFunnel> SMART_VALKYRUM_FUNNEL =
            REGISTRATE.block("smart_valkyrum_funnel", SmartValkyrumFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.brass()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> SMART_VALKYRUM_BELT_FUNNEL =
            REGISTRATE.block("smart_valkyrum_belt_funnel", p -> new BeltFunnelBlock(SMART_VALKYRUM_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, SMART_VALKYRUM_FUNNEL.get()))
                    .register();

    public static final BlockEntry<SmartPyralFunnel> SMART_PYRAL_FUNNEL =
            REGISTRATE.block("smart_pyral_funnel", SmartPyralFunnel::new)
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> ReducedDestroyEffects::new)
                    .onRegister(movementBehaviour(FunnelMovementBehaviour.brass()))
                    .blockstate(new FunnelGenerator("brass", true)::generate)
                    .item(FunnelItem::new)
                    .properties(Item.Properties::fireResistant)
                    .tag(AllTags.AllItemTags.CONTRAPTION_CONTROLLED.tag)
                    .model(FunnelGenerator.itemModel("brass"))
                    .build()
                    .register();

    public static final BlockEntry<BeltFunnelBlock> SMART_PYRAL_BELT_FUNNEL =
            REGISTRATE.block("smart_pyral_belt_funnel", p -> new BeltFunnelBlock(SMART_PYRAL_FUNNEL, p))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_YELLOW))
                    .transform(pickaxeOnly())
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .clientExtension(() -> () -> new ReducedDestroyEffects())
                    .blockstate(new BeltFunnelGenerator("brass")::generate)
                    .loot((p, b) -> p.dropOther(b, SMART_PYRAL_FUNNEL.get()))
                    .register();

    public static void register() {// required!
    }
}
