package me.xjon.jonsmod.registry;

import me.xjon.jonsmod.blocks.BlocksJon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class JonCreativeTabs 
{

	public static final CreativeTabs jon = new CreativeTabs("jon_blocks")
	{
		@Override
		public ItemStack getTabIconItem() 
		{
			return new ItemStack(BlocksJon.jon_block);
		}
	};
	

}