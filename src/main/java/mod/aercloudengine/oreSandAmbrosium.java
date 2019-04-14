package mod.aercloudengine;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import java.util.List;

public class oreSandAmbrosium extends aercloudengine.ModElement {

    public static final Block block = new BlockCustom().setHardness(3.0F).setResistance(5F).setCreativeTab(tabaercloudEngineBlocks.tab);

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        block.setHarvestLevel("shovel", 0);
        block.setTranslationKey("oresandambrosium");
        block.setRegistryName("oresandambrosium");
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @Override
    public void load(FMLInitializationEvent event) {
        if (event.getSide() == Side.CLIENT) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation("aercloudengine:oresandambrosium", "inventory"));
        }
    }

    public static class BlockCustom extends Block {

        public BlockCustom() {
            super(Material.ROCK);
            setSoundType(SoundType.STONE);
        }

        @Override
        public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
            super.addInformation(itemstack, world, list, flag);
            list.add("Ore Block");
        }

        @SideOnly(Side.CLIENT)
        public BlockRenderLayer getBlockLayer() {
            return BlockRenderLayer.SOLID;
        }
    }
}
