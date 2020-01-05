package collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 集合类不安全问题
 * Created by pig on 2019/12/29.
 */
public class ContainerNotSafeDemo {

    public static void main(String[] args) {
//        copyOnWriteArraySet();
//        Map<Object, Object> map = new HashMap<>();
        Map<Object, Object> map = new ConcurrentHashMap<>();

        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0, 8));
                System.out.println(map);
            }, String.valueOf(i)).start();
        }
    }

    private static void copyOnWriteArraySet() {
//        Set<String> set = new HashSet<>(); // hashSet线程不安全
        Set<String> set = new CopyOnWriteArraySet<>();
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                set.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(set);
            }, String.valueOf(i)).start();
        }
    }

}
