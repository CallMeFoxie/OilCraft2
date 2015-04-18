package cz.ondraster.oilcraft2.factory.structures.heater;

import cz.ondraster.oilcraft2.factory.FactoryBlocks;
import cz.ondraster.oilcraft2.multiblock.MultiblockLayer;
import cz.ondraster.oilcraft2.tools.BlockPos;
import net.minecraft.world.World;

public class HeaterLevelBottom extends MultiblockLayer {
    @Override
    protected boolean checkLevel(World world, BlockPos position) {
        BlockPos baseLevel = position.getBelow();

        if (!FactoryBlocks.blockHeater.isValid(world, baseLevel.getLeft()))
            return false;
        if (!FactoryBlocks.blockHeater.isValid(world, baseLevel.getLeft().getFarther()))
            return false;
        if (!FactoryBlocks.blockHeater.isValid(world, baseLevel.getFarther()))
            return false;
        if (!FactoryBlocks.blockHeater.isValid(world, baseLevel))
            return false;
        if (!FactoryBlocks.blockHeater.isValid(world, baseLevel.getRight()))
            return false;
        if (!FactoryBlocks.blockHeater.isValid(world, baseLevel.getRight().getFarther()))
            return false;

        return true;
    }

    @Override
    protected void markLevel(World world, BlockPos position) {
        BlockPos baseLevel = position.getBelow();
        markPart(world, baseLevel.getLeft(), position);
        markPart(world, baseLevel.getLeft().getFarther(), position);
        markPart(world, baseLevel, position);
        markPart(world, baseLevel.getFarther(), position);
        markPart(world, baseLevel.getRight(), position);
        markPart(world, baseLevel.getRight().getFarther(), position);
    }
}
