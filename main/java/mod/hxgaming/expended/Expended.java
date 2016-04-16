package mod.hxgaming.expended;

import mod.hxgaming.expended.items.ItemLightningBattery;
import mod.hxgaming.expended.items.ItemLightningRod;
import mod.hxgaming.expended.proxy.CommonProxy;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Expended
{
	public static Item lightning_rod;
	public static Item lightning_battery;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preinit (FMLPreInitializationEvent event)
	{
		lightning_rod = new ItemLightningRod().setUnlocalizedName("lightning_rod");
		GameRegistry.registerItem(lightning_rod, "lightning_rod");
		
		lightning_battery = new ItemLightningBattery().setUnlocalizedName("lightning_battery");
		GameRegistry.registerItem(lightning_battery, "lightning_battery");
	}
	
	@EventHandler
	public static void init (FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void postinit (FMLPostInitializationEvent event)
	{
		
	}
}
