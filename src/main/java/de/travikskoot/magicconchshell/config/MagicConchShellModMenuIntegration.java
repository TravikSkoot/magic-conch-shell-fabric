package de.travikskoot.magicconchshell.config;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import de.travikskoot.magicconchshell.MagicConchShell;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import me.shedaniel.clothconfig2.gui.entries.BooleanListEntry;
import net.minecraft.network.chat.Component;

public class MagicConchShellModMenuIntegration implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> {
            ConfigBuilder builder = ConfigBuilder.create()
                    .setParentScreen(parent)
                    .setTitle(Component.translatable("config.magic-conch-shell.title"));

            ConfigCategory general = builder.getOrCreateCategory(
                    Component.translatable("config.magic-conch-shell.category.general")
            );
            ConfigEntryBuilder entryBuilder = builder.entryBuilder();

            BooleanListEntry prideTexturesEntry = entryBuilder.startBooleanToggle(
                            Component.translatable("config.magic-conch-shell.enable_pride_textures"),
                            MagicConchShell.CONFIG.enable_pride_textures)
                    .setDefaultValue(true)
                    .setTooltip(Component.translatable("config.magic-conch-shell.enable_pride_textures.tooltip"))
                    .setSaveConsumer(newValue -> MagicConchShell.CONFIG.enable_pride_textures = newValue)
                    .build();

            BooleanListEntry prideSplashesEntry = entryBuilder.startBooleanToggle(
                            Component.translatable("config.magic-conch-shell.enable_pride_splashes"),
                            MagicConchShell.CONFIG.enable_pride_splashes)
                    .setDefaultValue(true)
                    .setTooltip(Component.translatable("config.magic-conch-shell.enable_pride_splashes.tooltip"))
                    .setSaveConsumer(newValue -> MagicConchShell.CONFIG.enable_pride_splashes = newValue)
                    .build();

            @SuppressWarnings("deprecation")
            BooleanListEntry prideFeaturesEntry = new BooleanListEntry(
                    Component.translatable("config.magic-conch-shell.enable_pride_features"),
                    MagicConchShell.CONFIG.enable_pride_features,
                    Component.translatable("controls.reset"),
                    () -> true,
                    newValue -> MagicConchShell.CONFIG.enable_pride_features = newValue,
                    () -> java.util.Optional.of(new Component[]{
                            Component.translatable("config.magic-conch-shell.enable_pride_features.tooltip")
                    }),
                    false
            ) {
                @Override
                public Component getYesNoText(boolean bool) {
                    prideTexturesEntry.setEditable(bool);
                    prideSplashesEntry.setEditable(bool);
                    return super.getYesNoText(bool);
                }
            };

            prideTexturesEntry.setEditable(MagicConchShell.CONFIG.enable_pride_features);
            prideSplashesEntry.setEditable(MagicConchShell.CONFIG.enable_pride_features);

            general.addEntry(prideFeaturesEntry);
            general.addEntry(prideTexturesEntry);
            general.addEntry(prideSplashesEntry);

            builder.setSavingRunnable(MagicConchShell.CONFIG::save);
            return builder.build();
        };
    }
}