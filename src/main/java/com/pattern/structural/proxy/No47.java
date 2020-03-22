package com.pattern.structural.proxy;

/**
 * Description：TODO
 * Create Time：2017/4/7 17:13
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class No47 implements IKiller {
    @Override
    public void shoot(String targetName) {
        System.out.println(String.format("%s执行杀手任务，目标：%s", getClass().getSimpleName(), targetName));
    }
}
