## 原型模式
### 特点
克隆的是新的对象在，在内存中
克隆模式和直接赋值的区别是，它和原型是独立的对象，原型的改变不会改变克隆对象，而赋值对象会随着原型的变化而变化。
浅克隆:值类型会复制，引用类型对象的地址复制，也就是值==为false，引用==为true
深克隆:值类型和引用类型对象都会复制，也就是==都返回false
深克隆实现了原型对象和克隆对象的完全独立，对任意克隆对象的修改都不会对其他对象产生影响

Cloneable和Serializable接口都是空接口，也称为标识接口，没有任何方法，其作用是告诉JRE这些接口的实现类是否具有某个功能
，例如是否支持克隆，是否支持序列化等

* 浅克隆
实现浅克隆需要实现Cloneable接口，对外提供公用方法调用，如果没有实现Cloneable接口则会报错。
```java
public Robot clone()  {
        Object object;
        try {
            object=super.clone();
            return (Robot)object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("不支持clone");
            return null;
        }
    }
 ```

 * 深克隆
 不实现Cloneable接口，实现Serializable接口，并对外提供深克隆方法.原型对象里的引用对象实现Serializable接口
 ```java
  public DeepRobot deepClone() throws IOException, ClassNotFoundException {
         ByteArrayOutputStream bao = new ByteArrayOutputStream();
         ObjectOutputStream oos = new ObjectOutputStream(bao);
         oos.writeObject(this);

         ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
         ObjectInputStream ois = new ObjectInputStream(bis);
         return (DeepRobot)ois.readObject();
     }
 ```

### 使用场景
在内存中有新的地址，得到的是相似但不相同的对象
模板对象，提高创建对象的效率，可用原型模式克隆一个对象用于保存原型的状态，以备以后恢复。
创建对象的成本较大，可在已有的原型基础上进行克隆得到对象
保存状态，配合备忘录模式

### 原型管理器
采用单例模式创建一个原型管理类，初始化时候创建一个HashMap，以键值对的形式保存原型，对外提供获取原型的方法。
