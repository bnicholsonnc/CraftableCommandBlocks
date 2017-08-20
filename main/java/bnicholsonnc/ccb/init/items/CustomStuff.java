package bnicholsonnc.ccb.init.items;

import bnicholsonnc.ccb.CCB;
import net.minecraft.item.Item;

public class CustomStuff extends Item {
	public CustomStuff(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CCB.craftable);
	}
}
