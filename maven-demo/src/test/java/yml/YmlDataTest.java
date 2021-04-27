package yml;

import entity.Actress;
import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by pig on 2020/8/1.
 */
public class YmlDataTest {

//	static {
//
//		Properties properties = new Properties();
//		try {
////			properties.load(YmlDataTest.class.getClassLoader().getResourceAsStream("data.yml"));
//			FileInputStream fileInputStream = new FileInputStream("data.yml");
//
//			Yaml yaml = new Yaml();
//			Object load = yaml.load(fileInputStream);
//			System.out.println(load);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}

	@Test
	public void test(){
		InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("data.yml");
		Yaml yaml = new Yaml();
		Actress actress = yaml.loadAs(resourceAsStream, Actress.class);
		try {
			resourceAsStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(actress);
	}
}
