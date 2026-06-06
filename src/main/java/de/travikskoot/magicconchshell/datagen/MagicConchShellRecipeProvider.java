package de.travikskoot.magicconchshell.datagen;

import de.travikskoot.magicconchshell.MagicConchShell;
import de.travikskoot.magicconchshell.item.MagicConchShellItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
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

                // Magic Conch Shell
                shaped(
                        RecipeCategory.COMBAT, MagicConchShellItems.MAGIC_CONCH_SHELL, 1)
                        .pattern("NNN")
                        .pattern("NSN")
                        .pattern("NNN")
                        .define('S', Items.AMETHYST_SHARD)
                        .define('N', Items.NAUTILUS_SHELL)
                        .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                        .unlockedBy(getHasName(Items.NAUTILUS_SHELL), has(Items.NAUTILUS_SHELL))
                        .save(output);

                // Secret Formular
                shapeless(
                        RecipeCategory.FOOD, MagicConchShellItems.SECRET_FORMULA, 1)
                        .requires(Items.GLASS_BOTTLE)
                        .requires(Items.WRITABLE_BOOK)
                        .unlockedBy(getHasName(Items.WRITABLE_BOOK), has(Items.WRITABLE_BOOK))
                        .save(output);

                // Spatula
                shaped(
                        RecipeCategory.COMBAT, MagicConchShellItems.SPATULA, 1)
                        .pattern("  B")
                        .pattern(" I ")
                        .pattern("I  ")
                        .define('B', Blocks.IRON_BARS)
                        .define('I', Items.STICK)
                        .unlockedBy(getHasName(Blocks.IRON_BARS), has(Blocks.IRON_BARS))
                        .save(output);

                // Krabby Patty from Smoking
                SimpleCookingRecipeBuilder.smoking(
                                Ingredient.of(MagicConchShellItems.NASTY_PATTY),
                                RecipeCategory.FOOD,
                                MagicConchShellItems.KRABBY_PATTY,
                                0.35f,
                                200
                        )
                        .unlockedBy(getHasName(MagicConchShellItems.NASTY_PATTY), has(MagicConchShellItems.NASTY_PATTY))
                        .save(output, Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, "nasty_patty").toString());

                // Krabby Patty from Smelting
                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(MagicConchShellItems.NASTY_PATTY),
                                RecipeCategory.FOOD,
                                CookingBookCategory.FOOD,
                                MagicConchShellItems.KRABBY_PATTY,
                                0.35f,
                                100
                        )
                        .unlockedBy(getHasName(MagicConchShellItems.NASTY_PATTY), has(MagicConchShellItems.NASTY_PATTY))
                        .save(output, Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, "nasty_patty_from_smoking").toString());

                // Krabby Patty from Campfire Cooking
                SimpleCookingRecipeBuilder.campfireCooking(
                                Ingredient.of(MagicConchShellItems.NASTY_PATTY),
                                RecipeCategory.FOOD,
                                MagicConchShellItems.KRABBY_PATTY,
                                0.35f,
                                600
                        )
                        .unlockedBy(getHasName(MagicConchShellItems.NASTY_PATTY), has(MagicConchShellItems.NASTY_PATTY))
                        .save(output, Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, "nasty_patty_from_campfire_cooking").toString());
            }
        };
    }

    @Override
    public String getName() {
        return "Magic Conch Shell Recipes";
    }
}
