import org.junit.jupiter.api.Test;

/**
 * Created by pig on 2019/12/26.
 */
public class TestSingleton1 {

    public static void main(String[] args) {
        Singleton1 instance = Singleton1.INSTANCE;
        System.out.println(instance);
    }
}
