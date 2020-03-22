package com.pattern.creational.singleton;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/3/18
 * [email]    :     kingjavip@gmail.com
 */
public class LazySingleton {
    /**
     * 懒汉式单例模式需要考虑多线程问题
     * 实例对象在第一次调用getInstance方法的时候调用，在类加载的时候并不自动实例化，这是延迟加载Lazy Load技术。
     * 即需要的时候加载实例对象，为了避免多个线程同时调用getInstance而导致产生多个对象，需要使用synchronized关键字
     * Doublee-Check Locking 双重检查锁定
     * volatile 关键字修饰的变量保证多个线程都能正确处理
     */
    private volatile static LazySingleton mInstance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        //第一层判断，避免频繁的进行线程锁判断
        if (mInstance == null) {
            //synchronized关键字可线程锁定，保证每次只能一个线程执行
            synchronized (LazySingleton.class) {
                //第二层判断避免产生多个对象，因为这个时候有可能多个线程执行到这步
                if (mInstance == null) {
                    mInstance =new LazySingleton();
                }
            }
        }
        return mInstance;
    }

}
