package com.irar.diedye.handlers;

import com.irar.diedye.client.renderer.entity.RenderDieDye;
import com.irar.diedye.client.renderer.factory.FactoryDieDye;
import com.irar.diedye.entity.projectile.EntityDieDye;
import com.irar.diedye.items.ItemDieDye;
import com.irar.diedye.items.ModItem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHandler {
	public static Item DieDye;
	public static void init(){
		DieDye = new ItemDieDye("die_dye");
		
	}
	
	public static void register(){
		 ForgeRegistries.ITEMS.register(DieDye);
	}
	
	public static void registerRenders(){
		registerRender(DieDye);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
