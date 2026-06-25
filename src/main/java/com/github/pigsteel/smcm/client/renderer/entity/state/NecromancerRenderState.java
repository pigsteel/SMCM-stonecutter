package com.github.pigsteel.smcm.client.renderer.entity.state;

//? fabric {
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
//?}
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.phys.Vec3;

//? fabric {
@Environment(EnvType.CLIENT)
//?}
public class NecromancerRenderState extends HumanoidRenderState {
    public float capeLean;
    public float capeLean2;
    public float capeFlap;
    public float stripLean;

    public AnimationState summonAnimationState = new AnimationState();
    public AnimationState shootingAnimationState = new AnimationState();
}
