package com.pattern.structural.decorator.uml;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/10
 * [email]    :     kingjavip@gmail.com
 */
public abstract class Decorator implements Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operator() {
        component.operator();
    }
}
