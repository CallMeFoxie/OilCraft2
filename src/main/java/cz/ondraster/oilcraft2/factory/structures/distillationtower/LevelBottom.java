package cz.ondraster.oilcraft2.factory.structures.distillationtower;

import cz.ondraster.oilcraft2.factory.FactoryBlocks;
import cz.ondraster.oilcraft2.multiblock.parts.PartBlockBlock;
import cz.ondraster.oilcraft2.tools.BlockPos;
import net.minecraft.world.World;

public class LevelBottom extends LevelBase {
    public LevelBottom() {
        super(0);
    }

    @Override
    protected PartBlockBlock valveBlock() {
        return FactoryBlocks.blockValveHT;
    }

    @Override
    protected PartBlockBlock casingBlock() {
        return FactoryBlocks.blockCasingHT;
    }

    @Override
    protected boolean checkLevel(World world, BlockPos position) {
        if (!casingBlock().isValid(world, position.getFarther()))
            return false;

        return super.checkLevel(world, position);
    }

    @Override
    protected void markLevel(World world, BlockPos position) {
        super.markLevel(world, position);
        markPart(world, position.getFarther(), position);
    }
}
