package cz.ondraster.oilcraft2.tools;

import cpw.mods.fml.common.registry.GameRegistry;
import cz.ondraster.oilcraft2.OilCraft2;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.oredict.OreDictionary;

public class Registrator {
    public static void registerBlock(Block block) {
        GameRegistry.registerBlock(block, OilCraft2.MODID + "_" + block.getUnlocalizedName().substring(5));
    }

    public static void registerItem(Item item) {
        GameRegistry.registerItem(item, OilCraft2.MODID + "_" + item.getUnlocalizedName().substring(5));
    }

    public static void registerMultiBlock(Block block, Class myClass) {
        GameRegistry.registerBlock(block, myClass, OilCraft2.MODID + "_" + block.getUnlocalizedName().substring(5));
    }

    public static void registerTileEntity(Class<? extends TileEntity> te, String unlocalizedname) {
        GameRegistry.registerTileEntity(te, OilCraft2.MODID + "_" + unlocalizedname);
    }

    public static void registerOreDict(Item item, String oreName) {
        OreDictionary.registerOre(oreName, new ItemStack(item));
    }
}
