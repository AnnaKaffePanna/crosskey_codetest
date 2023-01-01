package org.example;

public class ExchangeMoney {
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
}
