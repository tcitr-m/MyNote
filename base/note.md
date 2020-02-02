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
> Collection和Collections什么区别
```
Collection是集合接口,Collections是一个包装类,包含一些集合操作的静态方法
├List  
│   ├LinkedList
│   ├ArrayList
│   └Vector
│       └Stack
└Set 
```
##### List
    - ArrayList
    - LinkedList

    arrayList是基于动态数组， 通过下标操作元素
    linkedList基于实现链表，通过指针操作元素
    get、set时arrayList效率优于linkedList
    add、delete时linkedList由于arrayList
    如果是列表的头尾，则效率差不多
#### Map
```
HashMap和HashTable 
HashMap是HashTable的轻量级实现,HashMap允许null key和null value,
HashTable是线程安全的,HashMap是非安全的,因此HashMap效率更高,
```
#### 一个字符占多少个字节 int, long, double占多少字节
|  类型  | 字节  |
| :---: | :---: |
|boolean | 1 |
|byte |1|
|char |2|
|int |4|
|float |4|
|long |8|
|double |8|
#### 创建类的实例的几种方法
    · 关键字 new。工厂模式是对这种方式的包装
    · 类实现克隆接口，克隆一个实例。原型模式是一个应用实例
    · 用该类的加载器，newinstance。java的反射 Spring的依赖注入、切面编程中动态代理
    · 实现序列化接口的类，通过IO流反序列化读取一个类，获得实例
#### final/finally/finalize的区别
    final 用于声明属性、方法和类，分别表示属性不可变、方法不可覆盖、类不可继承
    finally 作为异常处理的一部分，只能在try/catch语句中用，并附带一个语句块表示这段语句最终一定被执行，经常用来释放或关闭资源
    finalize Object中的一个方法，在垃圾回收器执行时被调用
#### Cookie 与 Session 的区别
    Cookie是存储在客户端，Session存储在服务端
    Cookie不安全，可以通过本地修改，不可跨域名，最大长度4k，一个网址最多保存20个cookie
    Session存储在服务器上，会占用服务器性能
#### String,StringBuffer, StringBuilder 的区别是什么？String为什么是不可变的
    String是字符串常量。Stringbuilder和StringBuffer是字符串变量，String创建的字符不可变
    每次改变String都会自常量池中创建出一个新的对象，而StringBuffer怎是对常量池中的对象进行修改
    StringBuffer是线程安全的，Sting和StringBullder是不安全的;StringBuffer和StringBuiler原理和操作相同，
    尽在多线程方面不同，单线程中StringBuilder比StringBuffer性能高
```
@Test
public void test(){
    String a = "a";
    a = a + "b";
    String ab = a;
    System.out.println("a: " +  a); // a: ab
    a = "ab";
    System.out.println("ab: " + ab); // ab: ab
    System.out.println(a == ab); // false
}
@Test
public void stringBufferTest(){
    StringBuffer sb = new StringBuffer("a");
    sb.append("b");
    StringBuffer ab = sb;
    sb.replace(0, sb.length(), "ab");
    System.out.println("sb: " + sb); // sb: ab
    System.out.println("ab: " + ab); // ab: ab
    System.out.println(sb == ab); // true
}
```
#### Servlet的生命周期
加载servlet,创建servlet实例
1. init() 进行初始化
    > 只会创建一次,
2. service() 处理客户端的请求。
    >是执行实际任务的主要方法, Servlet容器（即web服务器）调用service()方法来处理客户端的请求,
    并把格式化的响应返回个客户端. 
    服务器每次接收到一个Servlet请求就会产生一个新的线程并调用服务  
    常用的方法有: doGet(), doPost(), doPut(), doDelete()
3. destroy() 服务被关闭,Servlet周期结束时被调用 销毁过程
4. 最后Servlet有JVM的垃圾回收器进行垃圾回收

#### get post区别
> get 路径传参，隐私性差，参数大小受限制
>
> post 传参分为 parameter和body data，\
>一个是以key-value的形式放在请求路径中，一个是放在body中

#### java分配一段连续的1G内存,需要注意什么
`ByteBuffer.allocateDirect(1024*1024*1024)`
> 注意对内存造成的**内存溢出(OOM)**

#### java有内存回收机制,为什么还回内存泄露
>没有释放对象引用造成的
```java
class MyList{
    /* 
     * 此处只为掩饰效果，并没有进行封装之类的操作
     * 将List集合用关键字 static 声明，这时这个集合将不属于任MyList 对象，而是一个类成员变量
     */  
    public static List<String> list = new ArrayList<String>();
}  
  
class Demo{  
    public static void main(String[] args) {  
        MyList list = new MyList();  
        list.list.add("123456");  
        // 此时即便我们将 list指向null，仍然存在内存泄漏，因为MyList中的list是静态的，它属于类所有而不属于任何特定的实例  
        list = null;  
    }  
} 
```
#### 什么时序列化,如何实现序列化
>就是将对象的内容流化处理成二进制,  
实现序列化需要实现Serializable

#### request.getParameter和request.getAttribute的区别
> 1.赋值方式不同parameter是客户端发给服务端的,attribute是服务端就收之后存进去的
> 2.parameter返回值是字符串,attribute返回的是对象
>
#### tomcat有几种部署方式
> 三种:
>+ 直接部署在webapps文件夹下,在server.xml文件配置相关属性即可
>+ 项目放到任意文件夹中,通过`con/server.xml`文件
```xml
<Context path="/网站名" docBase="所在路径"/>
```
>+ 在`conf/Catalina/localhost`文件夹中创建一个xml文件,文件名即为网站名称  
```xml
<?xml version="1.0" encoding="UTF-8"?> 
<Context 
    docBase="D:\web1" 
    reloadable="true"> 
</Context> 
```

#### forward(转发)和redirect(重定向) 区别
| |转发|重定向|
|:---|:----|----|
|发生位置| 发生在服务器| 发生在浏览器|
|地质变化| 浏览器地址不变|地址栏地址改变|
|范围|只能访问当前web服务下的资源|可以访问任何资源|
|传递的数据类型|可以传递任何数据类型，包括对象|重定向只可以是字符|
|发生时间|执行到转跳语句会立即转跳|整个页面执行完之后才执行|

#### cookie、session和token
> http是无状态性的，每次请求都是无关联的，session由服务器创建并存储在服务端，拥有唯一标识sessionId，给客户端发送一个响应，  
> 响应头中包含set-cookie(其中包含sessionId),如果客户端发送第二次请求时，发现有set-cookie，就会在请求头中添加cookie  
> cookie只是实现session的一种方案，一般都是`cookie + session`同时使用  
> token由`uid + time + sign[+固定参数]`
> + uid：用户唯一标识
> + time：当前时间戳
> + sign：签名，加密算法
> 用户登录时由服务器创建，通过响应返回给客户端，客户端每次请求时把token放在请求头中，服务端采用filter校验
> cookie+session不适合分布式或集群
> jwt(json web token)是一种跨域认证方式

| |cookie|session|token|
|---|---|---|---|
| |存储在客户端，有浏览器自动添加|存储在服务端|存储在客户端，需要手动添加|

#### servlet安全性
> servlet是单例的,应注意共享变量的多线程安全问题,加锁或者使用线程安全的类

#### Thread的 run() 和start()
> start()方法启动一个线程,线程处于就绪状态,  
> run()方法被称为线程体,包含线程要运行的内容,  
> run()方法运行结束,则线程终止,start()方法重复调用,  
> 每次使用不用等待run()方法执行完毕,即可继续执行之后的代码,即创建了一个新的线程
> run()方法可以被重复调用,如果直接调用run()方法,则程序中只有主线程,  
> 其程序按顺序执行,需等待run()方法体中的方法执行完毕后才可执行下面的代码
>
>start是开启一个新的线程,run只是一个普通的方法调用
