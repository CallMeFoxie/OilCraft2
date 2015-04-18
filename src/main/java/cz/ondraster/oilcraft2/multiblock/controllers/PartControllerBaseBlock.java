package cz.ondraster.oilcraft2.multiblock.controllers;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public abstract class PartControllerBaseBlock extends BlockContainer {
    protected PartControllerBaseBlock() {
        super(Material.iron);
    }
}
