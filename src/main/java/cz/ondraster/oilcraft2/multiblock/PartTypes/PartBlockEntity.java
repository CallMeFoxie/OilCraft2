package cz.ondraster.oilcraft2.multiblock.PartTypes;

import net.minecraft.block.Block;
import net.minecraft.world.World;

public class PartBlockEntity extends PartBaseEntity {
    private Block blockToCheck;

    public PartBlockEntity(Block block) {
        blockToCheck = block;
    }

    @Override
    public boolean isValid(World world, int x, int y, int z) {
        Block b = world.getBlock(x, y, z);
        return b == blockToCheck;
    }
}
