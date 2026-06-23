package com.github.pigsteel.smcm.registry;

import com.github.pigsteel.smcm.SMCM;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
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