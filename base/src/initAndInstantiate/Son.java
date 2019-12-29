package initAndInstantiate;

/**
 * Created by pig on 2019/12/28.
 */
public class Son extends Father {
    private int i = test();
    private static int j = method();

    static {
        System.out.print("(6)");
    }

    Son(){
        System.out.print("(7)");
    }
    {
        System.out.print("(8)");
    }

    public int test() {
        System.out.print("(9)");
        return 1;
    }

    public static int method() {
        System.out.print("(10)");
        return 1;
    }

    /**
     * (5)(1)(10)(6) 类初始化完毕(9)(3)(2)(9)(8)(7) 实例初始化完毕
     * (9)(3)(2)(9)(8)(7)
     *
     * 父类静态 =》子类静态 =》 父类
     *
     * 类初始化
     *
     */
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println("");
        Son son1 = new Son();
    }
}
