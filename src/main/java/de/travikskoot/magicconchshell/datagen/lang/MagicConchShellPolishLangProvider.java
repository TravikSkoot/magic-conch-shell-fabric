package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellPolishLangProvider extends FabricLanguageProvider {
    public MagicConchShellPolishLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "pl_pl", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "Skosztuj swojego pierwszego Krabiburgera");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "Lubisz Krabiburgery, prawda?");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "Zjedz ohydny burger i miej nadzieję na najlepsze");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "Pachnie inspektorem sanitarnym");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "Zdobądź tajną formułę Krabiburgera");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "Tylko dla oczu kierownika");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "Zdobądź szpatułkę i rozpocznij karierę kucharza");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "Jestem gotowy, jestem gotowy!");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "Zdobądź najmniejsze skrzypce świata");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "Czy majonez jest instrumentem?");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "Znajdź tajemniczą muszlę, która odpowiada na twoje pytania");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "Magiczna Muszla");
        translationBuilder.add("config.magic-conch-shell.category.general", "Ogólne");
        translationBuilder.add("config.magic-conch-shell.config_language", "Język konfiguracji");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "Włącz funkcje Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "Jeśli „tak”, włącza funkcje Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "Włącz teksty Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "Jeśli „tak”, włącza teksty Pride na ekranie tytułowym");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "Włącz tekstury Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "Jeśli „tak”, włącza tekstury Pride");
        translationBuilder.add("config.magic-conch-shell.title", "Konfiguracja Magicznej Muszli");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Krabiburger");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Magiczna Muszla");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "Ohydny Burger");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Tajna formuła");
        translationBuilder.add("item.magic-conch-shell.spatula", "Szpatułka");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "Najmniejsze skrzypce świata");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Magiczna Muszla");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "Magiczna Muszla mówi:");
        translationBuilder.add("message.magic-conch-shell.response.0", "Może kiedyś.");
        translationBuilder.add("message.magic-conch-shell.response.1", "Nic.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Ani jedno, ani drugie.");
        translationBuilder.add("message.magic-conch-shell.response.3", "Nie sądzę.");
        translationBuilder.add("message.magic-conch-shell.response.4", "Nie.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Tak.");
        translationBuilder.add("message.magic-conch-shell.response.6", "Spróbuj zapytać jeszcze raz.");
        translationBuilder.add("message.magic-conch-shell.response.7", "Nie dostaniesz się na szczyt, siedząc na tyłku.");
        translationBuilder.add("message.magic-conch-shell.response.8", "Widzę nowy sos w twojej przyszłości.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Zapytaj następnym razem.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Podążaj za konikiem morskim.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "Magiczna muszla, która daje losowe odpowiedzi na twoje pytania");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Magiczna Muszla");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "Magiczna Muszla dźwięczy");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "Najmniejsze skrzypce świata grają");
    }
}