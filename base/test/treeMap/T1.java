package treeMap;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;
import java.util.UUID;

/**
 * Created by pig on 2019/12/29.
 */
public class T1 {

    @Test
    public void treeMapTest(){
        TreeMap<Object, Object> map = new TreeMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(-i, UUID.randomUUID().toString().substring(0, 8));
        }

        System.out.println(map);
    }
}
