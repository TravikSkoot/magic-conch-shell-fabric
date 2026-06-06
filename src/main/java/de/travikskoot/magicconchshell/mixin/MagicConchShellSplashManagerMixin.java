package de.travikskoot.magicconchshell.mixin;

import de.travikskoot.magicconchshell.MagicConchShell;
import net.minecraft.client.gui.components.SplashRenderer;
import net.minecraft.client.resources.SplashManager;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.RandomSource;
import net.minecraft.util.SpecialDates;
import net.minecraft.util.profiling.ProfilerFiller;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Mixin(SplashManager.class)
public class MagicConchShellSplashManagerMixin {

    @Shadow
    @Final
    @Mutable
    private List<Component> splashes;

    @Unique
    private static final RandomSource MAGICCONCHSHELL$RANDOM = RandomSource.create();

    @Unique
    private static final Style MAGICCONCHSHELL$DEFAULT_SPLASH_STYLE = Style.EMPTY.withColor(-256);

    @Unique
    private static final Identifier MAGICCONCHSHELL$SPLASHES_LOCATION =
            Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, "texts/splashes.txt");

    @Unique
    private static final Identifier MAGICCONCHSHELL$PRIDE_SPLASHES_LOCATION =
            Identifier.fromNamespaceAndPath(MagicConchShell.MOD_ID, "texts/pride_splashes.txt");

    @Unique
    private List<Component> magicconchshell$prideSplashes = List.of();

    @Unique
    private static Component magicconchshell$literalSplash(String text) {
        return Component.literal(text).setStyle(MAGICCONCHSHELL$DEFAULT_SPLASH_STYLE);
    }

    @Unique
    private static List<Component> magicconchshell$loadSplashFile(ResourceManager manager, Identifier location) {
        List<Component> loadedSplashes = new ArrayList<>();

        try {
            Resource resource = manager.getResourceOrThrow(location);

            try (BufferedReader reader = resource.openAsReader()) {
                reader.lines()
                        .map(String::trim)
                        .filter(line -> !line.isEmpty())
                        .filter(line -> !line.startsWith("#"))
                        .map(MagicConchShellSplashManagerMixin::magicconchshell$literalSplash)
                        .forEach(loadedSplashes::add);
            }
        } catch (IOException ignored) {
        }

        return List.copyOf(loadedSplashes);
    }

    @Inject(method = "apply", at = @At("TAIL"))
    private void magicconchshell$appendCustomSplashes(List<Component> preparations,
                                                      ResourceManager manager,
                                                      ProfilerFiller profiler,
                                                      CallbackInfo ci) {
        List<Component> mutableSplashes = new ArrayList<>(this.splashes);
        mutableSplashes.addAll(magicconchshell$loadSplashFile(manager, MAGICCONCHSHELL$SPLASHES_LOCATION));
        this.splashes = List.copyOf(mutableSplashes);

        this.magicconchshell$prideSplashes =
                magicconchshell$loadSplashFile(manager, MAGICCONCHSHELL$PRIDE_SPLASHES_LOCATION);
    }

    @Inject(method = "getSplash", at = @At("HEAD"), cancellable = true)
    private void magicconchshell$addPrideMonthSplash(CallbackInfoReturnable<SplashRenderer> cir) {
        if (!MagicConchShell.CONFIG.enable_pride_features || !MagicConchShell.CONFIG.enable_pride_splashes) {
            return;
        }
        if (SpecialDates.dayNow().getMonth() == Month.JUNE && !this.magicconchshell$prideSplashes.isEmpty()) {
            Component splash = this.magicconchshell$prideSplashes.get(
                    MAGICCONCHSHELL$RANDOM.nextInt(this.magicconchshell$prideSplashes.size())
            );
            cir.setReturnValue(new SplashRenderer(splash));
        }
    }
}