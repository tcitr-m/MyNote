import java.util.ArrayList;
import java.util.List;

/**
 * Created by pig on 2019/12/22.
 */
public class EmployeeData {

    public static List<Person> getEmployeeData() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("tom", 178));
        list.add(new Person("jack", 166));
        list.add(new Person("tim", 156));
        return list;
    }
}
