package com.pluralsight;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class FormatDates {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("hh:mm");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        ZonedDateTime gmtDateTime = ZonedDateTime.now(ZoneOffset.UTC);
    }
}
