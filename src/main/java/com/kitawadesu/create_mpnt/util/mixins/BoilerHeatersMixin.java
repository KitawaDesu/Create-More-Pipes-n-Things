package com.kitawadesu.create_mpnt.util.mixins;

import com.kitawadesu.create_mpnt.blocks.CreateMPNTBlocks;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllTags;
import com.simibubi.create.api.boiler.BoilerHeater;
import com.simibubi.create.api.registry.SimpleRegistry;
import com.simibubi.create.content.fluids.tank.BoilerHeaters;
import com.simibubi.create.foundation.utility.BlockHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Unique;

@Mixin(BoilerHeaters.class)
public class BoilerHeatersMixin {
    @Overwrite
    public static void registerDefaults() {
        BoilerHeater.REGISTRY.register(AllBlocks.BLAZE_BURNER.get(), BoilerHeater.BLAZE_BURNER);
        BoilerHeater.REGISTRY.register(CreateMPNTBlocks.PYRAL_FLUID_PIPE.get(), BoilerHeatersMixin::pyral);
        BoilerHeater.REGISTRY.register(CreateMPNTBlocks.PYRAL_FLUID_TANK.get(), BoilerHeatersMixin::pyral);
        BoilerHeater.REGISTRY.register(CreateMPNTBlocks.PYRAL_MECHANICAL_PUMP.get(), BoilerHeatersMixin::pyral);
        BoilerHeater.REGISTRY.registerProvider(SimpleRegistry.Provider.forBlockTag(AllTags.AllBlockTags.PASSIVE_BOILER_HEATERS.tag, BoilerHeater.PASSIVE));
    }

    @Unique
    private static int pyral(Level level, BlockPos pos, BlockState state) {
        return 1;
    }
}
