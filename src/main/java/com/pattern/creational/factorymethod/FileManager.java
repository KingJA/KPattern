package com.pattern.creational.factorymethod;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/4/4
 * [email]    :     kingjavip@gmail.com
 */
public class FileManager implements DataManager {
    @Override
    public void save(String data) {
        System.out.println("FileManager:  "+data);
    }
}
