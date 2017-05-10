package com.pattern.structural.decorator.uml;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/10
 * [email]    :     kingjavip@gmail.com
 */
public class ConcreteComponent implements Component {
    @Override
    public void operator() {
        System.out.println("ConcreteComponent");
    }
}
