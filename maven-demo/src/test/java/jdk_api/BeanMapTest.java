package jdk_api;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by pig on 2020/8/2.
 */
public class BeanMapTest {

	@Test
	public void test1(){
		Map<String, String> map = Map.of("key", "value");
		map.merge("key", "value", (oldVal, newVal) -> newVal + "," + oldVal);
	}
}
