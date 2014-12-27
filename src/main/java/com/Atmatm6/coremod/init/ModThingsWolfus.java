package com.Atmatm6.coremod.init;

import com.Atmatm6.wolfuscraft.block.WolfusOreus;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModThingsWolfus {
    //Block Statements
    public static final Block wolfusore = new WolfusOreus(Material.rock);

    //TODO Make Wolfus Gem Item
    //Item Statements

    //Game registries
    public static void init(){
        String wolfusOreus;
        GameRegistry.registerBlock(wolfusore, "Wolfus Oreus");
    }
}
