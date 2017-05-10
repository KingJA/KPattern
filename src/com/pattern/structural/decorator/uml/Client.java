package com.pattern.structural.decorator.uml;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/10
 * [email]    :     kingjavip@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        Component component=new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(component);
        concreteDecoratorA.operator();
        concreteDecoratorB.operator();
    }
}
