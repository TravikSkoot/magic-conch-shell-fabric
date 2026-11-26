package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellTraditionalChineseTaiwanLangProvider extends FabricLanguageProvider {
    public MagicConchShellTraditionalChineseTaiwanLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "zh_tw", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "品嚐你的第一個蟹黃堡");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "你喜歡蟹黃堡，對吧？");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "吃一個噁心漢堡，並抱著最好的希望");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "聞起來像衛生檢查員");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "取得蟹黃堡秘密配方");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "僅供經理閱覽");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "取得一把鍋鏟，開始你的廚師生涯");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "我準備好了，我準備好了！");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "取得世界上最小的提琴");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "美奶滋是一種樂器嗎？");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "找到一枚會回答你問題的神秘貝殼");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "魔法海螺");
        translationBuilder.add("config.magic-conch-shell.category.general", "一般");
        translationBuilder.add("config.magic-conch-shell.config_language", "設定語言");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "啟用驕傲主題功能");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "若為「是」，則啟用驕傲主題功能");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "啟用驕傲主題標語");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "若為「是」，則在標題畫面啟用驕傲主題標語");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "啟用驕傲主題材質");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "若為「是」，則啟用驕傲主題材質");
        translationBuilder.add("config.magic-conch-shell.title", "魔法海螺設定");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "蟹黃堡");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "魔法海螺");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "噁心漢堡");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "秘密配方");
        translationBuilder.add("item.magic-conch-shell.spatula", "鍋鏟");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "世界上最小的提琴");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "魔法海螺");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "魔法海螺說：");
        translationBuilder.add("message.magic-conch-shell.response.0", "也許有一天。");
        translationBuilder.add("message.magic-conch-shell.response.1", "什麼都沒有。");
        translationBuilder.add("message.magic-conch-shell.response.2", "都不是。");
        translationBuilder.add("message.magic-conch-shell.response.3", "我不這麼認為。");
        translationBuilder.add("message.magic-conch-shell.response.4", "不。");
        translationBuilder.add("message.magic-conch-shell.response.5", "是。");
        translationBuilder.add("message.magic-conch-shell.response.6", "再問一次試試。");
        translationBuilder.add("message.magic-conch-shell.response.7", "坐在屁股上是到不了頂端的。");
        translationBuilder.add("message.magic-conch-shell.response.8", "我看到你的未來有一款新醬料。");
        translationBuilder.add("message.magic-conch-shell.response.9", "下次再問。");
        translationBuilder.add("message.magic-conch-shell.response.10", "跟著海馬走。");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "一枚會隨機回答你問題的魔法海螺");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "魔法海螺");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "魔法海螺叮噹作響");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "世界上最小的提琴正在演奏");
    }
}