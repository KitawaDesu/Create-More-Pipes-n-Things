package com.kitawadesu.create_mpnt.util.mixins;

import com.kitawadesu.create_mpnt.util.datagen.ModTags;
import com.simibubi.create.content.kinetics.saw.SawBlockEntity;
import com.simibubi.create.content.kinetics.saw.TreeCutter;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(SawBlockEntity.class)
public class SawBlockEntityMixin {
    @Overwrite
    public static boolean isSawable(BlockState stateToBreak) {
        if (stateToBreak.is(BlockTags.SAPLINGS))
            return false;
        if (TreeCutter.isLog(stateToBreak) || (stateToBreak.is(BlockTags.LEAVES)))
            return true;
        if (TreeCutter.isRoot(stateToBreak))
            return true;
        Block block = stateToBreak.getBlock();
        if (block instanceof BambooStalkBlock)
            return true;
        if (block.equals(Blocks.PUMPKIN) || block.equals(Blocks.MELON))
            return true;
        if (block instanceof CactusBlock)
            return true;
        if (block instanceof SugarCaneBlock)
            return true;
        if (block instanceof KelpPlantBlock)
            return true;
        if (block instanceof KelpBlock)
            return true;
        if (block instanceof ChorusPlantBlock)
            return true;
        if (stateToBreak.is(ModTags.Blocks.BAMBOO_SAPLING_LIKE))
            return true;
        if (stateToBreak.is(ModTags.Blocks.BAMBOO_LIKE))
            return true;
        if (TreeCutter.canDynamicTreeCutFrom(block))
            return true;
        return false;
    }
}
