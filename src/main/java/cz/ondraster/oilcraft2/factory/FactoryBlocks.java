package cz.ondraster.oilcraft2.factory;

import cz.ondraster.oilcraft2.Tools.Registrator;
import cz.ondraster.oilcraft2.factory.blocks.BlockCasing;
import cz.ondraster.oilcraft2.factory.blocks.BlockCasingHT;
import cz.ondraster.oilcraft2.factory.blocks.BlockHeater;
import net.minecraft.block.Block;

public class FactoryBlocks {
    public static Block blockCasing;
    public static Block blockCasingHT;

    public static Block blockHeater;

    public static void init() {
        // init all the blocks
        blockCasing = new BlockCasing();
        blockCasingHT = new BlockCasingHT();
        blockHeater = new BlockHeater();


        // register all the blocks
        Registrator.registerBlock(blockCasing);
        Registrator.registerBlock(blockCasingHT);
    }
}
