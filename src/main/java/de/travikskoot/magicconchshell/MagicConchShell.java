package de.travikskoot.magicconchshell;

import de.travikskoot.magicconchshell.config.MagicConchShellConfig;
import de.travikskoot.magicconchshell.creativemodetab.MagicConchShellCreativeModeTab;
import de.travikskoot.magicconchshell.data.MagicConchShellDataComponents;
import de.travikskoot.magicconchshell.item.MagicConchShellItems;
import de.travikskoot.magicconchshell.sound.MagicConchShellSounds;
// TODO: Disabled loot generation due to Fabric API temporarily removing the Loot API.
//  import de.travikskoot.magicconchshell.util.MagicConchShellLootTableProvider;
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
		LOGGER.info("Initializing " + MOD_NAME + " " + MOD_VERSION + "!");

		MagicConchShellConfig.registerConfig();
		MagicConchShellCreativeModeTab.registerMagicConchShellCreativeModeTab();
		MagicConchShellDataComponents.registerDataComponents();
		MagicConchShellItems.registerMagicConchShellItems();
		MagicConchShellSounds.registerSounds();
		// TODO: Disabled loot generation due to Fabric API temporarily removing the Loot API.
		//  MagicConchShellLootTableProvider.registerLootTables();
	}

	public static boolean shouldUsePrideTextures() {
		return CONFIG.enable_pride_features && CONFIG.enable_pride_textures && LocalDate.now().getMonth() == Month.JUNE;
	}
}