package micdoodle8.mods.galacticraft.core.dimension;

import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.ITeleportType;
import micdoodle8.mods.galacticraft.core.entities.player.GCEntityPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

import java.util.Random;

public class TeleportTypeOverworld implements ITeleportType
{
	@Override
	public boolean useParachute()
	{
		return true;
	}

	@Override
	public Vector3 getPlayerSpawnLocation(WorldServer world, EntityPlayerMP player)
	{
		if (player instanceof GCEntityPlayerMP)
		{
			return new Vector3(((GCEntityPlayerMP) player).getPlayerStats().coordsTeleportedFromX, 250.0, ((GCEntityPlayerMP) player).getPlayerStats().coordsTeleportedFromZ);
		}

		return null;
	}

	@Override
	public Vector3 getEntitySpawnLocation(WorldServer world, Entity entity)
	{
		return new Vector3(entity.posX, 250.0, entity.posZ);
	}

	@Override
	public Vector3 getParaChestSpawnLocation(WorldServer world, EntityPlayerMP player, Random rand)
	{
		final double x = (rand.nextDouble() * 2 - 1.0D) * 5.0D;
		final double z = (rand.nextDouble() * 2 - 1.0D) * 5.0D;

		return new Vector3(player.posX + x, 230.0D, player.posZ + z);
	}

	@Override
	public void onSpaceDimensionChanged(World newWorld, EntityPlayerMP player, boolean ridingAutoRocket)
	{
	}
}
