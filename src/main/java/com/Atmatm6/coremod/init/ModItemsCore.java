package com.Atmatm6.coremod.init;

import com.Atmatm6.coremod.items.ItemCore;
import com.Atmatm6.coremod.items.ItemWrench;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItemsCore {
    public static final ItemCore wrench = new ItemWrench();

    public static void init()
    {
        GameRegistry.registerItem(wrench, "Flux Wrench");
    }
}
