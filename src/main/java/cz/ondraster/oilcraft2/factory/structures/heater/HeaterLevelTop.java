package cz.ondraster.oilcraft2.factory.structures.heater;

import cz.ondraster.oilcraft2.factory.FactoryBlocks;
import cz.ondraster.oilcraft2.multiblock.MultiblockLayer;
import cz.ondraster.oilcraft2.tools.BlockPos;
import net.minecraft.world.World;

public class HeaterLevelTop extends MultiblockLayer {

    @Override
    protected boolean checkLevel(World world, BlockPos position) {

        if (!FactoryBlocks.blockCasingHT.isValid(world, position.getLeft()))
            return false;
        if (!FactoryBlocks.blockCasingHT.isValid(world, position.getRight()))
            return false;
        if (!FactoryBlocks.blockCasingHT.isValid(world, position.getFarther()))
            return false;
        if (!FactoryBlocks.blockValve.isValid(world, position.getLeft().getFarther()))
            return false;
        if (!FactoryBlocks.blockValve.isValid(world, position.getRight().getFarther()))
            return false;

        return true;
    }

    @Override
    protected void markLevel(World world, BlockPos position) {
        markPart(world, position.getLeft(), position);
        markPart(world, position.getLeft().getFarther(), position);
        markPart(world, position.getRight(), position);
        markPart(world, position.getRight().getFarther(), position);
        markPart(world, position.getFarther(), position);
    }
}
