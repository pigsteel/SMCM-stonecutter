package com.github.pigsteel.smcm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SMCM {

    public static final String MOD_ID = "smcm";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        LOG.info("Initializing {} on {}", MOD_ID, com.github.pigsteel.smcm.Platform.INSTANCE.loader());
    }

}
