package com.github.pigsteel.smcm.registry;

import com.github.pigsteel.smcm.SMCM;
import com.github.pigsteel.smcm.entity.monster.skeleton.SunkenVariant;
import com.github.pigsteel.smcm.entity.monster.zombie.Reclaimed;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

import java.util.function.UnaryOperator;

public class smcm$DataComponents {
    public static final DataComponentType<Reclaimed.HeadFlower> RECLAIMED_HEAD_FLOWER = register(
            SMCM.id("reclaimed/head_flower"),
            builder -> builder
                    .persistent(Reclaimed.HeadFlower.CODEC)
                    .networkSynchronized(Reclaimed.HeadFlower.STREAM_CODEC)
    );

    public static final DataComponentType<Holder<SunkenVariant>> SUNKEN_VARIANT = register(
            SMCM.id("sunken/variant"),
            builder -> builder
                    .persistent(SunkenVariant.CODEC)
                    .networkSynchronized(SunkenVariant.STREAM_CODEC)
    );

    public static void load() {
    }

    private static <T> DataComponentType<T> register(
            final Identifier id,
            final UnaryOperator<DataComponentType.Builder<T>> builder
    ) {
        DataComponentType<T> type = builder
                .apply(DataComponentType.<T>builder())
                .build();

        return Registry.register(BuiltInRegistries.DATA_COMPONENT_TYPE, id, type);
    }
}