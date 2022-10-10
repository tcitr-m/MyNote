import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by PIG
 * 2022/9/6 15
 */
public class MapTest {

	@Test
	public void testMerge(){
		Map<String, String> map = new HashMap<>();
		map.put("e", "E");
		map.merge("f", "F", String::concat);
		map.merge("e", "F", (oldVal, newVal) -> newVal + "," + oldVal);
		map.merge("key", "value", (oldVal, newVal) -> newVal + "," + oldVal);
		System.out.println("map.get(\"f\")="+map.get("f")); // map.get("f")=F
		System.out.println("map.get(\"e\")="+map.get("e")); // map.get("e")=F,E
	}

	@Test
	public void test(){

	}
}
