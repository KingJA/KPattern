package com.pattern.structural.adapter.sample;

/**
 * Description：TODO
 * Create Time：2017/5/12 10:30
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class HttpLoader extends Http implements NetLoader {
    @Override
    public void loadNet() {
        super.loadNetByHttp();
    }
}
