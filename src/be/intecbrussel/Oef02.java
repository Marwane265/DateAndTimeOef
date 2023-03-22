package be.intecbrussel;

import java.time.LocalDate;
import java.time.Period;

public class Oef02 {
    public static void main(String[] args) {


        //Oef02

        //Schrijf een programma dat van je geboortedatum het volgende afdrukt:
        // Bij deze oefening gaan we gebruik maken van de volgende classes LocalDate, LocalTime enLocalDateTime.
        // de hoeveelste dag van dat jaar het was.
        // de dag van de maand.
        // de dag van de week.
        // of je geboorte jaar in een schrikkeljaar was


        LocalDate birthDay = LocalDate.of(2002, 02, 14);
        System.out.println(birthDay.getDayOfYear());
        System.out.println(birthDay.getDayOfMonth());
        System.out.println(birthDay.getDayOfWeek());


        int year = 2002;

        if (year % 400 == 0) {
            System.out.println(year + " Dit is een schrikkeljaar.");
        } else if (year % 100 == 0) {
            System.out.println(year + " Dit is niet schrikkeljaar.");
        } else if (year % 4 == 0) {
            System.out.println(year + " Dit is een schrikkeljaar.");
        } else {
            System.out.println(year + " Dit is niet schrikkeljaar.");
        }


    }
}
