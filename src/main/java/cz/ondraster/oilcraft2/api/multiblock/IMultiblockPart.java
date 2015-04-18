package cz.ondraster.oilcraft2.api.multiblock;

import net.minecraft.world.World;

public interface IMultiblockPart {
    /**
     * @param world World that has been formed in
     * @param x     X of the controller block
     * @param y     Y of the controller block
     * @param z     Z of the controller block
     */
    void onFormed(World world, int x, int y, int z);

    void onDeformed();

    /**
     * @param world World to look in
     * @param x     X of the block
     * @param y     Y of the block
     * @param z     Z of the block
     */
    boolean isValid(World world, int x, int y, int z);
}
