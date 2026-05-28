package de.travikskoot.magicconchshell.datagen;

import de.travikskoot.magicconchshell.item.MagicConchShellItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class MagicConchShellRecipeProvider extends FabricRecipeProvider {
    public MagicConchShellRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup  = registries.lookupOrThrow(Registries.ITEM);

                shapeless(RecipeCategory.FOOD, MagicConchShellItems.SECRET_FORMULA, 1)
                        .requires(Items.GLASS_BOTTLE)
                        .requires(Items.WRITABLE_BOOK)
                        .unlockedBy(getHasName(Items.WRITABLE_BOOK), has(Items.WRITABLE_BOOK))
                        .save(output);

                shaped(RecipeCategory.COMBAT, MagicConchShellItems.SPATULA, 1)
                        .pattern("  B")
                        .pattern(" I ")
                        .pattern("I  ")
                        .define('B', Blocks.IRON_BARS)
                        .define('I', Items.STICK)
                        .group("magic_conch_shell")
                        .unlockedBy(getHasName(Blocks.IRON_BARS), has(Blocks.IRON_BARS))
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "MagicConchRecipeProvider";
    }
}
