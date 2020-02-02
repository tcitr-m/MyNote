package collectionTest;

import entity.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by pig on 2020/1/17.
 */
public class HashTableTest {

    @Test
    public void test1(){
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("张三", "男"));
        people.add(new Person("李四", "男"));
        System.out.println("people = " + people.toArray());
        AtomicInteger i = new AtomicInteger(1);
        people.forEach(person -> {
            person.setSex("female");
            i.getAndIncrement();
        });
        System.out.println("i = " + i);
        people.forEach(person -> System.out.println(person.getSex()+person.getName()));

    }

    /**
     * IOC Demo
     */
    @Test
    public void demo_IOC(){
        LaoWang laoWang = new LaoWang();
        laoWang.mingling();
    }
    // DI基于构造器
    @Test
    public void demo_IOC_DI_1(){
        LaoWang laoWang = new LaoWang(new XiaoSan());
        laoWang.mingling2();
    }
}

interface Heshang{
    void saodi();
}
class XiaoEr implements Heshang {
    @Override
    public void saodi() {
        System.out.println("小二在扫地");
    }
    public boolean isLiangong() {
        return false;
    }
}
class XiaoSan implements Heshang {
    @Override
    public void saodi() {
        System.out.println("小三在扫地");
    }
}
class LaoFang{
    static Heshang getUser() {
        XiaoEr xiaoEr = new XiaoEr();
        if (xiaoEr.isLiangong()) {
            new XiaoSan();
        }
        return xiaoEr;
    }
}

/**
 * laoWang不在直接管理xiaoer、xiaosan，而是通过LaoFang
 */
class LaoWang{
    public LaoWang() {
    }

    void mingling() {
        LaoFang.getUser().saodi();
    }

    // DI
    // 基于构造器
    private Heshang user;

    LaoWang(Heshang user)
	{
        this.user = user;
    }
    void mingling2() {
        this.user.saodi();
    }

    // 基于setter() 方法
    public Heshang getUser() {
        return user;
    }

    public void setUser(Heshang user) {
        this.user = user;
    }
    void mingling3() {
        this.user.saodi();
    }
}
