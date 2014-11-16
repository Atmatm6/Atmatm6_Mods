package micdoodle8.mods.galacticraft.core.tile;

import micdoodle8.mods.galacticraft.core.blocks.BlockMachine2;
import micdoodle8.mods.galacticraft.core.network.IPacketReceiver;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class TileEntityOxygenStorageModule extends TileEntityOxygen implements IPacketReceiver
{
	public final Set<EntityPlayer> playersUsing = new HashSet<EntityPlayer>();
	public int scaledOxygenLevel;
	private int lastScaledOxygenLevel;

	public static final int OUTPUT_PER_TICK = 100;

	public TileEntityOxygenStorageModule()
	{
		super(60000, 16);
		this.storage.setCapacity(0);
		this.storage.setMaxExtract(0);
	}

	@Override
	public void updateEntity()
	{
		super.updateEntity();

		this.scaledOxygenLevel = this.getScaledOxygenLevel(16);

		if (this.scaledOxygenLevel != this.lastScaledOxygenLevel)
		{
			this.worldObj.func_147479_m(this.xCoord, this.yCoord, this.zCoord);
		}

		this.lastScaledOxygenLevel = this.scaledOxygenLevel;

		this.produceOxygen();

		// if (!this.worldObj.isRemote)
		// {
		// int gasToSend = Math.min(this.storedOxygen,
		// GCCoreTileEntityOxygenStorageModule.OUTPUT_PER_TICK);
		// GasStack toSend = new GasStack(GalacticraftCore.gasOxygen,
		// gasToSend);
		// this.storedOxygen -= GasTransmission.emitGasToNetwork(toSend, this,
		// this.getOxygenOutputDirection());
		//
		// Vector3 thisVec = new Vector3(this);
		// TileEntity tileEntity =
		// thisVec.modifyPositionFromSide(this.getOxygenOutputDirection()).getTileEntity(this.worldObj);
		//
		// if (tileEntity instanceof IGasAcceptor)
		// {
		// if (((IGasAcceptor)
		// tileEntity).canReceiveGas(this.getOxygenInputDirection(),
		// GalacticraftCore.gasOxygen))
		// {
		// double sendingGas = 0;
		//
		// if (this.storedOxygen >=
		// GCCoreTileEntityOxygenStorageModule.OUTPUT_PER_TICK)
		// {
		// sendingGas = GCCoreTileEntityOxygenStorageModule.OUTPUT_PER_TICK;
		// }
		// else
		// {
		// sendingGas = this.storedOxygen;
		// }
		//
		// this.storedOxygen -= sendingGas - ((IGasAcceptor)
		// tileEntity).receiveGas(new GasStack(GalacticraftCore.gasOxygen, (int)
		// Math.floor(sendingGas)));
		// }
		// }
		// }

		this.lastScaledOxygenLevel = this.scaledOxygenLevel;
	}

	@Override
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readFromNBT(par1NBTTagCompound);
	}

	@Override
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeToNBT(par1NBTTagCompound);
	}

	@Override
	public EnumSet<ForgeDirection> getElectricalInputDirections()
	{
		return EnumSet.noneOf(ForgeDirection.class);
	}

	@Override
	public EnumSet<ForgeDirection> getElectricalOutputDirections()
	{
		return EnumSet.noneOf(ForgeDirection.class);
	}

	@Override
	public boolean shouldPullOxygen()
	{
		return this.storedOxygen < this.maxOxygen;
	}

	@Override
	public boolean shouldPullEnergy()
	{
		return false;
	}

	@Override
	public boolean shouldUseEnergy()
	{
		return false;
	}

	@Override
	public ForgeDirection getElectricInputDirection()
	{
		return null;
	}

	@Override
	public ItemStack getBatteryInSlot()
	{
		return null;
	}

	@Override
	public boolean shouldUseOxygen()
	{
		return false;
	}

	@Override
	public float getOxygenProvide(ForgeDirection direction)
	{
		return this.getOxygenOutputDirections().contains(direction) ? Math.min(TileEntityOxygenStorageModule.OUTPUT_PER_TICK, this.getOxygenStored()) : 0.0F;
	}

	@Override
	public EnumSet<ForgeDirection> getOxygenInputDirections()
	{
		return EnumSet.of(ForgeDirection.getOrientation(this.getBlockMetadata() - BlockMachine2.OXYGEN_STORAGE_MODULE_METADATA + 2));
	}

	@Override
	public EnumSet<ForgeDirection> getOxygenOutputDirections()
	{
		return EnumSet.of(ForgeDirection.getOrientation(this.getBlockMetadata() - BlockMachine2.OXYGEN_STORAGE_MODULE_METADATA + 2).getOpposite());
	}
}
