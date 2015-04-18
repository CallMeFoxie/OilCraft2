package cz.ondraster.oilcraft2.multiblock.parts;

import cz.ondraster.oilcraft2.api.multiblock.IMultiblockPart;
import cz.ondraster.oilcraft2.multiblock.MultiblockLayer;
import cz.ondraster.oilcraft2.tools.BlockPos;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public abstract class PartBlockBlock extends BlockContainer {
    public PartBlockBlock() {
        super(Material.iron);
    }

    public abstract Block getBlockInstance();

    public boolean isValid(World world, BlockPos pos) {
        IMultiblockPart part = MultiblockLayer.getMachinePart(world, pos);
        if (part == null)
            return false;

        if (part.getMasterBlock() != getBlockInstance())
            return false;

        return true;
    }
}
