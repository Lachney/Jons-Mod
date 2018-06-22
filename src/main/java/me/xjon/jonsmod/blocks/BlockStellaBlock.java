package me.xjon.jonsmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockStellaBlock extends Block
{

	public BlockStellaBlock()
	{
		super(Material.CLOTH);

		this.setHardness(2.0F);
		this.setSoundType(SoundType.CLOTH);
	}

}