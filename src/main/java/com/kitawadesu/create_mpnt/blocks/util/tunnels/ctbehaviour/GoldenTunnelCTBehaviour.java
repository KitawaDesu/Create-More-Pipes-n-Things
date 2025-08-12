package com.kitawadesu.create_mpnt.blocks.util.tunnels.ctbehaviour;

import com.kitawadesu.create_mpnt.blocks.util.MPNTSpriteShifts;
import com.simibubi.create.content.logistics.tunnel.BrassTunnelBlockEntity;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.block.connected.CTType;
import com.simibubi.create.foundation.block.connected.ConnectedTextureBehaviour;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class GoldenTunnelCTBehaviour extends ConnectedTextureBehaviour.Base {

    @Override
    public @Nullable CTType getDataType(BlockAndTintGetter world, BlockPos pos, BlockState state, Direction direction) {
        if (!(world.getBlockEntity(pos) instanceof BrassTunnelBlockEntity tunnelBE)
                || !tunnelBE.hasDistributionBehaviour())
            return null;
        return super.getDataType(world, pos, state, direction);
    }

    @Override
    public CTSpriteShiftEntry getShift(BlockState state, Direction direction, @Nullable TextureAtlasSprite sprite) {
        return direction == Direction.UP ? MPNTSpriteShifts.GOLDEN_TUNNEL_TOP : null;
    }

    @Override
    protected boolean reverseUVs(BlockState state, Direction face) {
        return true;
    }

    @Override
    public boolean connectsTo(BlockState state, BlockState other, BlockAndTintGetter reader, BlockPos pos,
                              BlockPos otherPos, Direction face) {
        int yDiff = otherPos.getY() - pos.getY();
        int zDiff = otherPos.getZ() - pos.getZ();
        if (yDiff != 0)
            return false;

        if (!(reader.getBlockEntity(pos) instanceof BrassTunnelBlockEntity tunnelBE))
            return false;
        boolean leftSide = zDiff > 0;
        return tunnelBE.isConnected(leftSide);
    }

}
