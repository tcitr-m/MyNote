package thirdPartJar;


import com.google.gson.Gson;
import entity.Gundam;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by pig on 2020/1/3.
 */
public class GsonTest {

    @Test
    public void test(){
        LinkedList<Gundam> list = new Gundam().getList();
        ListIterator<Gundam> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Gundam next = iterator.next();
            System.out.println(next.toString());
        }



        ConcurrentLinkedDeque linkedDeque = new ConcurrentLinkedDeque();
        Gson gson = new Gson();
    }
}
