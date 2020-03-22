package com.pattern.structural.bridge.uml;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/8
 * [email]    :     kingjavip@gmail.com
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        super.operation();
    }
}
