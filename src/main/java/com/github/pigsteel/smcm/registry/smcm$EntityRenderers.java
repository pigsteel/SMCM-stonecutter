package com.github.pigsteel.smcm.registry;

import com.github.pigsteel.smcm.client.model.geom.smcm$ModelLayers;
import com.github.pigsteel.smcm.client.renderer.entity.*;
import com.github.pigsteel.smcm.entity.monster.piglin.PiglinFarmer;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.PiglinRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

public class smcm$EntityRenderers {
    public static void register() {
        registerEntityRenderer(smcm$EntityTypes.BRUISER.get(), BruiserRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.ENCHANTER.get(), EnchanterRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.FROSTBITTEN.get(), FrostbittenRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.RECLAIMED.get(), ReclaimedRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.SUNKEN.get(), SunkenRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.LOST.get(), LostRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.NECROMANCER.get(), NecromancerRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.ZOMBIFIED_PIGLIN_BRUTE.get(), ZombifiedPiglinBruteRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.RECLAIMED_PUKE.get(), ReclaimedPukeRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.MOUNTAINEER.get(), MountaineerRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.GEOMANCER.get(), GeomancerRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.ICEOLOGER.get(), IceologerRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.WINDCALLER.get(), WindcallerRenderer::new);
        registerEntityRenderer(
                smcm$EntityTypes.PIGLIN_FARMER.get(),
                context -> new PiglinRenderer(context, smcm$ModelLayers.PIGLIN_FARMER, smcm$ModelLayers.PIGLIN_FARMER, smcm$ModelLayers.PIGLIN_FARMER_ARMOR, smcm$ModelLayers.PIGLIN_FARMER_ARMOR)
        );
        registerEntityRenderer(smcm$EntityTypes.VILER_WITCH.get(), VilerWitchRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.REDSTONE_GOLEM.get(), RedstoneGolemRenderer::new);
    }

    public static <T extends Entity> void registerEntityRenderer(EntityType<? extends T> type, EntityRendererProvider<T> provider) {
        EntityRenderers.register(type, provider);
    }
}
