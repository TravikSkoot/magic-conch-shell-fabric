package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellPirateSpeakLangProvider extends FabricLanguageProvider {
    public MagicConchShellPirateSpeakLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "en_pt", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Krabby Patty o’ the galley");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Enchanted Conch Shell");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "Foul Patty");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Hidden Formula");
        translationBuilder.add("item.magic-conch-shell.spatula", "Galley Spatula");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "World’s Tiniest Fiddle");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Enchanted Conch Shell");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "The Enchanted Conch be sayin’,");
        translationBuilder.add("message.magic-conch-shell.response.0", "Mayhap, one o’ these tides.");
        translationBuilder.add("message.magic-conch-shell.response.1", "Naught.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Neither, ye scallywag.");
        translationBuilder.add("message.magic-conch-shell.response.3", "I be doubtin’ it.");
        translationBuilder.add("message.magic-conch-shell.response.4", "Nay.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Aye!");
        translationBuilder.add("message.magic-conch-shell.response.6", "Ask again, matey.");
        translationBuilder.add("message.magic-conch-shell.response.7", "Ye won’t reach the masthead by restin’ on yer aft.");
        translationBuilder.add("message.magic-conch-shell.response.8", "I spy a new sauce in yer future.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Ask on the next watch.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Follow the sea-horse, arr.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "A magical conch shell that gives random answers to yer questions");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Enchanted Conch Shell");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "The tiniest fiddle be playin’");
    }
}
