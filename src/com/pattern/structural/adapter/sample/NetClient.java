package com.pattern.structural.adapter.sample;

/**
 * Description：TODO
 * Create Time：2017/5/12 10:31
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class NetClient {
    private NetLoader netLoader;

    public NetClient() {
    }

    public void setNetClient(NetLoader netLoader) {
        this.netLoader = netLoader;
    }

    public void loadNet() {
        netLoader.loadNet();
    }
}
