/*
 * Copyright 2023 7orivorian
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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