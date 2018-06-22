package me.xjon.jonsmod.client;

import me.xjon.jonsmod.CommonProxy;
import me.xjon.jonsmod.VariableConstants;
import me.xjon.jonsmod.client.renders.RenderRegistry;

public class ClientProxy extends CommonProxy
{

	@Override
	public void preInitialization() 
	{
		VariableConstants.registerEvent(new RenderRegistry());
		//RenderRegistry.initEntities();
		//registerEvent(new ItemRenders());
		//EntityRendering.initialization();
	}

	@Override
	public void initialization()
	{
		//MinecraftForge.EVENT_BUS.register(new GuiJonPortal(Minecraft.getMinecraft()));
	}

}
