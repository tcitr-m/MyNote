package collectionTest;

import initAndInstantiate.Son;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * Created by pig on 2020/1/5.
 */
public class ListSortTest {

    @Test
    public void test1(){
        List<Son> list = new ArrayList();
        Collections.sort(list, new Comparator<Son>() {
            @Override
            public int compare(Son o1, Son o2) {
                return 0;
            }
        });
        Collections.sort(list, (son, son2) -> {
            return 0;
        });
    }
}
