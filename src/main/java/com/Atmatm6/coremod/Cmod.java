package com.Atmatm6.coremod;

import com.Atmatm6.coremod.init.ModItemsCore;
import com.Atmatm6.coremod.libraries.CmodLibs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CmodLibs.MODID, name = CmodLibs.MODNAME, version = CmodLibs.Version)
public class Cmod {
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ModItemsCore.init();
    }
}
