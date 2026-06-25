package com.github.pigsteel.smcm.registry;

import com.github.pigsteel.smcm.SMCM;
import com.github.pigsteel.smcm.entity.monster.skeleton.SunkenVariant;
import com.github.pigsteel.smcm.entity.smcm$Pose;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityDataRegistry;
import net.minecraft.core.Holder;
import net.minecraft.network.syncher.EntityDataSerializer;

public class smcm$EntityDataSerializers {
    public static final EntityDataSerializer<Holder<SunkenVariant>> SUNKEN_VARIANT = EntityDataSerializer.forValueType(SunkenVariant.STREAM_CODEC);
    public static final EntityDataSerializer<smcm$Pose> EXTENDED_POSES = EntityDataSerializer.forValueType(smcm$Pose.STREAM_CODEC);

    public static void registerSerializer(EntityDataSerializer<?> serializer) {
        FabricEntityDataRegistry.register(SMCM.id("sunken/variant"), serializer);
    }

    public static void register() {
        registerSerializer(SUNKEN_VARIANT);
    }
}
