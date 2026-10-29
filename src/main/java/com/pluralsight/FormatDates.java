package com.pluralsight;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class FormatDates {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatSlash = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter formatComma = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss");
        DateTimeFormatter formatHourMinute = DateTimeFormatter.ofPattern("hh:mm");
        DateTimeFormatter fromatDash = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        ZonedDateTime gmtDateTime = ZonedDateTime.now(ZoneOffset.UTC);

        System.out.println(localDate);
        System.out.println(localDate.format(formatSlash));
        System.out.println(LocalDateTime.now().format(formatComma));
        System.out.println(gmtDateTime.format(formatComma));
        System.out.printf("%s on %s",
                localDateTime.format(formatHourMinute), localDateTime.format(fromatDash));
    }

}
