package cz.ondraster.oilcraft2.multiblock;

import cz.ondraster.oilcraft2.Tools.BlockPos;
import cz.ondraster.oilcraft2.api.multiblock.IMultiblockPart;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public abstract class MultiblockLayer {
    protected MultiblockStructure structure;

    public MultiblockLayer() {

    }

    public MultiblockLayer(MultiblockStructure structure) {
        this.structure = structure;
    }

    public void setStructure(MultiblockStructure structure) {
        this.structure = structure;
    }

    public boolean isAvailable(TileEntity tileEntity) {
        if (tileEntity instanceof IMultiblockPart) {
            IMultiblockPart part = (IMultiblockPart) tileEntity;
            if (!part.isPartOfStructure())
                return true;
        }

        return false;
    }

    public IMultiblockPart getMachinePart(World world, BlockPos pos) {
        TileEntity tileEntity = pos.getTE(world);
        if (tileEntity == null)
            return null;

        if (!isAvailable(tileEntity))
            return null;

        return (IMultiblockPart) tileEntity;
    }

    public void markPart(World world, BlockPos pos, BlockPos controller) {
        TileEntity te = pos.getTE(world);

        if (te == null || !(te instanceof IMultiblockPart))
            return;

        IMultiblockPart part = (IMultiblockPart) te;
        part.onFormed(world, controller.getX(), controller.getY(), controller.getZ());
    }

    /**
     * @param world    World to check in
     * @param position Block position (incl. rotation) of the controller block
     * @return whether level checked fine
     */
    protected abstract boolean checkLevel(World world, BlockPos position);

    /**
     * @param world    World to mark in
     * @param position Block position (incl. rotation) of the controller block
     */
    protected abstract void markLevel(World world, BlockPos position);
}
