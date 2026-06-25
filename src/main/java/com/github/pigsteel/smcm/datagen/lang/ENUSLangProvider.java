package com.github.pigsteel.smcm.datagen.lang;

//? fabric {
import com.github.pigsteel.smcm.registry.smcm$EntityTypes;
import com.github.pigsteel.smcm.registry.smcm$Items;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ENUSLangProvider extends FabricLanguageProvider implements SMCMLangProviderVariables {
    public ENUSLangProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider holderLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(smcm$EntityTypes.BRUISER.get(), TankIllagerName());
        translationBuilder.add(smcm$EntityTypes.ENCHANTER.get(), EnchanterName());
        translationBuilder.add(smcm$EntityTypes.FROSTBITTEN.get(), FrozenZombieName());
        translationBuilder.add(smcm$EntityTypes.GEOMANCER.get(), GeomancerName());
        translationBuilder.add(smcm$EntityTypes.ICEOLOGER.get(), IceologerName());
        translationBuilder.add(smcm$EntityTypes.LOST.get(), MossySkeletonName());
        translationBuilder.add(smcm$EntityTypes.MOUNTAINEER.get(), MountaineerName());
        translationBuilder.add(smcm$EntityTypes.NECROMANCER.get(), NecromancerName());
        translationBuilder.add(smcm$EntityTypes.PIGLIN_FARMER.get(), PiglinFarmerName());
        translationBuilder.add(smcm$EntityTypes.RECLAIMED.get(), JungleZombieName());
        translationBuilder.add(smcm$EntityTypes.REDSTONE_GOLEM.get(), RedstoneGolemName());
        translationBuilder.add(smcm$EntityTypes.SUNKEN.get(), SunkenSkeletonName());
        translationBuilder.add(smcm$EntityTypes.VILER_WITCH.get(), VilerWitchName());
        translationBuilder.add(smcm$EntityTypes.WINDCALLER.get(), WindcallerName());
        translationBuilder.add(smcm$EntityTypes.ZOMBIFIED_PIGLIN_BRUTE.get(), ZombiePigBruteName());

        translationBuilder.add(smcm$Items.BRUISER_SPAWN_EGG.get(), eggName(TankIllagerName()));
        translationBuilder.add(smcm$Items.ENCHANTER_SPAWN_EGG.get(), eggName(EnchanterName()));
        translationBuilder.add(smcm$Items.FROSTBITTEN_SPAWN_EGG.get(), eggName(FrozenZombieName()));
        translationBuilder.add(smcm$Items.GEOMANCER_SPAWN_EGG.get(), eggName(GeomancerName()));
        translationBuilder.add(smcm$Items.ICEOLOGER_SPAWN_EGG.get(), eggName(IceologerName()));
        translationBuilder.add(smcm$Items.LOST_SPAWN_EGG.get(), eggName(MossySkeletonName()));
        translationBuilder.add(smcm$Items.MOUNTAINEER_SPAWN_EGG.get(), eggName(MountaineerName()));
        translationBuilder.add(smcm$Items.NECROMANCER_SPAWN_EGG.get(), eggName(NecromancerName()));
        translationBuilder.add(smcm$Items.PIGLIN_FARMER_SPAWN_EGG.get(), eggName(PiglinFarmerName()));
        translationBuilder.add(smcm$Items.RECLAIMED_SPAWN_EGG.get(), eggName(JungleZombieName()));
        translationBuilder.add(smcm$Items.REDSTONE_GOLEM_SPAWN_EGG.get(), eggName(RedstoneGolemName()));
        translationBuilder.add(smcm$Items.SUNKEN_SPAWN_EGG.get(), eggName(SunkenSkeletonName()));
        translationBuilder.add(smcm$Items.VILER_WITCH_SPAWN_EGG.get(), eggName(VilerWitchName()));
        translationBuilder.add(smcm$Items.WINDCALLER_SPAWN_EGG.get(), eggName(WindcallerName()));
        translationBuilder.add(smcm$Items.ZOMBIFIED_PIGLIN_BRUTE_SPAWN_EGG.get(), eggName(ZombiePigBruteName()));

        translationBuilder.add("subtitles.smcm.entity.bruiser.ambient", TankIllagerName() + BruiserAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.bruiser.hurt", TankIllagerName() + HurtsVerb());
        translationBuilder.add("subtitles.smcm.entity.bruiser.death", TankIllagerName() + DiesVerb());

        translationBuilder.add("subtitles.smcm.entity.enchanter.ambient", EnchanterName() + EnchanterAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.enchanter.hurt", EnchanterName() + HurtsVerb());
        translationBuilder.add("subtitles.smcm.entity.enchanter.death", EnchanterName() + DiesVerb());

        translationBuilder.add("subtitles.smcm.entity.frostbitten.ambient", FrozenZombieName() + FrozenZombieAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.frostbitten.hurt", FrozenZombieName() + HurtsVerb());
        translationBuilder.add("subtitles.smcm.entity.frostbitten.death", FrozenZombieName() + DiesVerb());
        translationBuilder.add("subtitles.smcm.entity.zombie.converted_to_frostbitten", FrozenZombieName() + " forms");

        translationBuilder.add("subtitles.smcm.entity.geomancer.ambient", GeomancerName() + GeomancerAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.geomancer.hurt", GeomancerName() + HurtsVerb());
        translationBuilder.add("subtitles.smcm.entity.geomancer.death", GeomancerName() + DiesVerb());

        translationBuilder.add("subtitles.smcm.entity.iceologer.ambient", IceologerName() + IceologerAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.iceologer.hurt", IceologerName() + HurtsVerb());
        translationBuilder.add("subtitles.smcm.entity.iceologer.death", IceologerName() + DiesVerb());

        translationBuilder.add("subtitles.smcm.entity.lost.ambient", MossySkeletonName() + MossySkeletonAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.lost.hurt", MossySkeletonName() + HurtsVerb());
        translationBuilder.add("subtitles.smcm.entity.lost.death", MossySkeletonName() + DiesVerb());

        translationBuilder.add("subtitles.smcm.entity.mountaineer.ambient", MountaineerName() + MountaineerAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.mountaineer.hurt", MountaineerName() + HurtsVerb());
        translationBuilder.add("subtitles.smcm.entity.mountaineer.death", MountaineerName() + DiesVerb());

        translationBuilder.add("subtitles.smcm.entity.necromancer.ambient", NecromancerName() + NecromancerAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.necromancer.hurt", NecromancerName() + HurtsVerb());
        translationBuilder.add("subtitles.smcm.entity.necromancer.death", NecromancerName() + DiesVerb());
        translationBuilder.add("subtitles.smcm.entity.necromancer.laugh", NecromancerName() + NecromancerLaughsVerb());

        translationBuilder.add("subtitles.smcm.entity.piglin_farmer.ambient", PiglinFarmerName() + PiglinFarmerAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.piglin_farmer.hurt", PiglinFarmerName() + HurtsVerb());
        translationBuilder.add("subtitles.smcm.entity.piglin_farmer.death", PiglinFarmerName() + DiesVerb());

        translationBuilder.add("subtitles.smcm.entity.reclaimed.ambient", JungleZombieName() + JungleZombieAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.reclaimed.hurt", JungleZombieName() + HurtsVerb());
        translationBuilder.add("subtitles.smcm.entity.reclaimed.death", JungleZombieName() + DiesVerb());
        translationBuilder.add("subtitles.smcm.entity.reclaimed.spit", JungleZombieName() + " spits");

        translationBuilder.add("subtitles.smcm.entity.redstone_golem.ambient", RedstoneGolemName() + RedstoneGolemAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.redstone_golem.hurt", RedstoneGolemName() + HurtsVerb());
        translationBuilder.add("subtitles.smcm.entity.redstone_golem.death", RedstoneGolemName() + DiesVerb());

        translationBuilder.add("subtitles.smcm.entity.sunken.ambient", SunkenSkeletonName() + SunkenSkeletonAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.sunken.hurt", SunkenSkeletonName() + HurtsVerb());
        translationBuilder.add("subtitles.smcm.entity.sunken.death", SunkenSkeletonName() + DiesVerb());
        translationBuilder.add("subtitles.smcm.entity.skeleton.converted_to_sunken", SunkenSkeletonName() + " forms");

        translationBuilder.add("subtitles.smcm.entity.viler_witch.ambient", VilerWitchName() + VilerWitchAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.viler_witch.hurt", VilerWitchName() + HurtsVerb());
        translationBuilder.add("subtitles.smcm.entity.viler_witch.death", VilerWitchName() + DiesVerb());

        translationBuilder.add("subtitles.smcm.entity.windcaller.ambient", WindcallerName() + WindcallerAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.windcaller.hurt", WindcallerName() + HurtsVerb());
        translationBuilder.add("subtitles.smcm.entity.windcaller.death", WindcallerName() + DiesVerb());

        translationBuilder.add("subtitles.smcm.entity.zombified_piglin_brute.ambient", ZombiePigBruteName() + ZombiePigBruteAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.zombified_piglin_brute.hurt", ZombiePigBruteName() + HurtsVerb());
        translationBuilder.add("subtitles.smcm.entity.zombified_piglin_brute.death", ZombiePigBruteName() + DiesVerb());

        translationBuilder.add("subtitles.smcm.entity.parrot.imitate.enchanter", ParrotImitates() + EnchanterAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.parrot.imitate.frostbitten", ParrotImitates() + FrozenZombieAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.parrot.imitate.lost", ParrotImitates() + MossySkeletonAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.parrot.imitate.necromancer", ParrotImitates() + NecromancerLaughsVerb());
        translationBuilder.add("subtitles.smcm.entity.parrot.imitate.reclaimed", ParrotImitates() + JungleZombieAmbientVerb());
        translationBuilder.add("subtitles.smcm.entity.parrot.imitate.sunken", ParrotImitates() + SunkenSkeletonAmbientVerb());
    }

    private String eggName(String name) {
        return name + " Spawn Egg";
    }

    @Override
    public void generateTranslations() {

    }

    @Override
    public String EnchanterName() {
        return "Enchanter";
    }

    @Override
    public String FrozenZombieName() {
        return "Frostbitten";
    }

    @Override
    public String GeomancerName() {
        return "Geomancer";
    }

    @Override
    public String IceologerName() {
        return "Iceologer";
    }

    @Override
    public String JungleZombieName() {
        return "Reclaimed";
    }

    @Override
    public String MossySkeletonName() {
        return "Lost";
    }

    @Override
    public String MountaineerName() {
        return "Mountaineer";
    }

    @Override
    public String NecromancerName() {
        return "Necromancer";
    }

    @Override
    public String ParrotImitates() {
        return "Parrot";
    }

    @Override
    public String PiglinFarmerName() {
        return "Piglin Farmer";
    }

    @Override
    public String RedstoneGolemName() {
        return "Redstone Golem";
    }

    @Override
    public String SunkenSkeletonName() {
        return "Sunken";
    }

    @Override
    public String TankIllagerName() {
        return "Bruiser";
    }

    @Override
    public String VilerWitchName() {
        return "Viler Witch";
    }

    @Override
    public String WindcallerName() {
        return "Windcaller";
    }

    @Override
    public String ZombiePigBruteName() {
        return "Zombified Piglin Brute";
    }

    @Override
    public String BruiserAmbientVerb() {
        return " grunts";
    }

    @Override
    public String EnchanterAmbientVerb() {
        return " burbles";
    }

    @Override
    public String FrozenZombieAmbientVerb() {
        return " moans";
    }

    @Override
    public String GeomancerAmbientVerb() {
        return " squawks";
    }

    @Override
    public String IceologerAmbientVerb() {
        return " grumbles";
    }

    @Override
    public String JungleZombieAmbientVerb() {
        return " groans";
    }

    @Override
    public String MossySkeletonAmbientVerb() {
        return " shifts";
    }

    @Override
    public String MountaineerAmbientVerb() {
        return " mutters";
    }

    @Override
    public String NecromancerAmbientVerb() {
        return " clatters";
    }

    @Override
    public String NecromancerLaughsVerb() {
        return " cackles";
    }

    @Override
    public String PiglinFarmerAmbientVerb() {
        return " snorts";
    }

    @Override
    public String RedstoneGolemAmbientVerb() {
        return " rumbles";
    }

    @Override
    public String SunkenSkeletonAmbientVerb() {
        return " rattles";
    }

    @Override
    public String VilerWitchAmbientVerb() {
        return " cackles";
    }

    @Override
    public String WindcallerAmbientVerb() {
        return " grunts";
    }

    @Override
    public String ZombiePigBruteAmbientVerb() {
        return " grunts";
    }

    @Override
    public String DiesVerb() {
        return " dies";
    }

    @Override
    public String HurtsVerb() {
        return " hurts";
    }
}
//?}