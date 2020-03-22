package com.pattern.structural.bridge.sample;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/8
 * [email]    :     kingjavip@gmail.com
 */
public abstract class Platform {
    private Software software;

    public  Platform(Software software) {
        this.software = software;
    }

    public void run() {
        software.run();
    }
}
