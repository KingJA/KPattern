package com.pattern.structural.bridge.sample;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/8
 * [email]    :     kingjavip@gmail.com
 */
public class WindowsPlatform extends Platform {
    public WindowsPlatform(Software software) {
        super(software);
    }

    @Override
    public void run() {
        System.out.println("在Windows平台");
        super.run();
    }
}
