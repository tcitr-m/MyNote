import singleton.Singleton4;

import java.util.concurrent.*;

/**
 * Created by pig on 2019/12/26.
 */
public class TestSingleton4 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Singleton4> callable = Singleton4::getInstance;

        ExecutorService service = Executors.newFixedThreadPool(2);

        Future<Singleton4> submit1 = service.submit(callable);
        Future<Singleton4> submit2 = service.submit(callable);

        Singleton4 s1 = submit1.get();
        Singleton4 s2 = submit2.get();

        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
        service.shutdown();
    }
}
