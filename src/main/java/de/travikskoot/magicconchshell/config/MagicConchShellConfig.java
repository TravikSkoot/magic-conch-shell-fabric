package de.travikskoot.magicconchshell.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import de.travikskoot.magicconchshell.MagicConchShell;
import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class MagicConchShellConfig {
    private static final File FILE = new File(FabricLoader.getInstance().getConfigDir().toFile(), "magicconchshell.json");
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Type MAP_TYPE = new TypeToken<Map<String, String>>() {}.getType();

    private static final Set<String> SUPPORTED_CONFIG_LANGUAGES = Set.of(
            "de_de",
            "ksh",
            "lol_us",
            "en_pt"
    );

    private static final String FALLBACK_LANGUAGE = "en_us";

    public String config_language = "en_us";
    public boolean enable_pride_features = true;
    public boolean enable_pride_textures = true;
    public boolean enable_pride_splashes = true;

    public static MagicConchShellConfig load() {
        MagicConchShellConfig config = new MagicConchShellConfig();

        if (FILE.exists()) {
            try (FileReader reader = new FileReader(FILE)) {
                JsonObject json = GSON.fromJson(reader, JsonObject.class);

                if (json != null) {
                    if (json.has("config_language")) {
                        config.config_language = normalizeConfigLanguage(json.get("config_language").getAsString());
                    }

                    if (json.has("enable_pride_features")) {
                        config.enable_pride_features = json.get("enable_pride_features").getAsBoolean();
                    }

                    if (json.has("enable_pride_textures")) {
                        config.enable_pride_textures = json.get("enable_pride_textures").getAsBoolean();
                    }

                    if (json.has("enable_pride_splashes")) {
                        config.enable_pride_splashes = json.get("enable_pride_splashes").getAsBoolean();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        config.config_language = normalizeConfigLanguage(config.config_language);
        config.save();
        return config;
    }

    public void save() {
        this.config_language = normalizeConfigLanguage(this.config_language);

        EnvType envType = FabricLoader.getInstance().getEnvironmentType();
        Map<String, String> lang = loadLang(this.config_language);

        try (FileWriter writer = new FileWriter(FILE)) {
            writer.write("{\n");

            if (envType == EnvType.SERVER) {
                writer.write("  // " + escapeComment(getTranslation(lang, "config.magic-conch-shell.config_language")) + "\n");
                writer.write("  \"config_language\": \"" + escapeJson(this.config_language) + "\",\n");
            }

            writer.write("  // " + escapeComment(getTranslation(lang, "config.magic-conch-shell.enable_pride_features.tooltip")) + "\n");
            writer.write("  \"enable_pride_features\": " + this.enable_pride_features + ",\n");

            writer.write("  // " + escapeComment(getTranslation(lang, "config.magic-conch-shell.enable_pride_textures.tooltip")) + "\n");
            writer.write("  \"enable_pride_textures\": " + this.enable_pride_textures);

            if (envType == EnvType.CLIENT) {
                writer.write(",\n");
                writer.write("  // " + escapeComment(getTranslation(lang, "config.magic-conch-shell.enable_pride_splashes.tooltip")) + "\n");
                writer.write("  \"enable_pride_splashes\": " + this.enable_pride_splashes + "\n");
            } else {
                writer.write("\n");
            }

            writer.write("}\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String normalizeConfigLanguage(String language) {
        if (language == null || language.isBlank()) {
            return FALLBACK_LANGUAGE;
        }

        String normalized = language.toLowerCase();
        return SUPPORTED_CONFIG_LANGUAGES.contains(normalized) ? normalized : FALLBACK_LANGUAGE;
    }

    private static Map<String, String> loadLang(String languageCode) {
        String path = "/assets/magic-conch-shell/lang/" + languageCode + ".json";

        try (InputStream stream = MagicConchShellConfig.class.getResourceAsStream(path)) {
            if (stream == null) {
                return loadFallbackLang();
            }

            try (InputStreamReader reader = new InputStreamReader(stream, StandardCharsets.UTF_8)) {
                Map<String, String> map = GSON.fromJson(reader, MAP_TYPE);
                return map != null ? map : Collections.emptyMap();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return loadFallbackLang();
        }
    }

    private static Map<String, String> loadFallbackLang() {
        String path = "/assets/magic-conch-shell/lang/" + FALLBACK_LANGUAGE + ".json";

        try (InputStream stream = MagicConchShellConfig.class.getResourceAsStream(path)) {
            if (stream == null) {
                return Collections.emptyMap();
            }

            try (InputStreamReader reader = new InputStreamReader(stream, StandardCharsets.UTF_8)) {
                Map<String, String> map = GSON.fromJson(reader, MAP_TYPE);
                return map != null ? map : Collections.emptyMap();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyMap();
        }
    }

    private static String getTranslation(Map<String, String> lang, String key) {
        return lang.getOrDefault(key, key);
    }

    private static String escapeComment(String text) {
        return text
                .replace("\r", " ")
                .replace("\n", " ")
                .replace("*/", "* /");
    }

    private static String escapeJson(String text) {
        return text
                .replace("\\", "\\\\")
                .replace("\"", "\\\"");
    }

    public static void registerConfig() {
        MagicConchShell.LOGGER.info("Registering Config for " + MagicConchShell.MOD_NAME);
    }
}