package cz.ondraster.oilcraft2.factory.structures;

import cz.ondraster.oilcraft2.factory.structures.heater.MultiblockStructureHeater;
import cz.ondraster.oilcraft2.multiblock.MultiblockStructure;

public class Structures {
    public static MultiblockStructure structureHeater;

    public static void init() {
        structureHeater = new MultiblockStructureHeater();
    }
}
