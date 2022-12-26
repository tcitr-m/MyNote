import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import entity.Actress;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.net.URL;
import java.util.Map;

/**
 * @author by PIG
 * @date 2021/3/8 17
 */
public class M1 {

    public static void main(String[] args) {
        ClassLoader classLoader = M1.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("data.yml");
        URL resource = classLoader.getResource("data.yml");
        System.out.println("resource.getPath() = " + resource.getPath());
        Yaml yaml = new Yaml();
        if (resourceAsStream != null) {
			Map actress = yaml.loadAs(resourceAsStream, Map.class);

			Gson gson = new Gson();
			JsonObject ymlObj = gson.toJsonTree(actress).getAsJsonObject();
			System.out.println(ymlObj);
			String name = ymlObj.get("name").getAsString();
			System.out.println(name);
		}
    }
}
