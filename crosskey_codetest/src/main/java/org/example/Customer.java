package org.example;

public class Customer {
    private final String name;
    private final int loanInCents;
    private final double interest;
    private final int months;

    public Customer(String name, double loanInEuro, double interest, int years) {
        ExchangeMoney exchangeMoney = new ExchangeMoney();
        ExchangeYearsAndMonths exchangeYearsAndMonths = new ExchangeYearsAndMonths();

        this.name = name;
        this.loanInCents = exchangeMoney.eurosIntoCents(loanInEuro);
        this.interest = interest;
        this.months = exchangeYearsAndMonths.yearsIntoMonths(years);
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

    public int getLoanInCents() {
        return loanInCents;
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
