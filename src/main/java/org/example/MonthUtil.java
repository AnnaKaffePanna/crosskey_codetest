package org.example;

public class MonthUtil {
    public static int yearsIntoMonths(final int years) {
        int months = 0;

        for (int i = 0; i < years; i++) {
            months += 12;
        }

        return months;
    }

    public static int monthsIntoYears(final int months) {
        return months/12;
    }
}
