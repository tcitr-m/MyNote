import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author by PIG
 * @date 2020/8/12 10
 */
public class LocalDateTest {

    /**
     *
     */
    @Test
    public void plusAndMinusTest(){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dateTime = now.plusDays(4).minusDays(2);
        System.out.println(dateTime.toString());
    }

    /*
    DateTimeFormatter
     */
    @Test
    public void dateTimeFormatterTest(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd^HH:mm:ss");
        String s = now.format(formatter);
        System.out.println(s);

        LocalDate yyyy = LocalDate.parse("2020-08-06^15:23:33", formatter);
        System.out.println(yyyy);
    }

    @Test
    public void test(){
        LocalDate now = LocalDate.now(); // now总是获取当前默认时区时刻
        System.out.println(now);
    }
}
