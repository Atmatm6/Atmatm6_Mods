package com.Atmatm6.mobeds.gamebedgistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BedClass extends Block {
    private Object blockID;

    public BedClass(Material cloth, int x, int y, int z) {
        super(Material.cloth);
        this.setStepSound(soundTypeCloth);
    }

    public boolean isBed(World world, int x, int y, int z, EntityLiving player) {
        return blockID == Block.soundTypeCloth.soundName;
    }

    public void setBedOccupied(World world, int x, int y, int z, EntityPlayer player, boolean occupied) {
        BedClass.setBedOccupied(world, x, y, z, occupied);
    }

    private static void setBedOccupied(World world, int x, int y, int z, boolean occupied) {
    }

    public int getBedDirection(IBlockAccess world, int x, int y, int z) {
        return BlockBed.getDirection(world.getBlockMetadata(x, y, z));
    }

    public boolean isBedFoot(IBlockAccess world, int x, int y, int z) {
        return BlockBed.isBlockHeadOfBed(world.getBlockMetadata(x, y, z));
    }
}