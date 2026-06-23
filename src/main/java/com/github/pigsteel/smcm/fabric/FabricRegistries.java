package com.github.pigsteel.smcm.fabric;

import com.github.pigsteel.smcm.entity.monster.skeleton.SunkenVariant;
import com.github.pigsteel.smcm.registry.smcm$Registries;
import net.fabricmc.fabric.api.event.registry.DynamicRegistries;

public class FabricRegistries {
    public static void init() {
        DynamicRegistries.registerSynced(smcm$Registries.SUNKEN_VARIANT, SunkenVariant.DIRECT_CODEC, SunkenVariant.NETWORK_CODEC);
    }
}
