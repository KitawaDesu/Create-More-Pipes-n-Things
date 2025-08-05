package com.kitawadesu.create_mpnt;

import com.kitawadesu.create_mpnt.blocks.CreateMPNTBlocks;
import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.kitawadesu.create_mpnt.blocks.entities.util.tanks.entity.*;
import com.kitawadesu.create_mpnt.blocks.util.MPNTPartialModels;
import com.kitawadesu.create_mpnt.compat.blocks.entities.util.tanks.entity.PyralFluidTankBlockEntity;
import com.kitawadesu.create_mpnt.compat.blocks.entities.util.tanks.entity.RosariteFluidTankBlockEntity;
import com.kitawadesu.create_mpnt.compat.blocks.entities.util.tanks.entity.RoseGoldenFluidTankBlockEntity;
import com.kitawadesu.create_mpnt.compat.blocks.entities.util.tanks.entity.ValkyrumFluidTankBlockEntity;
import com.kitawadesu.create_mpnt.compat.blocks.util.CompatPartialModels;
import com.kitawadesu.create_mpnt.compat.items.CompatItems;
import com.kitawadesu.create_mpnt.items.CreateMPNTItems;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CreateMPNT.MOD_ID)
public class CreateMPNT {

    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "create_mpnt";
    public static final String NAME = "create_mpnt";
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreateMPNT.MOD_ID);

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public CreateMPNT(IEventBus eventBus, ModContainer modContainer) {
        onCtor(eventBus, modContainer);
    }

    public static void onCtor(IEventBus modEventBus, ModContainer modContainer) {
        REGISTRATE.registerEventListeners(modEventBus);

        CreateMPNTBlocks.register();
        CreateMPNTItems.register();
        CompatItems.register();
        CreateMPNTBlockEntities.register();

        MPNTPartialModels.init();
        CompatPartialModels.init();
    }

    public static CreateRegistrate registrate() {
        return REGISTRATE;
    }

    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {


        @net.neoforged.bus.api.SubscribeEvent
        public static void registerCapabilities(net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent event) {
            ZincFluidTankBlockEntity.registerCapabilities(event);
            GoldenFluidTankBlockEntity.registerCapabilities(event);
            AndesiteFluidTankBlockEntity.registerCapabilities(event);
            BrassFluidTankBlockEntity.registerCapabilities(event);
            IronFluidTankBlockEntity.registerCapabilities(event);
            NetheriteFluidTankBlockEntity.registerCapabilities(event);
            RoseGoldenFluidTankBlockEntity.registerCapabilities(event);
            RosariteFluidTankBlockEntity.registerCapabilities(event);
            ValkyrumFluidTankBlockEntity.registerCapabilities(event);
            PyralFluidTankBlockEntity.registerCapabilities(event);
        }

        @SubscribeEvent
        public static void onAddLayers(EntityRenderersEvent.AddLayers event) {

        }

        @SubscribeEvent
        public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {

        }

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

            event.enqueueWork(() -> {
                    }
            );
        }
    }
}
