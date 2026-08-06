package DataEhora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Data02 {

    public static void main(String[] args) {

        // Creating the dates
        LocalDate d01 = LocalDate.parse("2026-07-30");
        LocalDateTime d02 = LocalDateTime.parse("2026-07-30T15:41:01");
        Instant d03 = Instant.parse("2026-07-31T15:42:32Z");

        //Creating the formatting template for each date
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        //Printing all the created dates
        System.out.println("Data1: " + d01.format(fmt1));
        System.out.println("Data2: " + d02.format(fmt2));
        System.out.println("Data2: " + d02.format(fmt4));

        //Calling the formatting explicitly:
        System.out.println("Data com a formatação explícita: " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        //formatting the "time zone" (GMT) date to print according to the previous templates
        System.out.println("Data GMT: " + fmt3.format(d03));
        System.out.println("Data GMT: " + fmt5.format(d03));
    }
}
