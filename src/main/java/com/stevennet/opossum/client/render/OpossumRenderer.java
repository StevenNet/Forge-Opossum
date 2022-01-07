package com.stevennet.opossum.client.render;

import com.stevennet.opossum.Opossum;
import com.stevennet.opossum.client.entity.model.OpossumModel;
import com.stevennet.opossum.entities.OpossumEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class OpossumRenderer extends MobRenderer<OpossumEntity, OpossumModel<OpossumEntity>> {


    protected static final ResourceLocation TEXTURE = new ResourceLocation(Opossum.MOD_ID, "textures/entity/opossum.png");


    public OpossumRenderer(EntityRendererManager p_i50961_1_) {
        super(p_i50961_1_, new OpossumModel<>(), 0.4F);
    }

    @Override
    public ResourceLocation getEntityTexture(OpossumEntity entity) {
        return TEXTURE;
    }
}
