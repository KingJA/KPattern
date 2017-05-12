package com.pattern.structural.bridge.sample;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/8
 * [email]    :     kingjavip@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        new WindowsPlatform(new GameSoftware()).run();
        new WindowsPlatform(new OfficeSoftware()).run();
        new LinuxPlatform(new GameSoftware()).run();
        new WindowsPlatform(new OfficeSoftware()).run();
    }
}
