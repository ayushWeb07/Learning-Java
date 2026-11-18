package section23;

import java.time.*;
import java.util.Set;

public class ZoneDemo {
    public static void main(String[] args) {
        Set<String> allZones= ZoneId.getAvailableZoneIds();
        System.out.println(allZones);

        // get the source and destination zones
        ZoneId src= ZoneId.of("Asia/Calcutta");
        ZoneId dest= ZoneId.of("Africa/Mbabane");
        ZonedDateTime z1= ZonedDateTime.now(src);
        ZonedDateTime z2 = z1.withZoneSameInstant(dest);

        System.out.println(z1);
        System.out.println(z2);
    }
}
