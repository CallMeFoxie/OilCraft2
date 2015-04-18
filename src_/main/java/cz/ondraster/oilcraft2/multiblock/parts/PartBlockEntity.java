package cz.ondraster.oilcraft2.multiblock.parts;

import net.minecraft.block.Block;
import net.minecraft.world.World;

public abstract class PartBlockEntity extends PartBaseEntity {
    private int maxTemperature = 20;

    public PartBlockEntity() {

    }

    @Override
    public boolean isValid(World world, int x, int y, int z) {
        Block b = world.getBlock(x, y, z);
        return b == getMasterBlock();
    }

    @Override
    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
}
