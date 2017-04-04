package com.pattern.creational.singleton;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/3/18
 * [email]    :     kingjavip@gmail.com
 */
public class SingleTonTest {
    public static void main(String[] args) {
        System.out.println(SingleTon.getInstance().hashCode());
        System.out.println(SingleTon.getInstance().hashCode());
    }
}
