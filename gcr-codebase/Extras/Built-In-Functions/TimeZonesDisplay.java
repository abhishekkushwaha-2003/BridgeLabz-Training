// Program to display current time in different time zones

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZonesDisplay {
    public static void main(String[] args) {

        // Get current time in GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

        // Get current time in IST
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // Get current time in PST
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Display time in GMT
        System.out.println("Current Time in GMT: " + gmtTime);

        // Display time in IST
        System.out.println("Current Time in IST: " + istTime);

        // Display time in PST
        System.out.println("Current Time in PST: " + pstTime);
    }
}
