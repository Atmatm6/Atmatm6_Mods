package com.Atmatm6.pup.windmill;

import com.Atmatm6.pup.PoweredUp;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWondermill extends Item{

    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float x2, float y2, float z2){
        if(world.isRemote){
            System.out.println(side);
        }
            if(side==3)
                world.setBlock(x,y,z+1, PoweredUp.blockWondermill);
            if(side==4)
                world.setBlock(x-1,y,z,PoweredUp.blockWondermill);
            if(side==5)
                world.setBlock(x+1,y,z,PoweredUp.blockWondermill);
            if(side==2)
                world.setBlock(x, y, z-1,PoweredUp.blockWondermill);
            return true;
        }
}
