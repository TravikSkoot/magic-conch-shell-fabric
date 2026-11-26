package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellItalianLangProvider extends FabricLanguageProvider {
    public MagicConchShellItalianLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "it_it", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "Assaggia il tuo primo Krabby Patty");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "Ti piacciono i Krabby Patty, vero?");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "Mangia un hamburger schifoso e spera per il meglio");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "Sa dell'ispettore sanitario");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "Ottieni la formula segreta del Krabby Patty");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "Solo per gli occhi del manager");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "Prendi una spatola e inizia la tua carriera da cuoco");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "Sono pronto, sono pronto!");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "Ottieni il violino più piccolo del mondo");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "La maionese è uno strumento?");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "Trova una conchiglia misteriosa che risponde alle tue domande");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "La Conchiglia Magica");
        translationBuilder.add("config.magic-conch-shell.category.general", "Generale");
        translationBuilder.add("config.magic-conch-shell.config_language", "Lingua di configurazione");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "Attiva funzionalità Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "Se «sì», attiva le funzionalità Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "Attiva testi Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "Se «sì», attiva i testi Pride nella schermata iniziale");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "Attiva texture Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "Se «sì», attiva le texture Pride");
        translationBuilder.add("config.magic-conch-shell.title", "Configurazione della Conchiglia Magica");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Krabby Patty");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Conchiglia Magica");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "Hamburger schifoso");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Formula segreta");
        translationBuilder.add("item.magic-conch-shell.spatula", "Spatola");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "Il violino più piccolo del mondo");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Conchiglia Magica");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "La Conchiglia Magica dice:");
        translationBuilder.add("message.magic-conch-shell.response.0", "Forse un giorno.");
        translationBuilder.add("message.magic-conch-shell.response.1", "Niente.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Né l'uno né l'altro.");
        translationBuilder.add("message.magic-conch-shell.response.3", "Non credo.");
        translationBuilder.add("message.magic-conch-shell.response.4", "No.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Sì.");
        translationBuilder.add("message.magic-conch-shell.response.6", "Prova a chiedere di nuovo.");
        translationBuilder.add("message.magic-conch-shell.response.7", "Non puoi arrivare in cima restando seduto sul fondoschiena.");
        translationBuilder.add("message.magic-conch-shell.response.8", "Vedo una nuova salsa nel tuo futuro.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Chiedi la prossima volta.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Segui il cavalluccio marino.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "Una conchiglia magica che dà risposte casuali alle tue domande");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Conchiglia Magica");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "La Conchiglia Magica suona");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "Suona il violino più piccolo del mondo");
    }
}