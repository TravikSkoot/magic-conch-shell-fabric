package de.travikskoot.magicconchshell.util;

import de.travikskoot.magicconchshell.MagicConchShell;
import de.travikskoot.magicconchshell.item.MagicConchShellItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.advancements.criterion.EntityEquipmentPredicate;
import net.minecraft.advancements.criterion.EntityPredicate;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceWithEnchantedBonusCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class MagicConchShellLootTableProvider {

    private static final ResourceKey<LootTable> CAMEL_HUSK =
            ResourceKey.create(Registries.LOOT_TABLE, Identifier.withDefaultNamespace("entities/camel_husk"));
    private static final ResourceKey<LootTable> DROWNED =
            ResourceKey.create(Registries.LOOT_TABLE, Identifier.withDefaultNamespace("entities/drowned"));
    private static final ResourceKey<LootTable> HUSK =
            ResourceKey.create(Registries.LOOT_TABLE, Identifier.withDefaultNamespace("entities/husk"));
    private static final ResourceKey<LootTable> ZOGLIN =
            ResourceKey.create(Registries.LOOT_TABLE, Identifier.withDefaultNamespace("entities/zoglin"));
    private static final ResourceKey<LootTable> ZOMBIE =
            ResourceKey.create(Registries.LOOT_TABLE, Identifier.withDefaultNamespace("entities/zombie"));
    private static final ResourceKey<LootTable> ZOMBIE_HORSE =
            ResourceKey.create(Registries.LOOT_TABLE, Identifier.withDefaultNamespace("entities/zombie_horse"));
    private static final ResourceKey<LootTable> ZOMBIE_NAUTILUS =
            ResourceKey.create(Registries.LOOT_TABLE, Identifier.withDefaultNamespace("entities/zombie_nautilus"));
    private static final ResourceKey<LootTable> ZOMBIE_VILLAGER =
            ResourceKey.create(Registries.LOOT_TABLE, Identifier.withDefaultNamespace("entities/zombie_villager"));
    private static final ResourceKey<LootTable> ZOMBIFIED_PIGLIN =
            ResourceKey.create(Registries.LOOT_TABLE, Identifier.withDefaultNamespace("entities/zombified_piglin"));

    private static final ResourceKey<LootTable> NAUTILUS =
            ResourceKey.create(Registries.LOOT_TABLE, Identifier.withDefaultNamespace("entities/nautilus"));

    private static final Set<ResourceKey<LootTable>> UNDEAD_LOOT_TABLES = Set.of(
            CAMEL_HUSK,
            DROWNED,
            HUSK,
            ZOGLIN,
            ZOMBIE,
            ZOMBIE_HORSE,
            ZOMBIE_NAUTILUS,
            ZOMBIE_VILLAGER,
            ZOMBIFIED_PIGLIN
            );

    private static final Set<ResourceKey<LootTable>> BONUS_LOOT_TABLES = Set.of(
            BuiltInLootTables.TRAIL_RUINS_ARCHAEOLOGY_RARE,
            BuiltInLootTables.SHIPWRECK_TREASURE,
            BuiltInLootTables.UNDERWATER_RUIN_BIG,
            BuiltInLootTables.UNDERWATER_RUIN_SMALL,
            BuiltInLootTables.FISHING_TREASURE
    );

    private static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (!source.isBuiltin()) {
                return;
            }

            // Buried Treasure
            if (key.equals(BuiltInLootTables.BURIED_TREASURE)) {
                tableBuilder.withPool(
                        LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0F))
                                .add(LootItem.lootTableItem(MagicConchShellItems.MAGIC_CONCH_SHELL))
                );
            }

            // Fishing, Underwater Ruin, Shipwreck, Archeology
            if (BONUS_LOOT_TABLES.contains(key)) {
                tableBuilder.modifyPools(pool -> {
                    pool.add(LootItem.lootTableItem(MagicConchShellItems.MAGIC_CONCH_SHELL));
                });
            }

            // Nautilus
            if (key.equals(NAUTILUS)) {
                tableBuilder.withPool(
                        LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0F))
                                .add(LootItem.lootTableItem(MagicConchShellItems.MAGIC_CONCH_SHELL))
                                .when(LootItemKilledByPlayerCondition.killedByPlayer())
                                .when(
                                        LootItemRandomChanceWithEnchantedBonusCondition.randomChanceAndLootingBoost(
                                                registries,
                                                0.05F,
                                                0.01F
                                        )
                                )
                );
            }

            // Zombie Types
            if (UNDEAD_LOOT_TABLES.contains(key)) {
                tableBuilder.withPool(
                        LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0F))
                                .add(
                                        LootItem.lootTableItem(MagicConchShellItems.NASTY_PATTY)
                                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0F, 2.0F)))
                                )
                                .when(LootItemKilledByPlayerCondition.killedByPlayer())
                                .when(
                                        LootItemEntityPropertyCondition.hasProperties(
                                                LootContext.EntityTarget.ATTACKER,
                                                EntityPredicate.Builder.entity()
                                                        .equipment(
                                                                EntityEquipmentPredicate.Builder.equipment()
                                                                        .mainhand(
                                                                                ItemPredicate.Builder.item()
                                                                                        .of(registries.lookupOrThrow(Registries.ITEM), MagicConchShellItems.SPATULA)
                                                                        )
                                                        )
                                        )
                                )
                );
            }
        });
    }

    public static void registerLootTables() {
        MagicConchShell.LOGGER.info("Registering Loot Tables for " + MagicConchShell.MOD_NAME);
        modifyLootTables();
    }
}