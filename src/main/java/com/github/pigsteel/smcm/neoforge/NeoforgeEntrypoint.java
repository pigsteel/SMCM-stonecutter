package com.github.pigsteel.smcm.neoforge;

//? neoforge {
/*import com.github.pigsteel.smcm.SMCM;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(SMCM.MOD_ID)
public class NeoforgeEntrypoint {

    public NeoforgeEntrypoint() {
        SMCM.init();
    }

    @EventBusSubscriber(modid = SMCM.MOD_ID, value = Dist.CLIENT)
    public static class ClientEvents {
        @SubscribeEvent
        public static void onClientSetup(final FMLClientSetupEvent event) {
            SMCM.LOG.info("Initializing {} Client", SMCM.MOD_ID);
        }
    }

}
*///?}
