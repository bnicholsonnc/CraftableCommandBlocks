package bnicholsonnc.ccb.init;

import bnicholsonnc.ccb.init.items.CustomStuff;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit {
	public static Item diamond_dust;
	public static Item platinum_ingot;

	public static void init() {
		diamond_dust = new CustomStuff("diamond_dust");
		platinum_ingot = new CustomStuff("platinum_ingot");
	}

	public static void register() {
		registerItem(diamond_dust);
		registerItem(platinum_ingot);
	}

	public static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);

		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
