package org.oca.exam.chapter03;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class WorkingWithDatesAndTimes {

    public static void main(String...args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        System.out.println();

        date = LocalDate.of(2017, Month.JUNE, 10);
        time = LocalTime.of(20, 18, 59);
        dateTime = LocalDateTime.of(2017, Month.JUNE, 10, 21, 16, 40);

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        System.out.println();

        System.out.println(date.plusDays(2));
        System.out.println(time.plusMinutes(10));
        System.out.println(dateTime.plusWeeks(3));
        System.out.println(time.minusHours(3));

        System.out.println();

        dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);

        System.out.println(date.minus(Period.ofDays(1)));
        System.out.println(dateTime.minus(Period.ofMonths(10)));

        System.out.println();

        System.out.println(date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(f1.format(date));
        DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(f2.format(time));
        DateTimeFormatter f3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f3.format(dateTime));

        DateTimeFormatter f4 = DateTimeFormatter.ofPattern("MMMM, yyyy, HH:mm:ss");
        System.out.println(f4.format(dateTime));

        System.out.println();
        date = LocalDate.parse("19981223", DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println(date);
    }

}
