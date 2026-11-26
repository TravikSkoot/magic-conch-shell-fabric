package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellTraditionalChineseHongKongLangProvider extends FabricLanguageProvider {
    public MagicConchShellTraditionalChineseHongKongLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "zh_hk", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "品嚐你的第一個蟹黃堡");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "你喜歡蟹黃堡，對吧？");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "食一個核突漢堡，然後希望最好嘅事發生");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "聞落似衛生督察");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "取得蟹黃堡秘密配方");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "只限經理觀看");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "取得一把鑊鏟，開始你嘅廚師生涯");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "我準備好喇，我準備好喇！");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "取得世界上最細嘅提琴");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "沙律醬係咪一種樂器？");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "搵到一個會回答你問題嘅神秘貝殼");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "魔法海螺");
        translationBuilder.add("config.magic-conch-shell.category.general", "一般");
        translationBuilder.add("config.magic-conch-shell.config_language", "設定語言");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "啟用 Pride 功能");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "如果係「係」，就會啟用 Pride 功能");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "啟用 Pride 標語");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "如果係「係」，就會喺標題畫面啟用 Pride 標語");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "啟用 Pride 材質");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "如果係「係」，就會啟用 Pride 材質");
        translationBuilder.add("config.magic-conch-shell.title", "魔法海螺設定");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "蟹黃堡");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "魔法海螺");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "核突漢堡");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "秘密配方");
        translationBuilder.add("item.magic-conch-shell.spatula", "鑊鏟");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "世界上最細嘅提琴");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "魔法海螺");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "魔法海螺話：");
        translationBuilder.add("message.magic-conch-shell.response.0", "或者有一日。");
        translationBuilder.add("message.magic-conch-shell.response.1", "乜都冇。");
        translationBuilder.add("message.magic-conch-shell.response.2", "兩樣都唔係。");
        translationBuilder.add("message.magic-conch-shell.response.3", "我唔係咁諗。");
        translationBuilder.add("message.magic-conch-shell.response.4", "唔係。");
        translationBuilder.add("message.magic-conch-shell.response.5", "係。");
        translationBuilder.add("message.magic-conch-shell.response.6", "下次再問多次啦。");
        translationBuilder.add("message.magic-conch-shell.response.7", "坐喺屎忽上面係到唔到頂嘅。");
        translationBuilder.add("message.magic-conch-shell.response.8", "我見到你將來會有新醬汁。");
        translationBuilder.add("message.magic-conch-shell.response.9", "下次再問啦。");
        translationBuilder.add("message.magic-conch-shell.response.10", "跟住海馬行。");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "一個會隨機回答你問題嘅魔法海螺");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "魔法海螺");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "魔法海螺叮噹響");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "世界上最細嘅提琴正在演奏");
    }
}