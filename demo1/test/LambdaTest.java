import org.junit.jupiter.api.Test;

import javax.naming.Name;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * JDK8
 * Created by pigb on 2019/12/21.
 * lambda表达式本质：作为接口的实例
 * 接口只能有一个方法
 * 接口中只声明了一个抽象方法，则称为FunctionalInterface(函数式接口)
 */
public class LambdaTest {

    /**
     * 有参数 无返回值
     */
    @Test
    public void test1(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("投机主义者 永远是敌人");
        Consumer<String> consumer = content -> System.out.println(content);
        consumer.accept("投机主义者 永远是敌人");
    }

    /**
     * 有多个参数，有返回值
     * 返回体只有一条语句
     */
    @Test
    public void test2(){
        Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);

        System.out.println(comparator.compare(23, 45));
    }

    @Test
    public void test3(){
//        MyFunctionalInterface myFunctionalInterface = s -> System.out.println(s);
//        myFunctionalInterface.console("dream");
    }

    @Test
    public void test4(){
        List<String> list = new ArrayList<>();
        list.add("cosette");
        myChange(list, new MyFunctionalInterface() {
            @Override
            public Map<String, Object> myMethod(List<String> list) {
                Map<String, Object> map = new HashMap<>();
                for (String o : list) {
                    map.put("name", o);
                }
                map.put("name", list.get(0));
                return map;
            }
        });

        Map myChange = myChange(list, arr -> {
            Map<String, Object> map = new HashMap<>();
            for (String o : arr) {
                map.put("name", o);
            }
            map.put("name", arr.get(0));
            return map;
        });
        System.out.println(myChange);
    }

    private Map myChange(List list, MyFunctionalInterface fun) {
        return fun.myMethod(list);
    }

    @Test
    public void test5(){
        List<String> list = Arrays.asList("仁王", "code vein", "NieR");

        System.out.println(filterString(list, name -> name.equals("code vein")));
    }

    public List<String> filterString(List<String> list, Predicate<String> predicate) {
        ArrayList<String> filterList = new ArrayList<>();

        for (String s : list) {
            if (predicate.test(s)) {
                filterList.add(s);
            }
        }
        return filterList;
    }
}
