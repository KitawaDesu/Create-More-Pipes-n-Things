package com.kitawadesu.create_mpnt.util.mixins;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.simibubi.create.content.logistics.funnel.AbstractFunnelBlock;
import com.simibubi.create.foundation.blockEntity.SmartBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(AbstractFunnelBlock.class)
public class AbstractFunnelBlockMixin {

    @Overwrite
    public BlockEntityType<? extends SmartBlockEntity> getBlockEntityType() {
            return CreateMPNTBlockEntities.FUNNEL.get();
    }
}
