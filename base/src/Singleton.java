/**
 * @author by PIG
 * @date 2019/12/24 21:02
 *
 * 单例模式
 * 懒汉式：
 *  延迟创建实例对象
 *  构造器私有化
 *  用一个静态变量保存这个唯一的实例
 *  提供一个静态方法，获取这个实例对象
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
