package cz.ondraster.oilcraft2.factory.structures.heater;

import cz.ondraster.oilcraft2.multiblock.MultiblockStructure;

public class MultiblockStructureHeater extends MultiblockStructure {

    public MultiblockStructureHeater() {
        super(3, 2, 2);
        addLayer(0, new HeaterLevelBottom());
        addLayer(1, new HeaterLevelTop());
    }
}
