享元模式Flyweight
---

对象复用，它和单例的区别是，单例理论上在内存里只存在一个对象，而享元存在多个对象，只是复用了相似的对象。

### 类图
* Flyweight
接口
* ConcreteFlyweight
Flyweight的具体实现类
* FlyweightFactory
ConcreteFlyweight的工厂类，提供一个已经创建的ConcreteFlyweight或者新建一个ConcreteFlyweight对象。
