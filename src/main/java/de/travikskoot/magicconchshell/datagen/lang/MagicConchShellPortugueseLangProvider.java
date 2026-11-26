package de.travikskoot.magicconchshell.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellPortugueseLangProvider extends FabricLanguageProvider {
    public MagicConchShellPortugueseLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "pt_br", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.description", "Prove seu primeiro Hambúrguer de Siri");
        translationBuilder.add("advancements.magic-conch-shell.eat_krabby_patty.title", "Você gosta de Hambúrgueres de Siri, não é?");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.description", "Coma um Hambúrguer Nojento e espere pelo melhor");
        translationBuilder.add("advancements.magic-conch-shell.eat_nasty_patty.title", "Cheira a fiscal sanitário");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.description", "Consiga a Fórmula Secreta do Hambúrguer de Siri");
        translationBuilder.add("advancements.magic-conch-shell.get_secret_formula.title", "Somente para os olhos do gerente");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.description", "Consiga uma espátula e comece sua carreira como cozinheiro");
        translationBuilder.add("advancements.magic-conch-shell.get_spatula.title", "Estou pronto, estou pronto!");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.description", "Obtenha o Menor Violino do Mundo");
        translationBuilder.add("advancements.magic-conch-shell.get_worlds_smallest_violin.title", "Maionese é um instrumento?");
        translationBuilder.add("advancements.magic-conch-shell.root.description", "Encontre uma concha misteriosa que responde às suas perguntas");
        translationBuilder.add("advancements.magic-conch-shell.root.title", "A Concha Mágica");
        translationBuilder.add("config.magic-conch-shell.category.general", "Geral");
        translationBuilder.add("config.magic-conch-shell.config_language", "Idioma da configuração");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features", "Ativar recursos Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_features.tooltip", "Se «sim», ativa os recursos Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes", "Ativar textos Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_splashes.tooltip", "Se «sim», ativa os textos Pride na tela inicial");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures", "Ativar texturas Pride");
        translationBuilder.add("config.magic-conch-shell.enable_pride_textures.tooltip", "Se «sim», ativa as texturas Pride");
        translationBuilder.add("config.magic-conch-shell.title", "Configuração da Concha Mágica");
        translationBuilder.add("item.magic-conch-shell.krabby_patty", "Hambúrguer de Siri");
        translationBuilder.add("item.magic-conch-shell.magic_conch_shell", "Concha Mágica");
        translationBuilder.add("item.magic-conch-shell.nasty_patty", "Hambúrguer Nojento");
        translationBuilder.add("item.magic-conch-shell.secret_formula", "Fórmula Secreta");
        translationBuilder.add("item.magic-conch-shell.spatula", "Espátula");
        translationBuilder.add("item.magic-conch-shell.worlds_smallest_violin", "O Menor Violino do Mundo");
        translationBuilder.add("itemGroup.magic-conch-shell.magic_conch_shell", "Concha Mágica");
        translationBuilder.add("message.magic-conch-shell.magic-conch-shell_says", "A Concha Mágica diz:");
        translationBuilder.add("message.magic-conch-shell.response.0", "Talvez um dia.");
        translationBuilder.add("message.magic-conch-shell.response.1", "Nada.");
        translationBuilder.add("message.magic-conch-shell.response.2", "Nenhum dos dois.");
        translationBuilder.add("message.magic-conch-shell.response.3", "Acho que não.");
        translationBuilder.add("message.magic-conch-shell.response.4", "Não.");
        translationBuilder.add("message.magic-conch-shell.response.5", "Sim.");
        translationBuilder.add("message.magic-conch-shell.response.6", "Tente perguntar de novo.");
        translationBuilder.add("message.magic-conch-shell.response.7", "Você não chega ao topo sentado em cima da bunda.");
        translationBuilder.add("message.magic-conch-shell.response.8", "Vejo um novo molho no seu futuro.");
        translationBuilder.add("message.magic-conch-shell.response.9", "Pergunte na próxima vez.");
        translationBuilder.add("message.magic-conch-shell.response.10", "Siga o cavalo-marinho.");
        translationBuilder.add("modmenu.descriptionTranslation.magic-conch-shell", "Uma concha mágica que dá respostas aleatórias às suas perguntas");
        translationBuilder.add("modmenu.nameTranslation.magic-conch-shell", "Concha Mágica");
        translationBuilder.add("sound.magic-conch-shell.magic_conch_shell_sound", "A Concha Mágica tilinta");
        translationBuilder.add("sound.magic-conch-shell.worlds_smallest_violin", "O Menor Violino do Mundo toca");
    }
}