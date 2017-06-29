package com.wchb.jemain.init;

import com.wchb.jemain.Reference;
import com.wchb.jemain.wchbMod;
import com.wchb.jemain.blocks.WorldBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class wchbBlocks {
	
	public static Block world_grassblock;
	public static Block world_stoneblock;
	public static Block world_dirtblock;
	
	public static void init()
	{
		world_grassblock = new WorldBlock(Material.GRASS).setSoundType(SoundType.PLANT).setUnlocalizedName("world_grassblock").setCreativeTab(wchbMod.tabWchb);
		world_stoneblock = new WorldBlock(Material.ROCK).setSoundType(SoundType.STONE).setUnlocalizedName("world_stoneblock").setCreativeTab(wchbMod.tabWchb);
		world_dirtblock = new WorldBlock(Material.GROUND).setSoundType(SoundType.GROUND).setUnlocalizedName("world_dirtblock").setCreativeTab(wchbMod.tabWchb);
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(world_grassblock, world_grassblock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(world_stoneblock, world_stoneblock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(world_dirtblock, world_dirtblock.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		Item item;
		
		item = Item.getItemFromBlock(world_grassblock);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("minecraft:grass", "inventory"));
		
		item = Item.getItemFromBlock(world_stoneblock);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("minecraft:stone", "inventory"));
		
		item = Item.getItemFromBlock(world_dirtblock);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("minecraft:dirt", "inventory"));
		
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID+ ":" + 
				item.getUnlocalizedName().substring(5), "inventory"));
	}

}
