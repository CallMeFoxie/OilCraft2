package cz.ondraster.oilcraft2.factory.blocks;

import cz.ondraster.oilcraft2.Tools.Textures;
import cz.ondraster.oilcraft2.Tools.UnlocalizedNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockCasing extends Block {
    protected IIcon iconSide;
    protected IIcon iconTop;

    public BlockCasing() {
        super(Material.iron);
        setBlockName(UnlocalizedNames.Factory.blockCasing);
    }

    @Override
    public void registerBlockIcons(IIconRegister ireg) {
        iconSide = ireg.registerIcon(Textures.Factory.blockCasingSide);
        iconTop = ireg.registerIcon(Textures.Factory.blockCasingTop);
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        if (side == ForgeDirection.DOWN.ordinal() || side == ForgeDirection.UP.ordinal())
            return iconTop;

        return iconSide;
    }
}
