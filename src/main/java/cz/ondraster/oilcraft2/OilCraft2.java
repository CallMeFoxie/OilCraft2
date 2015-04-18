package cz.ondraster.oilcraft2;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cz.ondraster.oilcraft2.factory.FactoryBlocks;
import cz.ondraster.oilcraft2.factory.structures.Structures;
import cz.ondraster.oilcraft2.proxy.ProxyCommon;
import cz.ondraster.oilcraft2.registry.OilBlocks;
import cz.ondraster.oilcraft2.registry.OilItems;
import cz.ondraster.oilcraft2.tools.UnlocalizedNames;

@Mod(modid = UnlocalizedNames.MODID, name = UnlocalizedNames.NAME, version = UnlocalizedNames.VERSION)
public class OilCraft2 {
    @SidedProxy(clientSide = "cz.ondraster.oilcraft2.proxy.ProxyClient", serverSide = "cz.ondraster.oilcraft2.proxy.ProxyCommon")
    public static ProxyCommon proxy;

    @Mod.Instance(UnlocalizedNames.MODID)
    public static OilCraft2 INSTANCE;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        proxy.preinit();
        FactoryBlocks.init();
        Structures.init();
        OilBlocks.init();
        OilItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    public void postinit(FMLPostInitializationEvent event) {
        proxy.postinit();
    }
}
