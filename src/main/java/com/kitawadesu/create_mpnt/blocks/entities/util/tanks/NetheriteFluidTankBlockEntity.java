package com.kitawadesu.create_mpnt.blocks.entities.util.tanks;

import com.kitawadesu.create_mpnt.blocks.entities.CreateMPNTBlockEntities;
import com.simibubi.create.api.connectivity.ConnectivityHandler;
import com.simibubi.create.content.fluids.tank.FluidTankBlockEntity;
import com.simibubi.create.foundation.blockEntity.IMultiBlockEntityContainer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;

import javax.annotation.Nullable;

public class NetheriteFluidTankBlockEntity extends FluidTankBlockEntity implements IMultiBlockEntityContainer {
    public NetheriteFluidTankBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public int getTankHeight() {
        return height;
    }

    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(
                Capabilities.FluidHandler.BLOCK,
                CreateMPNTBlockEntities.NETHERITE_FLUID_TANK.get(),
                (be, context) -> {
                    if (be.fluidCapability == null)
                        be.refreshCapability();
                    return be.fluidCapability;
                }
        );
    }

    void refreshCapability() {
        fluidCapability = handlerForCapability();
        invalidateCapabilities();
    }

    private IFluidHandler handlerForCapability() {
        return isController() ? (boiler.isActive() ? boiler.createHandler() : tankInventory)
                : ((getControllerBE() != null) ? getControllerBE().handlerForCapability() : new FluidTank(0));
    }

    @Nullable
    public NetheriteFluidTankBlockEntity getOtherFluidTankBlockEntity(Direction direction) {
        BlockEntity otherBE = level.getBlockEntity(worldPosition.relative(direction));
        if (otherBE instanceof NetheriteFluidTankBlockEntity)
            return (NetheriteFluidTankBlockEntity) otherBE;
        return null;
    }

    public void updateConnectivity() {
        updateConnectivity = false;
        if (level.isClientSide)
            return;
        if (!isController())
            return;
        ConnectivityHandler.formMulti(this);
    }

    @Override
    public boolean isController() {
        return controller == null || worldPosition.getX() == controller.getX()
                && worldPosition.getY() == controller.getY() && worldPosition.getZ() == controller.getZ();
    }

    @SuppressWarnings("unchecked")
    @Override
    public NetheriteFluidTankBlockEntity getControllerBE() {
        if (isController() || !hasLevel())
            return this;
        BlockEntity blockEntity = level.getBlockEntity(controller);
        if (blockEntity instanceof NetheriteFluidTankBlockEntity)
            return (NetheriteFluidTankBlockEntity) blockEntity;
        return null;
    }
}
