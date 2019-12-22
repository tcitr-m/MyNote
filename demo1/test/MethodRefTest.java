import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 方法引用
 * 1、使用情景 当传递给lambda体的操作，已经有实现的方法，可使用方法引用
 * 2、方法引用本质是lambda表达式，而lambda表达式作为函数接口的实例。所以
 *  方法引用，也是函数式接口的实例
 * 3、使用格式：类（对象）:: 方法名
 * 4、使用情况：
 *  对象::非静态方法
 *  类::静态方法
 *  类::非静态方法
 * Created by pig on 2019/12/22.
 */
public class MethodRefTest {
    /**
     * Consumer void acept(T t)
     * PrintStream void print(T t)
     */
    @Test
    public void test1(){
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("hello");
        Consumer<String> con = System.out::println;
        con.accept("s");
    }

    /**
     *
     * supplier(提供者)
     * Supplier T get()
     * Person T getName()
     */
    @Test
    public void test2(){
        Person person = new Person("cosette", 177);
        Supplier<String> supplier = () -> person.getName();
        System.out.println(supplier.get());

        Person person2 = new Person("Marx", 175);
        Supplier<String> supplier1 = person2::getName;
        System.out.println(supplier1.get());
    }

    /**
     * 类::静态方法
     * Comparator(比较器)
     * Comparator int compare(T t1, T t2)
     * Integer int compare(T t1, T t2)
     */
    @Test
    public void test3() {
        Comparator<Integer> com = (t1, t2) -> Integer.compare(t1, t2);
        System.out.println(com.compare(23, 13));

        Comparator<Integer> com2 = Integer::compare;
        System.out.println(com2.compare(45, 203));
    }

    /**
     * 类::静态方法
     * Function R apply(T t)
     * Math long round(Double d) 四舍五入
     */
    @Test
    public void test4(){
        Function<Double, Long> fun = d -> Math.round(d);
        System.out.println(fun.apply(Math.PI));

        Function<Double, Long> fun2 =Math::round;
        System.out.println(fun2.apply(Math.E));
    }

    /**
     * 类::非静态方法
     * Comparator int compare(T t1, T t2)
     * String int .compareTo(t2)
     */
    @Test
    public void test5(){
        Comparator<String> com = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com.compare("123", "122"));

        Comparator<String> com2 = String::compareTo;
        System.out.println(com2.compare("abd", "adb1"));
    }

    /**
     * BiPredicate boolean test(T t1, T t2)
     * String boolean t1.equals(t2)
     */
    @Test
    public void test6(){

    }

    /**
     * Function R apply(T t)
     * Employee String getName()
     */
    @Test
    public void test7(){

    }
}
