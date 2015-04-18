package cz.ondraster.oilcraft2;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cz.ondraster.oilcraft2.Tools.UnlocalizedNames;
import cz.ondraster.oilcraft2.proxy.ProxyCommon;

@Mod(modid = UnlocalizedNames.MODID, name = UnlocalizedNames.NAME, version = UnlocalizedNames.VERSION)
public class OilCraft2 {
    @SidedProxy(clientSide = "cz.ondraster.oilcraft2.proxy.ProxyClient", serverSide = "cz.ondraster.oilcraft2.proxy.ProxyCommon")
    public static ProxyCommon proxy;

    @Mod.Instance(UnlocalizedNames.MODID)
    public static OilCraft2 INSTANCE;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        proxy.preinit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    public void postinit(FMLPostInitializationEvent event) {
        proxy.postinit();
    }
}
