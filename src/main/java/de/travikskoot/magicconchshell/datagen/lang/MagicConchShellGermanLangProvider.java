package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellGermanLangProvider extends FabricLanguageProvider {
    public MagicConchShellGermanLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "de_de", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Krabbenburger");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Magische Miesmuschel");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "Killerburger");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Krabbenburgerformel");
        translationBuilder.add("item.magic-conch-shell.spatula", "Pfannenwender");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "Kleinste Violine der Welt");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Magische Miesmuschel");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "Die Miesmuschel sagt,");
        translationBuilder.add("message.magic-conch-shell.response.0", "Eines Tages vielleicht.");
        translationBuilder.add("message.magic-conch-shell.response.1", "Gar Nichts.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Keins von Beiden.");
        translationBuilder.add("message.magic-conch-shell.response.3", "Ich glaub eher nicht.");
        translationBuilder.add("message.magic-conch-shell.response.4", "Nein.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Ja.");
        translationBuilder.add("message.magic-conch-shell.response.6", "Frag doch einfach nochmal.");
        translationBuilder.add("message.magic-conch-shell.response.7", "Man kommt nicht nach oben, wenn man nur sitzt.");
        translationBuilder.add("message.magic-conch-shell.response.8", "Ich sehe eine neue Soße in deiner Zukunft.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Frag beim nächsten Mal.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Folge dem Seepferdchen.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "Eine magische Miesmuschel, die zufällige Antworten auf deine Fragen gibt.");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Magische Miesmuschel");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "Kleinste Violine der Welt spielt");
    }
}
