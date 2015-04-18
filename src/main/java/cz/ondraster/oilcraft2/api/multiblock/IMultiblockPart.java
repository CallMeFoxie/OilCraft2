package cz.ondraster.oilcraft2.api.multiblock;

import net.minecraft.block.Block;
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
     * Checks whether a part is of specified type
     *
     * @param world World to look in
     * @param x     X of the block
     * @param y     Y of the block
     * @param z     Z of the block
     */
    boolean isValid(World world, int x, int y, int z);

    /**
     * @return returns maximum temperature (for explosions)
     */
    int getMaxTemperature();

    /**
     * @return returns whether this part is a part of a structure
     */
    boolean isPartOfStructure();

    /**
     * @return the master block that spawns this TE
     */
    Block getMasterBlock();
}
