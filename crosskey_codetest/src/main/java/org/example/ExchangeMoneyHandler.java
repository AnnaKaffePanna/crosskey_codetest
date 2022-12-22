package org.example;

public class ExchangeMoneyHandler{
    public int eurosIntoCents(double euros){
        return (int) (euros * 100);
    }

    public double centsIntoEuros(int cents){
        return (double)(cents / 100);
    }
}
