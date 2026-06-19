package de.travikskoot.magicconchshell;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class MagicConchShellClient implements ClientModInitializer {
    private static String lastLanguageCode = null;

    @Override
    public void onInitializeClient() {
        ClientLifecycleEvents.CLIENT_STARTED.register(MagicConchShellClient::updateLanguage);
        ClientTickEvents.END_CLIENT_TICK.register(MagicConchShellClient::updateLanguage);
    }

    private static void updateLanguage(net.minecraft.client.Minecraft client) {
        String currentLanguage = client.getLanguageManager().getSelected();
        if (currentLanguage.isBlank()) {
            return;
        }

        if (currentLanguage.equalsIgnoreCase(lastLanguageCode)) {
            return;
        }

        lastLanguageCode = currentLanguage;

        String oldConfigLanguage = MagicConchShell.CONFIG.config_language;
        MagicConchShell.CONFIG.setConfigLanguageFromClient(currentLanguage);

        if (!MagicConchShell.CONFIG.config_language.equals(oldConfigLanguage)) {
            MagicConchShell.CONFIG.save();
        }
    }
}