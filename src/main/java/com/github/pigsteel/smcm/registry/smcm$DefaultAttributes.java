package com.github.pigsteel.smcm.registry;

import com.github.pigsteel.smcm.entity.monster.VilerWitch;
import com.github.pigsteel.smcm.entity.monster.illager.*;
import com.github.pigsteel.smcm.entity.monster.necromancer.Necromancer;
import com.github.pigsteel.smcm.entity.monster.piglin.PiglinFarmer;
import com.github.pigsteel.smcm.entity.monster.redstonegolem.RedstoneGolem;
import com.github.pigsteel.smcm.entity.monster.skeleton.Lost;
import com.github.pigsteel.smcm.entity.monster.skeleton.Sunken;
import com.github.pigsteel.smcm.entity.monster.zombie.Frostbitten;
import com.github.pigsteel.smcm.entity.monster.zombie.Reclaimed;
import com.github.pigsteel.smcm.entity.monster.zombie.ZombifiedPiglinBrute;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;

public final class smcm$DefaultAttributes {
    private smcm$DefaultAttributes() {}

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
        registerAttributes(smcm$EntityTypes.REDSTONE_GOLEM.get(), RedstoneGolem.createAttributes());
        registerAttributes(smcm$EntityTypes.ICEOLOGER.get(), Iceologer.createMonsterAttributes());
        registerAttributes(smcm$EntityTypes.WINDCALLER.get(), Windcaller.createMonsterAttributes());
        registerAttributes(smcm$EntityTypes.GEOMANCER.get(), Geomancer.createMonsterAttributes());
        registerAttributes(smcm$EntityTypes.PIGLIN_FARMER.get(), PiglinFarmer.createMonsterAttributes());
        registerAttributes(smcm$EntityTypes.VILER_WITCH.get(), VilerWitch.createAttributes());
        registerAttributes(smcm$EntityTypes.MOUNTAINEER.get(), Mountaineer.createAttributes());
    }

    public static void registerAttributes(EntityType<? extends LivingEntity> entityType, AttributeSupplier.Builder supplier) {
        //? fabric {
        FabricDefaultAttributeRegistry.register(entityType, supplier);
        //?}
        //? neoforge {
        //?}
    }
}
