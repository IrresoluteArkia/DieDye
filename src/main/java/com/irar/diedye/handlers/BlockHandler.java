package com.irar.diedye.handlers;


import com.irar.diedye.blocks.BlockDieFlower;
import com.irar.diedye.blocks.ModBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class BlockHandler {
//	public static final 
	public static BlockDieFlower DieFlower;
	public static ItemBlock ibDieFlower;
	public static Block DecFlower;
	public static ItemBlock ibDecFlower;
	public static void init(){
		DieFlower = new BlockDieFlower(Material.LEAVES, "die_flower", 0F, 0F);
		ibDieFlower = (ItemBlock) new ItemBlock(DieFlower);
		DecFlower = new ModBlock(Material.LEAVES, "dec_flower", 0F, 0F);
		ibDecFlower = (ItemBlock) new ItemBlock(DecFlower);
	}
	
	public static void register(){
		ibDieFlower.setRegistryName(DieFlower.getRegistryName());
		ibDecFlower.setRegistryName(DecFlower.getRegistryName());
		
		ForgeRegistries.BLOCKS.register(DieFlower);
		ForgeRegistries.ITEMS.register(ibDieFlower);
		ForgeRegistries.BLOCKS.register(DecFlower);
		ForgeRegistries.ITEMS.register(ibDecFlower);
		
	}
	
	public static void registerRenders(){
		registerRender(DieFlower);
		ItemHandler.registerRender(ibDieFlower);
		registerRender(DecFlower);
		ItemHandler.registerRender(ibDecFlower);
	}
	
	public static void registerRender(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
