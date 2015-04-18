package cz.ondraster.oilcraft2.factory.blocks;

import cz.ondraster.oilcraft2.factory.FactoryBlocks;
import cz.ondraster.oilcraft2.multiblock.parts.PartBlockBlock;
import cz.ondraster.oilcraft2.tools.Textures;
import cz.ondraster.oilcraft2.tools.UnlocalizedNames;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockCasing extends PartBlockBlock {
    protected IIcon iconSide;
    protected IIcon iconTop;

    public BlockCasing() {
        super();
        setBlockName(UnlocalizedNames.Factory.blockCasing);
    }

    @Override
    public Block getBlockInstance() {
        return FactoryBlocks.blockCasing;
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

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TECasing();
    }
}
