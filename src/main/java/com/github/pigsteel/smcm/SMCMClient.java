package com.github.pigsteel.smcm;

import com.github.pigsteel.smcm.client.model.geom.smcm$LayerDefinitions;
import com.github.pigsteel.smcm.client.model.geom.smcm$ModelLayers;
import com.github.pigsteel.smcm.registry.smcm$EntityRenderers;

public final class SMCMClient {
    private static boolean initialized;

    private SMCMClient() {}

    public static void init() {
        if(initialized)
            return;

        initialized = true;

        smcm$ModelLayers.register();
        smcm$LayerDefinitions.registerModelLayers();
        smcm$EntityRenderers.register();
    }
}
