package com.pattern.behavioral.observer;

/**
 * Description:TODO
 * Create Time:2018/10/21 14:50
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class Test {
    public static void main(String[] args) {
        NewClient newClient = new NewClient();
        Subscriber subscriber1 = new Subscriber("Jack");
        Subscriber subscriber2 = new Subscriber("Tom");
        newClient.addObserver(subscriber1);
        newClient.addObserver(subscriber2);
        newClient.publish(new News("发现火星人了!!!"));
    }
}
