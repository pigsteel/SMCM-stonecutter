package com.github.pigsteel.smcm;

import com.github.pigsteel.smcm.registry.Animations;
import com.github.pigsteel.smcm.client.model.geom.smcm$LayerDefinitions;
import com.github.pigsteel.smcm.client.model.geom.smcm$ModelLayers;
import com.github.pigsteel.smcm.registry.smcm$Renderers;

public final class SMCMClient {
    private static boolean initialized;

    private SMCMClient() {}

    public static void init() {
        if(initialized)
            return;

        initialized = true;

        Animations.register();
        smcm$ModelLayers.register();
        smcm$LayerDefinitions.registerModelLayers();
        smcm$Renderers.register();
    }
}
