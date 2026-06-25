package com.github.pigsteel.smcm.mixin;

import com.github.pigsteel.smcm.entity.monster.VilerWitch;
import com.github.pigsteel.smcm.registry.smcm$EntityTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.raid.Raider;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Witch.class)
public abstract class WitchTurnsIntoVilerWitchMixin extends Raider {
    private WitchTurnsIntoVilerWitchMixin(EntityType<? extends Raider> type, Level level) {
        super(type, level);
    }

    @Override
    public void thunderHit(final ServerLevel level, final LightningBolt lightningBolt) {
        Witch witch = (Witch) (Object) this;

        if (witch.tickCount <= 10) {
            super.thunderHit(level, lightningBolt);
            return;
        }

        if (level.getDifficulty() != Difficulty.PEACEFUL && witch.getType() == EntityTypes.WITCH) {
            VilerWitch vilerWitch = witch.convertTo(smcm$EntityTypes.VILER_WITCH.get(), ConversionParams.single(witch, false, false), w -> {
                w.finalizeSpawn(level, level.getCurrentDifficultyAt(w.blockPosition()), EntitySpawnReason.CONVERSION, null);
                w.setPersistenceRequired();
            });
            if (vilerWitch  == null) {
                super.thunderHit(level, lightningBolt);
            }
        } else {
            super.thunderHit(level, lightningBolt);
        }
    }
}
