package bnicholsonnc.ccb.init;

import bnicholsonnc.ccb.init.items.CustomStuff;
import bnicholsonnc.ccb.init.tools.CustomAxe;
import bnicholsonnc.ccb.init.tools.CustomHoe;
import bnicholsonnc.ccb.init.tools.CustomPickaxe;
import bnicholsonnc.ccb.init.tools.CustomShovel;
import bnicholsonnc.ccb.init.tools.CustomSword;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ToolInit {
	
	public static final ToolMaterial platinum = EnumHelper.addToolMaterial("platinum", 3, 2351, 10.0F, 5.0F, 10);
	
	public static Item platinum_pickaxe, platinum_axe, platinum_shovel, platinum_hoe, platinum_sword;

	public static void init() {
		platinum_pickaxe = new CustomPickaxe("platinum_pickaxe", platinum);
		platinum_axe = new CustomAxe("platinum_axe", platinum);
		platinum_shovel = new CustomShovel("platinum_shovel", platinum);
		platinum_hoe = new CustomHoe("platinum_hoe", platinum);
		platinum_sword = new CustomSword("platinum_sword", platinum);
	}

	public static void register() {
		registerItem(platinum_pickaxe);
		registerItem(platinum_axe);
		registerItem(platinum_shovel);
		registerItem(platinum_hoe);
		registerItem(platinum_sword);
	}

	public static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);

		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
