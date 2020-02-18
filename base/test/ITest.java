import initAndInstantiate.Son;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author by PIG
 * @date 2020/1/6 20:44
 */
public class ITest {

    @Test
    public void test3(){
        ArrayList<String> list = new ArrayList<>();
        ListIterator<String> listIterator = list.listIterator();
        Iterator<String> iterator = list.iterator();


    }

    /**
     * 验证String和StringBuffer 变 与 不变
     */
    @Test
    public void stringBufferTest(){
        StringBuffer sb = new StringBuffer("a");
        sb.append("b");
        StringBuffer ab = sb;
        sb.replace(0, sb.length(), "ab");
        System.out.println("sb: " + sb);
        System.out.println("ab: " + ab);
        System.out.println(sb == ab);
    }

    @Test
    public void stringTest(){
        String a = "a";
        a = a + "b";
        String ab = a;
        System.out.println("a: " +  a);
        a = "ab";
        System.out.println("ab: " + ab);
        System.out.println(a == ab);
    }

    @Test
    public void test1(){

        String s = new String("123");
        String s2 = new String("123");
//        System.out.println("s hashcode:\t" + s.hashCode());
//        System.out.println("s2 hashcode:\t" + s2.hashCode());
//        System.out.println(s.equals(s2));
//        System.out.println(s == s2);
//        Object o = "1";
        List<Son> list = new ArrayList<>();
        System.out.println(list.hashCode());
        System.out.println(list.toString());
    }
}

