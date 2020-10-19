import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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
	public void testSorted2(){
		List<Person> list = EmployeeData.getEmployeeData();
		list.stream().sorted(Comparator.comparingDouble(Person::getHeight)).
			forEach(System.out::println);
	}
	@Test
	public void testSorted(){
		List<Integer> list = Stream.generate(() -> new Random().nextInt(100))
			.limit(7).collect(Collectors.toList());
		list.forEach(System.out::println);
		System.out.println("--------------------");
	}

	@Test
	public void test3(){
        List<String> list = Arrays.asList("aa", "bb", "cc");

//        list.stream().map();

    }

    private static ArrayList<Character> fromStringToStream(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list.add(c);
        }
//        Character character = Character.valueOf(chars[0]);
//        ArrayList<Character>
        return list;
    }

    /**
     * 创建无限流
     * 可用来创建随机数组
     */
	@Test
	public void test2(){
	    // iterate 迭代
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);

        // generate 生成
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
	}


	@Test
    void test1() {
		List<Person> list = EmployeeData.getEmployeeData();

		// default Stream<e> stream() 返回一个顺序流
		Stream<Person> stream = list.stream();

		// default Stream<e> parallelStream()
		Stream<Person> parallelStream = list.parallelStream();
	}
}
