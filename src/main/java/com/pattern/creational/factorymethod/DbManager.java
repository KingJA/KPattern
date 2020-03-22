package com.pattern.creational.factorymethod;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/4/4
 * [email]    :     kingjavip@gmail.com
 */
public class DbManager implements DataManager {
    @Override
    public void save(String data) {
        System.out.println("DbManager:  "+data);
    }
}
