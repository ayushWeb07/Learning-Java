package section23;

import java.time.Duration;
import java.time.Period;

public class DurationOperations {
    public static void main(String[] args) {
        Duration d= Duration.ofMinutes(45);
        Duration d2= d.multipliedBy(5);
        Duration d3= d.dividedBy(3);

        Period p= Period.of(1, 5, 19);
        Period p2= p.multipliedBy(2);

        System.out.println(d);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(p);
        System.out.println(p2);
    }
}
