package org.example;

public class ExchangeHandler {
    public int eurosIntoCents(double euros){
        if(euros < 0){
            return 0;
        }
        int result = (int)(euros * 100);
        return result;
    }

    public double centsIntoEuros(int cents){
        if(cents < 0.0){
            return 0.0;
        }
        double result = (double)cents / 100;
        return result;
    }

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
