package mod.aercloudengine.handlers;

import mod.aercloudengine.*;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler
{
    public static void registerOreDictionary() {

/**Follow the naming conventions here. If you use something other than these be sure to change it here or override it in a CT/MT3 script. **/


        /**
         gearWood
         gearStone
         gearGold
         gearIron
         gearDiamond
            //aether
         gearSkyroot
         gearHolystone
         gearZanite
         gearArkenium
         gearGravitite
         gearValkyrie**/
        //gears
        OreDictionary.registerOre("gearWood", skyrootGear.block);
        OreDictionary.registerOre("gearStone", holystoneGear.block);
        OreDictionary.registerOre("gearGold", zaniteGear.block);
        OreDictionary.registerOre("gearIron", arkeniumGear.block);
        OreDictionary.registerOre("gearDiamond", gravititeGear.block);
        OreDictionary.registerOre("gearDiamond", valkyrieGear.block);
                //aether
        OreDictionary.registerOre("gearSkyroot", skyrootGear.block);
        OreDictionary.registerOre("gearHolystone", holystoneGear.block);
        OreDictionary.registerOre("gearZanite", zaniteGear.block);
        OreDictionary.registerOre("gearArkenium", arkeniumGear.block);
        OreDictionary.registerOre("gearGravitite", gravititeGear.block);
        OreDictionary.registerOre("gearValkyrie", valkyrieGear.block);

        /**
         nuggetCoal
         nuggetGold
         nuggetIron
         nuggetDiamond
            //aether
         nuggetAmbrosium
         nuggetZanite
         nuggetArkenium
         nuggetGravitite
         nuggetValkyrie**/
        //nuggets
        OreDictionary.registerOre("nuggetCoal", ambrosiumNugget.block);
        OreDictionary.registerOre("nuggetGold", zaniteNugget.block);
        OreDictionary.registerOre("nuggetIron", arkeniumNugget.block);
        OreDictionary.registerOre("nuggetDiamond", gravititeNugget.block);
        OreDictionary.registerOre("nuggetDiamond", valkyrieNugget.block);
                //aether
        OreDictionary.registerOre("nuggetAmbrosium", ambrosiumNugget.block);
        OreDictionary.registerOre("nuggetZanite", zaniteNugget.block);
        OreDictionary.registerOre("nuggetArkenium", arkeniumNugget.block);
        OreDictionary.registerOre("nuggetGravitite", gravititeNugget.block);
        OreDictionary.registerOre("nuggetValkyrie", valkyrieNugget.block);

        /**
         dustArkenium
         dustGravitite
         dustValkyrie **/
        //dusts
        OreDictionary.registerOre("dustArkenium", arkeniumDust.block);
        OreDictionary.registerOre("dustGravitite", gravititeDust.block);
        OreDictionary.registerOre("dustValkyrie", valkyrieDust.block);

        /**
         ingotValkyrie **/
        //ingots
        OreDictionary.registerOre("ingotValkyrie", valkyrieMetalPlate.block);

        //plates
        OreDictionary.registerOre("ingotValkyrie", valkyrieMetalPlate.block);

        /**
         oreValkyrie **/
        //ores
        OreDictionary.registerOre("oreValkyrie", oreValkyrieMetal.block);

        /**
         toolHammer
         toolWirecutter
         toolWrench **/
        //tools
        OreDictionary.registerOre("toolHammer", hammer.block);
        OreDictionary.registerOre("toolWirecutter", wirecutters.block);
        OreDictionary.registerOre("toolWrench", wrench.block);

        /**
         fuelCoke **/
        //third-party
        OreDictionary.registerOre("fuelCoke", cokedAmbrosium.block);
    }
}
