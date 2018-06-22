package me.xjon.jonsmod.client.renders;

import me.xjon.jonsmod.VariableConstants;
import me.xjon.jonsmod.blocks.BlocksJon;
import me.xjon.jonsmod.client.renders.entities.CheeseburgerRenderer;
import me.xjon.jonsmod.entities.EntityCheeseburger;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RenderRegistry 
{

	public static void initEntities()
	{
		register(EntityCheeseburger.class, CheeseburgerRenderer.class);
	}

	//Blocks
	@SubscribeEvent
	public void onModelRegisterEvent(ModelRegistryEvent event)
	{
		register(BlocksJon.jon_block, "jon_block");
		register(BlocksJon.stella_block, "stella_block");
		register(BlocksJon.red_b, "red_b");
	}

	@SubscribeEvent
	public void initItems(ModelRegistryEvent event)
	{
		//register(ItemsJon.monster, "monster");
	}

	public static void initSpecial()
	{
		
	}

	public static void initTileEntities()
	{

	}
	
	public static void register(Block block, String model)
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(VariableConstants.MODID + ":" + model, "inventory"));
	}
	
	public static void register(Block block, int meta, String model)
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(VariableConstants.MODID + ":" + model, "inventory"));
	}


	private static void register(Item item, String model)
	{
		register(item, 0, model);
	}

	private static void register(Item item, int meta, String model)
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(VariableConstants.MODID + ":" + model, "inventory"));
	}
	
	private static void registerBlockWithStateMapper(Block block, IStateMapper mapper)
	{
		ModelLoader.setCustomStateMapper(block, mapper);

		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(block), new ItemMeshDefinition() 
		{
			@Override
			@SuppressWarnings("deprecation")
			public ModelResourceLocation getModelLocation(ItemStack stack) 
			{
				Block block = Block.getBlockFromItem(stack.getItem());

				return Minecraft.getMinecraft().getRenderItem().getItemModelMesher().getModelManager().getBlockModelShapes().getBlockStateMapper().getVariants(block).get(block.getStateFromMeta(stack.getMetadata()));
			}
		});
	}

	private static<T extends Entity> void register(Class<T> clazz, Class<? extends Render<T>> render)
	{
		RenderingRegistry.registerEntityRenderingHandler(clazz, new IRenderFactory<T>() 
		{
			@Override
			public Render<T> createRenderFor(RenderManager manager) 
			{
				try 
				{
					return render.getConstructor(RenderManager.class).newInstance(manager);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}

				return null;
			}
		});
	}

}