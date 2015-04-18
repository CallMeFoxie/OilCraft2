package cz.ondraster.oilcraft2.factory.structures.distillationtower;

import cz.ondraster.oilcraft2.factory.FactoryBlocks;
import cz.ondraster.oilcraft2.multiblock.MultiblockLayer;
import cz.ondraster.oilcraft2.multiblock.parts.PartBlockBlock;
import cz.ondraster.oilcraft2.tools.BlockPos;
import net.minecraft.world.World;

public class LevelBase extends MultiblockLayer {
    protected int yLevel;

    public LevelBase(int yLevel) {
        this.yLevel = yLevel;
    }

    protected PartBlockBlock valveBlock() {
        return FactoryBlocks.blockValve;
    }

    protected PartBlockBlock casingBlock() {
        return FactoryBlocks.blockCasing;
    }

    protected void advancedCheck(CheckReturnValue retval, World world, BlockPos pos) {
        if (valveBlock().isValid(world, pos)) {
            if (!retval.hasValve) {
                retval.hasValve = true;
                return;
            } else {
                retval.soFarSoGood = false;
                return;
            }
        } else if (casingBlock().isValid(world, pos)) {
            return;
        }

        retval.soFarSoGood = false;
    }

    protected boolean checkLevel(World world, BlockPos position, CheckReturnValue value) {
        BlockPos basePos = position.getAbove(yLevel);

        advancedCheck(value, world, basePos.getLeft());
        if (!value.soFarSoGood)
            return false;
        advancedCheck(value, world, basePos.getLeft().getFarther());
        if (!value.soFarSoGood)
            return false;
        advancedCheck(value, world, basePos.getLeft().getFarther(2));
        if (!value.soFarSoGood)
            return false;
        advancedCheck(value, world, basePos.getFarther(2));
        if (!value.soFarSoGood)
            return false;
        advancedCheck(value, world, basePos.getRight());
        if (!value.soFarSoGood)
            return false;
        advancedCheck(value, world, basePos.getRight().getFarther());
        if (!value.soFarSoGood)
            return false;
        advancedCheck(value, world, basePos.getRight().getFarther(2));
        if (!value.soFarSoGood)
            return false;

        if (value.hasValve)
            return true;

        return false;
    }

    @Override
    protected boolean checkLevel(World world, BlockPos position) {
        return checkLevel(world, position, new CheckReturnValue());
    }

    @Override
    protected void markLevel(World world, BlockPos position) {
        BlockPos basePos = position.getAbove(yLevel);

        markPart(world, basePos, position);
        markPart(world, basePos.getLeft(), position);
        markPart(world, basePos.getLeft().getFarther(), position);
        markPart(world, basePos.getLeft().getFarther(2), position);
        markPart(world, basePos.getFarther(2), position);
        markPart(world, basePos.getRight(), position);
        markPart(world, basePos.getRight().getFarther(), position);
        markPart(world, basePos.getRight().getFarther(2), position);
    }

    protected class CheckReturnValue {
        public boolean hasValve = false;
        public boolean soFarSoGood = true;
    }
}
