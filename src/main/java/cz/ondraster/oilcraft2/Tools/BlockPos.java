package cz.ondraster.oilcraft2.Tools;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Support class to make 1.8 update easier :P
 */
public class BlockPos {
    private int x, y, z;
    private ForgeDirection direction;

    public BlockPos(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = ForgeDirection.UNKNOWN;
    }

    public BlockPos(int x, int y, int z, ForgeDirection direction) {
        this(x, y, z);
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public ForgeDirection getDirection() {
        return direction;
    }

    public void setDirection(ForgeDirection direction) {
        this.direction = direction;
    }

    public BlockPos getLeft(int blocks) {
        if (direction == ForgeDirection.EAST) {
            return new BlockPos(x, y, z - blocks, direction);
        }

        if (direction == ForgeDirection.WEST) {
            return new BlockPos(x, y, z + blocks, direction);
        }

        if (direction == ForgeDirection.NORTH) {
            return new BlockPos(x - blocks, y, z, direction);
        }

        if (direction == ForgeDirection.SOUTH) {
            return new BlockPos(x + blocks, y, z, direction);
        }

        return this;
    }

    public BlockPos getRight(int blocks) {
        if (direction == ForgeDirection.EAST) {
            return new BlockPos(x, y, z + blocks, direction);
        }

        if (direction == ForgeDirection.WEST) {
            return new BlockPos(x, y, z - blocks, direction);
        }

        if (direction == ForgeDirection.NORTH) {
            return new BlockPos(x + blocks, y, z, direction);
        }

        if (direction == ForgeDirection.SOUTH) {
            return new BlockPos(x - blocks, y, z, direction);
        }

        return this;
    }

    public BlockPos getFarther(int blocks) {
        if (direction == ForgeDirection.EAST) {
            return new BlockPos(x + blocks, y, z, direction);
        }

        if (direction == ForgeDirection.WEST) {
            return new BlockPos(x - blocks, y, z, direction);
        }

        if (direction == ForgeDirection.NORTH) {
            return new BlockPos(x, y, z - blocks, direction);
        }

        if (direction == ForgeDirection.SOUTH) {
            return new BlockPos(x, y, z + blocks, direction);
        }

        return this;
    }

    public BlockPos getCloser(int blocks) {
        if (direction == ForgeDirection.EAST) {
            return new BlockPos(x - blocks, y, z, direction);
        }

        if (direction == ForgeDirection.WEST) {
            return new BlockPos(x + blocks, y, z, direction);
        }

        if (direction == ForgeDirection.NORTH) {
            return new BlockPos(x, y, z + blocks, direction);
        }

        if (direction == ForgeDirection.SOUTH) {
            return new BlockPos(x, y, z - blocks, direction);
        }

        return this;
    }

    public BlockPos getLeft() {
        return getLeft(1);
    }

    public BlockPos getRight() {
        return getRight(1);
    }

    public BlockPos getFarther() {
        return getFarther(1);
    }

    public BlockPos getCloser(1) {
        return getCloser(1);
    }

    public Block getBlock(World world) {
        return world.getBlock(x, y, z);
    }

    public TileEntity getTE(World world) {
        return world.getTileEntity(x, y, z);
    }

    public int getMeta(World world) {
        return world.getBlockMetadata(x, y, z);
    }

}
