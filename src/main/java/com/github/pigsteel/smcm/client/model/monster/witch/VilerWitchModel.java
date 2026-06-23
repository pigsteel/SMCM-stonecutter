package com.github.pigsteel.smcm.client.model.monster.witch;

import com.github.pigsteel.smcm.client.renderer.entity.state.VilerWitchRenderState;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HeadedModel;
import net.minecraft.client.model.VillagerLikeModel;
import net.minecraft.client.model.geom.ModelPart;

// Unfortunately since WitchModel doesn't implement generic params I can't extend it directly
public class VilerWitchModel extends EntityModel<VilerWitchRenderState> implements HeadedModel, VillagerLikeModel<VilerWitchRenderState> {

    protected VilerWitchModel(ModelPart root) {
        super(root);
    }

    @Override
    public ModelPart getHead() {
        return null;
    }

    @Override
    public void translateToArms(VilerWitchRenderState state, PoseStack outputPoseStack) {

    }
}
