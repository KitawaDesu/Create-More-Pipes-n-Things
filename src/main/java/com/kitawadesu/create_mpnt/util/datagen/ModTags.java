package com.kitawadesu.create_mpnt.util.datagen;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static com.kitawadesu.create_mpnt.CreateMPNT.MOD_ID;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> BAMBOO_LIKE = createTag("bamboo_like");
        public static final TagKey<Block> BAMBOO_SAPLING_LIKE = createTag("bamboo_sapling_like");
        public static final TagKey<Block> SUGARCANE_LIKE = createTag("sugarcane_like");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MOD_ID, name));
        }
    }
}
