package cz.ondraster.oilcraft2.factory.blocks;

import cz.ondraster.oilcraft2.tools.Textures;
import cz.ondraster.oilcraft2.tools.UnlocalizedNames;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockCasingHT extends BlockCasing {
    public BlockCasingHT() {
        super();
        setBlockName(UnlocalizedNames.Factory.blockCasingHT);
    }

    @Override
    public void registerBlockIcons(IIconRegister ireg) {
        iconSide = ireg.registerIcon(Textures.Factory.blockCasingHTSide);
        iconTop = ireg.registerIcon(Textures.Factory.blockCasingHTTop);
    }
}
