package org.example;

public class ExchangeHandler {
    public int eurosIntoCents(double euros){
        int result = (int)(euros * 100);
        return result;
    }

    public double centsIntoEuros(int cents){
        double result = (double)cents / 100;
        return result;
    }

    public int calculateYearsIntoMonths(int years) {
        int months = 0;
        for (int i = 0; i < years; i++) {
            months += 12;
        }
        return months;
    }

    public int calculateMonthsIntoYears(int months) {
        return months/12;
    }
}
