package com.pattern.structural.decorator.uml;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/10
 * [email]    :     kingjavip@gmail.com
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operator() {
        beforeOperator();
        super.operator();
        afterOperator();
    }

    private void beforeOperator() {
        System.out.println("ConcreteDecoratorA beforeOperator");
    }

    private void afterOperator() {
        System.out.println("ConcreteDecoratorA afterOperator");
    }
}
