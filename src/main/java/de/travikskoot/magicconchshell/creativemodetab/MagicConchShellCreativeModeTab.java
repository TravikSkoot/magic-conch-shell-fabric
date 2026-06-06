package de.travikskoot.magicconchshell.creativemodetab;

import de.travikskoot.magicconchshell.MagicConchShell;
import de.travikskoot.magicconchshell.data.MagicConchShellDataComponents;
import de.travikskoot.magicconchshell.item.MagicConchShellItems;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;

public class MagicConchShellCreativeModeTab {

    public static final CreativeModeTab MAGIC_CONCH_SHELL_CREATIVE_MODE_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, "magic_conch_shell"),
            FabricCreativeModeTab.builder()
                    .icon(MagicConchShellCreativeModeTab::createMagicConchShellStack)
                    .title(Component.translatable("itemGroup.magic-conch-shell.magic_conch_shell"))
                    .displayItems((parameters, output) -> {
                        output.accept(createMagicConchShellStack());
                        output.accept(MagicConchShellItems.SPATULA);
                        output.accept(MagicConchShellItems.WORLDS_SMALLEST_VIOLIN);
                        output.accept(MagicConchShellItems.SECRET_FORMULA);
                        output.accept(MagicConchShellItems.KRABBY_PATTY);
                        output.accept(MagicConchShellItems.NASTY_PATTY);
                    })
                    .build()
    );

    public static void registerMagicConchShellCreativeModeTab() {
        MagicConchShell.LOGGER.info("Registering Item Group for " + MagicConchShell.MOD_NAME);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> {
            output.accept(MagicConchShellItems.SECRET_FORMULA);
            output.accept(MagicConchShellItems.KRABBY_PATTY);
            output.accept(MagicConchShellItems.NASTY_PATTY);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(output -> {
            output.accept(MagicConchShellItems.MAGIC_CONCH_SHELL);
            output.accept(MagicConchShellItems.SPATULA);
            output.accept(MagicConchShellItems.WORLDS_SMALLEST_VIOLIN);
        });

    }

    private static ItemStack createMagicConchShellStack() {
        ItemStack stack = new ItemStack(MagicConchShellItems.MAGIC_CONCH_SHELL);

        if (MagicConchShell.shouldUsePrideTextures()) {
            stack.set(MagicConchShellDataComponents.PRIDE_ENABLED, true);
        }

        return stack;
    }
}