package com.github.pigsteel.smcm;

import com.github.pigsteel.smcm.registry.*;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// This class is part of the common project meaning it is shared between all supported loaders. Code written here can only
// import and access the vanilla codebase, libraries used by vanilla, and optionally third party libraries that provide
// common compatible binaries. This means common code can not directly use loader specific concepts such as NeoForge events
// however it will be compatible with all supported mod loaders.
public class SMCM {
    public static final String MOD_ID = "smcm";
    public static final String MOD_NAME = "SMCM";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        smcm$Registries.load();
        smcm$EntityDataSerializers.register();
        smcm$SoundEvents.register();
        smcm$EntityTypes.register();
        smcm$Items.register();
        Attributes.register();
        smcm$DataComponents.load();
        LootTables.load();
        smcm$DataAttachments.load();
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    public static <T> ResourceKey<T> key(ResourceKey<Registry<T>> registry, String path) {
        return ResourceKey.create(registry, Identifier.fromNamespaceAndPath(MOD_ID, path));
    }
}
