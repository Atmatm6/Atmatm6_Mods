package com.Atmatm6.mobeds.gamebedgistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockBed;

public class GameBedgristry {
    public static void registerBed(BlockBed blockBed, String bedID)
    {
        GameRegistry.registerBlock(blockBed, bedID);
    }
}
