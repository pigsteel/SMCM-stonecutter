package com.github.pigsteel.smcm.fabric.datagen;

//? fabric  {
import com.github.pigsteel.smcm.datagen.lang.ENUSLangProvider;
import com.github.pigsteel.smcm.datagen.model.SMCMModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class FabricDataGeneratorEntrypoint implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        final FabricDataGenerator.Pack pack = generator.createPack();
        pack.addProvider(SMCMModelProvider::new);
        pack.addProvider(ENUSLangProvider::new);
    }

}
//?}
