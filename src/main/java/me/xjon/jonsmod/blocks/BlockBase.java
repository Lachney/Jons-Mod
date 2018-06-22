package me.xjon.jonsmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBase extends Block
{

	public BlockBase()
	{
		super(Material.ROCK);

		this.setHardness(2.0F);
		this.setSoundType(SoundType.STONE);
	}

}