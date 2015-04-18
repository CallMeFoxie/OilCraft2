package cz.ondraster.oilcraft2.factory.structures.heater;

import cz.ondraster.oilcraft2.tools.BlockPos;
import cz.ondraster.oilcraft2.api.multiblock.IMultiblockPart;
import cz.ondraster.oilcraft2.factory.FactoryBlocks;
import cz.ondraster.oilcraft2.multiblock.MultiblockLayer;
import net.minecraft.world.World;

public class HeaterLevelBottom extends MultiblockLayer {
    @Override
    protected boolean checkLevel(World world, BlockPos position) {
        BlockPos baseLevel = new BlockPos(position.getX(), position.getY() - 1, position.getZ());

        IMultiblockPart part;

        if ((part = getMachinePart(world, baseLevel.getLeft())) == null)
            return false;
        if (part.getMasterBlock() != FactoryBlocks.blockHeater)
            return false;

        if ((part = getMachinePart(world, baseLevel.getLeft().getFarther())) == null)
            return false;
        if (part.getMasterBlock() != FactoryBlocks.blockHeater)
            return false;

        if ((part = getMachinePart(world, baseLevel.getFarther())) == null)
            return false;
        if (part.getMasterBlock() != FactoryBlocks.blockHeater)
            return false;

        if ((part = getMachinePart(world, baseLevel)) == null)
            return false;
        if (part.getMasterBlock() != FactoryBlocks.blockHeater)
            return false;

        if ((part = getMachinePart(world, baseLevel.getRight())) == null)
            return false;
        if (part.getMasterBlock() != FactoryBlocks.blockHeater)
            return false;

        if ((part = getMachinePart(world, baseLevel.getRight().getFarther())) == null)
            return false;
        if (part.getMasterBlock() != FactoryBlocks.blockHeater)
            return false;

        return true;
    }

    @Override
    protected void markLevel(World world, BlockPos position) {
        BlockPos baseLevel = new BlockPos(position.getX(), position.getY() - 1, position.getZ());
        markPart(world, baseLevel.getLeft(), position);
        markPart(world, baseLevel.getLeft().getFarther(), position);
        markPart(world, baseLevel, position);
        markPart(world, baseLevel.getFarther(), position);
        markPart(world, baseLevel.getRight(), position);
        markPart(world, baseLevel.getRight().getFarther(), position);
    }
}
