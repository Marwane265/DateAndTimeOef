package be.intecbrussel;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Oef01 {
    public static <localDate> void main(String[] args) {


        //Oefening 1
        // Bij deze oefening gaan we gebruik maken van de volgende classes
        // LocalDateTime, DateTimeFormatter enChronoUnit.
        // Print huidige tijd uit.
        // Print nu een tijd in de toekomst uit.
        // Gebruik de huidige tijd en zorg dat deze 3 jaar verder komt testaan.
        // Bereken het verschil tussen deze 2 tijden: jaren, maanden, dagen, uren, minuten, secondes.
        // Formateer deze 2 tijden als strings met dit patroon: "yyyy-MM-dd HH:mm:ss".


        LocalDateTime now = LocalDateTime.of(2023, 03, 22, 11, 32, 15);
        LocalDateTime future = LocalDateTime.of(2026, 02, 14, 18, 32, 15);


        long years = ChronoUnit.YEARS.between(now, future);
        long months = ChronoUnit.MONTHS.between(now, future);
        long days = ChronoUnit.DAYS.between(now, future);
        long hours = ChronoUnit.HOURS.between(now, future);
        long minutes = ChronoUnit.MINUTES.between(now, future);
        long seconds = ChronoUnit.SECONDS.between(now, future);


        System.out.println(years + "years");
        System.out.println(months + "months");
        System.out.println(days + "days");
        System.out.println(hours + "hours");
        System.out.println(minutes + "minutes");
        System.out.println(seconds + "seconds");


        DateTimeFormatter first = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String myFormatDate = now.format(first);
        System.out.println(myFormatDate);

        DateTimeFormatter second = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String bestForm = future.format(second);
        System.out.println(bestForm);

    }
}
