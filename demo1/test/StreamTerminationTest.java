import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * Created by pig on 2020/8/1.
 */
public class StreamTerminationTest {
	static List<Person> list = new ArrayList();

	@BeforeAll
	public static void testBefore() {
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			list.add(new Person(i+ "tom", random.nextInt(1000)));
		}
		list.forEach(System.out::println);
		System.out.println("测试之前");
	}
	@Test
	public void test(){
		List<Person> list = EmployeeData.getEmployeeData();
		Optional<Person> any = list.parallelStream().findAny();
		Optional<Person> any1 = list.stream().findAny();
		System.out.println(any);
		System.out.println(any1);
	}
}
