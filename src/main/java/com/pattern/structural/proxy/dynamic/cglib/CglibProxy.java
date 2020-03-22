package com.pattern.structural.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * Description:TODO
 * Create Time:2020/3/22 22:20
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class CglibProxy implements MethodInterceptor {
    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance(){
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("【Cglib动态代理开始】>>>，审核目标背景");
        // 这里如果使用 method.invoke方法，就等同于走了反射机制去调用方法，性能不高,而且还需要另外维护实际类实例
//        Object obj = method.invoke(target, objects);
        Object obj = methodProxy.invokeSuper(o,objects);
        System.out.println(String.format("【Cglib动态代理结束】>>>，结算杀手报酬$%d\n",100000 +new Random().nextInt(100000)));
        return obj;
    }
}
