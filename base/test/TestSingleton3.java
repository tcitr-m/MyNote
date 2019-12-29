import singleton.Singleton3;

/**
 * Created by pig on 2019/12/26.
 */
public class TestSingleton3 {

    public static void main(String[] args) {
        Singleton3 instance = Singleton3.INSTANCE;
        System.out.println(instance.toString());
    }
}
