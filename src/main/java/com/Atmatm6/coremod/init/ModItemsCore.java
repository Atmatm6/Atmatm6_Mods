package com.Atmatm6.coremod.init;

import com.Atmatm6.coremod.item.ItemCore;
import com.Atmatm6.coremod.item.ItemWrench;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ModItemsCore {
    public static final ItemCore wrench = new ItemWrench();

    public static void init()
    {
        GameRegistry.registerItem(wrench, "Flux Wrench");
    }
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add("A regular fish only");
        par3List.add("found in water");
    }
}
