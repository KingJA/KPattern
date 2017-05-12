package com.pattern.structural.adapter.class_uml;

/**
 * Description：TODO
 * Create Time：2017/5/12 8:51
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.specificRequest();
    }
}
