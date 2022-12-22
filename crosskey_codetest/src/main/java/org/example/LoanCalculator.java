package org.example;

public class LoanCalculator {
    //Loan is in cents
    private final int loan;
    private final double interest;
    private final int months;

    public LoanCalculator(int loan, double interest, int years) {
        this.loan = new ExchangeMoneyHandler().eurosIntoCents(loan);
        this.interest = interest;
        this.months = calculateYearsIntoMonths(years);
    }

    public double calculateInterestRate() {
        return ((interest / 100) / this.months) * this.loan;
    }

    public double calculateMonthlyRate(){
        return (int) ((loan / this.months) + calculateInterestRate());
    }

    public int calculateYearsIntoMonths(int years) {
        int months = 0;
        for (int i = 0; i < years; i++) {
            months += 12;
        }
        return months;
    }
}