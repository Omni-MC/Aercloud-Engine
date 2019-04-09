package mod.aercloudengine;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;

import java.util.List;

public class valkyrieGear extends aercloudengine.ModElement {

	public static Item block;
	static {
		block = (new ItemCustom());
	}

	@Override
	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("aercloudengine:valkyriegear", "inventory"));
		}
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 16;
			setTranslationKey("valkyriegear");
			setRegistryName("valkyriegear");
			setCreativeTab(tabaercloudEngine.tab);
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
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("Experiments using valkyrie gears were ultimately unsuccessful and thus this gear is only used in out of commission sentries hidden deep in the ancient vaults.");
		}
	}
}
