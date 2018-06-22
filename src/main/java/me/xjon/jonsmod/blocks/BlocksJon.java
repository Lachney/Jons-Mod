package me.xjon.jonsmod.blocks;

import me.xjon.jonsmod.VariableConstants;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class BlocksJon
{

	public static Block jon_block;
	
	private static IForgeRegistry<Block> iBlockRegistry;

	private static IForgeRegistry<Item> iItemRegistry;

	public static void initialization()
	{
		if (iBlockRegistry == null || iItemRegistry == null)
		{
			return;
		}
		
		jon_block = register("jon_block", new BlockJonBlock());
	}
	
	public static void setItemRegistry(IForgeRegistry<Item> iItemRegistry)
	{
		BlocksJon.iItemRegistry = iItemRegistry;
	}

	public static void setBlockRegistry(IForgeRegistry<Block> iBlockRegistry)
	{
		BlocksJon.iBlockRegistry = iBlockRegistry;
	}
	
	public static Block register(String name, Block block)
	{
		return register(name, block, new ItemBlock(block));
	}
	
	public static Block register(String name, Block block, ItemBlock item)
	{
		block.setUnlocalizedName(name);

		block.setRegistryName(VariableConstants.locate(name));
		item.setRegistryName(VariableConstants.locate(name));VariableConstants.locate(name);

		iBlockRegistry.register(block);
		iItemRegistry.register(item);
		
		//block.setCreativeTab(JonCreativeTabs.moo);

		return block;
	}
	
	/*public static Block registerSlab(String name, Block singleSlab, Block doubleSlab)
	{
		singleSlab.setCreativeTab(JonCreativeTabs.moo);
		doubleSlab.setCreativeTab(null);

		iBlockRegistry.register(singleSlab.setRegistryName(VariableConstants.locate(name)));
		iItemRegistry.register(new ItemMoolandsSlab(singleSlab, (BlockSlab) singleSlab, (BlockSlab) doubleSlab).setRegistryName(VariableConstants.locate(name)));

		return singleSlab;
	}*/
}