package CAS;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by pig on 2019/12/28.
 *
 * CAS: CompareAndSwap
 * 比较-并-交换
 *
 */
public class CASDemo {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5); // 内存值
        boolean b = atomicInteger.compareAndSet(5, 2020);// (expected)期望值，更新值
        System.out.println(b + "  current data  " + atomicInteger.get());
    }
}
