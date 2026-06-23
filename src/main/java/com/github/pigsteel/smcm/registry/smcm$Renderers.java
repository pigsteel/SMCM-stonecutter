package com.github.pigsteel.smcm.registry;

import com.github.pigsteel.smcm.client.renderer.entity.*;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

public class smcm$Renderers {
    public static void register() {
        registerEntityRenderer(smcm$EntityTypes.BRUISER.get(), BruiserRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.ENCHANTER.get(), EnchanterRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.FROSTBITTEN.get(), FrostbittenRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.RECLAIMED.get(), ReclaimedRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.SUNKEN.get(), SunkenRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.LOST.get(), LostRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.NECROMANCER.get(), NecromancerRenderer::new);
        registerEntityRenderer(smcm$EntityTypes.ZOMBIFIED_PIGLIN_BRUTE.get(), ZombifiedPiglinBruteRenderer::new);
    }

    public static <T extends Entity> void registerEntityRenderer(EntityType<T> entity, EntityRendererProvider<T> provider) {
        EntityRenderers.register(entity, provider);
    }
}
