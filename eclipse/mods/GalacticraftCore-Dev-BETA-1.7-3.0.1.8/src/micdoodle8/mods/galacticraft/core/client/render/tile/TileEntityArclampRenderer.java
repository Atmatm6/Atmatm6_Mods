package micdoodle8.mods.galacticraft.core.client.render.tile;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import micdoodle8.mods.galacticraft.core.tile.TileEntityArclamp;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.client.model.obj.WavefrontObject;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class TileEntityArclampRenderer extends TileEntitySpecialRenderer
{
	public static final ResourceLocation lampTexture = new ResourceLocation(GalacticraftCore.ASSET_PREFIX, "textures/misc/underoil.png");
	public static final ResourceLocation lightTexture = new ResourceLocation(GalacticraftCore.ASSET_PREFIX, "textures/misc/light.png");
	public static final IModelCustom lampMetal = AdvancedModelLoader.loadModel(new ResourceLocation(GalacticraftCore.ASSET_PREFIX, "models/arclampMetal.obj"));
	public static final IModelCustom lampLight = AdvancedModelLoader.loadModel(new ResourceLocation(GalacticraftCore.ASSET_PREFIX, "models/arclampLight.obj"));
	public static final IModelCustom lampBase = AdvancedModelLoader.loadModel(new ResourceLocation(GalacticraftCore.ASSET_PREFIX, "models/arclampBase.obj"));

	public void renderModelAt(TileEntityArclamp tileEntity, double d, double d1, double d2, float f)
	{
		int side = tileEntity.getBlockMetadata();
		int metaFacing = tileEntity.facing;

		//int facing;
		/*switch (side)
		{
		case 0:
		case 1:
			facing = metaFacing + 2;
			break;
		case 2:
			facing = metaFacing;
			if (metaFacing > 1) facing= 7 - metaFacing;
			break;
		case 3:
			facing = metaFacing;
			if (metaFacing > 1) facing+=2;
			break;
		case 4:
			facing = metaFacing;
			break;
		case 5:
			facing = metaFacing;
			if (metaFacing > 1) facing= 5 - metaFacing;
			break;
		default:
			return;						
		}*/

		GL11.glPushMatrix();
		GL11.glTranslatef((float) d + 0.5F, (float) d1 + 0.5F, (float) d2 + 0.5F);

		switch (side)
		{
		case 0:
			break;
		case 1:
			GL11.glRotatef(180F, 1F, 0, 0);
			if (metaFacing < 2)
			{
				metaFacing ^= 1;
			}
			break;
		case 2:
			GL11.glRotatef(90F, 1F, 0, 0);
			metaFacing ^= 1;
			break;
		case 3:
			GL11.glRotatef(90F, -1F, 0, 0);
			break;
		case 4:
			GL11.glRotatef(90F, 0, 0, -1F);
			metaFacing -= 2;
			if (metaFacing < 0)
			{
				metaFacing = 1 - metaFacing;
			}
			break;
		case 5:
			GL11.glRotatef(90F, 0, 0, 1F);
			metaFacing += 2;
			if (metaFacing > 3)
			{
				metaFacing = 5 - metaFacing;
			}
			break;
		}

		GL11.glTranslatef(0, -0.175F, 0);
		switch (metaFacing)
		{
		case 0:
			break;
		case 1:
			GL11.glRotatef(180F, 0, 1F, 0);
			break;
		case 2:
			GL11.glRotatef(90F, 0, 1F, 0);
			break;
		case 3:
			GL11.glRotatef(270F, 0, 1F, 0);
			break;
		}

		FMLClientHandler.instance().getClient().renderEngine.bindTexture(TileEntityArclampRenderer.lampTexture);
		TileEntityArclampRenderer.lampBase.renderAll();
		GL11.glRotatef(45F, -1F, 0, 0);
		GL11.glScalef(0.048F, 0.048F, 0.048F);
		TileEntityArclampRenderer.lampMetal.renderAll();

		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(TileEntityArclampRenderer.lightTexture);
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawing(GL11.GL_QUADS);
		tessellator.setColorRGBA(255, 255, 255, 255);
		RenderHelper.enableStandardItemLighting();
		((WavefrontObject) TileEntityArclampRenderer.lampLight).tessellateAll(tessellator);
		tessellator.draw();

		GL11.glPopMatrix();
	}

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double var2, double var4, double var6, float var8)
	{
		this.renderModelAt((TileEntityArclamp) tileEntity, var2, var4, var6, var8);
	}
}
