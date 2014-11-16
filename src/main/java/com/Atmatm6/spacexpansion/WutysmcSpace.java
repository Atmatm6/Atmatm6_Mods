package com.Atmatm6.spacexpansion;

import com.Atmatm6.coremod.libraries.WMCSpaceLibs;
import com.Atmatm6.coremod.proxy.CommonProxyClass;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = WMCSpaceLibs.MODID, name = WMCSpaceLibs.MODNAME, version = WMCSpaceLibs.VERSION, dependencies = WMCSpaceLibs.DEPS)
public class WutysmcSpace {
    @SidedProxy(clientSide="com.Atmatm6.coremod.proxy.ClientProxyClass", serverSide="com.Atmatm6.coremod.proxy.CommonProxyClass")
    public static CommonProxyClass proxy;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
