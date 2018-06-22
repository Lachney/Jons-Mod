package me.xjon.jonsmod.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelCheeseburger extends ModelBase 
{
    public ModelRenderer topbun;
    public ModelRenderer hamburger;
    public ModelRenderer cheese;
    public ModelRenderer bottombun;

    public ModelCheeseburger() 
    {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.topbun = new ModelRenderer(this, 60, 0);
        this.topbun.setRotationPoint(-9.0F, 12.0F, 7.5F);
        this.topbun.addBox(0.1F, 0.0F, -16.0F, 17, 5, 17, 0.0F);
        this.hamburger = new ModelRenderer(this, 67, 30);
        this.hamburger.setRotationPoint(-7.0F, 18.0F, 7.0F);
        this.hamburger.addBox(0.0F, 0.0F, -14.0F, 14, 2, 14, 0.0F);
        this.bottombun = new ModelRenderer(this, 0, 11);
        this.bottombun.setRotationPoint(-9.0F, 20.0F, 7.5F);
        this.bottombun.addBox(0.1F, 0.0F, -16.0F, 17, 4, 17, 0.0F);
        this.cheese = new ModelRenderer(this, 0, 41);
        this.cheese.setRotationPoint(-8.0F, 17.0F, 7.0F);
        this.cheese.addBox(0.0F, 0.0F, -15.0F, 16, 1, 16, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
        this.topbun.render(f5);
        this.hamburger.render(f5);
        this.bottombun.render(f5);
        this.cheese.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) 
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
    	this.topbun.rotateAngleX = (MathHelper.cos(ageInTicks * 0.2F) * 0.1F);
    }

}
