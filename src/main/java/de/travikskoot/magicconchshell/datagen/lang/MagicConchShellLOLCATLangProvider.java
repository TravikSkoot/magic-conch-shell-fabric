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
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Krabby Patty nomz");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Majik Conch thingy");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "Nasty Patty eww");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Sekrit wecipe");
        translationBuilder.add("item.magic-conch-shell.spatula", "Flipz Spatula");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "Wurld's Teeniest Violin");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Majik Conch thingy");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "Da Majik Conch thingy sez,");
        translationBuilder.add("message.magic-conch-shell.response.0", "Maaybe sumday.");
        translationBuilder.add("message.magic-conch-shell.response.1", "Nuffin.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Neither plz.");
        translationBuilder.add("message.magic-conch-shell.response.3", "Dun fink so.");
        translationBuilder.add("message.magic-conch-shell.response.4", "Nope.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Yus!");
        translationBuilder.add("message.magic-conch-shell.response.6", "Try 2 ask agin.");
        translationBuilder.add("message.magic-conch-shell.response.7", "U cant get 2 da top by sittin on ur bottom.");
        translationBuilder.add("message.magic-conch-shell.response.8", "Ai see new sauz in ur fuucher.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Ask next tiem.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Follow teh seahors.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "A majik conch thingy dat gibz random answerz 2 ur questionz");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Majik Conch thingy");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "Teeniest violin playz");
    }
}
