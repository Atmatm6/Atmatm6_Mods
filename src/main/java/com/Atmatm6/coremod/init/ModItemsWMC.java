package com.Atmatm6.coremod.init;

import com.Atmatm6.wutysmc.WhatIsMC;
import com.Atmatm6.wutysmc.item.ItemBackpack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItemsWMC {
    public static Item backPack;

    public static void loadItems() {
        backPack = new ItemBackpack().setUnlocalizedName("Backpack").setCreativeTab(WhatIsMC.tabWMCItem);

        GameRegistry.registerItem(backPack, backPack.getUnlocalizedName());
    }
}
