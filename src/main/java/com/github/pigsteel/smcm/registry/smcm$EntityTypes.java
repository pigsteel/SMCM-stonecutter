package com.github.pigsteel.smcm.registry;

import com.github.pigsteel.smcm.SMCM;
import com.github.pigsteel.smcm.entity.monster.Necromancer;
import com.github.pigsteel.smcm.entity.monster.illager.Bruiser;
import com.github.pigsteel.smcm.entity.monster.illager.Enchanter;
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
    public static DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(SMCM.MOD_ID, Registries.ENTITY_TYPE);

    public static RegistrySupplier<EntityType<Bruiser>> BRUISER;
    public static RegistrySupplier<EntityType<Enchanter>> ENCHANTER;
    public static RegistrySupplier<EntityType<Frostbitten>> FROSTBITTEN;
    public static RegistrySupplier<EntityType<Reclaimed>> RECLAIMED;
    public static RegistrySupplier<EntityType<ReclaimedPuke>> RECLAIMED_PUKE;
    public static RegistrySupplier<EntityType<Sunken>> SUNKEN;
    public static RegistrySupplier<EntityType<Lost>> LOST;
    public static RegistrySupplier<EntityType<Necromancer>> NECROMANCER;
    public static RegistrySupplier<EntityType<ZombifiedPiglinBrute>> ZOMBIFIED_PIGLIN_BRUTE;

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
    }

    public static <T extends Entity> RegistrySupplier<EntityType<T>> registerEntity(String name, Builder<T> builder) {
        ResourceKey<EntityType<?>> resourceKey = SMCM.key(Registries.ENTITY_TYPE, name);
        return ENTITIES.register(name, () -> builder.build(resourceKey));
    }

    public static void register() {
        ENTITIES.register();
    }
}
