package datetime;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Date;

public class AMP24HRConversion {

    public static void main(String[] args) throws IOException {
        String s = timeConversion("02:05:45PM");
        System.out.println(s);
    }

    public static String timeConversion(String str) {
        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
        Date parse = null;
        try {
            parse = df.parse(str);
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DateFormat outputTimeFormat = new SimpleDateFormat("HH:mm:ss");
        return outputTimeFormat.format(parse);
    }
}
