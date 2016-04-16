package mod.hxgaming.expended.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemLightningRod extends Item
{
	public ItemLightningRod()
	{
		setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn)
	{
	worldIn.playSoundAtEntity(playerIn, "random.bow", 0.5F, 0.4F / 0.4F + 0.8F);
	if (!worldIn.isRemote)
	{ 
	EntityLightningBolt bolt = new EntityLightningBolt(worldIn, playerIn.posX + 4, playerIn.posY, playerIn.posZ);
	EntityLightningBolt bolt2 = new EntityLightningBolt(worldIn, playerIn.posX - 4, playerIn.posY, playerIn.posZ);
	EntityLightningBolt bolt3 = new EntityLightningBolt(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ + 4);
	EntityLightningBolt bolt4 = new EntityLightningBolt(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ - 4);
	worldIn.addWeatherEffect(bolt);
	worldIn.addWeatherEffect(bolt2);
	worldIn.addWeatherEffect(bolt3);
	worldIn.addWeatherEffect(bolt4);

	}
	return stack;
	}
}
