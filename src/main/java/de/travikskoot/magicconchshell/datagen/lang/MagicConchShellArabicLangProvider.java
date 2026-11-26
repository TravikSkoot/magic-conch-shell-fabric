package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellArabicLangProvider extends FabricLanguageProvider {
    public MagicConchShellArabicLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "ar_sa", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "تذوّق أول برجر سلطعون لك");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "تحب برجر السلطعون، أليس كذلك؟");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "كُل برجرًا مقززًا وآمل أن تسير الأمور على خير");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "رائحته تشبه مفتش الصحة");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "احصل على الوصفة السرية لبرجر السلطعون");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "لعيون المدير فقط");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "احصل على ملعقة تقليب وابدأ مسيرتك كطاهي قلي");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "أنا مستعد، أنا مستعد!");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "احصل على أصغر كمان في العالم");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "هل المايونيز آلة موسيقية؟");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "اعثر على صدفة غامضة تجيب على أسئلتك");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "الصدفة السحرية");
        translationBuilder.add("config.magic-conch-shell.category.general", "عام");
        translationBuilder.add("config.magic-conch-shell.config_language", "لغة الإعدادات");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "تفعيل ميزات الفخر");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "إذا اخترت «نعم»، سيتم تفعيل ميزات الفخر");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "تفعيل شعارات الفخر");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "إذا اخترت «نعم»، ستظهر شعارات الفخر في شاشة العنوان");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "تفعيل خامات الفخر");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "إذا اخترت «نعم»، سيتم تفعيل خامات الفخر");
        translationBuilder.add("config.magic-conch-shell.title", "إعدادات الصدفة السحرية");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "برجر السلطعون");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "الصدفة السحرية");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "برجر مقزز");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "الوصفة السرية");
        translationBuilder.add("item.magic-conch-shell.spatula", "ملعقة تقليب");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "أصغر كمان في العالم");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "الصدفة السحرية");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "تقول الصدفة السحرية:");
        translationBuilder.add("message.magic-conch-shell.response.0", "ربما يومًا ما.");
        translationBuilder.add("message.magic-conch-shell.response.1", "لا شيء.");
        translationBuilder.add("message.magic-conch-shell.response.2", "لا هذا ولا ذاك.");
        translationBuilder.add("message.magic-conch-shell.response.3", "لا أعتقد ذلك.");
        translationBuilder.add("message.magic-conch-shell.response.4", "لا.");
        translationBuilder.add("message.magic-conch-shell.response.5", "نعم.");
        translationBuilder.add("message.magic-conch-shell.response.6", "حاول السؤال مرة أخرى.");
        translationBuilder.add("message.magic-conch-shell.response.7", "لا يمكنك الوصول إلى القمة وأنت جالس.");
        translationBuilder.add("message.magic-conch-shell.response.8", "أرى صوصًا جديدًا في مستقبلك.");
        translationBuilder.add("message.magic-conch-shell.response.9", "اسأل في المرة القادمة.");
        translationBuilder.add("message.magic-conch-shell.response.10", "اتبع فرس البحر.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "صدفة سحرية تقدم إجابات عشوائية لأسئلتك");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "الصدفة السحرية");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "ترنّ الصدفة السحرية");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "يعزف أصغر كمان في العالم");
    }
}
