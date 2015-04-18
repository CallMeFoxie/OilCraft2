package cz.ondraster.oilcraft2.factory.blocks;

import cz.ondraster.oilcraft2.factory.FactoryBlocks;
import cz.ondraster.oilcraft2.tools.Textures;
import cz.ondraster.oilcraft2.tools.UnlocalizedNames;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCasingHT extends BlockCasing {
    public BlockCasingHT() {
        super();
        setBlockName(UnlocalizedNames.Factory.blockCasingHT);
    }

    @Override
    public Block getBlockInstance() {
        return FactoryBlocks.blockCasingHT;
    }

    @Override
    public void registerBlockIcons(IIconRegister ireg) {
        iconSide = ireg.registerIcon(Textures.Factory.blockCasingHTSide);
        iconTop = ireg.registerIcon(Textures.Factory.blockCasingHTTop);
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TECasingHT();
    }
}
