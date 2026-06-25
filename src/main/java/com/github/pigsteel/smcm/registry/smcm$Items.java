package com.github.pigsteel.smcm.registry;

import com.github.pigsteel.smcm.SMCM;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

import java.util.function.Function;

public class smcm$Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(SMCM.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> BRUISER_SPAWN_EGG = registerItem(
            "bruiser_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(smcm$EntityTypes.BRUISER.get()))
    );

    public static final RegistrySupplier<Item> FROSTBITTEN_SPAWN_EGG = registerItem(
            "frostbitten_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(smcm$EntityTypes.FROSTBITTEN.get()))
    );

    public static final RegistrySupplier<Item> RECLAIMED_SPAWN_EGG = registerItem(
            "reclaimed_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(smcm$EntityTypes.RECLAIMED.get()))
    );

    public static final RegistrySupplier<Item> ENCHANTER_SPAWN_EGG = registerItem(
            "enchanter_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(smcm$EntityTypes.ENCHANTER.get()))
    );

    public static final RegistrySupplier<Item> SUNKEN_SPAWN_EGG = registerItem(
            "sunken_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(smcm$EntityTypes.SUNKEN.get()))
    );

    public static final RegistrySupplier<Item> LOST_SPAWN_EGG = registerItem(
            "lost_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(smcm$EntityTypes.LOST.get()))
    );

    public static final RegistrySupplier<Item> NECROMANCER_SPAWN_EGG = registerItem(
            "necromancer_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(smcm$EntityTypes.NECROMANCER.get()))
    );

    public static final RegistrySupplier<Item> ZOMBIFIED_PIGLIN_BRUTE_SPAWN_EGG = registerItem(
            "zombified_piglin_brute_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(smcm$EntityTypes.ZOMBIFIED_PIGLIN_BRUTE.get()))
    );

    public static final RegistrySupplier<Item> GEOMANCER_SPAWN_EGG = registerItem(
            "geomancer_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(smcm$EntityTypes.GEOMANCER.get()))
    );

    public static final RegistrySupplier<Item> ICEOLOGER_SPAWN_EGG = registerItem(
            "iceologer_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(smcm$EntityTypes.ICEOLOGER.get()))
    );

    public static final RegistrySupplier<Item> VILER_WITCH_SPAWN_EGG = registerItem(
            "viler_witch_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(smcm$EntityTypes.VILER_WITCH.get()))
    );

    public static final RegistrySupplier<Item> MOUNTAINEER_SPAWN_EGG = registerItem(
            "mountaineer_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(smcm$EntityTypes.MOUNTAINEER.get()))
    );

    public static final RegistrySupplier<Item> WINDCALLER_SPAWN_EGG = registerItem(
            "windcaller_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(smcm$EntityTypes.WINDCALLER.get()))
    );

    public static final RegistrySupplier<Item> REDSTONE_GOLEM_SPAWN_EGG = registerItem(
            "redstone_golem_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(smcm$EntityTypes.REDSTONE_GOLEM.get()))
    );

    public static final RegistrySupplier<Item> PIGLIN_FARMER_SPAWN_EGG = registerItem(
            "piglin_farmer_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(smcm$EntityTypes.PIGLIN_FARMER.get()))
    );

    public static <T extends Item> RegistrySupplier<T> registerItem(
            String name,
            Function<Item.Properties, T> itemFactory
    ) {
        return registerItem(name, itemFactory, new Item.Properties());
    }

    public static <T extends Item> RegistrySupplier<T> registerItem(
            String name,
            Function<Item.Properties, T> itemFactory,
            Item.Properties properties
    ) {
        ResourceKey<Item> itemKey = ResourceKey.create(
                Registries.ITEM,
                Identifier.fromNamespaceAndPath(SMCM.MOD_ID, name)
        );

        return ITEMS.register(name, () -> itemFactory.apply(properties.setId(itemKey)));
    }

    public static void register() {
        ITEMS.register();
    }
}