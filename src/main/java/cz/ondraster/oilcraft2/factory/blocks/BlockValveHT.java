package cz.ondraster.oilcraft2.factory.blocks;

import cz.ondraster.oilcraft2.factory.FactoryBlocks;
import cz.ondraster.oilcraft2.tools.UnlocalizedNames;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockValveHT extends BlockValve {
    public BlockValveHT() {
        super();
        setBlockName(UnlocalizedNames.Factory.blockValveHT);
    }

    @Override
    public Block getBlockInstance() {
        return FactoryBlocks.blockValveHT;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TEValveHT();
    }
}
