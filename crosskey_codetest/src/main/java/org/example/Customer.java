package org.example;

public class Customer {
    private final String name;
    private final double loan;
    private final double interest;
    private final int months;

    public Customer(final String name, final double loan, final double interest, final int years) {
        final MonthUtil monthUtil = new MonthUtil();

        this.name = name;
        this.loan = loan;
        this.interest = interest;
        this.months = monthUtil.yearsIntoMonths(years);
    }

    public String getName() {
        return name;
    }

    public double getLoan() {
        return loan;
    }

    public double getInterest() {
        return interest;
    }

    public int getMonths() {
        return months;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", loan=" + loan +
                ", interest=" + interest +
                ", months=" + months +
                '}';
    }
}
