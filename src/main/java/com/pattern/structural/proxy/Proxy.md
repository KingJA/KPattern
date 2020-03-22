我尽量用通俗的，生活化的的方式和大家谈谈技术这个事，如果大家看完看懂了，还觉得有点趣，那我就欣慰了



### 代理模式
体现了面向对象的开闭原则，对扩展开放，对修改关闭，编码应该尽量在不修改原有代码的情况下进行扩展
为某个对象提供一种代理以控制这个对象的访问
代表某个真实的对象，对外充当该对象的代理，对对象进行访问时可以自定义自己的逻辑，包括在方法执行前和执行后 

### 代理模式的几种
静态代理
静态代理在使用时,需要定义接口或者父类,被代理对象与代理对象一起实现相同的接口或者是继承相同父类 

好比剧本都写好，故事都得按剧本来，缺点是改起来麻烦，优点是所见即所得
通过继承方式的代理，也可以通过组合代理，由外部传入(构造方法或者set方法)

动态代理
好比即兴表演，上来谁都不知道下一秒会发生什么，简单地说你除非代码运行了，不然你都不知道要代理谁
使用InvocationHandler接口
通过反射动态生成代理对象

### 使用步骤
动态代理
JDK方式
Cglib方式

* JDK动态代理
只能代理实现了接口的类
需要
1.InvocationHandler接口
2.目标对象
3.Proxy类


1.创建类实现InvocationHandler接口
这个方法是控制代理方法，可以在方法执行前后加入自己的逻辑

```java
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
        System.out.println("代理结束>>>");
        return obj;
    }
```

2.创建目标行为接口
3.创建目标行为接口实现类
4.new实现类，并作为InvocationHandler接口实现类的构造方法参数传入。
5.调用Proxy.newProxyInstance方法执行代理方法

```java
/**
*
* @param loader 目标对象使用类加载器
* @param interfaces 目标对象实现的接口的类型
* @param invocationHandler InvocationHandler的实现类
* @return
* @throws Throwable
*/
public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler invocationHandler)
```
* cglib动态代理
不用实现接口，针对类来实现
Cglib代理总结：
1、代理的类不能为final， 否则报错。
2、目标对象的方法如果为final/static, 那么就不会被拦截，即不会执行目标对象额外的业务方法。

### 使用场景
当无法或者不想直接访问某个独享或者访问某个对象有困难时可以通过一个代理对象来间接访问，为了保证客户端使用的透明性，委托对象和代理对象需要实现相同的接口
你可以获得某个对象的实例，可以调用它的某个方法，但是你无法改变这方法，这个时候你就可以
在Spring的AOP编程中:
如果加入容器的目标对象有实现接口,用JDK代理
如果目标对象没有实现接口,用Cglib代理
### TODO
Retrofit的动态代理