package entity;

/**
 * @author by PIG
 * @date 2021/3/5 08
 */
public class Actress {

    private String name;
    private String birth;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actress{" +
                "name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", height=" + height +
                '}';
    }
}
