package com.pattern.creational.singleton;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/3/18
 * [email]    :     kingjavip@gmail.com
 */
public class SingleTon {
    private static SingleTon mSingleTon;

    private SingleTon() {

    }

    public static SingleTon getInstance() {
        if (mSingleTon == null) {
            synchronized (SingleTon.class) {
                if (mSingleTon == null) {
                    mSingleTon=new SingleTon();
                }
            }
        }
        return mSingleTon;
    }

}
