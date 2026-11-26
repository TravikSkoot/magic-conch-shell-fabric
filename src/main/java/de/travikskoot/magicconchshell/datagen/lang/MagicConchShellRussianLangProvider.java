package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellRussianLangProvider extends FabricLanguageProvider {
    public MagicConchShellRussianLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "ru_ru", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "Попробуй свой первый Крабсбургер");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "Тебе нравятся Крабсбургеры, не так ли?");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "Съешь мерзкий бургер и надейся на лучшее");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "Пахнет санитарным инспектором");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "Получи секретную формулу Крабсбургера");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "Только для глаз менеджера");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "Получи лопатку и начни карьеру повара");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "Я готов, я готов!");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "Получи самую маленькую скрипку в мире");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "Майонез — это музыкальный инструмент?");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "Найди загадочную раковину, которая отвечает на твои вопросы");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "Волшебная Раковина");
        translationBuilder.add("config.magic-conch-shell.category.general", "Общее");
        translationBuilder.add("config.magic-conch-shell.config_language", "Язык настроек");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "Включить функции Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "Если «да», включает функции Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "Включить Pride-надписи");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "Если «да», включает Pride-надписи на титульном экране");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "Включить Pride-текстуры");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "Если «да», включает Pride-текстуры");
        translationBuilder.add("config.magic-conch-shell.title", "Настройки Волшебной Раковины");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Крабсбургер");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Волшебная Раковина");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "Мерзкий Бургер");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Секретная формула");
        translationBuilder.add("item.magic-conch-shell.spatula", "Лопатка");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "Самая маленькая скрипка в мире");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Волшебная Раковина");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "Волшебная Раковина говорит:");
        translationBuilder.add("message.magic-conch-shell.response.0", "Может быть, когда-нибудь.");
        translationBuilder.add("message.magic-conch-shell.response.1", "Ничего.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Ни то, ни другое.");
        translationBuilder.add("message.magic-conch-shell.response.3", "Не думаю.");
        translationBuilder.add("message.magic-conch-shell.response.4", "Нет.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Да.");
        translationBuilder.add("message.magic-conch-shell.response.6", "Попробуй спросить ещё раз.");
        translationBuilder.add("message.magic-conch-shell.response.7", "Нельзя добраться до вершины, сидя на заднице.");
        translationBuilder.add("message.magic-conch-shell.response.8", "Я вижу новый соус в твоём будущем.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Спроси в следующий раз.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Следуй за морским коньком.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "Волшебная раковина, которая даёт случайные ответы на твои вопросы");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Волшебная Раковина");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "Волшебная Раковина звенит");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "Играет самая маленькая скрипка в мире");
    }
}