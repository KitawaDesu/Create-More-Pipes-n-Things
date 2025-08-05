package com.kitawadesu.create_mpnt.util.datagen;

import com.kitawadesu.create_mpnt.blocks.CreateMPNTBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class CMPNTRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public CMPNTRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }
    private static final Item ELECTRON_TUBE = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("create", "electron_tube"));
    private static final Item DRIED_KELP = Items.DRIED_KELP;

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        // Smart Funnels
        createSmartFunnel(recipeOutput, Item.byBlock(CreateMPNTBlocks.SMART_COPPER_FUNNEL.get()), Items.COPPER_INGOT, "copper");
        createSmartFunnel(recipeOutput, Item.byBlock(CreateMPNTBlocks.SMART_IRON_FUNNEL.get()), Items.IRON_INGOT, "iron");
        createSmartFunnel(recipeOutput, Item.byBlock(CreateMPNTBlocks.SMART_GOLDEN_FUNNEL.get()), Items.GOLD_INGOT, "gold");
        createSmartFunnel(recipeOutput, Item.byBlock(CreateMPNTBlocks.SMART_NETHERITE_FUNNEL.get()), Items.NETHERITE_INGOT, "netherite");
        createSmartFunnel(recipeOutput, Item.byBlock(CreateMPNTBlocks.SMART_ZINC_FUNNEL.get()),
                BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("create", "zinc_ingot")), "zinc");
        createSmartFunnel(recipeOutput, Item.byBlock(CreateMPNTBlocks.SMART_ANDESITE_FUNNEL.get()),
                BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("create", "andesite_alloy")), "andesite_alloy");

        // Normal Funnels
        createNormalFunnel(recipeOutput, Item.byBlock(CreateMPNTBlocks.NORMAL_COPPER_FUNNEL.get()), Items.COPPER_INGOT, "copper");
        createNormalFunnel(recipeOutput, Item.byBlock(CreateMPNTBlocks.NORMAL_IRON_FUNNEL.get()), Items.IRON_INGOT, "iron");
        createNormalFunnel(recipeOutput, Item.byBlock(CreateMPNTBlocks.NORMAL_GOLDEN_FUNNEL.get()), Items.GOLD_INGOT, "gold");
        createNormalFunnel(recipeOutput, Item.byBlock(CreateMPNTBlocks.NORMAL_NETHERITE_FUNNEL.get()), Items.NETHERITE_INGOT, "netherite");
        createNormalFunnel(recipeOutput, Item.byBlock(CreateMPNTBlocks.NORMAL_ZINC_FUNNEL.get()),
                BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("create", "zinc_ingot")), "zinc");
        // Andesite alloy replaced by brass ingot here for the normal funnel
        createNormalFunnel(recipeOutput, Item.byBlock(CreateMPNTBlocks.NORMAL_BRASS_FUNNEL.get()),
                BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("create", "brass_ingot")), "brass");
    }

    private void createSmartFunnel(RecipeOutput recipeOutput, Item funnel, Item ingot, String unlockName) {
        if (funnel == null || ingot == null) return;

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, funnel)
                .pattern(" T ")
                .pattern(" I ")
                .pattern(" K ")
                .define('T', ELECTRON_TUBE)
                .define('K', DRIED_KELP)
                .define('I', ingot)
                .unlockedBy("has_" + unlockName, has(ingot))
                .save(recipeOutput);
    }

    private void createNormalFunnel(RecipeOutput recipeOutput, Item funnel, Item ingot, String unlockName) {
        if (funnel == null || ingot == null) return;

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, funnel)
                .pattern(" I ")
                .pattern(" K ")
                .define('K', DRIED_KELP)
                .define('I', ingot)
                .unlockedBy("has_" + unlockName, has(ingot))
                .save(recipeOutput);
    }
}