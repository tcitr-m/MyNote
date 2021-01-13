import main.java.entity.Actress;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by pig on 2020/8/1.
 */
public class YmlDataTest {

	private  Actress actress;

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
		try {
			File file = new File("data.yml");
			String path = file.getPath();

			FileInputStream fileInputStream = new FileInputStream("data.yml");
			Yaml yaml = new Yaml();
			Object load = yaml.load(fileInputStream);
			System.out.println(load);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
