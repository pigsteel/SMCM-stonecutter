package com.github.pigsteel.smcm.registry;

import com.github.pigsteel.smcm.SMCM;
import com.github.pigsteel.smcm.entity.Necromancer;
import com.github.pigsteel.smcm.entity.illager.Bruiser;
import com.github.pigsteel.smcm.entity.illager.Enchanter;
import com.github.pigsteel.smcm.entity.projectile.ReclaimedPuke;
import com.github.pigsteel.smcm.entity.skeleton.Lost;
import com.github.pigsteel.smcm.entity.skeleton.Sunken;
import com.github.pigsteel.smcm.entity.zombie.Frostbitten;
import com.github.pigsteel.smcm.entity.zombie.Reclaimed;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.*;

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

    static {
        BRUISER = registerEntity(
                "bruiser",
                EntityType.Builder.of(Bruiser::new, MobCategory.MONSTER)
                        .sized(0.6F, 1.95F)
                        .passengerAttachments(2.0F)
                        .ridingOffset(-0.6F)
                        .clientTrackingRange(8)
                        .notInPeaceful());

        ENCHANTER = registerEntity("enchanter", EntityType.Builder.of(Enchanter::new, MobCategory.MONSTER)
                .sized(0.6F, 1.95F)
                .passengerAttachments(2.0F)
                .ridingOffset(-0.6F)
                .clientTrackingRange(8)
                .notInPeaceful());

        FROSTBITTEN = registerEntity("frostbitten", EntityType.Builder.of(Frostbitten::new, MobCategory.MONSTER)
                .sized(0.6F, 1.95F)
                .eyeHeight(1.74F)
                .passengerAttachments(2.075F)
                .ridingOffset(-0.7F)
                .immuneTo(smcm$BlockTags.FROSTBITTEN_IMMUNE_TO)
                .clientTrackingRange(8)
                .notInPeaceful());

        RECLAIMED = registerEntity("reclaimed", EntityType.Builder.of(Reclaimed::new, MobCategory.MONSTER)
                .sized(0.6F, 1.95F)
                .eyeHeight(1.74F)
                .passengerAttachments(2.075F)
                .ridingOffset(-0.7F)
                .clientTrackingRange(8)
                .notInPeaceful());

        /*
        RECLAIMED_PUKE = registerEntity("reclaimed_puke", EntityType.Builder.of(ReclaimedPuke::new, MobCategory.MISC))
                .sized(0.25F, 0.25F)
                .clientTrackingRange(4)
                .updateInterval(10)
                .suppressSuffocationChecks()
                .suppressVehicleSaving();

         */

        SUNKEN = registerEntity("sunken", EntityType.Builder.of(Sunken::new, MobCategory.MONSTER)
                .sized(0.6F, 1.99F)
                .eyeHeight(1.74F)
                .ridingOffset(-0.7F)
                .clientTrackingRange(8)
                .notInPeaceful());

        LOST = registerEntity("lost", EntityType.Builder.of(Lost::new, MobCategory.MONSTER)
                .sized(0.6F, 1.95F)
                .eyeHeight(1.74F)
                .ridingOffset(-0.7F)
                .clientTrackingRange(8)
                .notInPeaceful());

        NECROMANCER = registerEntity("necromancer", EntityType.Builder.of(Necromancer::new, MobCategory.MONSTER)
                .sized(0.7F, 2.4F)
                .eyeHeight(2.1F)
                .ridingOffset(-0.875F)
                .clientTrackingRange(16)
                .notInPeaceful());
    }

    public static <T extends Entity> RegistrySupplier<EntityType<T>> registerEntity(String name, EntityType.Builder<T> builder) {
        ResourceKey<EntityType<?>> resourceKey = SMCM.key(Registries.ENTITY_TYPE, name);
        return ENTITIES.register(name, () -> builder.build(resourceKey));
    }

    public static void register() {
        ENTITIES.register();
    }
}
