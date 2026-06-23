package com.github.pigsteel.smcm.registry;

import com.github.pigsteel.smcm.entity.monster.Necromancer;
import com.github.pigsteel.smcm.entity.monster.illager.Bruiser;
import com.github.pigsteel.smcm.entity.monster.illager.Enchanter;
import com.github.pigsteel.smcm.entity.monster.skeleton.Lost;
import com.github.pigsteel.smcm.entity.monster.skeleton.Sunken;
import com.github.pigsteel.smcm.entity.monster.zombie.Frostbitten;
import com.github.pigsteel.smcm.entity.monster.zombie.Reclaimed;
import com.github.pigsteel.smcm.entity.monster.zombie.ZombifiedPiglinBrute;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;

public final class Attributes {
    private Attributes() {}

    public static void register() {
        registerAttributes(smcm$EntityTypes.BRUISER.get(), Bruiser.createAttributes());
        registerAttributes(smcm$EntityTypes.ENCHANTER.get(), Enchanter.createAttributes());
        registerAttributes(smcm$EntityTypes.FROSTBITTEN.get(), Frostbitten.createAttributes());
        registerAttributes(smcm$EntityTypes.RECLAIMED.get(), Reclaimed.createAttributes());
        registerAttributes(smcm$EntityTypes.SUNKEN.get(), Sunken.createAttributes());
        registerAttributes(smcm$EntityTypes.LOST.get(), Lost.createAttributes());
        registerAttributes(smcm$EntityTypes.NECROMANCER.get(), Necromancer.createAttributes());
        registerAttributes(smcm$EntityTypes.SUNKEN.get(), Sunken.createAttributes());
        registerAttributes(smcm$EntityTypes.ZOMBIFIED_PIGLIN_BRUTE.get(), ZombifiedPiglinBrute.createAttributes());
    }

    public static void registerAttributes(EntityType<? extends LivingEntity> entityType, AttributeSupplier.Builder supplier) {
        //? fabric {
        FabricDefaultAttributeRegistry.register(entityType, supplier);
        //?}
        //? neoforge {
        //?}
    }
}
