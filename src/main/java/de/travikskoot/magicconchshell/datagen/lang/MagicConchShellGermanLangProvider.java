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
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "Koste deinen ersten Krabbenburger");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "Du stehst auf Krabbenburger, oder?");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "Iss einen Killerburger und hoffe auf das Beste");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "Das riecht nach dem Gesundheitsinspektor");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "Erhalte die Krabbenburger-Geheimformel");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "Nur für Führungskräfte bestimmt");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "Schnapp dir einen Pfannenwender und starte deine Burgerbrater‑Karriere");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "Ich bin bereit, ich bin bereit!");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "Erhalte die kleinste Violine der Welt");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "Ist Mayonnaise auch ein Instrument?");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "Finde eine geheimnisvolle Muschel, die deine Fragen beantwortet");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "Die Magische Miesmuschel");
        translationBuilder.add("config.magic-conch-shell.category.general", "Allgemein");
        translationBuilder.add("config.magic-conch-shell.config_language", "Konfig Sprache");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "Aktiviere Pride-Features");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "Wenn 'Ja', werden Pride-Features aktiviert");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "Aktiviere Pride-Splash-Texte");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "Wenn 'Ja', werden Pride-Splash-Texte auf dem Hauptbildschirm aktiviert");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "Aktiviere Pride-Texturen");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "Wenn 'Ja', werden Pride-Texturen aktiviert");
        translationBuilder.add("config.magic-conch-shell.title", "Magische Miesmuschel Konfiguration");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Krabbenburger");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Magische Miesmuschel");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "Killerburger");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Krabbenburgergeheimformel");
        translationBuilder.add("item.magic-conch-shell.spatula", "Pfannenwender");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "Die kleinste Violine der Welt");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Magische Miesmuschel");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "Die Magische Miesmuschel sagt:");
        translationBuilder.add("message.magic-conch-shell.response.0", "Eines Tages vielleicht!");
        translationBuilder.add("message.magic-conch-shell.response.1", "Gar nichts.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Keins von beiden.");
        translationBuilder.add("message.magic-conch-shell.response.3", "Ich glaub eher nicht.");
        translationBuilder.add("message.magic-conch-shell.response.4", "Nein.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Ja.");
        translationBuilder.add("message.magic-conch-shell.response.6", "Frag doch einfach noch mal!");
        translationBuilder.add("message.magic-conch-shell.response.7", "Man kann nicht zum Oberen kommen, wenn man auf seinem Unteren sitzt.");
        translationBuilder.add("message.magic-conch-shell.response.8", "Ich sehe eine neue Soße in deiner Zukunft.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Frag beim nächsten Mal.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Folge dem Seepferdchen.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "Eine magische Miesmuschel, die zufällige Antworten auf deine Fragen gibt");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Magische Miesmuschel");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "Die Magische Miesmuschel klingt");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "Die kleinste Violine der Welt spielt");
    }
}
