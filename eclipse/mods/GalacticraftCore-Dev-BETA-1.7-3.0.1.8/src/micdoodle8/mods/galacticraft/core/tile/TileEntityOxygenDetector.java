package micdoodle8.mods.galacticraft.core.tile;

import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.core.blocks.BlockOxygenDetector;
import micdoodle8.mods.galacticraft.core.util.OxygenUtil;

public class TileEntityOxygenDetector extends TileEntityAdvanced
{
	@Override
	public void updateEntity()
	{
		super.updateEntity();

		if (this.worldObj != null && !this.worldObj.isRemote && this.ticks % 50 == 0)
		{
			this.blockType = this.getBlockType();

			if (this.blockType != null && this.blockType instanceof BlockOxygenDetector)
			{
				((BlockOxygenDetector) this.blockType).updateOxygenState(this.worldObj, this.xCoord, this.yCoord, this.zCoord, OxygenUtil.isAABBInBreathableAirBlock(this.worldObj, new Vector3(this).translate(new Vector3(-1, -1, -1)), new Vector3(this).translate(new Vector3(2, 2, 2))));
			}
		}
	}

	@Override
	public double getPacketRange()
	{
		return 0;
	}

	@Override
	public int getPacketCooldown()
	{
		return 0;
	}

	@Override
	public boolean isNetworkedTile()
	{
		return false;
	}
}
