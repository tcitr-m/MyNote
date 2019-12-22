import java.util.List;
import java.util.Map;

/**
 * 函数式接口
 * 有且只能有一个抽象方法， 但可以有多个非抽象方法的接口
 * Created by pig on 2019/12/21.
 */
@FunctionalInterface
public interface MyFunctionalInterface {

    Map<String, Object> myMethod(List<String> list);

    default void nonAbstractMethod() {
        System.out.println("这是非抽象方法");
    }
}
