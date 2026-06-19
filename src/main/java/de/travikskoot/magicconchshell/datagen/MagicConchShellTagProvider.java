package de.travikskoot.magicconchshell.datagen;

import de.travikskoot.magicconchshell.item.MagicConchShellItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public MagicConchShellTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        builder(ItemTags.SWORDS)
                .add(
                        keyOf(MagicConchShellItems.SPATULA));

        builder(ItemTags.WOLF_FOOD)
                .add(
                        keyOf(MagicConchShellItems.KRABBY_PATTY),
                        keyOf(MagicConchShellItems.NASTY_PATTY)
                );
    }

    private static net.minecraft.resources.ResourceKey<Item> keyOf(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).orElseThrow();
    }
}