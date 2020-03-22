package com.pattern.structural.proxy.statics;

import com.pattern.structural.proxy.IKiller;

import java.util.Random;

/**
 * 静态代理：代理对象和目标对象需要实现实现同样的接口
 */

public class StaticsProxy implements IKiller {
    private IKiller killer;

    public StaticsProxy(IKiller killer) {
        this.killer = killer;
    }

    @Override
    public void shoot(String targetName) {
        System.out.println("【静态代理开始】>>>，审核目标背景");
        killer.shoot(targetName);
        System.out.println(String.format("【静态代理结束】>>>，结算杀手报酬$%d\n",100000 +new Random().nextInt(100000)));

    }
}
