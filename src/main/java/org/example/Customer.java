package org.example;

public class Customer {
    private final String name;
    private final double loan;
    private final double yearlyInterest;
    private final int months;

    public Customer(final String name, final double loan, final double yearlyInterest, final int years) {
        this.name = name;
        this.loan = loan;
        this.yearlyInterest = yearlyInterest;
        this.months = MonthUtil.yearsIntoMonths(years);
    }

    public String getName() {
        return name;
    }

    public double getLoan() {
        return loan;
    }

    public double getYearlyInterest() {
        return yearlyInterest;
    }

    public int getMonths() {
        return months;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", loan=" + loan +
                ", interest=" + yearlyInterest +
                ", months=" + months +
                '}';
    }
}