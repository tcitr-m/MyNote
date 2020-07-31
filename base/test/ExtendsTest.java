import main.java.entity.Person;
import main.java.entity.UnPerson;
import org.junit.jupiter.api.Test;

/**
 * @author by PIG
 * @date 2020/3/18 11:13
 */
public class ExtendsTest {


	@Test
	public void test(){
		Person tom = new Person("tom", "man");
		UnPerson unPerson = new UnPerson(tom);
		System.out.println(unPerson.getName());
	}
}
