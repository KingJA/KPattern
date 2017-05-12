package com.pattern.structural.flyweight.uml;

/**
 * Description：TODO
 * Create Time：2017/5/12 14:01
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight1 = flyweightFactory.getFlyweight("小白");
        Flyweight flyweight2 = flyweightFactory.getFlyweight("小红");
        Flyweight flyweight3 = flyweightFactory.getFlyweight("小白");
        flyweight1.operation();
        flyweight2.operation();
        flyweight3.operation();
        System.out.println(flyweightFactory.getFlyweightSize());

        flyweight1.setState("小强");
        flyweightFactory.getFlyweight("小白").operation();
        Flyweight flyweight4 = flyweightFactory.getFlyweight("小白");
        flyweight4.operation();
    }
}
