package com.pattern.structural.adapter.object_uml;


/**
 * Description：TODO
 * Create Time：2017/5/12 8:54
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
