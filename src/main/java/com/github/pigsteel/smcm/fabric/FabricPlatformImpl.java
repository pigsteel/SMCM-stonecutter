package com.github.pigsteel.smcm.fabric;

//? fabric  {
import com.github.pigsteel.smcm.Platform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class FabricPlatformImpl implements Platform {

    @Override
    public boolean isModLoaded(String modid) {
        return FabricLoader.getInstance().isModLoaded(modid);
    }

    @Override
    public String loader() {
        return "fabric";
    }

    @Override
    public Path getConfigDir() {
        return FabricLoader.getInstance().getConfigDir();
    }

    @Override
    public boolean isDevelopment() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

}
//?}