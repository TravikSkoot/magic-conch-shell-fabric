package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellBengaliLangProvider extends FabricLanguageProvider {
    public MagicConchShellBengaliLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "bn_in", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "তোমার প্রথম ক্র্যাবি প্যাটি খাও");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "তোমার ক্র্যাবি প্যাটি পছন্দ, তাই না?");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "একটা বাসি প্যাটি খাও এবং সব ঠিক হবে বলে আশা করো");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "স্বাস্থ্য পরিদর্শকের গন্ধ");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "ক্র্যাবি প্যাটির গোপন ফর্মুলা অর্জন করো");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "শুধু ম্যানেজারের চোখের জন্য");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "একটা স্প্যাচুলা নাও এবং ফ্রাই কুক হিসেবে ক্যারিয়ার শুরু করো");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "আমি প্রস্তুত, আমি প্রস্তুত!");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "বিশ্বের ক্ষুদ্রতম ভায়োলিন অর্জন করো");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "মেয়োনিজ কি বাদ্যযন্ত্র?");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "এমন একটি রহস্যময় শামুক খোঁজো যা তোমার প্রশ্নের উত্তর দেয়");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "জাদুর শামুক");
        translationBuilder.add("config.magic-conch-shell.category.general", "সাধারণ");
        translationBuilder.add("config.magic-conch-shell.config_language", "কনফিগ ভাষা");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "প্রাইড ফিচার চালু করো");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "যদি 'হ্যাঁ' নির্বাচন করো, প্রাইড ফিচার চালু হবে");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "প্রাইড স্প্ল্যাশ চালু করো");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "যদি 'হ্যাঁ' নির্বাচন করো, শিরোনাম স্ক্রিনে প্রাইড স্প্ল্যাশ দেখাবে");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "প্রাইড টেক্সচার চালু করো");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "যদি 'হ্যাঁ' নির্বাচন করো, প্রাইড টেক্সচার চালু হবে");
        translationBuilder.add("config.magic-conch-shell.title", "জাদুর শামুক কনফিগারেশন");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "ক্র্যাবি প্যাটি");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "জাদুর শামুক");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "বাসি প্যাটি");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "গোপন ফর্মুলা");
        translationBuilder.add("item.magic-conch-shell.spatula", "স্প্যাচুলা");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "বিশ্বের ক্ষুদ্রতম ভায়োলিন");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "জাদুর শামুক");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "জাদুর শামুক বলে:");
        translationBuilder.add("message.magic-conch-shell.response.0", "হয়তো একদিন।");
        translationBuilder.add("message.magic-conch-shell.response.1", "কিছুই না।");
        translationBuilder.add("message.magic-conch-shell.response.2", "কোনোটিই না।");
        translationBuilder.add("message.magic-conch-shell.response.3", "আমি মনে করি না।");
        translationBuilder.add("message.magic-conch-shell.response.4", "না।");
        translationBuilder.add("message.magic-conch-shell.response.5", "হ্যাঁ।");
        translationBuilder.add("message.magic-conch-shell.response.6", "আবার জিজ্ঞাসা করার চেষ্টা করো।");
        translationBuilder.add("message.magic-conch-shell.response.7", "বসে থাকলে তুমি শীর্ষে পৌঁছাতে পারবে না।");
        translationBuilder.add("message.magic-conch-shell.response.8", "আমি তোমার ভবিষ্যতে নতুন সস দেখতে পাচ্ছি।");
        translationBuilder.add("message.magic-conch-shell.response.9", "পরের বার জিজ্ঞাসা করো।");
        translationBuilder.add("message.magic-conch-shell.response.10", "সমুদ্রঘোড়াকে অনুসরণ করো।");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "একটি জাদুর শামুক যা তোমার প্রশ্নের এলোমেলো উত্তর দেয়");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "জাদুর শামুক");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "জাদুর শামুক বাজে");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "বিশ্বের ক্ষুদ্রতম ভায়োলিন বাজে");
    }
}
