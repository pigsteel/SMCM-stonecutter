package com.github.pigsteel.smcm.entity;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.util.ByIdMap;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.Pose;

import java.util.function.IntFunction;

// Extension of pose
public enum smcm$Pose implements StringRepresentable {
    STANDING(0, "standing"),
    FALL_FLYING(1, "fall_flying"),
    SLEEPING(2, "sleeping"),
    SWIMMING(3, "swimming"),
    SPIN_ATTACK(4, "spin_attack"),
    CROUCHING(5, "crouching"),
    LONG_JUMPING(6, "long_jumping"),
    DYING(7, "dying"),
    CROAKING(8, "croaking"),
    USING_TONGUE(9, "using_tongue"),
    SITTING(10, "sitting"),
    ROARING(11, "roaring"),
    SNIFFING(12, "sniffing"),
    EMERGING(13, "emerging"),
    DIGGING(14, "digging"),
    SLIDING(15, "sliding"),
    SHOOTING(16, "shooting"),
    INHALING(17, "inhaling"),
    SUMMONING(18, "summoning");

    public static final IntFunction<smcm$Pose> BY_ID = ByIdMap.continuous(smcm$Pose::id, values(), ByIdMap.OutOfBoundsStrategy.ZERO);
    public static final Codec<smcm$Pose> CODEC = StringRepresentable.fromEnum(smcm$Pose::values);
    public static final StreamCodec<ByteBuf, smcm$Pose> STREAM_CODEC = ByteBufCodecs.idMapper(BY_ID, smcm$Pose::id);
    private final int id;
    private final String name;

    smcm$Pose(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public int id() {
        return this.id;
    }

    public static smcm$Pose fromPose(final Pose pose) {
        return switch (pose) {
            case STANDING -> STANDING;
            case FALL_FLYING -> FALL_FLYING;
            case SLEEPING -> SLEEPING;
            case SWIMMING -> SWIMMING;
            case SPIN_ATTACK -> SPIN_ATTACK;
            case CROUCHING -> CROUCHING;
            case LONG_JUMPING -> LONG_JUMPING;
            case DYING -> DYING;
            case CROAKING -> CROAKING;
            case USING_TONGUE -> USING_TONGUE;
            case SITTING -> SITTING;
            case ROARING -> ROARING;
            case SNIFFING -> SNIFFING;
            case EMERGING -> EMERGING;
            case DIGGING -> DIGGING;
            case SLIDING -> SLIDING;
            case SHOOTING -> SHOOTING;
            case INHALING -> INHALING;
        };
    }

    public Pose toPose() {
        return switch(this) {
            case STANDING -> Pose.STANDING;
            case FALL_FLYING -> Pose.FALL_FLYING;
            case SLEEPING -> Pose.SLEEPING;
            case SWIMMING -> Pose.SWIMMING;
            case SPIN_ATTACK -> Pose.SPIN_ATTACK;
            case CROUCHING -> Pose.CROUCHING;
            case LONG_JUMPING -> Pose.LONG_JUMPING;
            case DYING -> Pose.DYING;
            case CROAKING -> Pose.CROAKING;
            case USING_TONGUE -> Pose.USING_TONGUE;
            case SITTING -> Pose.SITTING;
            case ROARING -> Pose.ROARING;
            case SNIFFING -> Pose.SNIFFING;
            case EMERGING -> Pose.EMERGING;
            case DIGGING -> Pose.DIGGING;
            case SLIDING -> Pose.SLIDING;
            case SHOOTING -> Pose.SHOOTING;
            case INHALING -> Pose.INHALING;
            default -> Pose.STANDING;
        };
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }
}
