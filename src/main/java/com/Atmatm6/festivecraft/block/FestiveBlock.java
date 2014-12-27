package com.Atmatm6.festivecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import static net.minecraft.block.material.Material.cloth;

/**
 * Created by Austin on 2014-12-23.
 */
public class FestiveBlock extends Block{
    public FestiveBlock(Material material)
    {
        super(cloth);
        this.setStepSound(soundTypeCloth);
    }
}
