/*
 * Created by Atmatm6 because of the modding community,including direwolf20, Team Cofh, tterag, and the rest of Forgecraft.
 */
package com.Atmatm6.pup;

import com.Atmatm6.coremod.libraries.PupLibs;
import com.Atmatm6.pup.windmill.BlockWondermill;
import com.Atmatm6.pup.windmill.ItemWondermill;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

@Mod(modid = PupLibs.MODID, name = PupLibs.MODNAME, version = PupLibs.VERSION,dependencies = "required-after:AtmCmod")
public class PoweredUp{
    public static Block blockWondermill;

    public static Item itemWondermill;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        blockWondermill = new BlockWondermill(Material.sand).setBlockName("Wondermill Windmill");
        GameRegistry.registerBlock(blockWondermill, "Wondermill Windmill");

        itemWondermill = new ItemWondermill().setUnlocalizedName("itemWondermill").setTextureName("ender_pearl");
        GameRegistry.registerItem(itemWondermill, "itemWondermill");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}