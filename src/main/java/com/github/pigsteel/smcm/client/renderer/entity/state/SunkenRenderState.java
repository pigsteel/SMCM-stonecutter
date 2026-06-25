package com.github.pigsteel.smcm.client.renderer.entity.state;

//? fabric {
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
//?}
import com.github.pigsteel.smcm.entity.monster.skeleton.SunkenVariant;
import net.minecraft.client.renderer.entity.state.SkeletonRenderState;

//? fabric {
@Environment(EnvType.CLIENT)
//?}
public class SunkenRenderState extends SkeletonRenderState {
    public SunkenVariant variant;
    public boolean isSheared;
    public boolean isCoralDead;
}
