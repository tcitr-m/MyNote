package recursive;

import org.junit.jupiter.api.Test;

/**
 * Created by pig on 2019/12/29.
 */
public class TestStep {

    public int f(int n) {
        if (1 > n) {
           throw new IllegalArgumentException("参数不能小于1");
        }
        if (1 == n || 2 == n)
            return n;
        return f(n - 1) + f(n - 2);
    }

    @Test
    public void test(){
        System.out.println(f(1200));
    }
}
