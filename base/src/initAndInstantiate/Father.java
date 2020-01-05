package initAndInstantiate;

/**
 * Created by pig on 2019/12/28.
 * 父类的初始化
 * (1) j = method()
 * (2) 静态代码块
 * 实例初始化
 * 方法调用
 * 代码块
 * 构造器
 */
public class Father {

    private int i = test();
    private static int j = method();

    static {
        System.out.print("(1)");
    }

    Father(){
        System.out.print("(2)");
    }

    {
        System.out.print("(3)");
    }

    // 被子类重写
    public int test() {
        System.out.print("(4)");
        return 1;
    }

    // 父类静态方法最先被调用 并且不会被重写
    public static int method() {
        System.out.print("(5)");
        return 1;
    }
}
