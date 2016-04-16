package mod.hxgaming.expended.proxy;

import mod.hxgaming.expended.Expended;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preinit(FMLPreInitializationEvent event)
	{
		super.preinit(event);
	}
	
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
		
		//items
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Expended.lightning_rod, 0, new ModelResourceLocation("Expended:lightning_rod", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Expended.lightning_battery, 0, new ModelResourceLocation("Expended:lightning_battery", "inventory"));
	}
	
	public void postinit(FMLPostInitializationEvent event)
	{
		super.postinit(event);
	}

}
