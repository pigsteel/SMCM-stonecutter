package com.github.pigsteel.smcm.client.renderer.entity.state;

import com.github.pigsteel.smcm.entity.FlowerCow.Variant;
//? fabric {
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
//?}
import net.minecraft.client.renderer.block.BlockModelRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.LivingEntity;

//? fabric {
@Environment(EnvType.CLIENT)
//?}
public class FlowerCowRenderState extends LivingEntityRenderState {
    public Variant variant = Variant.BUTTERCUP;
    public final BlockModelRenderState flowerModel = new BlockModelRenderState();
}
