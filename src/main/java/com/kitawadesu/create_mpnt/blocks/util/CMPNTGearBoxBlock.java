package com.kitawadesu.create_mpnt.blocks.util;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.simibubi.create.content.kinetics.gearbox.GearboxBlock;
import com.simibubi.create.content.kinetics.gearbox.GearboxBlockEntity;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class CMPNTGearBoxBlock extends GearboxBlock {

    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;

    public CMPNTGearBoxBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(AXIS, Direction.Axis.Y));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AXIS);
    }

    @Override
    public BlockEntityType<? extends GearboxBlockEntity> getBlockEntityType() {
        return CreateMPNTBlockEntities.CMPNT_GEARBOX.get();
    }
}
