package section23;

import java.time.*;

public class PeriodDemo {
    public static void main(String[] args) {
        // get dates and times
        LocalDate d1= LocalDate.of(2007, 8, 7);
        LocalDate d2= LocalDate.of(2008, 7, 9);

        Period p= Period.between(d1, d2);
        System.out.println(p);

        LocalDate d3= d1.plus(p);
        System.out.println(d3);

        Period p2= Period.ofDays(5);
        LocalDate d4= d3.plus(p2);
        System.out.println(d4);
    }
}
