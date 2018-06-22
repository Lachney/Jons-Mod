package me.xjon.jonsmod.entities;

import me.xjon.jonsmod.JonsMod;
import me.xjon.jonsmod.VariableConstants;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class JonEntities
{
	private static int modEntityId;
	
	public static void initialization()
	{	
		register("cheeseburger", EntityCheeseburger.class, 0x40362a, 0xeec634);
		
	}
	
	private static void register(String entityName, Class<? extends Entity> clazz, int primaryEggColor, int secondaryEggColor)
	{
		EntityRegistry.registerModEntity(VariableConstants.locate(entityName), clazz, entityName, modEntityId, JonsMod.instance, 80, 3, false, primaryEggColor, secondaryEggColor);

		modEntityId++;
	}

	@SuppressWarnings("unused")
	private static void register(String entityName, Class<? extends Entity> clazz)
	{
		EntityRegistry.registerModEntity(VariableConstants.locate(entityName), clazz, entityName, modEntityId, JonsMod.instance, 64, 3, false);

		modEntityId++;
	}
}