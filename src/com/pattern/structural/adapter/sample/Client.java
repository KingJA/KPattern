package com.pattern.structural.adapter.sample;

/**
 * Description：TODO
 * Create Time：2017/5/12 10:21
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        NetLoader netLoader = new HttpLoader();
        NetClient netClient = new NetClient();
        netClient.setNetClient(netLoader);
        netClient.loadNet();
    }
}
