package com.Atmatm6.bedgistry;

import com.Atmatm6.moodie.Moods;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockBed;
/*
//This Mod is an api for More Beds
//  -Atmatm6
*/
public class GameBedgristry {
    public static void registerBed(BlockBed blockBed, String bedID)
    {
        GameRegistry.registerBlock(blockBed, bedID);
    }

    public static void registerMood(Moods mood, String string)
    {

    }
}
