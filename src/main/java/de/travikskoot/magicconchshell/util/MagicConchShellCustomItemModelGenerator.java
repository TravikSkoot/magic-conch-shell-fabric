package de.travikskoot.magicconchshell.util;

import de.travikskoot.magicconchshell.MagicConchShell;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

import java.util.Optional;

public class MagicConchShellCustomItemModelGenerator {
    public static final ModelTemplate WORLDS_SMALLEST_VIOLIN_TEMPLATE =
            item("worlds_smallest_violin_parent", TextureSlot.LAYER0);

    public static final ModelTemplate WORLDS_SMALLEST_VIOLIN_PLAYING_TEMPLATE =
            item("worlds_smallest_violin_playing_parent", TextureSlot.LAYER0);

    public static Identifier createViolinModel(Item item, ItemModelGenerators generator) {
        return WORLDS_SMALLEST_VIOLIN_TEMPLATE.create(
                ModelLocationUtils.getModelLocation(item),
                TextureMapping.singleSlot(
                        TextureSlot.LAYER0,
                        new Material(ModelLocationUtils.getModelLocation(item))
                ),
                generator.modelOutput
        );
    }

    public static Identifier createViolinPlayingModel(Item item, ItemModelGenerators generator) {
        return WORLDS_SMALLEST_VIOLIN_PLAYING_TEMPLATE.create(
                ModelLocationUtils.getModelLocation(item, "_playing"),
                TextureMapping.singleSlot(
                        TextureSlot.LAYER0,
                        new Material(ModelLocationUtils.getModelLocation(item, "_playing"))
                ),
                generator.modelOutput
        );
    }

    private static ModelTemplate item(String parent, TextureSlot requiredTextureKey) {
        return new ModelTemplate(
                Optional.of(Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, "item/" + parent)),
                Optional.empty(),
                requiredTextureKey
        );
    }
}