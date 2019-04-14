package mod.aercloudengine;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;

public class wirecutters extends aercloudengine.ModElement {

    public static Item block;
    static {
        block = (new ItemCustom());
    }

    @Override
    public void load(FMLInitializationEvent event) {
        if (event.getSide() == Side.CLIENT) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                    .register(block, 0, new ModelResourceLocation("aercloudengine:wirecutters", "inventory"));
        }
    }

    public static class ItemCustom extends Item {

        public ItemCustom() {
            setMaxDamage(0);
            maxStackSize = 1;
            setTranslationKey("wirecutters");
            setRegistryName("wirecutters");
            setCreativeTab(tabaercloudEngineItems.tab);
            ForgeRegistries.ITEMS.register(this);
        }

        @Override
        public int getItemEnchantability() {
            return 0;
        }

        @Override
        public int getMaxItemUseDuration(ItemStack par1ItemStack) {
            return 0;
        }

        @Override
        public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
            return 1F;
        }

        @Override
        public ItemStack getContainerItem(ItemStack itemstack) {

            ItemStack item = itemstack.copy();
            item.setCount(1);
            return item;


        }

        @Override

        public boolean hasContainerItem(ItemStack stack) {
            return true;

        }
    }
}
