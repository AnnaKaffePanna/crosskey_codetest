package org.example;

import java.util.Objects;

public class Customer {
    private final String name;
    private final double loan;
    private final double yearlyInterest;
    private final int months;

    public Customer(final String name, final double loan, final double yearlyInterest, final int years) {
        final MonthUtil monthUtil = new MonthUtil();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Double.compare(customer.loan, loan) == 0 && Double.compare(customer.yearlyInterest, yearlyInterest) == 0 && months == customer.months && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, loan, yearlyInterest, months);
    }
}
