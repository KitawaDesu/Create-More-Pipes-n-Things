package com.kitawadesu.create_mpnt.util.mixins;

import com.kitawadesu.create_mpnt.blocks.CreateMPNTBlocks;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.kinetics.steamEngine.*;
import com.simibubi.create.foundation.blockEntity.SmartBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(SteamEngineBlockEntity.class)
public abstract class SteamEngineBlockEntityMixin extends SmartBlockEntity {

    public SteamEngineBlockEntityMixin(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Overwrite
    public boolean isValid() {
        Direction dir = SteamEngineBlock.getConnectedDirection(getBlockState()).getOpposite();

        Level level = getLevel();
        if (level == null)
            return false;

        BlockState adjacentState = level.getBlockState(getBlockPos().relative(dir));
        return adjacentState.is(AllBlocks.FLUID_TANK.get()) ||
               adjacentState.is(CreateMPNTBlocks.BRASS_FLUID_TANK.get()) ||
               adjacentState.is(CreateMPNTBlocks.ZINC_FLUID_TANK.get()) ||
               adjacentState.is(CreateMPNTBlocks.ANDESITE_FLUID_TANK.get()) ||
               adjacentState.is(CreateMPNTBlocks.IRON_FLUID_TANK.get()) ||
               adjacentState.is(CreateMPNTBlocks.GOLDEN_FLUID_TANK.get()) ||
               adjacentState.is(CreateMPNTBlocks.NETHERITE_FLUID_TANK.get()) ||
               adjacentState.is(CreateMPNTBlocks.ROSE_GOLDEN_FLUID_TANK.get()) ||
               adjacentState.is(CreateMPNTBlocks.ROSARITE_FLUID_TANK.get()) ||
               adjacentState.is(CreateMPNTBlocks.VALKYRUM_FLUID_TANK.get()) ||
               adjacentState.is(CreateMPNTBlocks.PYRAL_FLUID_TANK.get());
    }

}
