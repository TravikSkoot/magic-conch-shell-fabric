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
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Krabbe-Boorjer");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Magisch Miesmüschel");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "Fiese Boorjer");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Krabbe-Boorjer-Rezept");
        translationBuilder.add("item.magic-conch-shell.spatula", "Schpatula");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "Kleinst Fidel vun d’r Welt");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Magisch Miesmüschel");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "D’r Müschel säät,");
        translationBuilder.add("message.magic-conch-shell.response.0", "Vielleisch eines Daachs.");
        translationBuilder.add("message.magic-conch-shell.response.1", "Jarnix.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Keins vun beid.");
        translationBuilder.add("message.magic-conch-shell.response.3", "Ich glööv dat nit.");
        translationBuilder.add("message.magic-conch-shell.response.4", "Nä.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Joh.");
        translationBuilder.add("message.magic-conch-shell.response.6", "Frooch noch ens noh.");
        translationBuilder.add("message.magic-conch-shell.response.7", "Do küss nit noh bovve, wenn de nur hucks.");
        translationBuilder.add("message.magic-conch-shell.response.8", "Ich sinn en neue Sooss en ding Zokunf.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Frooch beim nächste Mol.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Follich dem Seepäädche.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "En magisch Miesmüschel, diir jöck zesammejewööfelde Antwoote op ding Froore jitt.");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Magisch Miesmüschel");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "Kleinst Fidel vun d’r Welt spillt");
    }
}
