package com.pattern.structural.bridge.uml;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/8
 * [email]    :     kingjavip@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        new RefinedAbstraction(new ConcreteImplementorA()).operation();
        new RefinedAbstraction(new ConcreteImplementorB()).operation();
    }
}
