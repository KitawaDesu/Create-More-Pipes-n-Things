package com.kitawadesu.create_mpnt.compat.more_stuff.blocks.util;

import com.kitawadesu.create_mpnt.CreateMPNT;
import com.simibubi.create.api.contraption.storage.fluid.MountedFluidStorageType;
import com.simibubi.create.content.fluids.tank.storage.FluidTankMountedStorageType;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.RegistryEntry;

import java.util.function.Supplier;

public class MPNTMountedStorageTypes {
    private static final CreateRegistrate REGISTRATE = CreateMPNT.registrate();

    public static final RegistryEntry<MountedFluidStorageType<?>, FluidTankMountedStorageType> ZINC_FLUID_TANK = simpleFluid("fluid_tank", FluidTankMountedStorageType::new);

    private static <T extends MountedFluidStorageType<?>> RegistryEntry<MountedFluidStorageType<?>, T> simpleFluid(String name, Supplier<T> supplier) {
        return REGISTRATE.mountedFluidStorage(name, supplier).register();
    }

    public static void register() {
    }
}
