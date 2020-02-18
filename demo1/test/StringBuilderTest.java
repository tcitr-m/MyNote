import org.junit.jupiter.api.Test;

/**
 * @author by PIG
 * @date 2020/2/15 12:02
 */
public class StringBuilderTest {

	@Test
	public void test() {
		StringBuilder sb = new StringBuilder("我是一个人");
		sb.append(",").append("I am human");
		sb.replace(0, 1, "你");
		System.out.println(sb);
	}
}
