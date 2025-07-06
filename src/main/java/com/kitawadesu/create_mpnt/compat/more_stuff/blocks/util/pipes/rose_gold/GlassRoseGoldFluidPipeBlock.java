package com.kitawadesu.create_mpnt.compat.more_stuff.blocks.util.pipes.rose_gold;

import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.MoreStuffCompatBlocks;
import com.kitawadesu.create_mpnt.compat.more_stuff.blocks.entities.MoreStuffCompatBlockEntities;
import com.simibubi.create.content.fluids.pipes.FluidPipeBlock;
import com.simibubi.create.content.fluids.pipes.GlassFluidPipeBlock;
import com.simibubi.create.content.fluids.pipes.StraightPipeBlockEntity;
import com.simibubi.create.content.schematics.requirement.ItemRequirement;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.HitResult;

import java.util.Map;

public class GlassRoseGoldFluidPipeBlock extends GlassFluidPipeBlock {
    public GlassRoseGoldFluidPipeBlock(Properties p_i48339_1_) {
        super(p_i48339_1_);
    }

    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, LevelReader level, BlockPos pos,
                                       Player player) {
        return MoreStuffCompatBlocks.ROSE_GOLDEN_FLUID_PIPE.asStack();
    }

    @Override
    public BlockState toRegularPipe(LevelAccessor world, BlockPos pos, BlockState state) {
        Direction side = Direction.get(Direction.AxisDirection.POSITIVE, state.getValue(AXIS));
        Map<Direction, BooleanProperty> facingToPropertyMap = FluidPipeBlock.PROPERTY_BY_DIRECTION;
        return MoreStuffCompatBlocks.ROSE_GOLDEN_FLUID_PIPE.get()
                .updateBlockState(MoreStuffCompatBlocks.ROSE_GOLDEN_FLUID_PIPE.getDefaultState()
                        .setValue(facingToPropertyMap.get(side), true)
                        .setValue(facingToPropertyMap.get(side.getOpposite()), true), side, null, world, pos);
    }

    @Override
    public ItemRequirement getRequiredItems(BlockState state, BlockEntity be) {
        return ItemRequirement.of(MoreStuffCompatBlocks.ROSE_GOLDEN_FLUID_PIPE.getDefaultState(), be);
    }

    @Override
    public BlockEntityType<? extends StraightPipeBlockEntity> getBlockEntityType() {
        return MoreStuffCompatBlockEntities.GLASS_ROSE_GOLDEN_FLUID_PIPE.get();
    }
}
