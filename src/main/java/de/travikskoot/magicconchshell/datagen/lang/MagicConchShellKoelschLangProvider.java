package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellKoelschLangProvider extends FabricLanguageProvider {
    public MagicConchShellKoelschLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "ksh", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "Kost ding eeste Krabbe-Burjer");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "Do stehs op Krabbe-Burjer, odder?");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "Ess ene Killer-Burjer un hopp, dat et joot jeiht");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "Dat rüch noh däm Gesundheitsinschpektor");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "Kreech de Krabbe-Burjer Jeheemformel");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "Nur för de Chef ehr Oore");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "Nimm dir ene Wender un fang ding Kareer als Burjerbrater aan");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "Ich ben bereit, ich ben bereit!");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "Kreech de kleenste Violine vun de Welt");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "Is Mayonnaise och en Instrument?");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "Fing en jeheimnisvoll Muschel, die ding Froore beantwoot");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "De majische Miesmuschel");
        translationBuilder.add("config.magic-conch-shell.category.general", "Alljemein");
        translationBuilder.add("config.magic-conch-shell.config_language", "Konfisch Sprooch");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "Pride Features akteviere");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "Wenn 'Jo', donn Pride Features akteviert");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "Pride Splash Texte akteviere");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "Wenn 'Jo', donn Pride Splash Texte op dä Hauptbildschirm akteviert");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "Pride Texturen akteviere");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "Wenn 'Jo', donn Pride Texturen akteviert");
        translationBuilder.add("config.magic-conch-shell.title", "Magische Miesmuschel Konfijuration");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Krabbe-Burjer");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Majische Miesmuschel");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "Killer-Burjer");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Krabbe-Burjer Jeheemformel");
        translationBuilder.add("item.magic-conch-shell.spatula", "Bratewänder");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "De kleenste Violine vun de Welt");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Majische Miesmuschel");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "De majische Miesmuschel säät:");
        translationBuilder.add("message.magic-conch-shell.response.0", "Irjendwann verleech!");
        translationBuilder.add("message.magic-conch-shell.response.1", "Jar nix.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Keins vun beide.");
        translationBuilder.add("message.magic-conch-shell.response.3", "Ich jläuv ehr nit.");
        translationBuilder.add("message.magic-conch-shell.response.4", "Nä.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Jo.");
        translationBuilder.add("message.magic-conch-shell.response.6", "Frooch doch einfach noch ens!");
        translationBuilder.add("message.magic-conch-shell.response.7", "Mer kann nit noh bovve kumme, wenn mer op singem unne sitzt.");
        translationBuilder.add("message.magic-conch-shell.response.8", "Ich sinn ene neue Soß en dingem Zokunft.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Frooch beim nächste Mol.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Folch däm Seepäerdche.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "En majische Miesmuschel, die zufällije Antworte op ding Froore jitt");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Majische Miesmuschel");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "De majische Miesmuschel klingt");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "De kleenste Violine vun de Welt spillt");
    }
}
