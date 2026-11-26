package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellTurkishLangProvider extends FabricLanguageProvider {
    public MagicConchShellTurkishLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "tr_tr", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "İlk Krabbi Burgerini tadına bak");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "Krabbi Burgerleri seviyorsun, değil mi?");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "Bir İğrenç Burger ye ve en iyisini um");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "Sağlık müfettişi gibi kokuyor");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "Krabbi Burger'in Gizli Formülünü edin");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "Sadece Müdürün Gözleri İçin");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "Bir spatula al ve aşçı kariyerine başla");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "Hazırım, hazırım!");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "Dünyanın En Küçük Kemanı'nı edin");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "Mayonez bir enstrüman mı?");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "Sorularını yanıtlayan gizemli bir kabuk bul");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "Büyülü Kabuk");
        translationBuilder.add("config.magic-conch-shell.category.general", "Genel");
        translationBuilder.add("config.magic-conch-shell.config_language", "Yapılandırma Dili");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "Pride Özelliklerini Etkinleştir");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "«Evet» ise Pride özelliklerini etkinleştirir");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "Pride Metinlerini Etkinleştir");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "«Evet» ise başlık ekranındaki Pride metinlerini etkinleştirir");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "Pride Dokularını Etkinleştir");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "«Evet» ise Pride dokularını etkinleştirir");
        translationBuilder.add("config.magic-conch-shell.title", "Büyülü Kabuk Yapılandırması");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Krabbi Burger");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Büyülü Kabuk");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "İğrenç Burger");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Gizli Formül");
        translationBuilder.add("item.magic-conch-shell.spatula", "Spatula");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "Dünyanın En Küçük Kemanı");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Büyülü Kabuk");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "Büyülü Kabuk diyor ki:");
        translationBuilder.add("message.magic-conch-shell.response.0", "Belki bir gün.");
        translationBuilder.add("message.magic-conch-shell.response.1", "Hiçbir şey.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Ne biri ne diğeri.");
        translationBuilder.add("message.magic-conch-shell.response.3", "Sanmıyorum.");
        translationBuilder.add("message.magic-conch-shell.response.4", "Hayır.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Evet.");
        translationBuilder.add("message.magic-conch-shell.response.6", "Bir daha sormayı dene.");
        translationBuilder.add("message.magic-conch-shell.response.7", "Poponda oturarak zirveye çıkamazsın.");
        translationBuilder.add("message.magic-conch-shell.response.8", "Geleceğinde yeni bir sos görüyorum.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Bir dahaki sefere sor.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Deniz atını takip et.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "Sorularına rastgele yanıtlar veren büyülü bir kabuk");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Büyülü Kabuk");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "Büyülü Kabuk çınlıyor");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "Dünyanın En Küçük Kemanı çalıyor");
    }
}