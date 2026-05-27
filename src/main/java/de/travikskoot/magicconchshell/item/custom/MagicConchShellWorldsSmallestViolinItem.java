package de.travikskoot.magicconchshell.item.custom;

import de.travikskoot.magicconchshell.sound.MagicConchShellSounds;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.level.Level;

public class MagicConchShellWorldsSmallestViolinItem extends Item {
    public MagicConchShellWorldsSmallestViolinItem(Properties properties) {
        super(properties);
    }

    public static final int MAX_USE_TIME = 180;
    public static final int COOLDOWN = 9;

    @Override
    public InteractionResult use(Level Level, Player player, InteractionHand hand) {
            ItemStack stack = player.getItemInHand(hand);
            player.getItemInHand(hand);
            Level.playSound(
                    null,
                    player.getX(),
                    player.getY(),
                    player.getZ(),
                    MagicConchShellSounds.WORLDS_SMALLEST_VIOLIN,
                    SoundSource.PLAYERS,
                    16.0f,
                    1.0f
            );

            player.awardStat(Stats.ITEM_USED.get(this));

        return InteractionResult.SUCCESS;
    }

    public int getMaxUseTime(ItemStack stack, Player user) {
        return MAX_USE_TIME;
    }

    public ItemUseAnimation getUseAction(ItemStack stack) {
        return ItemUseAnimation.TOOT_HORN;
    }
}
