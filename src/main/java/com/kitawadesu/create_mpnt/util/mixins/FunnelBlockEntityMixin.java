package com.kitawadesu.create_mpnt.util.mixins;

import com.kitawadesu.create_mpnt.blocks.CreateMPNTBlocks;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.logistics.funnel.FunnelBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FunnelBlockEntity.class)
public class FunnelBlockEntityMixin {

    @Inject(
            method = "supportsFiltering",
            at = @At("HEAD"),
            cancellable = true
    )
    private void injectSupportsFiltering(CallbackInfoReturnable<Boolean> cir) {
        // Use 'this' because we're in an instance method
        BlockState blockState = ((FunnelBlockEntity)(Object)this).getBlockState();

        if (shouldSupportFilteringAnyway(blockState)) {
            cir.setReturnValue(true);
        }
    }

    private boolean shouldSupportFilteringAnyway(BlockState state) {
        return AllBlocks.BRASS_BELT_FUNNEL.has(state)
                || AllBlocks.BRASS_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_ZINC_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_ZINC_BELT_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_ANDESITE_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_ANDESITE_BELT_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_COPPER_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_COPPER_BELT_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_GOLDEN_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_GOLDEN_BELT_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_IRON_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_IRON_BELT_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_NETHERITE_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_NETHERITE_BELT_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_ROSARITE_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_ROSARITE_BELT_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_ROSE_GOLDEN_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_ROSE_GOLDEN_BELT_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_VALKYRUM_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_VALKYRUM_BELT_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_PYRAL_FUNNEL.has(state)
                || CreateMPNTBlocks.SMART_PYRAL_BELT_FUNNEL.has(state); // Add your condition here
    }
}
