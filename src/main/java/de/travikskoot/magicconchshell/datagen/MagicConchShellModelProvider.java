package de.travikskoot.magicconchshell.datagen;

import de.travikskoot.magicconchshell.data.MagicConchShellDataComponents;
import de.travikskoot.magicconchshell.item.MagicConchShellItems;
import de.travikskoot.magicconchshell.util.MagicConchShellCustomItemModelGenerator;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.renderer.item.properties.conditional.HasComponent;
import net.minecraft.resources.Identifier;

public class MagicConchShellModelProvider extends FabricModelProvider {
    public MagicConchShellModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateBooleanDispatch(
                MagicConchShellItems.MAGIC_CONCH_SHELL,
                new HasComponent(MagicConchShellDataComponents.PRIDE_ENABLED, true),
                ItemModelUtils.plainModel(itemModelGenerators.createFlatItemModel(
                        MagicConchShellItems.MAGIC_CONCH_SHELL,
                        "_pride",
                        ModelTemplates.FLAT_ITEM
                )),
                ItemModelUtils.plainModel(itemModelGenerators.createFlatItemModel(
                        MagicConchShellItems.MAGIC_CONCH_SHELL,
                        ModelTemplates.FLAT_ITEM
                ))
        );

        itemModelGenerators.generateFlatItem(MagicConchShellItems.KRABBY_PATTY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(MagicConchShellItems.NASTY_PATTY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(MagicConchShellItems.SECRET_FORMULA, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(MagicConchShellItems.SPATULA, ModelTemplates.FLAT_HANDHELD_ITEM);

        Identifier violinModel = MagicConchShellCustomItemModelGenerator.createViolinModel(
                MagicConchShellItems.WORLDS_SMALLEST_VIOLIN,
                itemModelGenerators
        );

        Identifier violinPlayingModel = MagicConchShellCustomItemModelGenerator.createViolinPlayingModel(
                MagicConchShellItems.WORLDS_SMALLEST_VIOLIN,
                itemModelGenerators
        );

        itemModelGenerators.generateBooleanDispatch(
                MagicConchShellItems.WORLDS_SMALLEST_VIOLIN,
                ItemModelUtils.isUsingItem(),
                ItemModelUtils.plainModel(violinPlayingModel),
                ItemModelUtils.plainModel(violinModel)
        );
    }
}