package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CurrentZoneDateTime {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        //Convert to Zone Date
        ZonedDateTime zonedDateTime = date.toInstant().atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime);

        //Convert to local date
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(localDateTime);

        //tokyo time for zone date time
        ZonedDateTime tokyotime = zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyotime);

        //format the date
        String format = tokyotime.withZoneSameInstant(ZoneId.of("Asia/Tokyo")).format(DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm"));
        System.out.println(format);

    }
}
