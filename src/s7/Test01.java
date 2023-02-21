package s7;

import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);

       Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);
        Date time = calendar.getTime();
        System.out.println(time);
        System.out.println(calendar.getTimeZone());


        /*localdate*/
        LocalDate date1=LocalDate.now();
        System.out.println(date1);
        LocalTime tt=LocalTime.now();
        System.out.println(tt);
    }
}
