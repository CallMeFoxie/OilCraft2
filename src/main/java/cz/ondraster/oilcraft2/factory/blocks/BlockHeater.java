package cz.ondraster.oilcraft2.factory.blocks;

import cz.ondraster.oilcraft2.factory.FactoryBlocks;
import cz.ondraster.oilcraft2.multiblock.parts.PartBlockBlock;
import cz.ondraster.oilcraft2.tools.UnlocalizedNames;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockHeater extends PartBlockBlock {
    public BlockHeater() {
        super();
        setBlockName(UnlocalizedNames.Factory.blockHeater);
    }

    @Override
    public Block getBlockInstance() {
        return FactoryBlocks.blockHeater;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TEHeater();
    }
}
