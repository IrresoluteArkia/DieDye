package com.irar.diedye.proxy;

import com.irar.diedye.DieDye;
import com.irar.diedye.client.renderer.entity.RenderDieDye;
import com.irar.diedye.client.renderer.factory.FactoryDieDye;
import com.irar.diedye.entity.projectile.EntityDieDye;
import com.irar.diedye.handlers.BlockHandler;
import com.irar.diedye.handlers.ItemHandler;
import com.irar.diedye.items.ItemDieDye;
import com.irar.diedye.world.WorldGenFlower;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy{
	public void init(){
		ItemHandler.registerRenders();
		BlockHandler.registerRenders();
	}
}
