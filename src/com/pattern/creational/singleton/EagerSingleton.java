package com.pattern.creational.singleton;

/**
 * [Des]      :     饿汉式单例模式
 * [Author]   :     KingJA
 * [Date]     :     2017/4/4
 * [email]    :     kingjavip@gmail.com
 */
public class EagerSingleton {
    /**
     * 类加载的时候就创建了实例对象，不用考虑多线程问题，但是在加载初始就创建对象，加载时间会比较长
     * 饿汉式单例模式不管以后有没有使用，都有在内存中占用资源
     */
    private EagerSingleton(){}
    private static EagerSingleton mInstance=new EagerSingleton();

    public static EagerSingleton getInstance() {
        return mInstance;
    }
}
