package com.Atmatm6.coremod.init;

import com.Atmatm6.coremod.item.ItemCore;
import com.Atmatm6.coremod.item.ItemWrench;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Austin on 2014-11-11.
 */
public class ModItemsCore {
    public static final ItemCore wrench = new ItemWrench();

    public static void init()
    {
        GameRegistry.registerItem(wrench, "Flux Wrench");
    }
}
