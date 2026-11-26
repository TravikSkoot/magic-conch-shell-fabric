package de.travikskoot.magicconchshell;

import de.travikskoot.magicconchshell.datagen.MagicConchShellAdvancementProvider;
import de.travikskoot.magicconchshell.datagen.MagicConchShellModelProvider;
import de.travikskoot.magicconchshell.datagen.MagicConchShellRecipeProvider;
import de.travikskoot.magicconchshell.datagen.MagicConchShellTagProvider;
import de.travikskoot.magicconchshell.datagen.lang.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MagicConchShellDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(MagicConchShellArabicLangProvider::new);
		pack.addProvider(MagicConchShellBengaliLangProvider::new);
		pack.addProvider(MagicConchShellDutchLangProvider::new);
		pack.addProvider(MagicConchShellEnglishLangProvider::new);
		pack.addProvider(MagicConchShellFrenchLangProvider::new);
		pack.addProvider(MagicConchShellGermanLangProvider::new);
		pack.addProvider(MagicConchShellHindiLangProvider::new);
		pack.addProvider(MagicConchShellItalianLangProvider::new);
		pack.addProvider(MagicConchShellJapaneseLangProvider::new);
		pack.addProvider(MagicConchShellKoelschLangProvider::new);
		pack.addProvider(MagicConchShellKoreanLangProvider::new);
		pack.addProvider(MagicConchShellLOLCATLangProvider::new);
		pack.addProvider(MagicConchShellMandarinLangProvider::new);
		pack.addProvider(MagicConchShellPirateSpeakLangProvider::new);
		pack.addProvider(MagicConchShellPolishLangProvider::new);
		pack.addProvider(MagicConchShellPortugueseLangProvider::new);
		pack.addProvider(MagicConchShellRussianLangProvider::new);
		pack.addProvider(MagicConchShellSpanishLangProvider::new);
		pack.addProvider(MagicConchShellTraditionalChineseHongKongLangProvider::new);
		pack.addProvider(MagicConchShellTraditionalChineseTaiwanLangProvider::new);
		pack.addProvider(MagicConchShellTurkishLangProvider::new);

		pack.addProvider(MagicConchShellModelProvider::new);
		pack.addProvider(MagicConchShellRecipeProvider::new);
		pack.addProvider(MagicConchShellAdvancementProvider::new);
		pack.addProvider(MagicConchShellTagProvider::new);
	}
}
