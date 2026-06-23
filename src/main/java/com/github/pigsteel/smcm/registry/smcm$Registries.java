package com.github.pigsteel.smcm.registry;

import com.github.pigsteel.smcm.SMCM;
import com.github.pigsteel.smcm.entity.monster.skeleton.SunkenVariant;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

public class smcm$Registries {
    public static final ResourceKey<Registry<SunkenVariant>> SUNKEN_VARIANT =
            ResourceKey.createRegistryKey(
                    SMCM.id("sunken/variant")
            );


    public static void load() {
    }
}