package com.pattern.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

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

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理开始>>>");
        Object obj = method.invoke(target, args);
        System.out.println("代理结束>>>");
        return obj;
    }
}
