package com.pattern.structural.proxy;

/**
 * Description：TODO
 * Create Time：2017/4/7 17:13
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class TicketProxy implements TicketSeller{

    @Override
    public void sellTrainTicket(int a, int b) {
        System.out.println("a="+a+"b="+b);
    }

    @Override
    public void sellCarTicket(String s) {
        System.out.println("s="+s);
    }
}
