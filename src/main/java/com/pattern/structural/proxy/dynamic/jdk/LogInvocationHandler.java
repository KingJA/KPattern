package com.pattern.structural.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * Description：TODO
 * Create Time：2017/4/7 17:10
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class LogInvocationHandler implements InvocationHandler {
    private Object target;

    public LogInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 代理类的对象
     * @param method 代理类的方法
     * @param args 代理方法的参数数组
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("【动态代理开始】>>>，审核目标背景");
        Object obj = method.invoke(target, args);
        System.out.println(String.format("【动态代理结束】>>>，结算杀手报酬$%d\n",100000 +new Random().nextInt(100000)));
        return obj;
    }

    public Object bind() {
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(), this);
    }
}
