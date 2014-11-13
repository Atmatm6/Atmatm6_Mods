package com.Atmatm6.coremod.init;

import com.Atmatm6.pup.item.ItemConsoleLol;
import com.Atmatm6.pup.item.ItemPup;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItemsPuP {
    public static final ItemPup ConsoleLol = new ItemConsoleLol();

    public static void init()
    {
        GameRegistry.registerItem(ConsoleLol, "Console Lol");
    }
}
