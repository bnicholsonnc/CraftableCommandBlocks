package bnicholsonnc.ccb.handlers;

import bnicholsonnc.ccb.init.ArmorInit;
import bnicholsonnc.ccb.init.BlockInit;
import bnicholsonnc.ccb.init.ItemInit;
import bnicholsonnc.ccb.init.ToolInit;

public class RegistryHandler {
	public static void Client() {
		RecipeHandler.registerCrafting();
	}

	public static void Common() {
		ItemInit.init();
		ItemInit.register();
		BlockInit.init();
		BlockInit.register();
		ToolInit.init();
		ToolInit.register();
		ArmorInit.init();
		ArmorInit.register();
}
}
