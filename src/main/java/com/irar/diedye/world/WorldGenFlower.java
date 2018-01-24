package com.irar.diedye.world;

import java.util.Random;

import com.irar.diedye.blocks.BlockDieFlower;
import com.irar.diedye.handlers.BlockHandler;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenBush;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenFlower extends WorldGenerator implements IWorldGenerator
{
    private final BlockDieFlower block;
    public BlockPos chunkPos;
    public WorldGenFlower()
    {
        this.block = BlockHandler.DieFlower;
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (worldIn.isAirBlock(blockpos) && (/*!worldIn.provider.hasNoSky() || */blockpos.getY() < worldIn.getHeight() - 1) && this.block.canBlockStay(worldIn, blockpos, this.block.getDefaultState()))
            {
                worldIn.setBlockState(blockpos, this.block.getDefaultState(), 2);
            }
        }

        return true;
    }

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
	    WorldGenFlower gen = new WorldGenFlower();
	    chunkPos= new BlockPos(chunkX*16, 64, chunkZ*16);
        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(world, random, chunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS)){
	
	        for (int l2 = 0; l2 < 5; ++l2)
	        {
	            int i7 = random.nextInt(16) + 8;
	            int l10 = random.nextInt(16) + 8;
	            int j14 = world.getHeight(this.chunkPos.add(i7, 0, l10)).getY() + 32;
	
	            if (j14 > 0)
	            {
	                int k17 = random.nextInt(j14);
	                BlockPos blockpos1 = this.chunkPos.add(i7, k17, l10);
	
	                if (block.getDefaultState().getMaterial() != Material.AIR)
	                {
	                    gen.generate(world, random, blockpos1);
	                }
	            }
	        }
		}
	}
}