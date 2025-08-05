package com.kitawadesu.create_mpnt.util.datagen;

import com.kitawadesu.create_mpnt.blocks.CreateMPNTBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.List;
import java.util.Set;

public class CMPNTLoottableProvider extends BlockLootSubProvider {

    public CMPNTLoottableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        // Smart Funnels
        dropSelf(CreateMPNTBlocks.SMART_ZINC_FUNNEL.get());
        dropSelf(CreateMPNTBlocks.SMART_ANDESITE_FUNNEL.get());
        dropSelf(CreateMPNTBlocks.SMART_COPPER_FUNNEL.get());
        dropSelf(CreateMPNTBlocks.SMART_GOLDEN_FUNNEL.get());
        dropSelf(CreateMPNTBlocks.SMART_IRON_FUNNEL.get());
        dropSelf(CreateMPNTBlocks.SMART_NETHERITE_FUNNEL.get());

        // Belt versions drop the base funnel
        add(CreateMPNTBlocks.SMART_ZINC_BELT_FUNNEL.get(),
                createSingleItemTable(CreateMPNTBlocks.SMART_ZINC_FUNNEL.get()));
        add(CreateMPNTBlocks.SMART_ANDESITE_BELT_FUNNEL.get(),
                createSingleItemTable(CreateMPNTBlocks.SMART_ANDESITE_FUNNEL.get()));
        add(CreateMPNTBlocks.SMART_COPPER_BELT_FUNNEL.get(),
                createSingleItemTable(CreateMPNTBlocks.SMART_COPPER_FUNNEL.get()));
        add(CreateMPNTBlocks.SMART_GOLDEN_BELT_FUNNEL.get(),
                createSingleItemTable(CreateMPNTBlocks.SMART_GOLDEN_FUNNEL.get()));
        add(CreateMPNTBlocks.SMART_IRON_BELT_FUNNEL.get(),
                createSingleItemTable(CreateMPNTBlocks.SMART_IRON_FUNNEL.get()));
        add(CreateMPNTBlocks.SMART_NETHERITE_BELT_FUNNEL.get(),
                createSingleItemTable(CreateMPNTBlocks.SMART_NETHERITE_FUNNEL.get()));

        // Normal Funnels
        dropSelf(CreateMPNTBlocks.NORMAL_ZINC_FUNNEL.get());
        dropSelf(CreateMPNTBlocks.NORMAL_BRASS_FUNNEL.get());
        dropSelf(CreateMPNTBlocks.NORMAL_COPPER_FUNNEL.get());
        dropSelf(CreateMPNTBlocks.NORMAL_GOLDEN_FUNNEL.get());
        dropSelf(CreateMPNTBlocks.NORMAL_IRON_FUNNEL.get());
        dropSelf(CreateMPNTBlocks.NORMAL_NETHERITE_FUNNEL.get());

        // Normal Belt Funnels
        add(CreateMPNTBlocks.NORMAL_ZINC_BELT_FUNNEL.get(),
                createSingleItemTable(CreateMPNTBlocks.NORMAL_ZINC_FUNNEL.get()));
        add(CreateMPNTBlocks.NORMAL_BRASS_BELT_FUNNEL.get(),
                createSingleItemTable(CreateMPNTBlocks.NORMAL_BRASS_FUNNEL.get()));
        add(CreateMPNTBlocks.NORMAL_COPPER_BELT_FUNNEL.get(),
                createSingleItemTable(CreateMPNTBlocks.NORMAL_COPPER_FUNNEL.get()));
        add(CreateMPNTBlocks.NORMAL_GOLDEN_BELT_FUNNEL.get(),
                createSingleItemTable(CreateMPNTBlocks.NORMAL_GOLDEN_FUNNEL.get()));
        add(CreateMPNTBlocks.NORMAL_IRON_BELT_FUNNEL.get(),
                createSingleItemTable(CreateMPNTBlocks.NORMAL_IRON_FUNNEL.get()));
        add(CreateMPNTBlocks.NORMAL_NETHERITE_BELT_FUNNEL.get(),
                createSingleItemTable(CreateMPNTBlocks.NORMAL_NETHERITE_FUNNEL.get()));

        // Ladders
        dropSelf(CreateMPNTBlocks.ZINC_LADDER.get());
        dropSelf(CreateMPNTBlocks.GOLDEN_LADDER.get());
        dropSelf(CreateMPNTBlocks.IRON_LADDER.get());
        dropSelf(CreateMPNTBlocks.NETHERITE_LADDER.get());
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return List.of(
                // Normal Funnels
                CreateMPNTBlocks.NORMAL_ZINC_FUNNEL.get(),
                CreateMPNTBlocks.NORMAL_BRASS_FUNNEL.get(),
                CreateMPNTBlocks.NORMAL_COPPER_FUNNEL.get(),
                CreateMPNTBlocks.NORMAL_GOLDEN_FUNNEL.get(),
                CreateMPNTBlocks.NORMAL_IRON_FUNNEL.get(),
                CreateMPNTBlocks.NORMAL_NETHERITE_FUNNEL.get(),

                // Normal Belt Funnels
                CreateMPNTBlocks.NORMAL_ZINC_BELT_FUNNEL.get(),
                CreateMPNTBlocks.NORMAL_BRASS_BELT_FUNNEL.get(),
                CreateMPNTBlocks.NORMAL_COPPER_BELT_FUNNEL.get(),
                CreateMPNTBlocks.NORMAL_GOLDEN_BELT_FUNNEL.get(),
                CreateMPNTBlocks.NORMAL_IRON_BELT_FUNNEL.get(),
                CreateMPNTBlocks.NORMAL_NETHERITE_BELT_FUNNEL.get(),

                // Smart Funnels
                CreateMPNTBlocks.SMART_ZINC_FUNNEL.get(),
                CreateMPNTBlocks.SMART_ANDESITE_FUNNEL.get(),
                CreateMPNTBlocks.SMART_COPPER_FUNNEL.get(),
                CreateMPNTBlocks.SMART_GOLDEN_FUNNEL.get(),
                CreateMPNTBlocks.SMART_IRON_FUNNEL.get(),
                CreateMPNTBlocks.SMART_NETHERITE_FUNNEL.get(),

                // Smart Belt Funnels
                CreateMPNTBlocks.SMART_ZINC_BELT_FUNNEL.get(),
                CreateMPNTBlocks.SMART_ANDESITE_BELT_FUNNEL.get(),
                CreateMPNTBlocks.SMART_COPPER_BELT_FUNNEL.get(),
                CreateMPNTBlocks.SMART_GOLDEN_BELT_FUNNEL.get(),
                CreateMPNTBlocks.SMART_IRON_BELT_FUNNEL.get(),
                CreateMPNTBlocks.SMART_NETHERITE_BELT_FUNNEL.get(),

                // Ladders
                CreateMPNTBlocks.ZINC_LADDER.get(),
                CreateMPNTBlocks.GOLDEN_LADDER.get(),
                CreateMPNTBlocks.IRON_LADDER.get(),
                CreateMPNTBlocks.NETHERITE_LADDER.get()
        );
    }
}
