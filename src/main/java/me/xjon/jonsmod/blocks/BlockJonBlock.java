package me.xjon.jonsmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockJonBlock extends Block
{

	public BlockJonBlock()
	{
		super(Material.ANVIL);

		this.setHardness(2.0F);
		this.setSoundType(SoundType.ANVIL);
		this.setLightLevel(1F);
	}

}