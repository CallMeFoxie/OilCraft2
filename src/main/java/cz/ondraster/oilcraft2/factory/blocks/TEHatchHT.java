package cz.ondraster.oilcraft2.factory.blocks;

import cz.ondraster.oilcraft2.factory.FactoryBlocks;
import cz.ondraster.oilcraft2.multiblock.parts.PartBlockEntity;
import net.minecraft.block.Block;

public class TEHatchHT extends PartBlockEntity {
    @Override
    public Block getMasterBlock() {
        return FactoryBlocks.blockHatchHT;
    }
}
