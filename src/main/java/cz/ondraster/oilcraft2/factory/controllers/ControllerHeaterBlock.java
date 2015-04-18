package cz.ondraster.oilcraft2.factory.controllers;

import cz.ondraster.oilcraft2.multiblock.Controller.PartControllerBaseBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ControllerHeaterBlock extends PartControllerBaseBlock {
    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new ControllerHeaterEntity();
    }
}
