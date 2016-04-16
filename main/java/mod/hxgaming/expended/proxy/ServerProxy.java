package mod.hxgaming.expended.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy extends CommonProxy
{
	@Override
	public void preinit(FMLPreInitializationEvent event)
	{
		super.preinit(event);
	}
	
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
	}
	
	public void postinit(FMLPostInitializationEvent event)
	{
		super.postinit(event);
	}
}
