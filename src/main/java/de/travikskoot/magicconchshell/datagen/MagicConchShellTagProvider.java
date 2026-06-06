package de.travikskoot.magicconchshell.datagen;

import de.travikskoot.magicconchshell.item.MagicConchShellItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public MagicConchShellTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .add(MagicConchShellItems.SPATULA);

        valueLookupBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .add(MagicConchShellItems.SPATULA);

        valueLookupBuilder(ItemTags.FIRE_ASPECT_ENCHANTABLE)
                .add(MagicConchShellItems.SPATULA);

        valueLookupBuilder(ItemTags.SWEEPING_ENCHANTABLE)
                .add(MagicConchShellItems.SPATULA);

        valueLookupBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(MagicConchShellItems.SPATULA);

        valueLookupBuilder(ItemTags.VANISHING_ENCHANTABLE)
                .add(MagicConchShellItems.SPATULA);
    }
}