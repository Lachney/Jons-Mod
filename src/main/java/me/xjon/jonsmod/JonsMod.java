package me.xjon.jonsmod;

import me.xjon.jonsmod.registry.RegistryEventHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = VariableConstants.NAME, version = VariableConstants.VERSION, modid = VariableConstants.MODID)
public class JonsMod 
{

	@Instance(VariableConstants.MODID)
	public static JonsMod instance;

	@SidedProxy(modId = VariableConstants.MODID, clientSide = VariableConstants.CLIENT_PROXY_LOCATION, serverSide = VariableConstants.COMMON_PROXY_LOCATION)
	public static CommonProxy proxy;

	@EventHandler
	public void preInitialization(FMLPreInitializationEvent event)
	{
		//JonConfig.init(event.getModConfigurationDirectory());
		
		VariableConstants.registerEvent(new RegistryEventHandler());
		proxy.preInitialization();
	}

	@EventHandler
	public void initialization(FMLInitializationEvent event)
	{
		//JonEntities.initialization();
		//JonWorld.initialization();
		//JonLootTables.initialization();
		
		proxy.initialization();
		//ServerProxy.registerEvent(new JonEvents());
	}

}
