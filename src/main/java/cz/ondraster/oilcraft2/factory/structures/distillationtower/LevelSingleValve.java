package cz.ondraster.oilcraft2.factory.structures.distillationtower;

import cz.ondraster.oilcraft2.tools.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class LevelSingleValve extends LevelBase {
    public LevelSingleValve(int yLevel) {
        super(yLevel);
    }

    @Override
    protected boolean checkLevel(World world, BlockPos position) {
        BlockPos basePos = position.getAbove(yLevel);
        CheckReturnValue value = new CheckReturnValue();

        advancedCheck(value, world, basePos);
        if (!value.soFarSoGood)
            return false;

        if (basePos.getFarther().getBlock(world) != Blocks.air)
            return false;

        return super.checkLevel(world, position, value);
    }

    @Override
    protected void markLevel(World world, BlockPos position) {
        BlockPos basePos = position.getAbove(yLevel);

        super.markLevel(world, position);
        markPart(world, basePos, position);
    }
}
