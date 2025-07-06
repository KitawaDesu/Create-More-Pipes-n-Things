package com.kitawadesu.create_mpnt.compat.more_stuff.blocks;

import com.kitawadesu.create_mpnt.CreateMPNT;
import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.util.pipes.rose_gold.GlassRoseGoldFluidPipeBlock;
import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.util.pipes.rose_gold.RoseGoldFluidPipeBlock;
import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.util.pipes.rose_gold.RoseGoldPipeAttachmentModel;
import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.util.pipes.rosarite.GlassRosariteFluidPipeBlock;
import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.util.pipes.rosarite.RosariteFluidPipeBlock;
import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.util.pipes.rosarite.RosaritePipeAttachmentModel;
import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.util.tanks.rosarite.RosariteFluidTankBlock;
import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.util.tanks.rosarite.RosariteFluidTankModel;
import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.util.tanks.rose_gold.RoseGoldenFluidTankBlock;
import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.util.tanks.rose_gold.RoseGoldenFluidTankModel;
import com.simibubi.create.AllDisplaySources;
import com.simibubi.create.AllMountedStorageTypes;
import com.simibubi.create.content.fluids.tank.FluidTankGenerator;
import com.simibubi.create.content.fluids.tank.FluidTankItem;
import com.simibubi.create.content.fluids.tank.FluidTankMovementBehavior;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;

import static com.simibubi.create.api.behaviour.display.DisplaySource.displaySource;
import static com.simibubi.create.api.behaviour.movement.MovementBehaviour.movementBehaviour;
import static com.simibubi.create.api.contraption.storage.fluid.MountedFluidStorageType.mountedFluidStorage;
import static com.simibubi.create.foundation.data.ModelGen.customItemModel;
import static com.simibubi.create.foundation.data.TagGen.pickaxeOnly;

public class MoreStuffCompatBlocks {
    // Don't duplicate! Assume REGISTRATE is passed in from main mod class
    private static final CreateRegistrate REGISTRATE = CreateMPNT.registrate();

    public static final BlockEntry<RoseGoldFluidPipeBlock> ROSE_GOLDEN_FLUID_PIPE = REGISTRATE
            .block("rose_golden_fluid_pipe", RoseGoldFluidPipeBlock::new)
            .initialProperties(SharedProperties::softMetal)
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

    public static final BlockEntry<RosariteFluidPipeBlock> ROSARITE_FLUID_PIPE = REGISTRATE
            .block("rosarite_fluid_pipe", RosariteFluidPipeBlock::new)
            .initialProperties(SharedProperties::netheriteMetal)
            .properties(p -> p.forceSolidOff())
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.pipe())
            .onRegister(CreateRegistrate.blockModel(() -> RosaritePipeAttachmentModel::withAO))
            .item()
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
                                                    .getExistingFile(p.modLoc("block/netherite_fluid_pipe/window")))
                                            .uvLock(false)
                                            .rotationX(axis == Direction.Axis.Y ? 0 : 90)
                                            .rotationY(axis == Direction.Axis.X ? 90 : 0)
                                            .build();
                                }, BlockStateProperties.WATERLOGGED);
                    })
                    .onRegister(CreateRegistrate.blockModel(() -> RosaritePipeAttachmentModel::withAO))
                    .loot((p, b) -> p.dropOther(b, ROSARITE_FLUID_PIPE.get()))
                    .register();

    public static final BlockEntry<RoseGoldenFluidTankBlock> ROSE_GOLDEN_FLUID_TANK = REGISTRATE
            .block("rose_golden_fluid_tank", RoseGoldenFluidTankBlock::regular)
            .initialProperties(SharedProperties::softMetal)
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
            .model(AssetLookup.customBlockItemModel("_", "block_single_window"))
            .build()
            .register();

    public static void register() {// required!
    }
}
