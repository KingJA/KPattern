package com.pattern.structural.proxy;

import java.lang.reflect.Proxy;

/**
 * Description：TODO
 * Create Time：2017/4/7 17:09
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class ProxyTest {
    public static void main(String[] args) {
        LogInvocationHandler logInvocationHandler = new LogInvocationHandler(new TicketProxy());
        TicketSeller ticketProxy =(TicketSeller) Proxy.newProxyInstance(TicketProxy.class.getClassLoader(), TicketProxy.class.getInterfaces(), logInvocationHandler);
        ticketProxy.sellCarTicket();
        ticketProxy.sellTrainTicket();
    }
}
