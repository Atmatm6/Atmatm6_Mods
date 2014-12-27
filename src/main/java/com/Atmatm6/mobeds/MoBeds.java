package com.Atmatm6.mobeds;

import com.Atmatm6.coremod.Cmod;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

@Mod(modid = Cmod.MoModids, name = MoBeds.name, version = MoBeds.ver)
public class MoBeds {
    // String Statements
    public static final String name = "Mo Beds";
    public static final String ver = "1.00 of the Effect Beds";
    //Pre-Initialization Event Statement
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }
    //MoBeds Creative Mode Tab
    public static final CreativeTabs tabBeds = new CreativeTabs(41325, "MoBeds")
    {
        private static final String __OBFID = "CL_00000006";
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(Blocks.bed);
        }
    };
}
