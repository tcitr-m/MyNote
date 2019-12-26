import java.io.IOException;
import java.util.Properties;

/**
 * Created by pig on 2019/12/26.
 *
 * 静态代码块
 */
public class Singleton3 {

    public static final Singleton3 INSTANCE;
    private String info;

    // 静态代码块
    static {
        Properties pro = new Properties();
        try {
            // 动态读取配置数据
            pro.load(Singleton3.class.getClassLoader().getResourceAsStream("single.properties"));
            INSTANCE = new Singleton3(pro.getProperty("info"));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private Singleton3(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Singleton3{" +
                "info='" + info + '\'' +
                '}';
    }
}
