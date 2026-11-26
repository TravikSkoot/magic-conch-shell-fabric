package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellKoreanLangProvider extends FabricLanguageProvider {
    public MagicConchShellKoreanLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "ko_kr", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "첫 크래비 패티를 맛보세요");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "크래비 패티 좋아하죠?");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "역겨운 패티를 먹고 최선을 바라보세요");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "위생 검사관 냄새가 나요");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "크래비 패티의 비밀 레시피를 획득하세요");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "매니저만 볼 수 있음");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "주걱을 얻고 요리사로서의 커리어를 시작하세요");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "준비됐어, 준비됐어!");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "세상에서 가장 작은 바이올린을 획득하세요");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "마요네즈는 악기인가요?");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "질문에 답해 주는 신비로운 조개를 찾으세요");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "마법의 소라");
        translationBuilder.add("config.magic-conch-shell.category.general", "일반");
        translationBuilder.add("config.magic-conch-shell.config_language", "설정 언어");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "Pride 기능 활성화");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "'예'인 경우 Pride 기능을 활성화합니다");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "Pride 스플래시 활성화");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "'예'인 경우 타이틀 화면의 Pride 스플래시를 활성화합니다");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "Pride 텍스처 활성화");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "'예'인 경우 Pride 텍스처를 활성화합니다");
        translationBuilder.add("config.magic-conch-shell.title", "마법의 소라 설정");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "크래비 패티");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "마법의 소라");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "역겨운 패티");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "비밀 레시피");
        translationBuilder.add("item.magic-conch-shell.spatula", "주걱");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "세상에서 가장 작은 바이올린");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "마법의 소라");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "마법의 소라가 말합니다:");
        translationBuilder.add("message.magic-conch-shell.response.0", "언젠가는 어쩌면.");
        translationBuilder.add("message.magic-conch-shell.response.1", "아무것도 없어.");
        translationBuilder.add("message.magic-conch-shell.response.2", "둘 다 아니야.");
        translationBuilder.add("message.magic-conch-shell.response.3", "그렇게 생각하지 않아.");
        translationBuilder.add("message.magic-conch-shell.response.4", "아니.");
        translationBuilder.add("message.magic-conch-shell.response.5", "응.");
        translationBuilder.add("message.magic-conch-shell.response.6", "다시 물어봐.");
        translationBuilder.add("message.magic-conch-shell.response.7", "엉덩이에 앉아서는 꼭대기에 갈 수 없어.");
        translationBuilder.add("message.magic-conch-shell.response.8", "네 미래에 새 소스가 보여.");
        translationBuilder.add("message.magic-conch-shell.response.9", "다음에 다시 물어봐.");
        translationBuilder.add("message.magic-conch-shell.response.10", "해마를 따라가.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "질문에 무작위 답변을 주는 마법의 소라");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "마법의 소라");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "마법의 소라가 울립니다");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "세상에서 가장 작은 바이올린이 연주됩니다");
    }
}