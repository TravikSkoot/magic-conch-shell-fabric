package de.travikskoot.magicconchshell.item.custom;

import de.travikskoot.magicconchshell.sound.MagicConchShellSounds;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;

public class MagicConchShellWorldsSmallestViolinItem extends Item {
    public MagicConchShellWorldsSmallestViolinItem(Properties properties) {
        super(properties);
    }

    public static final int MAX_USE_TIME = 100;
    public static final int COOLDOWN = 100;

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        player.startUsingItem(hand);

        level.playSound(
                player,
                player,
                MagicConchShellSounds.WORLDS_SMALLEST_VIOLIN,
                SoundSource.RECORDS,
                2.0f,
                2.0f
        );

        level.gameEvent(GameEvent.INSTRUMENT_PLAY, player.position(), GameEvent.Context.of(player));

        player.getCooldowns().addCooldown(stack, COOLDOWN);
        player.awardStat(Stats.ITEM_USED.get(this));

        return InteractionResult.CONSUME;
    }

    @Override
    public int getUseDuration(ItemStack stack, LivingEntity entity) {
        return MAX_USE_TIME;
    }

    @Override
    public ItemUseAnimation getUseAnimation(ItemStack stack) {
        return ItemUseAnimation.TOOT_HORN;
    }
}
