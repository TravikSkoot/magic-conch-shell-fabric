package de.travikskoot.magicconchshell.datagen;

import de.travikskoot.magicconchshell.MagicConchShell;
import de.travikskoot.magicconchshell.item.MagicConchShellItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.criterion.ConsumeItemTrigger;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class MagicConchShellAdvancementProvider extends FabricAdvancementProvider {
    public MagicConchShellAdvancementProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateAdvancement(HolderLookup.Provider registryLookup, Consumer<AdvancementHolder> consumer) {
        AdvancementHolder root = Advancement.Builder.advancement()
                .display(
                        MagicConchShellItems.MAGIC_CONCH_SHELL,
                        Component.translatable("advancements.magic-conch-shell.root.title"),
                        Component.translatable("advancements.magic-conch-shell.root.description"),
                        Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, "gui/advancements/backgrounds/magic_conch_shell"),
                        AdvancementType.TASK ,
                        false,
                        false,
                        false
                )
                .addCriterion("got_magic_conch_shell", InventoryChangeTrigger.TriggerInstance.hasItems(MagicConchShellItems.MAGIC_CONCH_SHELL))
                .save(consumer, Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, "root"));

        AdvancementHolder getSpatula = Advancement.Builder.advancement()
                .parent(root)
                .display(
                        MagicConchShellItems.SPATULA,
                        Component.translatable("advancements.magic-conch-shell.get_spatula.title"),
                        Component.translatable("advancements.magic-conch-shell.get_spatula.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("got_spatula", InventoryChangeTrigger.TriggerInstance.hasItems(MagicConchShellItems.SPATULA))
                .save(consumer, Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, "get_spatula"));

        AdvancementHolder getWorldsSmallestViolin = Advancement.Builder.advancement()
                .parent(root)
                .display(
                        MagicConchShellItems.WORLDS_SMALLEST_VIOLIN,
                        Component.translatable("advancements.magic-conch-shell.get_worlds_smallest_violin.title"),
                        Component.translatable("advancements.magic-conch-shell.get_worlds_smallest_violin.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        true
                )
                .addCriterion("got_worlds_smallest_violin", InventoryChangeTrigger.TriggerInstance.hasItems(MagicConchShellItems.WORLDS_SMALLEST_VIOLIN))
                .save(consumer, Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, "get_worlds_smallest_violin"));

        AdvancementHolder getSecretFormula = Advancement.Builder.advancement()
                .parent(root)
                .display(
                        MagicConchShellItems.SECRET_FORMULA,
                        Component.translatable("advancements.magic-conch-shell.get_secret_formula.title"),
                        Component.translatable("advancements.magic-conch-shell.get_secret_formula.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        true
                )
                .addCriterion("got_secret_formula", InventoryChangeTrigger.TriggerInstance.hasItems(MagicConchShellItems.SECRET_FORMULA))
                .save(consumer, Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, "get_secret_formula"));

        AdvancementHolder eatKrabbyPatty = Advancement.Builder.advancement()
                .parent(getSecretFormula)
                .display(
                        MagicConchShellItems.KRABBY_PATTY,
                        Component.translatable("advancements.magic-conch-shell.eat_krabby_patty.title"),
                        Component.translatable("advancements.magic-conch-shell.eat_krabby_patty.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("ate_krabby_patty", ConsumeItemTrigger.TriggerInstance.usedItem(registryLookup.lookupOrThrow(Registries.ITEM), MagicConchShellItems.KRABBY_PATTY))
                .save(consumer, Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, "eat_krabby_patty"));

        AdvancementHolder eatNastyPatty = Advancement.Builder.advancement()
                .parent(getSpatula)
                .display(
                        MagicConchShellItems.NASTY_PATTY,
                        Component.translatable("advancements.magic-conch-shell.eat_nasty_patty.title"),
                        Component.translatable("advancements.magic-conch-shell.eat_nasty_patty.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("ate_nasty_patty", ConsumeItemTrigger.TriggerInstance.usedItem(registryLookup.lookupOrThrow(Registries.ITEM), MagicConchShellItems.NASTY_PATTY))
                .save(consumer, Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, "eat_nasty_patty"));
    }
}
