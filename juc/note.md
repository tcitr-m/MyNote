java.util.concurrent
==
**并发与并行的区别**  
并发是并行的超集，并行一定是同时进行，并发是有可能再用一时间发生
### [volatile](src/VolatileDemo.java)
    是java虚拟机提供的轻量级的同步机制
+ 可见性
+ 不保证原子性  
    使用atomic解决原子性问题
+ 禁止指令重排  
    从而避免多线程下程序乱序执行的现象
### 可见性
    JMM（java memory model: java内存模型）
    1、线程枷锁前，必须把共享变量的值刷新回主内存
    
    工作内存是每个线程的私有数据区域，java的内存模型规定所有变量都存储在主内存，
    所有线程都能访问，但线程的操作必须在工作内存中进行，操作完，在写回主内存。
    线程间通信必须通过主内存所有工作内存中的变量都是拷贝副本。
    
##### JMM  
    1. 可见性
    2. 原子性
    3. 有序性
#### [CAS](src/CAS/CASDemo.java)
    initialValue, expectedValue, newValue
    Compare-And-Swap 比较内存中的值并交换
    
    为什么用CAS而不是synchronized
    synchronized：悲观锁
        并发性下降
    CAS：乐观锁
        循环时间长开销大
        只能保证一个共享变量的原子性
        导致自旋 加大cpu的消耗
---
#### [并发线程安全](src/ArrayListTest.java)
1. Vector() 加锁 线程安全性能下降
2. Collections.synchronizedList()
3. CopOnWriteArrayList()
