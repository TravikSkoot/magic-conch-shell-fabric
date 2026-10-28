package de.travikskoot.magicconchshell.mixin;

import com.google.common.collect.ImmutableMap;
import de.travikskoot.magicconchshell.item.MagicConchShellItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.AdvancementTree;
import net.minecraft.advancements.triggers.ConsumeItemTrigger;
import net.minecraft.advancements.triggers.Criterion;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.server.ServerAdvancementManager;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Mixin(ServerAdvancementManager.class)
public class MagicConchShellServerAdvancementManagerMixin {

    @Shadow
    @Final
    @Mutable
    private Map<Identifier, AdvancementHolder> advancements;

    @Shadow
    @Final
    @Mutable
    private AdvancementTree tree;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void magicconchshell$extendBalancedDiet(HolderLookup.Provider registries, CallbackInfo ci) {
        Identifier balancedDietId = Identifier.fromNamespaceAndPath("minecraft", "husbandry/balanced_diet");
        AdvancementHolder balancedDiet = this.advancements.get(balancedDietId);
        if (balancedDiet == null) {
            return;
        }

        Advancement original = balancedDiet.value();
        Map<String, Criterion<?>> criteria = new LinkedHashMap<>(original.criteria());
        List<List<String>> requirements = new ArrayList<>(original.requirements().requirements());
        HolderGetter<Item> items = registries.lookupOrThrow(Registries.ITEM);

        boolean changed = magicconchshell$addEdibleItem(criteria, requirements, items, "krabby_patty", MagicConchShellItems.KRABBY_PATTY);
        changed |= magicconchshell$addEdibleItem(criteria, requirements, items, "nasty_patty", MagicConchShellItems.NASTY_PATTY);
        if (!changed) {
            return;
        }

        Advancement extended = new Advancement(
                original.parent(),
                original.display(),
                original.rewards(),
                criteria,
                new AdvancementRequirements(requirements),
                original.sendsTelemetryEvent(),
                original.name()
        );

        Map<Identifier, AdvancementHolder> updated = new LinkedHashMap<>(this.advancements);
        updated.put(balancedDietId, new AdvancementHolder(balancedDietId, extended));
        this.advancements = ImmutableMap.copyOf(updated);

        AdvancementTree newTree = new AdvancementTree();
        newTree.addAll(this.advancements.values());
        newTree.repositionNodes();
        this.tree = newTree;
    }

    @Unique
    private static boolean magicconchshell$addEdibleItem(Map<String, Criterion<?>> criteria, List<List<String>> requirements, HolderGetter<Item> items, String name, ItemLike item) {
        if (criteria.containsKey(name)) {
            return false;
        }
        criteria.put(name, ConsumeItemTrigger.TriggerInstance.usedItem(items, item));
        requirements.add(List.of(name));
        return true;
    }
}
