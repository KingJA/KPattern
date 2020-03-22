package com.pattern.structural.bridge.uml;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/8
 * [email]    :     kingjavip@gmail.com
 */
public abstract class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operationImpl();
    }
}

