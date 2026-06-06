package de.travikskoot.magicconchshell.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MagicConchShellConfig {
    private static final File FILE = new File(FabricLoader.getInstance().getConfigDir().toFile(), "magicconchshell.json");
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public boolean enable_pride_features = true;
    public boolean enable_pride_textures = true;
    public boolean enable_pride_splashes = true;

    public static MagicConchShellConfig load() {
        if (FILE.exists()) {
            try (FileReader reader = new FileReader(FILE)) {
                MagicConchShellConfig config = GSON.fromJson(reader, MagicConchShellConfig.class);
                if (config == null) {
                    config = new MagicConchShellConfig();
                }
                config.save();
                return config;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        MagicConchShellConfig config = new MagicConchShellConfig();
        config.save();
        return config;
    }

    public void save() {
        try (FileWriter writer = new FileWriter(FILE)) {
            GSON.toJson(this, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}