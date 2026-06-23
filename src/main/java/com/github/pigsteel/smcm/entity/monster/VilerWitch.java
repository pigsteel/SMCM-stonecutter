package com.github.pigsteel.smcm.entity.monster;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.level.Level;

public class VilerWitch extends Witch {
    public VilerWitch(EntityType<? extends VilerWitch> type, Level level) {
        super(type, level);
    }
}
