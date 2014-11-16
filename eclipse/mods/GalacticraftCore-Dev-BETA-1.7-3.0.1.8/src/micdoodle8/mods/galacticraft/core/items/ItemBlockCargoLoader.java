package micdoodle8.mods.galacticraft.core.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import micdoodle8.mods.galacticraft.core.proxy.ClientProxyCore;
import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockCargoLoader extends ItemBlockDesc
{
	public ItemBlockCargoLoader(Block block)
	{
		super(block);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		String name = "";

		if (par1ItemStack.getItemDamage() < 4)
		{
			name = "loader";
		}
		else
		{
			name = "unloader";
		}

		return this.field_150939_a.getUnlocalizedName() + "." + name;
	}

	@Override
	public int getMetadata(int damage)
	{
		return damage;
	}
}
