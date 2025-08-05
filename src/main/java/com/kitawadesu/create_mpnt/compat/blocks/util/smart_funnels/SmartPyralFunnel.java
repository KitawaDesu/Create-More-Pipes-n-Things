package com.kitawadesu.create_mpnt.compat.blocks.util.smart_funnels;

import com.kitawadesu.create_mpnt.blocks.CreateMPNTBlocks;
import com.simibubi.create.content.logistics.funnel.BeltFunnelBlock;
import com.simibubi.create.content.logistics.funnel.FunnelBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

public class SmartPyralFunnel extends FunnelBlock {

    public SmartPyralFunnel(Properties p_i48415_1_) {
        super(p_i48415_1_);
    }

    @Override
    public BlockState getEquivalentBeltFunnel(BlockGetter world, BlockPos pos, BlockState state) {
        Direction facing = getFacing(state);
        return CreateMPNTBlocks.SMART_PYRAL_BELT_FUNNEL.getDefaultState()
                .setValue(BeltFunnelBlock.HORIZONTAL_FACING, facing)
                .setValue(POWERED, state.getValue(POWERED));
    }

}
