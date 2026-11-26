package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellJapaneseLangProvider extends FabricLanguageProvider {
    public MagicConchShellJapaneseLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "ja_jp", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "初めてのクラビーパティを味わう");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "クラビーパティは好きだよね？");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "まずいバーガーを食べて、うまくいくことを願う");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "衛生監督官のにおいがする");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "クラビーパティの秘密のレシピを手に入れる");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "店長限定");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "スパチュラを手に入れて、コックとしてのキャリアを始める");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "準備完了、準備完了！");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "世界で一番小さいバイオリンを手に入れる");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "マヨネーズは楽器なの？");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "質問に答えてくれる不思議な貝がらを見つける");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "魔法の貝がら");
        translationBuilder.add("config.magic-conch-shell.category.general", "一般");
        translationBuilder.add("config.magic-conch-shell.config_language", "設定言語");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "Pride機能を有効にする");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "「はい」の場合、Pride機能を有効にします");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "Prideスプラッシュを有効にする");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "「はい」の場合、タイトル画面のPrideスプラッシュを有効にします");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "Prideテクスチャを有効にする");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "「はい」の場合、Prideテクスチャを有効にします");
        translationBuilder.add("config.magic-conch-shell.title", "魔法の貝がらの設定");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "クラビーパティ");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "魔法の貝がら");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "まずいバーガー");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "秘密のレシピ");
        translationBuilder.add("item.magic-conch-shell.spatula", "スパチュラ");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "世界で一番小さいバイオリン");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "魔法の貝がら");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "魔法の貝がらは言います：");
        translationBuilder.add("message.magic-conch-shell.response.0", "いつかね。");
        translationBuilder.add("message.magic-conch-shell.response.1", "何もない。");
        translationBuilder.add("message.magic-conch-shell.response.2", "どちらでもない。");
        translationBuilder.add("message.magic-conch-shell.response.3", "そうは思わない。");
        translationBuilder.add("message.magic-conch-shell.response.4", "いいえ。");
        translationBuilder.add("message.magic-conch-shell.response.5", "はい。");
        translationBuilder.add("message.magic-conch-shell.response.6", "もう一度聞いてみて。");
        translationBuilder.add("message.magic-conch-shell.response.7", "おしりに座っていても、頂上には行けないよ。");
        translationBuilder.add("message.magic-conch-shell.response.8", "君の未来に新しいソースが見える。");
        translationBuilder.add("message.magic-conch-shell.response.9", "次はまた聞いて。");
        translationBuilder.add("message.magic-conch-shell.response.10", "タツノオトシゴについていって。");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "質問にランダムな答えを返す魔法の貝がら");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "魔法の貝がら");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "魔法の貝がらが鳴る");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "世界で一番小さいバイオリンが鳴る");
    }
}