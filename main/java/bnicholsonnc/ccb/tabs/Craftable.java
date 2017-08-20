package bnicholsonnc.ccb.tabs;

import bnicholsonnc.ccb.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Craftable extends CreativeTabs {
	public Craftable(String label) {
		super("craftable");
		this.setBackgroundImageName("craftable.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.diamond_dust);
	}
}