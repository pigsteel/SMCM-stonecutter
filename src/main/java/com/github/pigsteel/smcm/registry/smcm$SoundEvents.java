package com.github.pigsteel.smcm.registry;

import com.github.pigsteel.smcm.SMCM;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

public class smcm$SoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(SMCM.MOD_ID, Registries.SOUND_EVENT);
    
    public static final RegistrySupplier<SoundEvent> FROSTBITTEN_AMBIENT = registerSoundEvent("entity.frostbitten.ambient");
    public static final RegistrySupplier<SoundEvent> FROSTBITTEN_HURT = registerSoundEvent("entity.frostbitten.hurt");
    public static final RegistrySupplier<SoundEvent> FROSTBITTEN_DEATH = registerSoundEvent("entity.frostbitten.death");
    public static final RegistrySupplier<SoundEvent> FROSTBITTEN_SHOOT = registerSoundEvent("entity.frostbitten.shoot");
    public static final RegistrySupplier<SoundEvent> ZOMBIE_CONVERTED_TO_FROSTBITTEN = registerSoundEvent("entity.zombie.converted_to_frostbitten");
    public static final RegistrySupplier<SoundEvent> RECLAIMED_AMBIENT = registerSoundEvent("entity.reclaimed.ambient");
    public static final RegistrySupplier<SoundEvent> RECLAIMED_DEATH = registerSoundEvent("entity.reclaimed.death");
    public static final RegistrySupplier<SoundEvent> RECLAIMED_HURT = registerSoundEvent("entity.reclaimed.hurt");
    public static final RegistrySupplier<SoundEvent> RECLAIMED_STEP = registerSoundEvent("entity.reclaimed.step");
    public static final RegistrySupplier<SoundEvent> RECLAIMED_SHEAR = registerSoundEvent("entity.reclaimed.shear");
    public static final RegistrySupplier<SoundEvent> RECLAIMED_BONEMEAL = registerSoundEvent("entity.reclaimed.bone_meal");
    public static final RegistrySupplier<SoundEvent> RECLAIMED_SPIT = registerSoundEvent("entity.reclaimed.spit");
    public static final RegistrySupplier<SoundEvent> ENCHANTER_AMBIENT = registerSoundEvent("entity.enchanter.ambient");
    public static final RegistrySupplier<SoundEvent> ENCHANTER_DEATH = registerSoundEvent("entity.enchanter.death");
    public static final RegistrySupplier<SoundEvent> ENCHANTER_HURT = registerSoundEvent("entity.enchanter.hurt");
    public static final RegistrySupplier<SoundEvent> NECROMANCER_AMBIENT =
            registerSoundEvent("entity.necromancer.ambient");
    public static final RegistrySupplier<SoundEvent> NECROMANCER_DEATH =
            registerSoundEvent("entity.necromancer.death");
    public static final RegistrySupplier<SoundEvent> NECROMANCER_HURT =
            registerSoundEvent("entity.necromancer.hurt");
    public static final RegistrySupplier<SoundEvent> NECROMANCER_STEP =
            registerSoundEvent("entity.necromancer.step");
    public static final RegistrySupplier<SoundEvent> NECROMANCER_LAUGH =
            registerSoundEvent("entity.necromancer.laugh");
    public static final RegistrySupplier<SoundEvent> NECROMANCER_SUMMON =
            registerSoundEvent("entity.necromancer.summon");
    public static final RegistrySupplier<SoundEvent> NECROMANCER_PREPARE_SUMMON =
            registerSoundEvent("entity.necromancer.prepare_summon");
    public static final RegistrySupplier<SoundEvent> NECROMANCER_SPELL =
            registerSoundEvent("entity.necromancer.spell");
    public static final RegistrySupplier<SoundEvent> PARROT_IMITATE_FROSTBITTEN = registerSoundEvent("entity.parrot.imitate.frostbitten");
    public static final RegistrySupplier<SoundEvent> PARROT_IMITATE_RECLAIMED = registerSoundEvent("entity.parrot.imitate.reclaimed");
    public static final RegistrySupplier<SoundEvent> PARROT_IMITATE_ENCHANTER = registerSoundEvent("entity.parrot.imitate.enchanter");
    public static final RegistrySupplier<SoundEvent> PARROT_IMITATE_NECROMANCER = registerSoundEvent("entity.parrot.imitate.necromancer");
    public static final RegistrySupplier<SoundEvent> PARROT_IMITATE_LOST = registerSoundEvent("entity.parrot.imitate.lost");
    public static final RegistrySupplier<SoundEvent> PARROT_IMITATE_SUNKEN = registerSoundEvent("entity.parrot.imitate.sunken");
    public static final RegistrySupplier<SoundEvent> LOST_AMBIENT =
            registerSoundEvent("entity.lost.ambient");
    public static final RegistrySupplier<SoundEvent> LOST_DEATH =
            registerSoundEvent("entity.lost.death");
    public static final RegistrySupplier<SoundEvent> LOST_HURT =
            registerSoundEvent("entity.lost.hurt");
    public static final RegistrySupplier<SoundEvent> LOST_STEP =
            registerSoundEvent("entity.lost.step");

    public static final RegistrySupplier<SoundEvent> SUNKEN_AMBIENT =
            registerSoundEvent("entity.sunken.ambient");
    public static final RegistrySupplier<SoundEvent> SUNKEN_DEATH =
            registerSoundEvent("entity.sunken.death");
    public static final RegistrySupplier<SoundEvent> SUNKEN_HURT =
            registerSoundEvent("entity.sunken.hurt");
    public static final RegistrySupplier<SoundEvent> SUNKEN_STEP =
            registerSoundEvent("entity.sunken.step");

    public static final RegistrySupplier<SoundEvent> SKELETON_CONVERTED_TO_SUNKEN =
            registerSoundEvent("entity.skeleton.converted_to_sunken");

    public static RegistrySupplier<SoundEvent> registerSoundEvent(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(SMCM.MOD_ID, name);

        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register() {

        SMCM.LOGGER.debug("Sounds for SMCM!");
        SOUND_EVENTS.register();
    }
}
