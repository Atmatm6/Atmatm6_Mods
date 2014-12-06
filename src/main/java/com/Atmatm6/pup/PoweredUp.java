/**
 * Created by Atmatm6 because of the modding community,including direwolf20, Team Cofh, tterag, and the rest of Forgecraft.
 */
package com.Atmatm6.pup;

import com.Atmatm6.coremod.init.ModItemsPuP;
import com.Atmatm6.coremod.libraries.PupLibs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PupLibs.MODID, name = PupLibs.MODNAME, version = PupLibs.VERSION,dependencies = "required-after:AtmCmod")
public class PoweredUp{
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItemsPuP.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}