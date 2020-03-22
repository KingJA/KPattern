package com.pattern.structural.proxy;

import com.pattern.structural.proxy.dynamic.cglib.CglibProxy;
import com.pattern.structural.proxy.dynamic.jdk.LogInvocationHandler;
import com.pattern.structural.proxy.statics.No48;
import com.pattern.structural.proxy.statics.StaticsProxy;

/**
 * Description：TODO
 * Create Time：2017/4/7 17:09
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class ProxyTest {
    public static void main(String[] args) {

        /*静态代理-接口组合形式*/

        //1.创建目标对象
        No47 no47 = new No47();
        //2.创建代理对象
        StaticsProxy staticsProxy = new StaticsProxy(no47);
        //3.通过代理类进行操作
        staticsProxy.shoot("蝙蝠侠");

        /*静态代理-继承形式*/
        No48 no48 = new No48();
        no48.shoot("蜘蛛侠");

        /*动态代理-jdk形式*/
        LogInvocationHandler logInvocationHandler = new LogInvocationHandler(no47);
//        TicketSeller killer =(TicketSeller) Proxy.newProxyInstance(TicketProxy.class.getClassLoader(), TicketProxy.class.getInterfaces(), logInvocationHandler);
        IKiller killer = (IKiller) logInvocationHandler.bind();
        killer.shoot("超人");

        /*动态代理-jcglib形式*/
        No47 no471Proxy = (No47) new CglibProxy(no47).getProxyInstance();
        no471Proxy.shoot("雷神");

    }
}
