package org.example;

public class ExchangeYearsAndMonths {
    public int yearsIntoMonths(int years) {
        int months = 0;

        for (int i = 0; i < years; i++) {
            months += 12;
        }

        return months;
    }

    public int monthsIntoYears(int months) {
        return months/12;
    }
}
