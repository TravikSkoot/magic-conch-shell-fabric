package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellMandarinLangProvider extends FabricLanguageProvider {
    public MagicConchShellMandarinLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "品尝你的第一个蟹黄堡");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "你喜欢蟹黄堡，对吧？");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "吃一个恶心汉堡，并抱最好的希望");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "闻起来像卫生检查员");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "获得蟹黄堡秘密配方");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "仅供经理阅览");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "获得一把锅铲，开始你的厨师生涯");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "我准备好了，我准备好了！");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "获得世界上最小的提琴");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "蛋黄酱是一种乐器吗？");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "找到一枚会回答你问题的神秘贝壳");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "魔法海螺");
        translationBuilder.add("config.magic-conch-shell.category.general", "常规");
        translationBuilder.add("config.magic-conch-shell.config_language", "配置语言");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "启用骄傲主题功能");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "若为“是”，则启用骄傲主题功能");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "启用骄傲主题标语");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "若为“是”，则在标题屏幕启用骄傲主题标语");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "启用骄傲主题材质");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "若为“是”，则启用骄傲主题材质");
        translationBuilder.add("config.magic-conch-shell.title", "魔法海螺设置");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "蟹黄堡");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "魔法海螺");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "恶心汉堡");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "秘密配方");
        translationBuilder.add("item.magic-conch-shell.spatula", "锅铲");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "世界上最小的提琴");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "魔法海螺");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "魔法海螺说：");
        translationBuilder.add("message.magic-conch-shell.response.0", "也许有一天。");
        translationBuilder.add("message.magic-conch-shell.response.1", "什么都没有。");
        translationBuilder.add("message.magic-conch-shell.response.2", "都不是。");
        translationBuilder.add("message.magic-conch-shell.response.3", "我不这么认为。");
        translationBuilder.add("message.magic-conch-shell.response.4", "不。");
        translationBuilder.add("message.magic-conch-shell.response.5", "是。");
        translationBuilder.add("message.magic-conch-shell.response.6", "再问一次试试。");
        translationBuilder.add("message.magic-conch-shell.response.7", "坐在屁股上是到不了顶端的。");
        translationBuilder.add("message.magic-conch-shell.response.8", "我看到你的未来有一款新酱料。");
        translationBuilder.add("message.magic-conch-shell.response.9", "下次再问。");
        translationBuilder.add("message.magic-conch-shell.response.10", "跟着海马走。");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "一枚会随机回答你问题的魔法海螺");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "魔法海螺");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "魔法海螺叮当作响");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "世界上最小的提琴正在演奏");
    }
}