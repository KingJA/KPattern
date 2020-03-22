## 抽象方法模式

### 特点
如果要增加新的产品很简单，只需要实现产品接口即可，符合开闭原则
如果要增加产品接口则要修改接口，并逐一修改接口的子类，这个是抽象方法模式最大的缺点，违反了开闭原则


### 使用场景
系统里有多个产品族，而每次只用其中一个，可以通过配置文件来动态改变产品族
Android 系统的主题样式可以尝试用抽象方法模式。
在设计的时候产品结构尽量保持稳定，后期的添加修改将非常麻烦