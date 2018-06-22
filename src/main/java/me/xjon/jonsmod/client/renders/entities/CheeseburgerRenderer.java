package me.xjon.jonsmod.client.renders.entities;

import me.xjon.jonsmod.client.models.ModelCheeseburger;
import me.xjon.jonsmod.entities.EntityCheeseburger;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class CheeseburgerRenderer extends RenderLiving<EntityCheeseburger>
{

    private static final ResourceLocation CHEESEBURGER = new ResourceLocation("jon", "textures/entities/cheeseburger.png");

    public CheeseburgerRenderer(RenderManager p_i47193_1_)
    {
        super(p_i47193_1_, new ModelCheeseburger(), 0.25F);
        //this.addLayer(new LayerNetherSlimeGel(this));
    }

    /**
     * Renders the desired {@code T} type Entity.
     */
    public void doRender(EntityCheeseburger entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        this.shadowSize = 0.25F * (float)entity.getSlimeSize();
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    /**
     * Allows the render to do state modifications necessary before the model is rendered.
     */
    protected void preRenderCallback(EntityCheeseburger entitylivingbaseIn, float partialTickTime)
    {
        float f = 0.999F;
        GlStateManager.scale(0.999F, 0.999F, 0.999F);
        float f1 = (float)entitylivingbaseIn.getSlimeSize();
        float f2 = (entitylivingbaseIn.prevSquishFactor + (entitylivingbaseIn.squishFactor - entitylivingbaseIn.prevSquishFactor) * partialTickTime) / (f1 * 0.5F + 1.0F);
        float f3 = 1.0F / (f2 + 1.0F);
        GlStateManager.scale(f3 * f1, 1.0F / f3 * f1, f3 * f1);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */

	@Override
    protected ResourceLocation getEntityTexture(EntityCheeseburger entity)
    {
        return CHEESEBURGER;
    }

}