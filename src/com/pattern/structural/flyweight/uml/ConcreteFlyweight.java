package com.pattern.structural.flyweight.uml;

/**
 * Description：TODO
 * Create Time：2017/5/12 14:02
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class ConcreteFlyweight implements Flyweight {
    private String extrinsicState;

    public ConcreteFlyweight(String extrinsicState) {
        this.extrinsicState = extrinsicState;
    }

    @Override
    public void operation() {
        System.out.println("operation:"+extrinsicState);
    }
}
