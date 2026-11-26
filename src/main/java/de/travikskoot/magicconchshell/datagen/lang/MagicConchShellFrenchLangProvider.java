package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellFrenchLangProvider extends FabricLanguageProvider {
    public MagicConchShellFrenchLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "fr_fr", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "Goûte ton premier Krabby Patty");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "Tu aimes les Krabby Patties, n'est-ce pas ?");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "Mange un burger dégoûtant et espère que tout ira bien");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "Ça sent l'inspecteur sanitaire");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "Obtiens la recette secrète du Krabby Patty");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "Réservé aux yeux du gérant");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "Obtiens une spatule et commence ta carrière de cuisinier");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "Je suis prêt, je suis prêt !");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "Obtiens le plus petit violon du monde");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "La mayonnaise, c'est un instrument ?");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "Trouve un coquillage mystérieux qui répond à tes questions");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "Le Coquillage Magique");
        translationBuilder.add("config.magic-conch-shell.category.general", "Général");
        translationBuilder.add("config.magic-conch-shell.config_language", "Langue de configuration");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "Activer les fonctions Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "Si « oui », active les fonctions Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "Activer les messages Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "Si « oui », affiche des messages Pride sur l'écran-titre");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "Activer les textures Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "Si « oui », active les textures Pride");
        translationBuilder.add("config.magic-conch-shell.title", "Configuration du Coquillage Magique");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Krabby Patty");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Coquillage Magique");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "Burger dégoûtant");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Recette secrète");
        translationBuilder.add("item.magic-conch-shell.spatula", "Spatule");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "Le plus petit violon du monde");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Coquillage Magique");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "Le Coquillage Magique dit :");
        translationBuilder.add("message.magic-conch-shell.response.0", "Peut-être un jour.");
        translationBuilder.add("message.magic-conch-shell.response.1", "Rien.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Ni l'un ni l'autre.");
        translationBuilder.add("message.magic-conch-shell.response.3", "Je ne pense pas.");
        translationBuilder.add("message.magic-conch-shell.response.4", "Non.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Oui.");
        translationBuilder.add("message.magic-conch-shell.response.6", "Essaie de demander à nouveau.");
        translationBuilder.add("message.magic-conch-shell.response.7", "Tu ne peux pas atteindre le sommet en restant assis.");
        translationBuilder.add("message.magic-conch-shell.response.8", "Je vois une nouvelle sauce dans ton avenir.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Demande la prochaine fois.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Suis l'hippocampe.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "Un coquillage magique qui répond au hasard à tes questions");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Coquillage Magique");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "Le Coquillage Magique résonne");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "Le plus petit violon du monde joue");
    }
}
