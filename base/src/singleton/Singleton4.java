package singleton;

/**
 * Created by pig on 2019/12/26.
 *
 * 构造器私有化
 * 用静态变量保存该对象
 * 提供一个静态方法，获取该实例对象
 */
public class Singleton4 {
    static Singleton4 instace;

    private Singleton4() {}

    // 静态方法
    public static Singleton4 getInstance() {
        if (instace == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instace = new Singleton4();
        }
        return instace;
    }
}
