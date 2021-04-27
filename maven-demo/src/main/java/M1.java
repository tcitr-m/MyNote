import entity.Actress;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.net.URL;

/**
 * @author by PIG
 * @date 2021/3/8 17
 */
public class M1 {
    public static void main(String[] args) {
        ClassLoader classLoader = M1.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("/data.yml");
        URL resource = classLoader.getResource("/data.yml");
        System.out.println("resource.getPath() = " + resource.getPath());
        Yaml yaml = new Yaml();
        if (resourceAsStream != null) {
            Actress actress = yaml.loadAs(resourceAsStream, Actress.class);
            System.out.println(actress);
        }
    }
}
