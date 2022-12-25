package org.example;

public class Customer {
    private final String name;
    private final int loanInCents;
    private final double interest;
    private final int months;

    ExchangeHandler exchangeHandler = new ExchangeHandler();

    public Customer(String name, double loanInEuro, double interest, int years) {
        this.name = name;
        this.loanInCents = exchangeHandler.eurosIntoCents(loanInEuro);
        this.interest = interest;
        this.months = exchangeHandler.calculateYearsIntoMonths(years);
    }

    public String getName() {
        return name;
    }

    public double getInterest() {
        return interest;
    }

    public int getMonths() {
        return months;
    }

    public ExchangeHandler getExchangeHandler() {
        return exchangeHandler;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", loanInCents=" + loanInCents +
                ", interest=" + interest +
                ", months=" + months +
                '}';
    }
}
