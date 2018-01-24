package com.irar.diedye.proxy;

import com.irar.diedye.DieDye;
import com.irar.diedye.client.renderer.factory.FactoryDieDye;
import com.irar.diedye.entity.projectile.EntityDieDye;
import com.irar.diedye.handlers.BlockHandler;
import com.irar.diedye.handlers.CraftingHandler;
import com.irar.diedye.handlers.ItemHandler;
import com.irar.diedye.world.WorldGenFlower;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy implements IProxy{

	@Override
	public void preInit() {
		ItemHandler.init();
		ItemHandler.register();
		
		BlockHandler.init();
		BlockHandler.register();

		RenderingRegistry.registerEntityRenderingHandler(EntityDieDye.class, new FactoryDieDye());
		GameRegistry.registerWorldGenerator(new WorldGenFlower(), 0);
	}

	@Override
	public void init() {
		
	}

	@Override
	public void postInit() {
		CraftingHandler.init();
	}

}
