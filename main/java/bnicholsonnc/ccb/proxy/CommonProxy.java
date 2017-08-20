package bnicholsonnc.ccb.proxy;

import bnicholsonnc.ccb.handlers.RegistryHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		RegistryHandler.Common();
	}

	public void init(FMLInitializationEvent event) {

	}

	public void postInit(FMLPostInitializationEvent event) {

	}
}
