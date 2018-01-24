package com.irar.diedye.handlers;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class CraftingHandler {
	public static void init(){
		
		GameRegistry.addShapelessRecipe(new ResourceLocation("diedye:diedye"), new ResourceLocation("custom_recipes"), new ItemStack(ItemHandler.DieDye, 2), Ingredient.fromItems(BlockHandler.ibDieFlower));
		GameRegistry.addShapedRecipe(new ResourceLocation("diedye:diedye2"), new ResourceLocation("custom_recipes"), new ItemStack(BlockHandler.DecFlower, 1), new Object[]{"DDD", "DFD", "DDD", 'D', ItemHandler.DieDye, 'F', BlockHandler.DieFlower});
		
	}
}
