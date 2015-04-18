package cz.ondraster.oilcraft2.multiblock.PartTypes;

import cz.ondraster.oilcraft2.api.multiblock.IMultiblockPart;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public abstract class PartBaseEntity extends TileEntity implements IMultiblockPart {

    private int masterX, masterY, masterZ;
    private boolean isFormed = false;

    @Override
    public void onFormed(World world, int x, int y, int z) {
        this.masterX = x;
        this.masterY = y;
        this.masterZ = z;
        isFormed = true;
    }

    @Override
    public void onDeformed() {
        isFormed = false;
    }

    protected void save(NBTTagCompound compound) {
        compound.setInteger("masterX", masterX);
        compound.setInteger("masterY", masterY);
        compound.setInteger("masterZ", masterZ);

        compound.setBoolean("isFormed", isFormed);
    }


    protected void load(NBTTagCompound compound) {
        masterX = compound.getInteger("masterX");
        masterY = compound.getInteger("masterY");
        masterZ = compound.getInteger("masterZ");

        isFormed = compound.getBoolean("isFormed");
    }

    @Override
    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        save(compound);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        load(compound);
    }
}
