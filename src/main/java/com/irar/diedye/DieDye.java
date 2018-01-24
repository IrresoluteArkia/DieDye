package com.irar.diedye;

import java.util.Random;

import com.irar.diedye.client.renderer.factory.FactoryDieDye;
import com.irar.diedye.entity.projectile.EntityDieDye;
import com.irar.diedye.proxy.IProxy;

import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@Mod(modid = Ref.MODID, version = Ref.VERSION)

public class DieDye {
	@Mod.Instance(Ref.MODID)
	public static DieDye instance;
	@SidedProxy(clientSide=Ref.CLIENT_PROXY, serverSide=Ref.SERVER_PROXY)
	public static IProxy proxy;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	proxy.preInit();
    }
	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		ResourceLocation resourceLocation = new ResourceLocation("diedye", "die_dye");
		EntityRegistry.registerModEntity(resourceLocation, EntityDieDye.class, resourceLocation.toString(), 0, instance, 64, 10, true);
    	proxy.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	proxy.postInit();
    }
}
