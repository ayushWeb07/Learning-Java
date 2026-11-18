package section23;

import java.time.*;

public class DatetimeDemo {
    public static void main(String[] args) {
        // current dates and times
        LocalDate d= LocalDate.now();
        LocalTime t= LocalTime.now();
        LocalDateTime dt= LocalDateTime.now();
        ZonedDateTime zdt= ZonedDateTime.now();

        System.out.println(d);
        System.out.println(t);
        System.out.println(dt);
        System.out.println(zdt);
        System.out.println();

        // of methods in order to get specific dates and times
        LocalDate bd= LocalDate.of(2007, 8, 7);
        LocalTime bt= LocalTime.of(17, 45);
        LocalDateTime bdt= LocalDateTime.of(bd, bt);
        ZoneId zid= ZoneId.of("Asia/Calcutta");
        ZonedDateTime bzdt= ZonedDateTime.of(bd, bt, zid);

        System.out.println(bd);
        System.out.println(bt);
        System.out.println(bdt);
        System.out.println(bzdt);
        System.out.println();

        // derive the dates
        LocalDate derivedDate= LocalDate.from(bdt);
        LocalTime derivedTime= LocalTime.from(bdt);
        System.out.println(derivedDate);
        System.out.println(derivedTime);
        System.out.println();

        // update the dates and times
        LocalDate u1= bd.withYear(2008);
        LocalDate u2= bd.withYear(2008).withMonth(7).withDayOfMonth(9);
        System.out.println(u1);
        System.out.println(u2);
        System.out.println();

        // get the minute details
        int y= bd.getYear();
        int m= bd.getMonthValue();
        int day= bd.getDayOfMonth();
        System.out.printf("day: %d | month: %d | year: %d", day, m, y);

    }
}
