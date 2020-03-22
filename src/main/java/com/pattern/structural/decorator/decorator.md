类图解析
* Component
接口，定义需要实现的方法
* ConcreteComponent
Component具体实现类
* Decorator
实现了Component接口的抽象装饰类类，具体操作让ConcreteComponent实现，
前后可以添加装饰操作预留了抽象方法给具体实现类
* ConcreteDecorator
具体的装饰类，实现了抽象方法

#### 使用场景