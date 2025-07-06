package com.kitawadesu.create_mpnt.blocks;

import com.kitawadesu.create_mpnt.CreateMPNT;
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
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllDisplaySources;
import com.simibubi.create.AllItems;
import com.simibubi.create.AllMountedStorageTypes;
import com.simibubi.create.content.decoration.MetalLadderBlock;
import com.simibubi.create.content.fluids.tank.*;
import com.simibubi.create.foundation.data.*;
import com.tterrag.registrate.util.DataIngredient;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;

import static com.simibubi.create.api.behaviour.display.DisplaySource.displaySource;
import static com.simibubi.create.api.behaviour.movement.MovementBehaviour.movementBehaviour;
import static com.simibubi.create.api.contraption.storage.fluid.MountedFluidStorageType.mountedFluidStorage;
import static com.simibubi.create.foundation.data.ModelGen.customItemModel;
import static com.simibubi.create.foundation.data.TagGen.pickaxeOnly;

@SuppressWarnings("removal")
public class CreateMPNTBlocks {
    // Don't duplicate! Assume REGISTRATE is passed in from main mod class
    private static final CreateRegistrate REGISTRATE = CreateMPNT.registrate();

    public static final BlockEntry<ZincFluidPipeBlock> ZINC_FLUID_PIPE = REGISTRATE
            .block("zinc_fluid_pipe", ZincFluidPipeBlock::new)
            .initialProperties(AllBlocks.ZINC_BLOCK::get)
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.pipe())
            .onRegister(CreateRegistrate.blockModel(() -> ZincPipeAttachmentModel::withAO))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<GlassZincFluidPipeBlock> GLASS_ZINC_FLUID_PIPE =
            REGISTRATE.block("glass_zinc_fluid_pipe", GlassZincFluidPipeBlock::new)
                    .initialProperties(AllBlocks.ZINC_BLOCK::get)
                    .properties(p -> p.noOcclusion())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(pickaxeOnly())
                    .blockstate((c, p) -> {
                        p.getVariantBuilder(c.getEntry())
                                .forAllStatesExcept(state -> {
                                    Direction.Axis axis = state.getValue(BlockStateProperties.AXIS);
                                    return ConfiguredModel.builder()
                                            .modelFile(p.models()
                                                    .getExistingFile(p.modLoc("block/zinc_fluid_pipe/window")))
                                            .uvLock(false)
                                            .rotationX(axis == Direction.Axis.Y ? 0 : 90)
                                            .rotationY(axis == Direction.Axis.X ? 90 : 0)
                                            .build();
                                }, BlockStateProperties.WATERLOGGED);
                    })
                    .onRegister(CreateRegistrate.blockModel(() -> ZincPipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, ZINC_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<GoldFluidPipeBlock> GOLDEN_FLUID_PIPE = REGISTRATE
            .block("golden_fluid_pipe", GoldFluidPipeBlock::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.pipe())
            .onRegister(CreateRegistrate.blockModel(() -> GoldPipeAttachmentModel::withAO))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<GlassGoldFluidPipeBlock> GLASS_GOLDEN_FLUID_PIPE =
            REGISTRATE.block("glass_golden_fluid_pipe", GlassGoldFluidPipeBlock::new)
                    .initialProperties(SharedProperties::softMetal)
                    .properties(p -> p.noOcclusion())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(pickaxeOnly())
                    .blockstate((c, p) -> {
                        p.getVariantBuilder(c.getEntry())
                                .forAllStatesExcept(state -> {
                                    Direction.Axis axis = state.getValue(BlockStateProperties.AXIS);
                                    return ConfiguredModel.builder()
                                            .modelFile(p.models()
                                                    .getExistingFile(p.modLoc("block/gold_fluid_pipe/window")))
                                            .uvLock(false)
                                            .rotationX(axis == Direction.Axis.Y ? 0 : 90)
                                            .rotationY(axis == Direction.Axis.X ? 90 : 0)
                                            .build();
                                }, BlockStateProperties.WATERLOGGED);
                    })
                    .onRegister(CreateRegistrate.blockModel(() -> GoldPipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, GOLDEN_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<AndesiteFluidPipeBlock> ANDESITE_FLUID_PIPE = REGISTRATE
            .block("andesite_fluid_pipe", AndesiteFluidPipeBlock::new)
            .initialProperties(SharedProperties::stone)
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.pipe())
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
                    .blockstate((c, p) -> {
                        p.getVariantBuilder(c.getEntry())
                                .forAllStatesExcept(state -> {
                                    Direction.Axis axis = state.getValue(BlockStateProperties.AXIS);
                                    return ConfiguredModel.builder()
                                            .modelFile(p.models()
                                                    .getExistingFile(p.modLoc("block/andesite_fluid_pipe/window")))
                                            .uvLock(false)
                                            .rotationX(axis == Direction.Axis.Y ? 0 : 90)
                                            .rotationY(axis == Direction.Axis.X ? 90 : 0)
                                            .build();
                                }, BlockStateProperties.WATERLOGGED);
                    })
                    .onRegister(CreateRegistrate.blockModel(() -> AndesitePipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, ANDESITE_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<BrassFluidPipeBlock> BRASS_FLUID_PIPE = REGISTRATE
            .block("brass_fluid_pipe", BrassFluidPipeBlock::new)
            .initialProperties(AllBlocks.BRASS_BLOCK::get)
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.pipe())
            .onRegister(CreateRegistrate.blockModel(() -> BrassPipeAttachmentModel::withAO))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<GlassBrassFluidPipeBlock> GLASS_BRASS_FLUID_PIPE =
            REGISTRATE.block("glass_brass_fluid_pipe", GlassBrassFluidPipeBlock::new)
                    .initialProperties(AllBlocks.BRASS_BLOCK::get)
                    .properties(p -> p.noOcclusion())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(pickaxeOnly())
                    .blockstate((c, p) -> {
                        p.getVariantBuilder(c.getEntry())
                                .forAllStatesExcept(state -> {
                                    Direction.Axis axis = state.getValue(BlockStateProperties.AXIS);
                                    return ConfiguredModel.builder()
                                            .modelFile(p.models()
                                                    .getExistingFile(p.modLoc("block/brass_fluid_pipe/window")))
                                            .uvLock(false)
                                            .rotationX(axis == Direction.Axis.Y ? 0 : 90)
                                            .rotationY(axis == Direction.Axis.X ? 90 : 0)
                                            .build();
                                }, BlockStateProperties.WATERLOGGED);
                    })
                    .onRegister(CreateRegistrate.blockModel(() -> BrassPipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, BRASS_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<IronFluidPipeBlock> IRON_FLUID_PIPE = REGISTRATE
            .block("iron_fluid_pipe", IronFluidPipeBlock::new)
            .initialProperties(AllBlocks.ZINC_BLOCK::get)
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.pipe())
            .onRegister(CreateRegistrate.blockModel(() -> IronPipeAttachmentModel::withAO))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<GlassIronFluidPipeBlock> GLASS_IRON_FLUID_PIPE =
            REGISTRATE.block("glass_iron_fluid_pipe", GlassIronFluidPipeBlock::new)
                    .initialProperties(AllBlocks.ZINC_BLOCK::get)
                    .properties(p -> p.noOcclusion())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(pickaxeOnly())
                    .blockstate((c, p) -> {
                        p.getVariantBuilder(c.getEntry())
                                .forAllStatesExcept(state -> {
                                    Direction.Axis axis = state.getValue(BlockStateProperties.AXIS);
                                    return ConfiguredModel.builder()
                                            .modelFile(p.models()
                                                    .getExistingFile(p.modLoc("block/iron_fluid_pipe/window")))
                                            .uvLock(false)
                                            .rotationX(axis == Direction.Axis.Y ? 0 : 90)
                                            .rotationY(axis == Direction.Axis.X ? 90 : 0)
                                            .build();
                                }, BlockStateProperties.WATERLOGGED);
                    })
                    .onRegister(CreateRegistrate.blockModel(() -> IronPipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, IRON_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<NetheriteFluidPipeBlock> NETHERITE_FLUID_PIPE = REGISTRATE
            .block("netherite_fluid_pipe", NetheriteFluidPipeBlock::new)
            .initialProperties(SharedProperties::netheriteMetal)
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.pipe())
            .onRegister(CreateRegistrate.blockModel(() -> NetheritePipeAttachmentModel::withAO))
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<GlassNetheriteFluidPipeBlock> GLASS_NETHERITE_FLUID_PIPE =
            REGISTRATE.block("glass_netherite_fluid_pipe", GlassNetheriteFluidPipeBlock::new)
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
                                                    .getExistingFile(p.modLoc("block/netherite_fluid_pipe/window")))
                                            .uvLock(false)
                                            .rotationX(axis == Direction.Axis.Y ? 0 : 90)
                                            .rotationY(axis == Direction.Axis.X ? 90 : 0)
                                            .build();
                                }, BlockStateProperties.WATERLOGGED);
                    })
                    .onRegister(CreateRegistrate.blockModel(() -> NetheritePipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, NETHERITE_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<ZincFluidTankBlock> ZINC_FLUID_TANK = REGISTRATE
            .block("zinc_fluid_tank", ZincFluidTankBlock::regular)
            .initialProperties(AllBlocks.ZINC_BLOCK::get)
            .properties(p -> p.noOcclusion()
                    .isRedstoneConductor((p1, p2, p3) -> true))
            .transform(pickaxeOnly())
            .blockstate(new FluidTankGenerator()::generate)
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
            .properties(p -> p.noOcclusion()
                    .isRedstoneConductor((p1, p2, p3) -> true))
            .transform(pickaxeOnly())
            .blockstate(new FluidTankGenerator()::generate)
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
            .blockstate(new FluidTankGenerator()::generate)
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
            .initialProperties(AllBlocks.BRASS_BLOCK::get)
            .properties(p -> p.noOcclusion()
                    .isRedstoneConductor((p1, p2, p3) -> true))
            .transform(pickaxeOnly())
            .blockstate(new FluidTankGenerator()::generate)
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
            .initialProperties(AllBlocks.ZINC_BLOCK::get)
            .properties(p -> p.noOcclusion()
                    .isRedstoneConductor((p1, p2, p3) -> true))
            .transform(pickaxeOnly())
            .blockstate(new FluidTankGenerator()::generate)
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
            .blockstate(new FluidTankGenerator()::generate)
            .onRegister(CreateRegistrate.blockModel(() -> NetheriteFluidTankModel::standard))
            .transform(displaySource(AllDisplaySources.BOILER))
            .transform(mountedFluidStorage(AllMountedStorageTypes.FLUID_TANK))
            .onRegister(movementBehaviour(new FluidTankMovementBehavior()))
            .addLayer(() -> RenderType::cutoutMipped)
            .item(FluidTankItem::new)
            .model(AssetLookup.customBlockItemModel("_", "block_single_window"))
            .build()
            .register();

    public static final BlockEntry<MetalLadderBlock> ZINC_LADDER =
            REGISTRATE.block("zinc_ladder", MetalLadderBlock::new)
                    .transform(BuilderTransformers.ladder("zinc", () -> DataIngredient.items(AllItems.ZINC_INGOT.get()),
                            MapColor.GLOW_LICHEN))
                    .register();

    public static void register() {// required!
    }
}
