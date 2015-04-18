package cz.ondraster.oilcraft2.multiblock.Parts;

import net.minecraft.block.Block;
import net.minecraft.world.World;

public abstract class PartInstanceofEntity extends PartBaseEntity {
    Class<? extends Block> blockToCheckFor;

    public PartInstanceofEntity(Class<? extends Block> block) {
        this.blockToCheckFor = block;
    }

    @Override
    public boolean isValid(World world, int x, int y, int z) {
        Block block = world.getBlock(x, y, z);

        return blockToCheckFor.isInstance(block);
    }
}
