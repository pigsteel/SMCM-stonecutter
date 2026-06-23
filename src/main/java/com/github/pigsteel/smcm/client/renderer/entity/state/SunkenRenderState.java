package com.github.pigsteel.smcm.client.renderer.entity.state;

import com.github.pigsteel.smcm.entity.monster.skeleton.SunkenVariant;
import net.minecraft.client.renderer.entity.state.SkeletonRenderState;

public class SunkenRenderState extends SkeletonRenderState {
    public SunkenVariant variant;
    public boolean isSheared;
    public boolean isCoralDead;
}
