package com.npucraft.npuconstruction.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(BlockEntity.class)
public class BlockEntityMixin {
    /**
     * @author SUPER2FH
     * @reason change block entity (eg.clockhand) render distance
     */
    @Environment(EnvType.CLIENT)
    @Overwrite
    public double getRenderDistance() {
        return 128.0D;
    }
}

