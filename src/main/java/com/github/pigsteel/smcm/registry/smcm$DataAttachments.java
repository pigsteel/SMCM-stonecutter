package com.github.pigsteel.smcm.registry;

import com.github.pigsteel.smcm.SMCM;
//? fabric {
import com.github.pigsteel.smcm.entity.monster.skeleton.SunkenVariant;
import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry;
import net.fabricmc.fabric.api.attachment.v1.AttachmentSyncPredicate;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
//?}

import net.minecraft.core.Holder;
import net.minecraft.network.codec.ByteBufCodecs;

public class smcm$DataAttachments {

    //? fabric {
    public static final AttachmentType<Boolean> DATA_FROSTBITTEN_CONVERSION_ID = AttachmentRegistry.create(
            SMCM.id("data_frostbitten_conversion_id"),
            builder -> builder
                    .initializer(() -> false)
                    .syncWith(
                            ByteBufCodecs.BOOL,
                            AttachmentSyncPredicate.all()
                    )
    );

    public static final AttachmentType<Holder<SunkenVariant>> SUNKEN_VARIANT = AttachmentRegistry.create(
            SMCM.id("sunken_variant"),
            builder -> builder
                    .persistent(SunkenVariant.CODEC)
                    .syncWith(
                            SunkenVariant.STREAM_CODEC,
                            AttachmentSyncPredicate.all()
                    )
    );
    //?}

    //? neoforge {

    //?}

    private smcm$DataAttachments() {
    }

    public static void load() {}
}
