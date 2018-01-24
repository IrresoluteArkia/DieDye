package com.irar.diedye.client.renderer.factory;

import com.irar.diedye.client.renderer.entity.RenderDieDye;
import com.irar.diedye.entity.projectile.EntityDieDye;
import com.irar.diedye.handlers.ItemHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class FactoryDieDye implements IRenderFactory<EntityDieDye>{

	@Override
	public Render<? super EntityDieDye> createRenderFor(RenderManager manager) {
		return new RenderDieDye(manager);
	}


}
