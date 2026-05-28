package de.travikskoot.magicconchshell.sound;

import de.travikskoot.magicconchshell.MagicConchShell;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

public class MagicConchShellSounds {
    public static void registerSounds() {
        MagicConchShell.LOGGER.info("Registering Sounds for " + MagicConchShell.MOD_NAME);
    }
    public static final SoundEvent WORLDS_SMALLEST_VIOLIN = registerSound("worlds_smallest_violin");
    public static final SoundEvent MAGIC_CONCH_SHELL_SOUND = registerSound("magic_conch_shell_sound");

    private static SoundEvent registerSound(String id) {
        Identifier identifier = Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, id);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, identifier, SoundEvent.createVariableRangeEvent(identifier));
    }

}
