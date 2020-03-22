package com.pattern.behavioral.observer;

/**
 * Description:TODO
 * Create Time:2018/10/21 14:48
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class News {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public News(String content) {
        this.content = content;
    }
}
