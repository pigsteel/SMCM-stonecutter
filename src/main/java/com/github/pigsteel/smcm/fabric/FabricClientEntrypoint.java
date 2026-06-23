package com.github.pigsteel.smcm.fabric;

//? fabric  {
import com.github.pigsteel.smcm.SMCM;
import com.github.pigsteel.smcm.SMCMClient;
import net.fabricmc.api.ClientModInitializer;

public class FabricClientEntrypoint implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        SMCM.LOGGER.info("Initializing {} Client", SMCM.MOD_ID);
        SMCMClient.init();
    }

}
//?}