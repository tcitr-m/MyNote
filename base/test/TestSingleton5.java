import singleton.Singleton5;

import java.util.concurrent.*;

/**
 * Created by pig on 2019/12/26.
 */
public class TestSingleton5 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Singleton5> callable = Singleton5::getInstance;

        ExecutorService service = Executors.newFixedThreadPool(2);

        Future<Singleton5> submit1 = service.submit(callable);
        Future<Singleton5> submit2 = service.submit(callable);

        Singleton5 s1 = submit1.get();
        Singleton5 s2 = submit2.get();

        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
        service.shutdown();
    }
}
