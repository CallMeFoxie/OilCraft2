package cz.ondraster.oilcraft2.factory.structures.distillationtower;

import cz.ondraster.oilcraft2.factory.FactoryBlocks;
import cz.ondraster.oilcraft2.multiblock.parts.PartBlockBlock;

public class LevelSingleValveHT extends LevelSingleValve {
    public LevelSingleValveHT(int yLevel) {
        super(yLevel);
    }

    @Override
    protected PartBlockBlock valveBlock() {
        return FactoryBlocks.blockValveHT;
    }

    @Override
    protected PartBlockBlock casingBlock() {
        return FactoryBlocks.blockCasingHT;
    }
}
