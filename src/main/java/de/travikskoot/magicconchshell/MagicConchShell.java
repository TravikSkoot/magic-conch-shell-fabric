package de.travikskoot.magicconchshell;

import de.travikskoot.magicconchshell.config.MagicConchShellConfig;
import de.travikskoot.magicconchshell.creativemodetab.MagicConchShellCreativeModeTab;
import de.travikskoot.magicconchshell.data.MagicConchShellDataComponents;
import de.travikskoot.magicconchshell.item.MagicConchShellItems;
import de.travikskoot.magicconchshell.sound.MagicConchShellSounds;
import de.travikskoot.magicconchshell.util.MagicConchShellLootTableProvider;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.Month;

public class MagicConchShell implements ModInitializer {
	public static final String MOD_ID = "magic-conch-shell";
	public static final String MOD_NAME = "Magic Conch Shell";
	public static final String MOD_VERSION = FabricLoader.getInstance()
			.getModContainer(MOD_ID)
			.orElseThrow()
			.getMetadata()
			.getVersion()
			.getFriendlyString();

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final MagicConchShellConfig CONFIG = MagicConchShellConfig.load();

	@Override
	public void onInitialize() {
		LOGGER.info("Registering " + MOD_NAME + " " + MOD_VERSION + "!");

		MagicConchShellItems.registerMagicConchShellItems();
		MagicConchShellCreativeModeTab.registerMagicConchShellCreativeModeTab();
		MagicConchShellSounds.registerSounds();
		MagicConchShellLootTableProvider.registerLootTables();
		MagicConchShellDataComponents.registerDataComponents();
	}

	public static boolean shouldUsePrideTextures() {
		return CONFIG.enable_pride_features && CONFIG.enable_pride_textures && LocalDate.now().getMonth() == Month.JUNE;
	}
}