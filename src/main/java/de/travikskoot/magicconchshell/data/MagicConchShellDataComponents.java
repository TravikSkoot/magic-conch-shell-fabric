package de.travikskoot.magicconchshell.data;

import de.travikskoot.magicconchshell.MagicConchShell;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

import static com.mojang.serialization.Codec.BOOL;

public class MagicConchShellDataComponents {

    public static final DataComponentType<Boolean> PRIDE_ENABLED = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, "pride_enabled"),
            DataComponentType.<Boolean>builder().persistent(BOOL).build()
    );

    public static void registerDataComponents() {
        MagicConchShell.LOGGER.info("Registering Data Components for " + MagicConchShell.MOD_NAME);
    }
}
