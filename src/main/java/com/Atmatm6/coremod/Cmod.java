package com.Atmatm6.coremod;

import com.Atmatm6.coremod.init.ModItemsCore;
import com.Atmatm6.coremod.libraries.CmodLibs;
import com.Atmatm6.pup.PoweredUp;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = CmodLibs.MODID, name = CmodLibs.MODNAME, version = CmodLibs.Version)
public class Cmod {
    public static final String TwitModid = "Twittmc";
    public static final String MoModids = "MoBeds";
    public static final String MoMoodsModids = "MoBedsMoods";
    public static final String BedgistryModid = "Bedgistry";
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ModItemsCore.init();
    }
    public static final CreativeTabs tabAtmatm6 = new CreativeTabs(27, "Atmatm6's Mods")
    {
        private static final String __OBFID = "CL_00000006";
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(PoweredUp.blockWondermill);
        }
    };
}
