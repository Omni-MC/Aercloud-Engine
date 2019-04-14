package mod.aercloudengine;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

public class tabaercloudEngineItems extends aercloudengine.ModElement {

	public static CreativeTabs tab = new CreativeTabs("tabaercloudengineitems") {

		@SideOnly(Side.CLIENT)
		@Override
		public ItemStack createIcon() {
			return new ItemStack(gravititeGear.block, (int) (1));
		}

		@SideOnly(Side.CLIENT)
		public boolean hasSearchBar() {
			return false;
		}
	};
}
