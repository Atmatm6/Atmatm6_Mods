package com.Atmatm6.wutysmc;

import com.Atmatm6.coremod.libraries.WIMCLibs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = WIMCLibs.MODID, name = WIMCLibs.MODNAME, version = WIMCLibs.VERSION)
public class WhatIsMC {
    public static CreativeTabs tabWMCItem;

    //Pre-Init
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }
    //Initialization
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        tabWMCItem = new CreativeTabs("") {
            @Override
            public Item getTabIconItem() {
                return null;
            }

        };
    }
    //Post-Init
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
