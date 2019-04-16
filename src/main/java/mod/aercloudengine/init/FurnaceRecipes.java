package mod.aercloudengine.init;

import mod.aercloudengine.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

public class FurnaceRecipes extends aercloudengine.ModElement {

    @Override
    public void load(FMLInitializationEvent event) {
        ItemStack smeltStack = new ItemStack(valkyrieNugget.block, (int) (1));
        GameRegistry.addSmelting(new ItemStack(oreValkyrieMetal.block, (int) (1)), smeltStack, 1F);
    }
    {
        ItemStack smeltStack = new ItemStack(arkeniumNugget.block, (int) (1));
        GameRegistry.addSmelting(new ItemStack(arkeniumDust.block, (int) (1)), smeltStack, 0.25F);
    }
    {
        ItemStack smeltStack = new ItemStack(gravititeNugget.block, (int) (1));
        GameRegistry.addSmelting(new ItemStack(gravititeDust.block, (int) (1)), smeltStack, 0.5F);
    }
    {
        ItemStack smeltStack = new ItemStack(valkyrieMetalPlate.block, (int) (1));
        GameRegistry.addSmelting(new ItemStack(valkyrieDust.block, (int) (1)), smeltStack, 0.75F);
    }
}

