package me.xjon.jonsmod.registry;

import me.xjon.jonsmod.blocks.BlocksJon;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegistryEventHandler 
{

	@SubscribeEvent
	public void onRegisterBlocks(RegistryEvent.Register<Block> event)
	{
		BlocksJon.setBlockRegistry(event.getRegistry());

		BlocksJon.initialization();
	}

	@SubscribeEvent
	public void onRegisterItems(RegistryEvent.Register<Item> event)
	{
		BlocksJon.setItemRegistry(event.getRegistry());
		//ItemsMoolands.setItemRegistry(event.getRegistry());
		
		BlocksJon.initialization();
		//ItemsMoolands.initialization();
	}

	@SubscribeEvent
	public void onRegisterSoundEvent(RegistryEvent.Register<SoundEvent> event)
	{
		//SoundsMoolands.soundRegistry = event.getRegistry();

		//SoundsMoolands.initialization();
	}
}