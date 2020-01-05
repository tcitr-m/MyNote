package collection;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author by PIG
 * @date 2019/12/24 19:26
 * 解决并发 安全
 * 1、Vector 并发加锁， 性能急剧下降
 * 2、Collections.synchronizedList()
 * 3、CopOnWriteArrayList()
 */
public class ArrayListTest {

    public static void main(String[] args) {
//        List<String> list = new Vector<>();
//        List<String> list = Collections.synchronizedList(new ArrayList<>());
        List<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }
    /**
     * 故障现象
     *  java.util.ConcurrentModificationException
     *  并发修改错误
     */
}
