package com.kitawadesu.create_mpnt.util.datagen;

import com.kitawadesu.create_mpnt.CreateMPNT;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class MPNTBlockTagProvider extends BlockTagsProvider {
    public MPNTBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CreateMPNT.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Blocks.BAMBOO_LIKE)
                .add(Blocks.BAMBOO)
                .add(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("more_stuff", "pyrolized_bamboo_stalk")))
                .add(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("more_stuff", "copper_bamboo_stalk")))
                .add(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("more_stuff", "iron_bamboo_stalk")))
                .add(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("more_stuff", "golden_bamboo_stalk")))
                .add(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("more_stuff", "ancient_bamboo_stalk")));

        tag(ModTags.Blocks.BAMBOO_SAPLING_LIKE)
                .add(Blocks.BAMBOO_SAPLING)
                .add(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("more_stuff", "pyrolized_bamboo_sapling")))
                .add(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("more_stuff", "copper_bamboo_sapling")))
                .add(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("more_stuff", "iron_bamboo_sapling")))
                .add(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("more_stuff", "golden_bamboo_sapling")))
                .add(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("more_stuff", "ancient_bamboo_sapling")));
    }
}