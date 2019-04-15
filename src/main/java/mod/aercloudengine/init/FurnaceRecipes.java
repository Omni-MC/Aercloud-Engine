package mod.aercloudengine.init;

import mod.aercloudengine.aercloudengine;
import mod.aercloudengine.oreValkyrieMetal;
import mod.aercloudengine.valkyrieNugget;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

public class FurnaceRecipes extends aercloudengine.ModElement {

    @Override
    public void load(FMLInitializationEvent event) {
        ItemStack smeltStack = new ItemStack(valkyrieNugget.block, (int) (1));
        GameRegistry.addSmelting(new ItemStack(oreValkyrieMetal.block, (int) (1)), smeltStack, 2F);
    }
}

