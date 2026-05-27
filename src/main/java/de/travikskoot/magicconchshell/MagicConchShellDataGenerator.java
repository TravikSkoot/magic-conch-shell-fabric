package de.travikskoot.magicconchshell;

import de.travikskoot.magicconchshell.datagen.*;
import de.travikskoot.magicconchshell.datagen.lang.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MagicConchShellDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(MagicConchShellEnglishLangProvider::new);
		pack.addProvider(MagicConchShellGermanLangProvider::new);
		pack.addProvider(MagicConchShellKoelschLangProvider::new);
		pack.addProvider(MagicConchShellLOLCATLangProvider::new);
		pack.addProvider(MagicConchShellPirateSpeakLangProvider::new);

		pack.addProvider(MagicConchShellModelProvider::new);
	}
}
