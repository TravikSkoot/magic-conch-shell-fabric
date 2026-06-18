package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellEnglishLangProvider extends FabricLanguageProvider {
    public MagicConchShellEnglishLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "Taste your first Krabby Patty");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "You like Krabby Patties, don't you?");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "Eat a Nasty Patty and hope for the best");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "Smells like the health inspector");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "Acquire the Krabby Patty Secret Formula");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "For Manager's Eyes Only");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "Get a spatula and start your fry cook career");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "I'm Ready, I'm Ready!");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "Obtain the World's Smallest Violin");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "Is mayonnaise an instrument?");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "Find a mysterious shell that answers your questions");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "The Magic Conch Shell");
        translationBuilder.add("config.magic-conch-shell.category.general", "General");
        translationBuilder.add("config.magic-conch-shell.config_language", "Config Language");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "Enable Pride Features");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "If 'yes', enables pride features");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "Enable Pride Splashes");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "If 'yes', enables pride splash texts in title screen");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "Enable Pride Textures");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "If 'yes', enables pride textures");
        translationBuilder.add("config.magic-conch-shell.title", "Magic Conch Shell Config");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Krabby Patty");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Magic Conch Shell");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "Nasty Patty");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Secret Formula");
        translationBuilder.add("item.magic-conch-shell.spatula", "Spatula");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "World's Smallest Violin");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Magic Conch Shell");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "The Magic Conch Shell says:");
        translationBuilder.add("message.magic-conch-shell.response.0", "Maybe someday.");
        translationBuilder.add("message.magic-conch-shell.response.1", "Nothing.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Neither.");
        translationBuilder.add("message.magic-conch-shell.response.3", "I don't think so.");
        translationBuilder.add("message.magic-conch-shell.response.4", "No.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Yes.");
        translationBuilder.add("message.magic-conch-shell.response.6", "Try asking again.");
        translationBuilder.add("message.magic-conch-shell.response.7", "You cannot get to the top by sitting on your bottom.");
        translationBuilder.add("message.magic-conch-shell.response.8", "I see a new sauce in your future.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Ask next time.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Follow the seahorse.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "A magical conch shell that gives random answers to your questions");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Magic Conch Shell");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "Magic Conch Shell chimes");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "World's Smallest Violin plays");
    }
}
