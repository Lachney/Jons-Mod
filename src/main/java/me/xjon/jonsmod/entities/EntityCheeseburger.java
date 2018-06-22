package me.xjon.jonsmod.entities;

import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityCheeseburger extends EntitySlime
{

	public EntityCheeseburger(World worldIn) 
	{
		super(worldIn);
	}

	@Override
    protected boolean spawnCustomParticles() 
	{
		return true; 
	}

	@Override
    protected EntitySlime createInstance()
    {
        return new EntityCheeseburger(this.world);
    }

	@Override
    protected void entityInit()
    {
        super.entityInit();      
    }

	@Override
    protected ResourceLocation getLootTable()
    {
    	return null;
    }

	@Override
    public boolean getCanSpawnHere()
    {
        return this.world.getDifficulty() != EnumDifficulty.PEACEFUL;
    }

}