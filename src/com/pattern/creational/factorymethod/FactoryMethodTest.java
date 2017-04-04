package com.pattern.creational.factorymethod;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/4/4
 * [email]    :     kingjavip@gmail.com
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        FileManager dataManager = DataFactory.getDataManager(FileManager.class);
        dataManager.save("aaa");
    }
}
