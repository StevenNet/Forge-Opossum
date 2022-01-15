package com.stevennet.opossum.client.entity.model;

// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.stevennet.opossum.entities.OpossumEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class OpossumModel<T extends OpossumEntity> extends EntityModel<T> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer TopRightLeg;
	private final ModelRenderer TopLeftLeg;
	private final ModelRenderer BotomRightLeg;
	private final ModelRenderer BotomLeftLeg;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r1;

	public OpossumModel() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-2.5F, -7.0F, -3.0F, 5.0F, 5.0F, 9.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 20.0F, -3.0F);
		head.setTextureOffset(16, 24).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(16, 16).addBox(1.0F, -3.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(16, 16).addBox(-3.0F, -3.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		TopRightLeg = new ModelRenderer(this);
		TopRightLeg.setRotationPoint(-1.4F, 21.0F, -1.0F);
		TopRightLeg.setTextureOffset(8, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		TopLeftLeg = new ModelRenderer(this);
		TopLeftLeg.setRotationPoint(1.4F, 21.0F, -1.0F);
		TopLeftLeg.setTextureOffset(0, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		BotomRightLeg = new ModelRenderer(this);
		BotomRightLeg.setRotationPoint(1.4F, 21.0F, 4.0F);
		BotomRightLeg.setTextureOffset(0, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		BotomLeftLeg = new ModelRenderer(this);
		BotomLeftLeg.setRotationPoint(-1.4F, 21.0F, 4.0F);
		BotomLeftLeg.setTextureOffset(8, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 19.0F, 4.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.0F, 0.0F, -1.0F);
		tail.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(16, 16).addBox(2.5F, 0.0F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
	}

	public OpossumModel(ModelRenderer body, ModelRenderer head, ModelRenderer topRightLeg, ModelRenderer topLeftLeg, ModelRenderer botomRightLeg, ModelRenderer botomLeftLeg, ModelRenderer tail, ModelRenderer cube_r1) {
		this.body = body;
		this.head = head;
		TopRightLeg = topRightLeg;
		TopLeftLeg = topLeftLeg;
		BotomRightLeg = botomRightLeg;
		BotomLeftLeg = botomLeftLeg;
		this.tail = tail;
		this.cube_r1 = cube_r1;
	}

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
		this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		//this.body.rotateAngleX = ((float)Math.PI / 2F);
		this.BotomRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * -limbSwingAmount;
		this.BotomLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * -limbSwingAmount;
		this.TopRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.TopLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}


	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		TopRightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		TopLeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		BotomRightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		BotomLeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}