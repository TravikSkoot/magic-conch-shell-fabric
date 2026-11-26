package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellDutchLangProvider extends FabricLanguageProvider {
    public MagicConchShellDutchLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "nl_nl", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "Proef je eerste Krabby Patty");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "Je vindt Krabby Patties lekker, toch?");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "Eet een walgelijke burger en hoop op het beste");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "Het ruikt naar de gezondheidsinspecteur");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "Verkrijg de geheime formule van de Krabby Patty");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "Alleen voor managerogen");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "Pak een spatel en begin je carrière als frituurkok");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "Ik ben er klaar voor, ik ben er klaar voor!");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "Verkrijg 's werelds kleinste viool");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "Is mayonaise een instrument?");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "Vind een mysterieuze schelp die je vragen beantwoordt");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "De Magische Schelp");
        translationBuilder.add("config.magic-conch-shell.category.general", "Algemeen");
        translationBuilder.add("config.magic-conch-shell.config_language", "Configuratietaal");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "Pride-functies inschakelen");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "Als 'ja', schakelt Pride-functies in");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "Pride-splashteksten inschakelen");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "Als 'ja', schakelt Pride-splashteksten op het startscherm in");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "Pride-texturen inschakelen");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "Als 'ja', schakelt Pride-texturen in");
        translationBuilder.add("config.magic-conch-shell.title", "Magische Schelp-configuratie");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Krabby Patty");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Magische Schelp");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "Walgelijke Burger");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Geheime formule");
        translationBuilder.add("item.magic-conch-shell.spatula", "Spatel");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "'s Werelds kleinste viool");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Magische Schelp");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "De Magische Schelp zegt:");
        translationBuilder.add("message.magic-conch-shell.response.0", "Misschien ooit.");
        translationBuilder.add("message.magic-conch-shell.response.1", "Niets.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Geen van beide.");
        translationBuilder.add("message.magic-conch-shell.response.3", "Ik denk het niet.");
        translationBuilder.add("message.magic-conch-shell.response.4", "Nee.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Ja.");
        translationBuilder.add("message.magic-conch-shell.response.6", "Probeer het de volgende keer opnieuw te vragen.");
        translationBuilder.add("message.magic-conch-shell.response.7", "Je komt niet bovenaan door op je billen te zitten.");
        translationBuilder.add("message.magic-conch-shell.response.8", "Ik zie een nieuwe saus in je toekomst.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Vraag de volgende keer.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Volg het zeepaardje.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "Een magische schelp die willekeurige antwoorden op je vragen geeft");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Magische Schelp");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "De Magische Schelp klinkt");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "'s Werelds kleinste viool speelt");
    }
}