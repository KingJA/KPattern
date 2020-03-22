package com.pattern.structural.adapter.class_uml;

/**
 * Description：TODO
 * Create Time：2017/5/12 8:51
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        Target target=new Adapter();
        target.request();
    }
}
