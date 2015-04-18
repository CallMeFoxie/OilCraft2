package cz.ondraster.oilcraft2.tools;

import cpw.mods.fml.common.FMLLog;
import cz.ondraster.oilcraft2.OilCraft2;

public class OilLog {
    public static void warn(String message, Object... params) {
        FMLLog.warning("[" + OilCraft2.MODID + "] " + message, params);
    }

    public static void err(String message, Object... params) {
        FMLLog.severe("[" + OilCraft2.MODID + "] " + message, params);
    }

    public static void info(String message, Object... params) {
        FMLLog.info("[" + OilCraft2.MODID + "] " + message, params);
    }
}
