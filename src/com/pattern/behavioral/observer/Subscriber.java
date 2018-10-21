package com.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Description:TODO
 * Create Time:2018/10/21 14:49
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class Subscriber implements Observer {
    private String userName;

    public Subscriber(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof NewClient) {
            News news= (News) arg;
            System.out.println(getUserName()+"收到一条新闻："+news.getContent());
        }
    }
}
