package com.pattern.structural.proxy;

/**
 * Description：TODO
 * Create Time：2017/4/7 17:13
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class TicketProxy implements TicketSeller{
    @Override
    public void sellTrainTicket() {
        System.out.println("销售火车票");
    }

    @Override
    public void sellCarTicket() {
        System.out.println("销售汽车票");
    }
}
