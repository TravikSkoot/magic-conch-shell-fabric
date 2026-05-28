package de.travikskoot.magicconchshell.util;

import de.travikskoot.magicconchshell.MagicConchShell;
import de.travikskoot.magicconchshell.item.MagicConchShellItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;

public class MagicConchShellLootTableProvider {
    public static void registerLootTables() {
        MagicConchShell.LOGGER.debug("Registering Loot Tables for " + MagicConchShell.MOD_NAME);

        modifyLootTables();
    }

    private static final Identifier BURIED_TREASURE = Identifier.fromNamespaceAndPath("minecraft", "chests/buried_treasure");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (source.isBuiltin() && BURIED_TREASURE.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        //.rolls(ConstantLootNumberProvider.create(1.0F))
                        .add(LootItem.lootTableItem(MagicConchShellItems.MAGIC_CONCH_SHELL));
                        //.add(LootItem.lootTableItem(Items.AIR).setWeight(19));
                        //.conditionally(KilledByPlayerLootCondition.builder());

                tableBuilder.withPool(poolBuilder);
            }
        });
    }
}
