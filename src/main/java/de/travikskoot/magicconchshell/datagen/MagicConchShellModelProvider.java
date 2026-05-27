package de.travikskoot.magicconchshell.datagen;

import de.travikskoot.magicconchshell.MagicConchShell;
import de.travikskoot.magicconchshell.item.MagicConchShellItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class MagicConchShellModelProvider extends FabricModelProvider {
    public MagicConchShellModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(MagicConchShellItems.MAGIC_CONCH_SHELL, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(MagicConchShellItems.KRABBY_PATTY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(MagicConchShellItems.NASTY_PATTY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(MagicConchShellItems.SECRET_FORMULA, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(MagicConchShellItems.SPATULA, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(MagicConchShellItems.WORLDS_SMALLEST_VIOLIN, ModelTemplates.FLAT_ITEM);
    }
}
