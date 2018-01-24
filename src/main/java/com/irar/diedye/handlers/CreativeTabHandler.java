package com.irar.diedye.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabHandler {
	public static CreativeTabs DIE_DYE = new CreativeTabs("die_dye"){

		public ItemStack getTabIconItem() {
			return new ItemStack(BlockHandler.DieFlower);
		}
		
	};
}
