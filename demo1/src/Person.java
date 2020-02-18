/**
 * Created by pig on 2019/12/22.
 */
public class Person {

    private String name;
    private Double height;

    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }
    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
