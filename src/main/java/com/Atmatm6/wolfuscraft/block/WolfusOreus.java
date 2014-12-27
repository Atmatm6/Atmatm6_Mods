package com.Atmatm6.wolfuscraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class WolfusOreus extends Block {
    public WolfusOreus(Material rock)
    {
        super(rock);
        setHarvestLevel("shovel", 3);
        setCreativeTab(CreativeTabs.tabMisc);
        setBlockTextureName("assets.wolfuscraft.textures.block.wolfusoreus.png");
        setLightLevel(10);
        setBlockName(String.valueOf(WolfusOreus));
        setStepSound(soundTypeStone);
    }
    public static Block WolfusOreus = new BlockOre();
}
