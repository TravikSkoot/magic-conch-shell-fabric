package de.travikskoot.magicconchshell.datagen;

import de.travikskoot.magicconchshell.item.MagicConchShellItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
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

                // World's Smallest Violin
                shaped(
                        RecipeCategory.TOOLS, MagicConchShellItems.WORLDS_SMALLEST_VIOLIN, 1)
                        .pattern("I  ")
                        .pattern(" SP")
                        .pattern(" PN")
                        .define('I', Items.STICK)
                        .define('N', Items.NAUTILUS_SHELL)
                        .define('P', ItemTags.PLANKS)
                        .define('S', Items.STRING)
                        .unlockedBy(getHasName(Items.NAUTILUS_SHELL), has(Items.NAUTILUS_SHELL))
                        .save(output);

                // Secret Formular
                shapeless(
                        RecipeCategory.FOOD, MagicConchShellItems.SECRET_FORMULA, 1)
                        .requires(Items.GLASS_BOTTLE)
                        .requires(Items.PAPER)
                        .unlockedBy(getHasName(Items.KELP), has(Items.KELP))
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

                // Krabby Patty
                shapeless(
                        RecipeCategory.FOOD, MagicConchShellItems.KRABBY_PATTY, 1)
                        .requires(MagicConchShellItems.NASTY_PATTY)
                        .requires(MagicConchShellItems.SECRET_FORMULA)
                        .unlockedBy(getHasName(MagicConchShellItems.SECRET_FORMULA), has(MagicConchShellItems.SECRET_FORMULA))
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "Magic Conch Shell Recipes";
    }
}
