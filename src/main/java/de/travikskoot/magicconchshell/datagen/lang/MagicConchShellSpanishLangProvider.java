package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellSpanishLangProvider extends FabricLanguageProvider {
    public MagicConchShellSpanishLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "es_es", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "Prueba tu primera Cangreburger");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "Te gustan las Cangreburgers, ¿verdad?");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "Cómete una hamburguesa asquerosa y reza por que salga bien");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "Huele a inspector sanitario");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "Consigue la fórmula secreta de la Cangreburger");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "Solo para ojos del gerente");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "Consigue una espátula y empieza tu carrera como cocinero");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "¡Estoy listo, estoy listo!");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "Consigue el violín más pequeño del mundo");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "¿La mayonesa es un instrumento?");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "Encuentra una concha misteriosa que responde a tus preguntas");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "La Concha Mágica");
        translationBuilder.add("config.magic-conch-shell.category.general", "General");
        translationBuilder.add("config.magic-conch-shell.config_language", "Idioma de la configuración");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "Activar funciones del Orgullo");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "Si eliges «sí», se activan las funciones del Orgullo");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "Activar mensajes del Orgullo");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "Si eliges «sí», se muestran mensajes del Orgullo en la pantalla de título");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "Activar texturas del Orgullo");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "Si eliges «sí», se activan las texturas del Orgullo");
        translationBuilder.add("config.magic-conch-shell.title", "Configuración de la Concha Mágica");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Cangreburger");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Concha Mágica");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "Hamburguesa asquerosa");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Fórmula secreta");
        translationBuilder.add("item.magic-conch-shell.spatula", "Espátula");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "El violín más pequeño del mundo");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Concha Mágica");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "La Concha Mágica dice:");
        translationBuilder.add("message.magic-conch-shell.response.0", "Quizá algún día.");
        translationBuilder.add("message.magic-conch-shell.response.1", "Nada.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Ninguno.");
        translationBuilder.add("message.magic-conch-shell.response.3", "No lo creo.");
        translationBuilder.add("message.magic-conch-shell.response.4", "No.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Sí.");
        translationBuilder.add("message.magic-conch-shell.response.6", "Intenta preguntar de nuevo.");
        translationBuilder.add("message.magic-conch-shell.response.7", "No puedes llegar arriba sentándote.");
        translationBuilder.add("message.magic-conch-shell.response.8", "Veo una nueva salsa en tu futuro.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Pregunta la próxima vez.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Sigue al caballito de mar.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "Una concha mágica que da respuestas aleatorias a tus preguntas");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Concha Mágica");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "La Concha Mágica suena");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "Suena el violín más pequeño del mundo");
    }
}
