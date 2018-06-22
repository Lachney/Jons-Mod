package me.xjon.jonsmod;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class VariableConstants 
{

	public static final String NAME = "Jon's Mod";

	public static final String VERSION = "1.12.2";

	public static final String MODID = "jon";

	public static final String CLIENT_PROXY_LOCATION = "me.xjon.jonsmod.client.ClientProxy";

	public static final String COMMON_PROXY_LOCATION = "me.xjon.jonsmod.CommonProxy";

	public static ResourceLocation locate(String name)
	{
		return new ResourceLocation(MODID, name);
	}

	@SuppressWarnings("deprecation")
	public static void registerEvent(Object obj)
	{
		FMLCommonHandler.instance().bus().register(obj);
		MinecraftForge.EVENT_BUS.register(obj);
	}
}