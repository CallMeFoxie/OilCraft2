package cz.ondraster.oilcraft2.factory.structures.distillationtower;

import cz.ondraster.oilcraft2.tools.BlockPos;
import net.minecraft.world.World;

public class LevelTop extends LevelBase {
    public LevelTop(int yLevel) {
        super(yLevel);
    }

    @Override
    protected boolean checkLevel(World world, BlockPos position) {
        BlockPos base = position.getAbove(yLevel);
        if (!casingBlock().isValid(world, base))
            return false;
        if (!casingBlock().isValid(world, base.getLeft()))
            return false;
        if (!casingBlock().isValid(world, base.getLeft().getFarther()))
            return false;
        if (!casingBlock().isValid(world, base.getLeft().getFarther(2)))
            return false;
        if (!casingBlock().isValid(world, base.getFarther()))
            return false;
        if (!casingBlock().isValid(world, base.getFarther(2)))
            return false;
        if (!casingBlock().isValid(world, base.getRight()))
            return false;
        if (!casingBlock().isValid(world, base.getRight().getFarther()))
            return false;
        if (!casingBlock().isValid(world, base.getRight().getFarther(2)))
            return false;

        return true;
    }

    @Override
    protected void markLevel(World world, BlockPos position) {
        BlockPos base = position.getAbove(yLevel);

        markPart(world, base, position);
        markPart(world, base.getLeft(), position);
        markPart(world, base.getLeft().getFarther(), position);
        markPart(world, base.getLeft().getFarther(2), position);
        markPart(world, base.getFarther(), position);
        markPart(world, base.getFarther(2), position);
        markPart(world, base.getRight().getFarther(), position);
        markPart(world, base.getRight(), position);
        markPart(world, base.getRight().getFarther(2), position);
    }
}
