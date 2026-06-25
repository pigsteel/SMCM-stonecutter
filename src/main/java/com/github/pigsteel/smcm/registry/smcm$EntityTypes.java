package com.github.pigsteel.smcm.registry;

import com.github.pigsteel.smcm.SMCM;
import com.github.pigsteel.smcm.entity.monster.redstonegolem.RedstoneGolem;
import com.github.pigsteel.smcm.entity.monster.VilerWitch;
import com.github.pigsteel.smcm.entity.monster.illager.*;
import com.github.pigsteel.smcm.entity.monster.necromancer.Necromancer;
import com.github.pigsteel.smcm.entity.monster.piglin.PiglinFarmer;
import com.github.pigsteel.smcm.entity.projectile.ReclaimedPuke;
import com.github.pigsteel.smcm.entity.monster.skeleton.Lost;
import com.github.pigsteel.smcm.entity.monster.skeleton.Sunken;
import com.github.pigsteel.smcm.entity.monster.zombie.Frostbitten;
import com.github.pigsteel.smcm.entity.monster.zombie.Reclaimed;
import com.github.pigsteel.smcm.entity.monster.zombie.ZombifiedPiglinBrute;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.EntityType.Builder;

public class smcm$EntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(SMCM.MOD_ID, Registries.ENTITY_TYPE);

    public static final RegistrySupplier<EntityType<Bruiser>> BRUISER;
    public static final RegistrySupplier<EntityType<Enchanter>> ENCHANTER;
    public static final RegistrySupplier<EntityType<Frostbitten>> FROSTBITTEN;
    public static final RegistrySupplier<EntityType<Reclaimed>> RECLAIMED;
    public static final RegistrySupplier<EntityType<ReclaimedPuke>> RECLAIMED_PUKE;
    public static final RegistrySupplier<EntityType<Sunken>> SUNKEN;
    public static final RegistrySupplier<EntityType<Lost>> LOST;
    public static final RegistrySupplier<EntityType<Necromancer>> NECROMANCER;
    public static final RegistrySupplier<EntityType<ZombifiedPiglinBrute>> ZOMBIFIED_PIGLIN_BRUTE;
    public static final RegistrySupplier<EntityType<Geomancer>> GEOMANCER;
    public static final RegistrySupplier<EntityType<Iceologer>> ICEOLOGER;
    public static final RegistrySupplier<EntityType<Mountaineer>> MOUNTAINEER;
    public static final RegistrySupplier<EntityType<Windcaller>> WINDCALLER;
    public static final RegistrySupplier<EntityType<PiglinFarmer>> PIGLIN_FARMER;
    public static final RegistrySupplier<EntityType<VilerWitch>> VILER_WITCH;
    public static final RegistrySupplier<EntityType<RedstoneGolem>> REDSTONE_GOLEM;

    static {
        BRUISER = registerEntity(
                "bruiser",
                Builder.of(Bruiser::new, MobCategory.MONSTER)
                        .sized(0.6F, 1.95F)
                        .passengerAttachments(2.0F)
                        .ridingOffset(-0.6F)
                        .clientTrackingRange(8)
                        .notInPeaceful());

        ENCHANTER = registerEntity("enchanter", Builder.of(Enchanter::new, MobCategory.MONSTER)
                .sized(0.6F, 1.95F)
                .passengerAttachments(2.0F)
                .ridingOffset(-0.6F)
                .clientTrackingRange(8)
                .notInPeaceful());

        FROSTBITTEN = registerEntity("frostbitten", Builder.of(Frostbitten::new, MobCategory.MONSTER)
                .sized(0.6F, 1.95F)
                .eyeHeight(1.74F)
                .passengerAttachments(2.075F)
                .ridingOffset(-0.7F)
                .immuneTo(smcm$BlockTags.FROSTBITTEN_IMMUNE_TO)
                .clientTrackingRange(8)
                .notInPeaceful());

        RECLAIMED = registerEntity("reclaimed", Builder.of(Reclaimed::new, MobCategory.MONSTER)
                .sized(0.6F, 1.95F)
                .eyeHeight(1.74F)
                .passengerAttachments(2.075F)
                .ridingOffset(-0.7F)
                .clientTrackingRange(8)
                .notInPeaceful());

        RECLAIMED_PUKE = registerEntity("reclaimed_puke", Builder.of(ReclaimedPuke::new, MobCategory.MISC)
                .sized(0.25F, 0.25F)
                .clientTrackingRange(4)
                .noLootTable()
                .updateInterval(20));

        SUNKEN = registerEntity("sunken", Builder.of(Sunken::new, MobCategory.MONSTER)
                .sized(0.6F, 1.99F)
                .eyeHeight(1.74F)
                .ridingOffset(-0.7F)
                .clientTrackingRange(8)
                .notInPeaceful());

        LOST = registerEntity("lost", Builder.of(Lost::new, MobCategory.MONSTER)
                .sized(0.6F, 1.95F)
                .eyeHeight(1.74F)
                .ridingOffset(-0.7F)
                .clientTrackingRange(8)
                .notInPeaceful());

        NECROMANCER = registerEntity("necromancer", Builder.of(Necromancer::new, MobCategory.MONSTER)
                .sized(0.7F, 2.4F)
                .eyeHeight(2.1F)
                .ridingOffset(-0.875F)
                .clientTrackingRange(16)
                .notInPeaceful());

        ZOMBIFIED_PIGLIN_BRUTE = registerEntity("zombified_piglin_brute", Builder.of(ZombifiedPiglinBrute::new, MobCategory.MONSTER)
                .fireImmune()
                .sized(0.6F, 1.95F)
                .eyeHeight(1.79F)
                .passengerAttachments(2.0F)
                .ridingOffset(-0.7F)
                .clientTrackingRange(8)
                .notInPeaceful());

        GEOMANCER = registerEntity("geomancer", Builder.of(Geomancer::new, MobCategory.MONSTER)
                .canSpawnFarFromPlayer()
                .sized(0.6F, 1.95F)
                .passengerAttachments(2.0F)
                .ridingOffset(-0.6F)
                .clientTrackingRange(8)
                .notInPeaceful());

        ICEOLOGER = registerEntity("iceologer", Builder.of(Iceologer::new, MobCategory.MONSTER)
                .canSpawnFarFromPlayer()
                .sized(0.6F, 1.95F)
                .passengerAttachments(2.0F)
                .ridingOffset(-0.6F)
                .clientTrackingRange(8)
                .notInPeaceful());

        MOUNTAINEER = registerEntity("mountaineer", Builder.of(Mountaineer::new, MobCategory.MONSTER)
                .canSpawnFarFromPlayer()
                .sized(0.6F, 1.95F)
                .passengerAttachments(2.0F)
                .ridingOffset(-0.6F)
                .clientTrackingRange(8)
                .notInPeaceful());

        WINDCALLER = registerEntity("windcaller", Builder.of(Windcaller::new, MobCategory.MONSTER)
                .canSpawnFarFromPlayer()
                .sized(0.6F, 1.95F)
                .passengerAttachments(2.0F)
                .ridingOffset(-0.6F)
                .clientTrackingRange(8)
                .notInPeaceful());

        PIGLIN_FARMER = registerEntity("piglin_farmer", Builder.of(PiglinFarmer::new, MobCategory.MONSTER)
                .sized(0.6F, 1.95F)
                .eyeHeight(1.79F)
                .passengerAttachments(2.0125F)
                .ridingOffset(-0.7F)
                .clientTrackingRange(8));

        VILER_WITCH = registerEntity("viler_witch", Builder.of(VilerWitch::new, MobCategory.MONSTER)
                .sized(0.6F, 1.95F)
                .eyeHeight(1.62F)
                .passengerAttachments(2.2625F)
                .clientTrackingRange(8)
                .notInPeaceful());

        REDSTONE_GOLEM = registerEntity("redstone_golem", Builder.of(RedstoneGolem::new, MobCategory.MONSTER)
                .sized(3.5F, 4.0F)
                .eyeHeight(3.25F));
    }

    public static <T extends Entity> RegistrySupplier<EntityType<T>> registerEntity(String name, Builder<T> builder) {
        ResourceKey<EntityType<?>> resourceKey = SMCM.key(Registries.ENTITY_TYPE, name);
        return ENTITIES.register(name, () -> builder.build(resourceKey));
    }

    public static void register() {
        ENTITIES.register();
    }
}
