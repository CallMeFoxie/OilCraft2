package cz.ondraster.oilcraft2.factory.blocks;

import cz.ondraster.oilcraft2.factory.FactoryBlocks;
import cz.ondraster.oilcraft2.multiblock.Parts.PartBlockEntity;
import net.minecraft.block.Block;

public class TEHeater extends PartBlockEntity {
    public TEHeater() {
        super();
    }

    @Override
    public Block getMasterBlock() {
        return FactoryBlocks.blockHeater;
    }
}
