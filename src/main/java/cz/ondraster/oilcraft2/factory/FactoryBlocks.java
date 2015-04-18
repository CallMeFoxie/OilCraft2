package cz.ondraster.oilcraft2.factory;

import cz.ondraster.oilcraft2.factory.blocks.*;
import cz.ondraster.oilcraft2.multiblock.parts.PartBlockBlock;
import cz.ondraster.oilcraft2.tools.Registrator;
import cz.ondraster.oilcraft2.tools.UnlocalizedNames;

public class FactoryBlocks {
    public static PartBlockBlock blockCasing;
    public static PartBlockBlock blockCasingHT;

    public static PartBlockBlock blockHeater;

    public static PartBlockBlock blockValve;
    public static PartBlockBlock blockValveHT;

    public static PartBlockBlock blockHatch;
    public static PartBlockBlock blockHatchHT;

    public static void init() {
        // init all the blocks
        blockCasing = new BlockCasing();
        blockCasingHT = new BlockCasingHT();
        blockHeater = new BlockHeater();
        blockValve = new BlockValve();
        blockValveHT = new BlockValveHT();
        blockHatch = new BlockHatch();
        blockHatchHT = new BlockHatchHT();

        // register all the blocks
        Registrator.registerBlock(blockCasing);
        Registrator.registerBlock(blockCasingHT);
        Registrator.registerBlock(blockHeater);
        Registrator.registerBlock(blockValve);
        Registrator.registerBlock(blockValveHT);
        Registrator.registerBlock(blockHatch);
        Registrator.registerBlock(blockHatchHT);

        // register Tile Entities
        Registrator.registerTileEntity(TECasing.class, UnlocalizedNames.Factory.blockCasing + "_te");
        Registrator.registerTileEntity(TECasingHT.class, UnlocalizedNames.Factory.blockCasingHT + "_te");
        Registrator.registerTileEntity(TEHeater.class, UnlocalizedNames.Factory.blockHeater + "_te");
        Registrator.registerTileEntity(TEValve.class, UnlocalizedNames.Factory.blockValve + "_te");
        Registrator.registerTileEntity(TEValveHT.class, UnlocalizedNames.Factory.blockValveHT + "_te");
        Registrator.registerTileEntity(TEHatch.class, UnlocalizedNames.Factory.blockHatch + "_te");
        Registrator.registerTileEntity(TEHatchHT.class, UnlocalizedNames.Factory.blockHatchHT + "_te");
    }
}
