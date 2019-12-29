package singleton;

/**
 * Created by pig on 2019/12/26.
 *
 *  在内部类被加载和初始化时，才创建INSTANCE
 *  静态内部类不会自动随着外部类的初始化和加载而初始化，他是要单独去初始化和加载
 *  是线程安全的
 */
public class Singleton6 {


    private Singleton6() {}

    private static class Inner{
        private static Singleton6 instace;
    }

    public static Singleton6 getInstance() {
        return Inner.instace;
    }
}
