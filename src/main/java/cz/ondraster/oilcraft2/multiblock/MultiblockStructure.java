package cz.ondraster.oilcraft2.multiblock;

import cz.ondraster.oilcraft2.tools.BlockPos;
import cz.ondraster.oilcraft2.tools.OilLog;
import net.minecraft.world.World;

public class MultiblockStructure {
    private MultiblockLayer[] layers;

    public MultiblockStructure(int height) {
        this.layers = new MultiblockLayer[height];
    }

    public void addLayer(int level, MultiblockLayer layer) {
        layer.setStructure(this);
        layers[level] = layer;
    }

    public boolean checkStructure(World world, BlockPos position) {
        for (MultiblockLayer layer : layers) {
            if (layer == null) {
                OilLog.err("Given structure's layer was null! ABORT ABORT");
                return false;
            }

            boolean retval = layer.checkLevel(world, position);
            if (!retval) {
                return false;
            }
        }

        return true;
    }

    public void markStructure(World world, BlockPos position) {
        for (MultiblockLayer layer : layers) {
            layer.markLevel(world, position);
        }
    }
}
