package Wurgegriff;

import Wurgegriff.Item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftMod implements ModInitializer {
    public static final String MOD_ID = "wurgegriff";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Mod initzializeing");
        ModItems.registerModItems();
    }
}
