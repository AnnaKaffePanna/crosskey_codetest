package org.example;

public class ExchangeHandler {
    public int eurosIntoCents(double euros){
        return (int) (euros * 100);
    }

    public double centsIntoEuros(int cents){
        return (double)(cents / 100);
    }

    public int calculateYearsIntoMonths(int years) {
        int months = 0;
        for (int i = 0; i < years; i++) {
            months += 12;
        }
        return months;
    }
}
