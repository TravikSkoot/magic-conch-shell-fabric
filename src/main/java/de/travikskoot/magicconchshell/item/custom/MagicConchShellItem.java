package de.travikskoot.magicconchshell.item.custom;

import de.travikskoot.magicconchshell.sound.MagicConchShellSounds;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
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

import java.util.Random;

public class MagicConchShellItem extends Item {

    private static final Random RANDOM = new Random();
    private static final int TOTAL_ANSWERS = 11;
    private static final int DRUM_ROLL_DURATION = 20;
    private static final String DRUM_ROLL_TEXT = "???????????";

    public MagicConchShellItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        player.startUsingItem(hand);
        return InteractionResult.SUCCESS;
    }

    @Override
    public int getUseDuration(ItemStack stack, LivingEntity entity) {
        return DRUM_ROLL_DURATION;
    }

    @Override
    public ItemUseAnimation getUseAnimation(ItemStack stack) {
        return ItemUseAnimation.BOW;
    }

    @Override
    public void onUseTick(Level level, LivingEntity livingEntity, ItemStack stack, int remainingUseDuration) {
        if (level.isClientSide() || !(livingEntity instanceof Player player)) {
            return;
        }

        Component questionText = Component.translatable("message.magic-conch-shell.magic-conch-shell_says")
                .withStyle(ChatFormatting.LIGHT_PURPLE);

        Component obfuscatedAnswerText = Component.literal(DRUM_ROLL_TEXT)
                .withStyle(ChatFormatting.AQUA, ChatFormatting.OBFUSCATED);

        Component drumRollMessage = Component.empty()
                .append(questionText)
                .append(Component.literal(" "))
                .append(obfuscatedAnswerText);

        player.sendOverlayMessage(drumRollMessage);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        if (!level.isClientSide() && livingEntity instanceof Player player) {
            int answerIndex = RANDOM.nextInt(TOTAL_ANSWERS);

            Component questionText = Component.translatable("message.magic-conch-shell.magic-conch-shell_says")
                    .withStyle(ChatFormatting.LIGHT_PURPLE);

            Component answerText = Component.translatable("message.magic-conch-shell.response." + answerIndex)
                    .withStyle(ChatFormatting.AQUA);

            Component finalMessage = Component.empty()
                    .append(questionText)
                    .append(Component.literal(" "))
                    .append(answerText);

            player.sendOverlayMessage(finalMessage);

            level.playSound(
                    null,
                    player.getX(),
                    player.getY(),
                    player.getZ(),
                    MagicConchShellSounds.MAGIC_CONCH_SHELL_SOUND,
                    SoundSource.PLAYERS,
                    1.0f,
                    1.0f
            );

            player.awardStat(Stats.ITEM_USED.get(this));

        }

        return stack;
    }
}
