package cn.wsq;

import java.time.LocalDateTime;
import java.util.Calendar;

public class DateTimeTest {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));

        LocalDateTime time=LocalDateTime.now();
        System.out.println(time.getYear());
        System.out.println(time.getMonthValue());
        System.out.println(time.getDayOfMonth());
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
    }
}
