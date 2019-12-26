/**
 * Created by pig on 2019/12/26.
 *
 * 构造器私有化
 * 用静态变量保存该对象
 * 提供一个静态方法，获取该实例对象
 */
public class Singleton5 {
    static Singleton5 instace;

    private Singleton5() {}

    // 静态方法
    public static Singleton5 getInstance() {
        if (instace == null) {
            // 加锁 达到线程安全
            synchronized (Singleton5.class) {
                if (instace == null) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instace = new Singleton5();
                }
            }
        }
        return instace;
    }
}
