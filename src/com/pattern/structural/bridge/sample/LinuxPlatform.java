package com.pattern.structural.bridge.sample;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/8
 * [email]    :     kingjavip@gmail.com
 */
public class LinuxPlatform extends Platform {
    public LinuxPlatform(Software software) {
        super(software);
    }

    @Override
    public void run() {
        System.out.println("在Linux平台");
        super.run();
    }
}
