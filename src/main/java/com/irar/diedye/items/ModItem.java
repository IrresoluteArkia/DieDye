package com.irar.diedye.items;

import com.irar.diedye.handlers.CreativeTabHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItem extends Item{
	public ModItem(String name){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabHandler.DIE_DYE);
	}
	
	public ModItem(String name, Item containerItem){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabHandler.DIE_DYE);
		setContainerItem(containerItem);
	}
	
	public ModItem(String name, int stacksize){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabHandler.DIE_DYE);
		setMaxStackSize(stacksize);
	}
}
