/**
 * Created by pig on 2019/12/28.
 */
public class SingletonDemo {

    // 只加synchronized不能保证第一个if的指令顺序，所以要用volatile禁止指令重排
    private static volatile SingletonDemo instance = null;

    private SingletonDemo() {
        System.out.println(Thread.currentThread().getName() + "构造器方法");
    }

    /**
     * DCL (double check lock 双端检锁机制)
     * base.src.singleton.Singleton5
     */
    public static SingletonDemo getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
//        System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
//        System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
//        System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());

        for (int i = 0; i < 10; i++) {
            new Thread(SingletonDemo::getInstance, String.valueOf(i)).start();
        }
    }
}
