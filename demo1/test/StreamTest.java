import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by pig on 2019/12/22.
 */
public class StreamTest {

	static List<Person> list = new ArrayList();


	@BeforeAll

	public static void test() {
		System.out.println("测试之前");
		for (int i = 0; i < 5; i++) {
			Person person = new Person();
			person.setName(i + "tom");
			person.setHeight(i * 2.5);
			list.add(person);
		}
		Person person = new Person();
		person.setName("null_tom");
		person.setHeight(null);
		list.add(person);
	}

	@Test
	public void test2(){
		System.out.println();
	}


	@Test
	public void test1() {
		List<Person> list = EmployeeData.getEmployeeData();

		// default Stream<e> stream() 返回一个顺序流
		Stream<Person> stream = list.stream();

		// default Stream<e> parallelStream()
		Stream<Person> parallelStream = list.parallelStream();
	}
}
