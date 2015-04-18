package cz.ondraster.oilcraft2.multiblock.Controller;

import cz.ondraster.oilcraft2.api.multiblock.IMultiblockController;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public abstract class PartControllerBaseEntity extends TileEntity implements IMultiblockController {

    private boolean isFormed = false;

    @Override
    public void onFormed() {
        isFormed = true;
    }

    @Override
    public void onFormed(World world, int x, int y, int z) {

    }

    @Override
    public void onDeformed() {
        isFormed = false;
    }

    @Override
    public boolean isValid(World world, int x, int y, int z) {
        return true;
    }

    protected void load(NBTTagCompound compound) {
        isFormed = compound.getBoolean("isFormed");
    }

    protected void save(NBTTagCompound compound) {
        compound.setBoolean("isFormed", isFormed);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        load(compound);
    }

    @Override
    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        save(compound);
    }
}
