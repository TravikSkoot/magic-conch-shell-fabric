package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellHindiLangProvider extends FabricLanguageProvider {
    public MagicConchShellHindiLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "hi_in", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "अपना पहला क्रैबी पैटी चखें");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "तुम्हें क्रैबी पैटी पसंद हैं, है ना?");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "एक घिनौना पैटी खाओ और सबसे अच्छे की उम्मीद रखो");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "स्वास्थ्य निरीक्षक जैसी गंध");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "क्रैबी पैटी का गुप्त फ़ॉर्मूला हासिल करो");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "केवल प्रबंधक के लिए");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "स्पैचुला लो और अपना फ्राई कुक करियर शुरू करो");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "मैं तैयार हूँ, मैं तैयार हूँ!");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "दुनिया का सबसे छोटा वायलिन हासिल करो");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "क्या मेयोनेज़ एक वाद्य यंत्र है?");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "एक रहस्यमय शंख खोजो जो तुम्हारे सवालों के जवाब देता है");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "जादुई शंख");
        translationBuilder.add("config.magic-conch-shell.category.general", "सामान्य");
        translationBuilder.add("config.magic-conch-shell.config_language", "कॉन्फ़िग भाषा");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "प्राइड सुविधाएँ सक्षम करें");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "यदि 'हाँ' चुनें, तो प्राइड सुविधाएँ सक्षम होंगी");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "प्राइड स्प्लैश सक्षम करें");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "यदि 'हाँ' चुनें, तो मुख्य स्क्रीन में प्राइड स्प्लैश दिखेंगे");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "प्राइड टेक्सचर सक्षम करें");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "यदि 'हाँ' चुनें, तो प्राइड टेक्सचर सक्षम होंगे");
        translationBuilder.add("config.magic-conch-shell.title", "जादुई शंख कॉन्फ़िगरेशन");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "क्रैबी पैटी");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "जादुई शंख");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "घिनौना पैटी");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "गुप्त फ़ॉर्मूला");
        translationBuilder.add("item.magic-conch-shell.spatula", "स्पैचुला");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "दुनिया का सबसे छोटा वायलिन");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "जादुई शंख");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "जादुई शंख कहता है:");
        translationBuilder.add("message.magic-conch-shell.response.0", "शायद किसी दिन।");
        translationBuilder.add("message.magic-conch-shell.response.1", "कुछ नहीं।");
        translationBuilder.add("message.magic-conch-shell.response.2", "दोनों में से कोई नहीं।");
        translationBuilder.add("message.magic-conch-shell.response.3", "मुझे नहीं लगता।");
        translationBuilder.add("message.magic-conch-shell.response.4", "नहीं।");
        translationBuilder.add("message.magic-conch-shell.response.5", "हाँ।");
        translationBuilder.add("message.magic-conch-shell.response.6", "फिर से पूछने की कोशिश करो।");
        translationBuilder.add("message.magic-conch-shell.response.7", "बैठे रहकर तुम ऊँचाई तक नहीं पहुँच सकते।");
        translationBuilder.add("message.magic-conch-shell.response.8", "मैं तुम्हारे भविष्य में एक नई चटनी देखता हूँ।");
        translationBuilder.add("message.magic-conch-shell.response.9", "अगली बार पूछो।");
        translationBuilder.add("message.magic-conch-shell.response.10", "समुद्री घोड़े का पीछा करो।");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "एक जादुई शंख जो तुम्हारे सवालों के यादृच्छिक जवाब देता है");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "जादुई शंख");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "जादुई शंख बजता है");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "दुनिया का सबसे छोटा वायलिन बजता है");
    }
}
