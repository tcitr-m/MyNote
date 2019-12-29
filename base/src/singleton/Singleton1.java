package singleton;

/**
 * @author by PIG
 * @date 2019/12/24 21:02
 *
 * 饿汉式：
 *  在类初始化时主动创建
 * 1、构造器私有化
 * 2、自行创建，并用静态变量保存
 * 3、向外提供这个实例
 * 4、强调静态
 *
 *
 */
public class Singleton1 {

    // final 强调静态 public向外暴露
    public static final Singleton1 INSTANCE = new Singleton1();

    // 构造器是private私有的
    private Singleton1() {

    }
}
