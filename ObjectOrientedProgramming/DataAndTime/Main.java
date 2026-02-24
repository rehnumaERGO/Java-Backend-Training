package DataAndTime;
// How to work with DATES & TIMES using Java

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        System.out.println(" ");

        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println(" ");

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        System.out.println(" ");

        // UTC
        Instant instant = Instant.now();
        System.out.println(instant);

        System.out.println(" ");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        System.out.println(" ");

        // Custom Date and Time object

        LocalDateTime date1 = LocalDateTime.of(2024, 12, 25, 0, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);
        System.out.println(date1);
        System.out.println(date2);

        System.out.println(" ");

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is earlier than " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is later than " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is later than " + date2);
        }

    }
}
