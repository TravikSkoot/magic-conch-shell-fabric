package de.travikskoot.magicconchshell.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.level.Level;

import java.util.Random;

public class MagicConchShellItem extends Item {
    public MagicConchShellItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        int totalAnswers = 11;
        int answerIndex = new Random().nextInt(totalAnswers);

        Component questionText = Component.translatable("message.magic-conch-shell.magic-conch-shell_says")
                .withStyle(ChatFormatting.LIGHT_PURPLE);

        Component answerText = Component.translatable("message.magic-conch-shell.response." + answerIndex)
                .withStyle(ChatFormatting.AQUA);

        Component finalMessage = Component.empty()
                .append(questionText)
                .append(Component.literal(" "))
                .append(answerText);

        player.sendOverlayMessage(finalMessage);

        player.awardStat(Stats.ITEM_USED.get(this));
        player.getItemInHand(hand);
        //TODO: drum roll effect with obfuscated text

        level.playSound(
                null,
                player.getX(),
                player.getY(),
                player.getZ(),
                SoundEvents.AMETHYST_BLOCK_HIT,
                SoundSource.PLAYERS,
                1.0f,
                1.0f);
        return InteractionResult.SUCCESS;
    }
}
