package com.pattern.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

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
        System.out.println("代理开始>>>");
        Object obj = method.invoke(target, args);
        if (args!=null&&args.length > 0) {
            for (Object arg : args) {
                System.out.println(method.getName()+"方法参数:"+arg);
            }
        }

        System.out.println("代理结束>>>");
        return obj;
    }

    public Object bind() {
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(), this);
    }
}
