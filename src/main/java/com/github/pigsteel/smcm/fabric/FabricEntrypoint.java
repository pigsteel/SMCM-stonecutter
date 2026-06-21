package com.github.pigsteel.smcm.fabric;

//? fabric  {
import com.github.pigsteel.smcm.SMCM;
import net.fabricmc.api.ModInitializer;

public class FabricEntrypoint implements ModInitializer {

    @Override
    public void onInitialize() {
        SMCM.init();
    }

}
//?}
