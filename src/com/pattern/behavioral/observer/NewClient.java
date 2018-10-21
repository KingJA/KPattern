package com.pattern.behavioral.observer;

import java.util.Observable;

/**
 * Description:TODO
 * Create Time:2018/10/21 10:01
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class NewClient extends Observable {

    public void publish(News news) {
        setChanged();
        notifyObservers(news);
    }
}
