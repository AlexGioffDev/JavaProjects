package org.razeft.findYourAge;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class findYourAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateBirthday = null;

        while(dateBirthday == null) {
            try {
                System.out.print("Write your birthday with this format: yyyy-MM-dd: ");
                String birthday = scanner.next();
                dateBirthday = LocalDate.parse(birthday, df);
            }catch (DateTimeParseException e) {
                System.out.println("Invalid format, try again ");
            }
        }

        LocalDate today = LocalDate.now();


        Period periodo = Period.between(dateBirthday, today);
        System.out.printf("You are: %s years, %s month and %s days old",
                periodo.getYears(),
                periodo.getMonths(),
                periodo.getDays()
                );
    }
}
