package com.pattern.creational.singleton;

/**
 * [Des]      :     内部类单例模式
 * [Author]   :     KingJA
 * [Date]     :     2017/4/4
 * [email]    :     kingjavip@gmail.com
 */
public class InnerClassSingleton {
    /**
     * IoDH克服了懒汉式和饿汉式单例模式的缺点。既可以实现延迟加载，又可以保证线程安全，缺点是与编程语言本身该特性相关，
     * 很多面向对象语言不支持IoDH。
     */
    private InnerClassSingleton() {
    }

    private static class InnerClass {
        private final static InnerClassSingleton mInstance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return InnerClass.mInstance;

    }
}
