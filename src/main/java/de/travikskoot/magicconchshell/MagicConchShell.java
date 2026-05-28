package de.travikskoot.magicconchshell;

import de.travikskoot.magicconchshell.creativemodetab.MagicConchShellCreativeModeTab;
import de.travikskoot.magicconchshell.item.MagicConchShellItems;
import de.travikskoot.magicconchshell.sound.MagicConchShellSounds;
import de.travikskoot.magicconchshell.util.MagicConchShellLootTableProvider;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicConchShell implements ModInitializer {
	public static final String MOD_ID = "magic-conch-shell";
	public static final String MOD_NAME = "Magic Conch Shell";
	public static final String MOD_VERSION = "1.0.0+26.1.2";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Registering " + MOD_NAME + " " + MOD_VERSION + "!");

		MagicConchShellItems.registerMagicConchShellItems();
		MagicConchShellCreativeModeTab.registerMagicConchShellCreativeModeTab();
		MagicConchShellSounds.registerSounds();
		MagicConchShellLootTableProvider.registerLootTables();
	}
}