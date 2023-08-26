package me.tori.narratorbegone.client;

import me.tori.narratorbegone.NarratorBeGone;
import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author <b><a href="https://github.com/7orivorian">7orivorian</a></b>
 * @since <b>1.0.0</b>
 */
public class NarratorBeGoneClient implements ClientModInitializer {

    public static final Logger LOGGER = LogManager.getLogger(NarratorBeGone.MOD_NAME);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Banishing the narration keybind! v" + NarratorBeGone.VERSION);
    }
}