package section23;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {
    public static void main(String[] args) {
        // get the instant
        Instant i= Instant.now();
        long secs= i.getEpochSecond();
        System.out.println(i);
        System.out.println(secs);
        System.out.println();

        // play with the durations
        Duration d1= Duration.ofDays(5);
        Duration d2= Duration.ofHours(3);
        Duration d3= Duration.ofMinutes(19);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println();

        // add the duration to the instants
        Instant i2= i.plus(d1);
        Instant i3= i.plus(d2);
        Instant i4= i.minus(d3);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        System.out.println();

        System.out.println(i3.isBefore(i4));
        System.out.println(i2.isAfter(i4));
    }
}
