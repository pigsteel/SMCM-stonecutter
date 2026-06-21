package com.example.examplemod;

//? fabric  {
/*import com.example.examplemod.fabric.FabricPlatformImpl;
*///?}
//? neoforge {
import com.example.examplemod.neoforge.NeoForgePlatformImpl;
//?}
import java.nio.file.Path;

public interface Platform {

    //? fabric  {
    /*Platform INSTANCE = new FabricPlatformImpl();
    *///?}
    //? neoforge {
    Platform INSTANCE = new NeoForgePlatformImpl();
    //?}


    boolean isModLoaded(String modid);
    String loader();
    Path getConfigDir();
    boolean isDevelopment();

}
