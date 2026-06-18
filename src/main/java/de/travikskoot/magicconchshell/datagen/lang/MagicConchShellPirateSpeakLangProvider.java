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
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "Take yer first bite o' a Krabby Patty, ye landlubber!");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "Ye like Krabby Patties, don't ye?");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "Scoff down a Foul Patty an' pray to Davy Jones it goes well");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "Smells Like Davy Jones' Locker");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "Plunder the hidden formula, arrr!");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "Fer the Cap'n's Eyes Only");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "Grab yer spatula an' set sail on yer fry cook voyage");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "I'm ready, I'm ready, arrr!");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "Pillage the World's Smallest Fiddle");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "Be mayonnaise an instrument of the sea?");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "Find a mysterious shell that answers yer questions from the deep");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "The Enchanted Conch Shell");
        translationBuilder.add("config.magic-conch-shell.category.general", "General Lore");
        translationBuilder.add("config.magic-conch-shell.config_language", "Config Lingo");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "Fly the Pride Colors");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "If 'aye', the crew flies the pride colors");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "Unfurl Pride Splashes");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "If 'aye', pride chants echo on the title screen");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "Hoist Pride Textures");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "If 'aye', paints the ship in pride textures");
        translationBuilder.add("config.magic-conch-shell.title", "Enchanted Conch Shell Logbook");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Krabby Patty o’ the galley");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Enchanted Conch Shell");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "Foul Patty");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Hidden Formula");
        translationBuilder.add("item.magic-conch-shell.spatula", "Galley Spatula");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "World's Smallest Fiddle");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Enchanted Conch Shell");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "The Enchanted Conch Shell bellows:");
        translationBuilder.add("message.magic-conch-shell.response.0", "Maybe some other tide.");
        translationBuilder.add("message.magic-conch-shell.response.1", "Naught.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Neither, ye scallywag.");
        translationBuilder.add("message.magic-conch-shell.response.3", "I reckon not.");
        translationBuilder.add("message.magic-conch-shell.response.4", "Nay.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Aye.");
        translationBuilder.add("message.magic-conch-shell.response.6", "Bellow yer question once more.");
        translationBuilder.add("message.magic-conch-shell.response.7", "Ye cannot reach the crow's nest by sitting on yer bilge.");
        translationBuilder.add("message.magic-conch-shell.response.8", "I spy a strange new grog in yer future.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Ask when the next ship sails.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Follow the seahorse, matey.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "A mystical conch from the deep that bellows random answers to yer parley");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Enchanted Conch Shell");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "Enchanted Conch Shell chimes");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "World's Smallest Fiddle weeps");

    }
}
