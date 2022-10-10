import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

/**
 * @author by PIG
 * @date 2020/8/12 10
 * 缺少断言 assert
 */
class LocalDateTest {

	@Test
	public void test1(){
		String time = "2022-01";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(time + "-01", dateTimeFormatter);
		LocalDateTime dateTime = date.atStartOfDay();
		System.out.println("parse = " + dateTime);
		LocalDateTime localDateTime = dateTime.with(TemporalAdjusters.lastDayOfMonth()).withHour(23).withMinute(59).withSecond(59);
		System.out.println(localDateTime);

	}

    @Test
    void instantTest(){
        try {
            Instant instant = Instant.now();
            System.out.println("instant = " + instant.toString());
            Date date = new Date();
            String dateString = date.toString();
            System.out.println("date = " + dateString);
            LocalDateTime localDateTime = LocalDateTime.now();
            System.out.println(localDateTime.toLocalDate());
            String calendarString = Calendar.getInstance().getTime().toString();
            System.out.println("Calendar = " + calendarString);
//            assert dateString.equals(calendarString) : "一样";
            Assertions.assertEquals(dateString, calendarString);
        } catch (AssertionError  e) {
            e.printStackTrace();
        }
    }

    /**
     * localDateTime Methods
     */
    @Test
    void plusAndMinusTest(){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dateTime = now.plusDays(4).minusDays(2);
        System.out.println(dateTime.toString());
        System.out.println(now.minusMonths(2).format(DateTimeFormatter.ofPattern("yyyy-MM")));
        System.out.println(now.minusMonths(1).with(TemporalAdjusters.lastDayOfMonth()).withHour(23).withMinute(59).withSecond(59));
    }

    /*
    DateTimeFormatter
     */
    @Test
    void dateTimeFormatterTest(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd^HH:mm:ss");
        String s = now.format(formatter);
        System.out.println(s);

        LocalDate yyyy = LocalDate.parse("2020-08-06^15:23:33", formatter);
        System.out.println(yyyy);
    }

    @Test
    void test(){
        LocalDate now = LocalDate.now(); // now总是获取当前默认时区时刻
        System.out.println(now);
    }
}
