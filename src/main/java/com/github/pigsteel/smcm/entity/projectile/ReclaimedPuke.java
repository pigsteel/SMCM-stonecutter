package com.github.pigsteel.smcm.entity.projectile;

import com.github.pigsteel.smcm.entity.monster.zombie.Reclaimed;
import com.github.pigsteel.smcm.registry.smcm$EntityTypes;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;

public class ReclaimedPuke extends Projectile {

    public ReclaimedPuke(final EntityType<? extends ReclaimedPuke> type, final Level level) {
        super(type, level);
    }

    public ReclaimedPuke spawnPuke(final Level level, final Reclaimed owner) { // i have no fucking clue why i can't make this a constructor without java freaking out in registries
        var p = new ReclaimedPuke(smcm$EntityTypes.RECLAIMED_PUKE.get(), level);
        this.setOwner(owner);
        return p;
    }

    protected void defineSynchedData(SynchedEntityData.Builder entityData) {
    }

    public void tick() {
        super.tick();
        if (this.level() != null && this.level().isClientSide()) {
            //this.level().addParticle(smcm$EntityType.RECLAIMED_PUKE_PARTICLE.get(), this.getX(), this.getY(), this.getZ(), 0.0, 0.0, 0.0);
        }
    }
}
