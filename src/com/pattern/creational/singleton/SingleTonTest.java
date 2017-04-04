package com.pattern.creational.singleton;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/3/18
 * [email]    :     kingjavip@gmail.com
 */
public class SingleTonTest {
    public static void main(String[] args) {
        System.out.println("LazySingleton: "+LazySingleton.getInstance().hashCode());
        System.out.println("LazySingleton: "+LazySingleton.getInstance().hashCode());
        System.out.println("EagerSingleton: "+EagerSingleton.getInstance().hashCode());
        System.out.println("EagerSingleton: "+EagerSingleton.getInstance().hashCode());
        System.out.println("InnerClassSingleton: "+InnerClassSingleton.getInstance().hashCode());
        System.out.println("InnerClassSingleton: "+InnerClassSingleton.getInstance().hashCode());
    }
}
