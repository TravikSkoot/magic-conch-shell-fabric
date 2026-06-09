package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellLOLCATLangProvider extends FabricLanguageProvider {
    public MagicConchShellLOLCATLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "lol_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "Nom a Krabby Patty");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "Nommy");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "Nom a Nasty Patty, oh noe");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "Smellz like health inspectr cat");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "Can haz Secret Wecipe");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "Top Secrit");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "Can haz a Spatula");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "Spatulastik");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "Get Worldz Teeniest Violin for cryin");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "Iz mayonnaise instrument?");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "Ask me anythin!");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "Teh Majik Conch Thingy");
        translationBuilder.add("config.magic-conch-shell.category.general", "General stuff");
        translationBuilder.add("config.magic-conch-shell.config_language", "Config Cat Langyage");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "Turn on Pride Feachurs");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "If 'yes', rainbow kittehs appear");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "Turn on Pride Textz");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "If 'yes', rainbow wordz on screen");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "Turn on Pride Colors");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "If 'yes', rainbow itemz appear");
        translationBuilder.add("config.magic-conch-shell.title", "Majik Conch Thingy Settingz");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Krabby Patty nomz");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Teh Majik Conch Thingy");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "Nasty Patty eww");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Secrit Wecipe");
        translationBuilder.add("item.magic-conch-shell.spatula", "Burgirflipper");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "Worldz Teeniest Violin");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Teh Majik Conch Thingy");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "Teh Majik Conch Thingy sez:");
        translationBuilder.add("message.magic-conch-shell.response.0", "Mebbe sumday.");
        translationBuilder.add("message.magic-conch-shell.response.1", "Nothin.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Nofin.");
        translationBuilder.add("message.magic-conch-shell.response.3", "I dun fink so.");
        translationBuilder.add("message.magic-conch-shell.response.4", "No.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Yis.");
        translationBuilder.add("message.magic-conch-shell.response.6", "Try askin again, k?");
        translationBuilder.add("message.magic-conch-shell.response.7", "U cant get to teh top by sittin on ur tail.");
        translationBuilder.add("message.magic-conch-shell.response.8", "I seez new sauce in ur futur.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Ask next tim.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Follow teh seahorsie.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "A majikal conch shell dat gibs random ansrs to ur queschuns");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Teh Majik Conch Thingy");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "Majik Conch Thingy makez ding-ding");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "Worldz Teeniest Violin playz sad song");
    }
}
