package com.Atmatm6.pup.ctabs;

import com.Atmatm6.coremod.init.ModItemsPuP;
import com.Atmatm6.coremod.libraries.PupLibs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PupCreativeTabs {
    public static final CreativeTabs tabPoweredUpItems = new CreativeTabs(PupLibs.MODID) {
        @Override
        public Item getTabIconItem()
        {
            return ModItemsPuP.ConsoleLol;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Powered Up Items";
        }
    };
}