基础
==
### singleton 单例模式
    单个唯一的实例
+ 某个类只能由一个实例
    * 构造器私有化
+ 必须自行创建这个实例
    * 含有一个**静态变量**保存这个唯一的实例
+ 必须自行向整个系统提供这个实例
    * 对外提供获取该实例对象的方法
        * 直接暴露
        * 用静态变量的get方法获取
    
+ 饿汉式: 直接创建对象，不存在线程安全问题
    + [直接实例化](src/singleton/Singleton1.java)
    + [枚举式](src/singleton/Singleton2.java)
    + [静态代码块](src/singleton/Singleton3.java)
+ 懒汉式：延迟创建对象
    + [线程不安全（适用于单线程）](src/singleton/Singleton4.java)
    + [线程安全（适用于多线程）](src/singleton/Singleton5.java)
    + [静态内部类型（适用于多线程）](src/singleton/Singleton6.java)
### [类初始化和类实例化](src/initAndInstantiate/Son.java)
    父类静态 静态方法、静态代码块 按照代码顺序执行
    ↓
    子类静态
    ↓
    父类方法调用、代码快、构造器
    ↓
    子类方法调用、代码快、构造器        

- 类初始化过程  
    main方法所在的类需要先加载和初始化  
    子类初始化先初始化父类  
    一个类初始化就是执行\<clinit>\()方法
- 实例初始化过程

- 方法重写
    - 不被重写：final方法，静态方法，private等子类不可见方法
    - 多态：  
        - 子类重写父类的方法，通过子类调用的一定是子类重写过的方法
        - 非静态默认调用的对象是this
#### 方法的参数传递机制
    基本数据类型 数据值
    引用数据类型 地址值

#### 递归 recursive
```java

```

#### 局部变量和成员变量

#### Collection类
##### List
    - ArrayList
    - LinkedList

    arrayList是基于动态数组， 通过下标操作元素
    linkedList基于实现链表，通过指针操作元素
    get、set时arrayList效率优于linkedList
    add、delete时linkedList由于arrayList
    如果是列表的头尾，则效率差不多
        
    

