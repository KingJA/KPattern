### 代理模式

### 使用步骤

* JDK动态代理
1.创建类实现InvocationHandler接口

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

2.创建接口
3.创建接口实现类
4.创建实现类，并作为InvocationHandler接口实现类的构造方法参数传入。
5.调用Proxy.newProxyInstance方法

```java
/
* @param   loader the class loader to define the proxy class
     * @param   interfaces the list of interfaces for the proxy class
     *          to implement
     * @param   h the invocation handler to dispatch method invocations to
     * @return  a proxy instance with the specified invocation handler of a
     *          proxy class that is defined by the specified class loader
     */          and that implements the specified interfaces
public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
```

### 使用场景
