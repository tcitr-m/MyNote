import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author by PIG
 * @date 2019/12/24 20:08
 */
class MyData {
    volatile int number = 0; // 共享变量
    public void addTo60() {
        this.number = 60;
    }

    public void addPlus() {
        this.number++; //不加synchronized在多线程是非线程安全的
    }

    AtomicInteger atomicInteger = new AtomicInteger();
    public void addAtomic() {
        atomicInteger.getAndIncrement(); // +1
    }
}

/**
 * 1、验证volatile的可见性
 * 1.1 number 没有添加volatile关键字 number此时没有‘可见性’
 * 1.2 添加了volatile 可以解决可见性
 *
 * 2、验证volatile保证原子性
 *  2.1原子性：不可分割，完整性，即某个线程做某个业务时中间不可被加塞，分割需要完整性
 *      同时成功或同时失败
 *  2.2 解决
 *      使用java.util.concurrent 中的 atomicInteger
 */
public class VolatileDemo {

    public static void main(String[] args) {
//        seeOkVolatile();
        MyData myData = new MyData();
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    myData.addPlus();
                    myData.addAtomic();
                }
            }, String.valueOf(i)).start();
        }

        //等待20个线程全部都计算完成后，再用main线程获取
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() + "\t  finally number " + myData.number);
        System.out.println(Thread.currentThread().getName() + "\t  finally atomicInteger " + myData.atomicInteger);

//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    /**
     * volatile可以保证 可见性，及时通知其他线程，主物理内存的值已经被修改
     */
    private static void seeOkVolatile() {
        MyData myData = new MyData();

        new Thread(() -> {
            // Thread.currentThread().getName() 获取当前线程对象的名称
            System.out.println(Thread.currentThread().getName() + "\t come in");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myData.addTo60();
            System.out.println(Thread.currentThread().getName() + "\t update number value" + myData.number);
        }, "aaa").start();

        // 第二个线程就是main线程
        while (myData.number == 0) {
            // main 线程就一直在这里等待循环，直到number被改变

        }

        System.out.println(Thread.currentThread().getName() + "\t mission is over");
    }
}
