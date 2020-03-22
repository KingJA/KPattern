package com.pattern.structural.proxy.statics;

import com.pattern.structural.proxy.No47;

import java.util.Random;

/**
 * Description:TODO
 * Create Time:2020/3/22 22:15
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class No48 extends No47 {
    @Override
    public void shoot(String targetName) {
        System.out.println("【继承形式代理开始】>>>，审核目标背景");
        super.shoot(targetName);
        System.out.println(String.format("【继承形式结束】>>>，结算杀手报酬$%d\n",100000 +new Random().nextInt(100000)));

    }
}
