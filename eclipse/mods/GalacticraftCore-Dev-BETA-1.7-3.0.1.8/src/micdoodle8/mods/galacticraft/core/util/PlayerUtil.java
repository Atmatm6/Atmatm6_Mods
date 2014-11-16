package micdoodle8.mods.galacticraft.core.util;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import micdoodle8.mods.galacticraft.core.entities.player.GCEntityClientPlayerMP;
import micdoodle8.mods.galacticraft.core.entities.player.GCEntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import sun.misc.Version;

import java.util.Iterator;

public class PlayerUtil
{
    public static EntityPlayerMP getPlayerForUsernameVanilla(MinecraftServer server, String username)
    {
        return VersionUtil.getPlayerForUsername(server, username);
    }

	public static GCEntityPlayerMP getPlayerBaseServerFromPlayerUsername(String username, boolean ignoreCase)
	{
		MinecraftServer server = MinecraftServer.getServer();

		if (server != null)
		{
			if (ignoreCase)
			{
				return (GCEntityPlayerMP) getPlayerForUsernameVanilla(server, username);
			}
			else
			{
				Iterator iterator = server.getConfigurationManager().playerEntityList.iterator();
				GCEntityPlayerMP entityplayermp;

				do
				{
					if (!iterator.hasNext())
					{
						return null;
					}

					entityplayermp = (GCEntityPlayerMP) iterator.next();
				}
				while (!entityplayermp.getCommandSenderName().equalsIgnoreCase(username));

				return entityplayermp;
			}
		}

		GCLog.severe("Warning: Could not find player base server instance for player " + username);

		return null;
	}

	public static GCEntityPlayerMP getPlayerBaseServerFromPlayer(EntityPlayer player, boolean ignoreCase)
	{
		if (player == null)
		{
			return null;
		}

		if (player instanceof GCEntityPlayerMP)
		{
			return (GCEntityPlayerMP) player;
		}

		return PlayerUtil.getPlayerBaseServerFromPlayerUsername(player.getCommandSenderName(), ignoreCase);
	}

	@SideOnly(Side.CLIENT)
	public static GCEntityClientPlayerMP getPlayerBaseClientFromPlayer(EntityPlayer player, boolean ignoreCase)
	{
		GCEntityClientPlayerMP clientPlayer = (GCEntityClientPlayerMP) FMLClientHandler.instance().getClientPlayerEntity();

		if (clientPlayer == null && player != null)
		{
			GCLog.severe("Warning: Could not find player base client instance for player " + player.getGameProfile().getName());
		}

		return clientPlayer;
	}
}
