import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by pig on 2019/12/22.
 */
public class StreamTest {

    @Test
    public void test1(){
        List<Person> list = EmployeeData.getEmployeeData();

        // default Stream<e> stream() 返回一个顺序流
        Stream<Person> stream = list.stream();

        // default Stream<e> parallelStream()
        Stream<Person> parallelStream = list.parallelStream();
    }
}
