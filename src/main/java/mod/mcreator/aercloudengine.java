package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.client.model.obj.OBJLoader;

import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

@Mod(modid = aercloudengine.MODID, version = aercloudengine.VERSION, dependencies = "required-after:forge@[14.23.5.2814,]")
public class aercloudengine implements IFuelHandler, IWorldGenerator {

	public static final String MODID = "aercloudengine";
	public static final String VERSION = "1.4";
	@SidedProxy(clientSide = "mod.mcreator.ClientProxyaercloudengine", serverSide = "mod.mcreator.CommonProxyaercloudengine")
	public static CommonProxyaercloudengine proxy;
	@Instance(MODID)
	public static aercloudengine instance;
	public static final List<ModElement> elements = new ArrayList<>();

	@Override
	public int getBurnTime(ItemStack fuel) {
		for (ModElement element : elements) {
			int ret = element.addFuel(fuel);
			if (ret != 0)
				return ret;
		}
		return 0;
	}

	@Override
	public void generate(final Random random, int chunkX, int chunkZ, final World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		final int f_chunkX = chunkX * 16;
		final int f_chunkZ = chunkZ * 16;
		if (world.provider.getDimension() == -1)
			elements.forEach(element -> element.generateNether(world, random, f_chunkX, f_chunkZ));
		if (world.provider.getDimension() == 0)
			elements.forEach(element -> element.generateSurface(world, random, f_chunkX, f_chunkZ));
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		GameRegistry.registerFuelHandler(this);
		GameRegistry.registerWorldGenerator(this, 5);
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		elements.forEach(element -> element.load(event));
		proxy.registerRenderers(this);
	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		elements.forEach(element -> element.serverLoad(event));
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		if (event.getSide() == Side.CLIENT)
			OBJLoader.INSTANCE.addDomain("aercloudengine");
		elements.forEach(element -> {
			element.instance = this.instance;
			element.preInit(event);
		});
	}

	public static class GuiHandler implements IGuiHandler {

		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			return null;
		}
	}

	static {
		elements.add(new mcreator_aercloudEngine());
		elements.add(new mcreator_gravititeGear());
		elements.add(new mcreator_arkeniumGear());
		elements.add(new mcreator_skyrootGear());
		elements.add(new mcreator_holystoneGear());
		elements.add(new mcreator_zaniteGear());
		elements.add(new mcreator_valkyrieGear());
		elements.add(new mcreator_gravititeNugget());
		elements.add(new mcreator_arkeniumNugget());
		elements.add(new mcreator_zaniteNugget());
		elements.add(new mcreator_valkyrieNugget());
		elements.add(new mcreator_ambrosiumNugget());
		elements.add(new mcreator_gravititeDust());
		elements.add(new mcreator_arkeniumDust());
		elements.add(new mcreator_valkyrieDust());
		elements.add(new mcreator_arkeniumRod());
	}

	public static class ModElement {

		public static Object instance;

		public void load(FMLInitializationEvent event) {
		}

		public void generateNether(World world, Random random, int chunkX, int chunkZ) {
		}

		public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		public void preInit(FMLPreInitializationEvent event) {
		}

		public void registerRenderers() {
		}

		public int addFuel(ItemStack fuel) {
			return 0;
		}
	}
}
