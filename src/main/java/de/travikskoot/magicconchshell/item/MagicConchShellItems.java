package de.travikskoot.magicconchshell.item;

import de.travikskoot.magicconchshell.MagicConchShell;
import de.travikskoot.magicconchshell.item.custom.MagicConchShellItem;
import de.travikskoot.magicconchshell.item.custom.MagicConchShellWorldsSmallestViolinItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import java.util.List;
import java.util.function.Function;

import static net.minecraft.world.item.component.Consumables.defaultFood;

public class MagicConchShellItems {

    public static final Item MAGIC_CONCH_SHELL = registerItem("magic_conch_shell",
            properties -> new MagicConchShellItem(properties
                    .rarity(Rarity.EPIC)
                    .stacksTo(1)
                    .useCooldown(1.0F)
                    .durability(250)
            ));
    public static final Item KRABBY_PATTY = registerItem("krabby_patty",
            properties -> new Item(properties
                    .food((new FoodProperties.Builder())
                            .nutrition(10)
                            .saturationModifier(1.0F)
                            .build())
            ));
    public static final Item NASTY_PATTY = registerItem("nasty_patty",
            properties -> new Item(properties
                    .food(((new FoodProperties.Builder())
                            .nutrition(4)
                            .saturationModifier(0.1F)
                            .build()),

                            defaultFood()
                            .onConsume(
                                    new ApplyStatusEffectsConsumeEffect(
                                            List.of(
                                                    new MobEffectInstance(MobEffects.POISON, 1200, 1), new MobEffectInstance(MobEffects.HUNGER, 300, 2), new MobEffectInstance(MobEffects.NAUSEA, 300, 0)
                                            )
                                    )
                            )
                    .build())
            ));
    public static final Item SPATULA = registerItem("spatula",
            properties -> new Item(properties
                    .rarity(Rarity.RARE)
                    .sword(ToolMaterial.IRON, 3.0F, -2.4F)
            ));
    public static final Item WORLDS_SMALLEST_VIOLIN = registerItem("worlds_smallest_violin",
            properties -> new MagicConchShellWorldsSmallestViolinItem(properties
                    .rarity(Rarity.RARE)
                    .stacksTo(1)
            ));
    public static final Item SECRET_FORMULA = registerItem("secret_formula",
            properties -> new Item(properties
                    .rarity(Rarity.RARE)
            ));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, name)))));
    }

    public static void registerMagicConchShellItems() {
        MagicConchShell.LOGGER.info("Registering Items for " + MagicConchShell.MOD_NAME);
    }
}
