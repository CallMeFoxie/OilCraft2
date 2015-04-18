package cz.ondraster.oilcraft2.multiblock;

import cz.ondraster.oilcraft2.tools.BlockPos;
import cz.ondraster.oilcraft2.tools.OilLog;
import net.minecraft.world.World;

public class MultiblockStructure {
    private MultiblockLayer[] layers;
    private int width;
    private int depth;

    public MultiblockStructure(int width, int depth, int height) {
        this.width = width;
        this.depth = depth;
        this.layers = new MultiblockLayer[height];
    }

    public void addLayer(int level, MultiblockLayer layer) {
        layer.setStructure(this);
        layers[level] = layer;
    }

    public boolean checkStructure(World world, BlockPos position) {
        for (int i = 0; i < layers.length; i++) {
            if (layers[i] == null) {
                OilLog.err("Given structure's layer was null! ABORT ABORT");
                return false;
            }

            boolean retval = layers[i].checkLevel(world, position);
            if (!retval) {
                return false;
            }
        }

        return true;
    }
}
