package li.cil.scannable.client.audio;

import li.cil.scannable.api.API;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import javax.annotation.Nullable;

@Environment(EnvType.CLIENT)
public final class SoundManager {
    private static final SoundEvent SCANNER_CHARGE = new SoundEvent(new ResourceLocation(API.MOD_ID, "scanner_charge"));
    private static final SoundEvent SCANNER_ACTIVATE = new SoundEvent(new ResourceLocation(API.MOD_ID, "scanner_activate"));

    @Nullable
    private static SimpleSoundInstance currentChargingSound;

    public static void playChargingSound() {
        currentChargingSound = SimpleSoundInstance.forUI(SCANNER_CHARGE, 1);
        Minecraft.getInstance().getSoundManager().play(currentChargingSound);
    }

    public static void stopChargingSound() {
        if (currentChargingSound != null) {
            Minecraft.getInstance().getSoundManager().stop(currentChargingSound);
            currentChargingSound = null;
        }
    }

    public static void playActivateSound() {
        Minecraft.getInstance().getSoundManager().play(SimpleSoundInstance.forUI(SCANNER_ACTIVATE, 1));
    }
}
