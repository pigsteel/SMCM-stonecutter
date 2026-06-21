package com.github.pigsteel.smcm;

//? fabric  {
import com.github.pigsteel.smcm.fabric.FabricPlatformImpl;
//?}
//? neoforge {
/*import com.github.pigsteel.smcm.neoforge.NeoForgePlatformImpl;
*///?}
import java.nio.file.Path;

public interface Platform {

    //? fabric  {
    Platform INSTANCE = new FabricPlatformImpl();
    //?}
    //? neoforge {
    /*Platform INSTANCE = new NeoForgePlatformImpl();
    *///?}


    boolean isModLoaded(String modid);
    String loader();
    Path getConfigDir();
    boolean isDevelopment();

}
