package org.example;

public class LoanCalculator {
    //Loan is in cents

    /*
    private final int loan;
    private final double interest;
    private final int months;*/

    private final ExchangeHandler exchangeHandler = new ExchangeHandler();

    /*
    public LoanCalculator(int loan, double interest, int years) throws IllegalArgumentException{
        //ToDo: handle exceptions like -0 and loans being 0, could a factory method be a solution?
        if (loan > 0 && interest >= 0 && years >= 1) {
            this.loan = exchangeMoneyHandler.eurosIntoCents(loan);
            this.interest = interest;
            this.months = calculateYearsIntoMonths(years);
        }
        this.loan = exchangeHandler.eurosIntoCents(loan);
        this.interest = interest;
        this.months = exchangeHandler.calculateYearsIntoMonths(years);
    }
    */

    public double calculateInterestRate(double interest, int months, int loan) {
        return ((interest / 100) / months) * loan;
    }

    public double calculateMonthlyRate(int loan, int months, double interest){
        int result = (int) ((loan / months) + calculateInterestRate(interest, months, loan)); //Maybe wrong?
        return exchangeHandler.centsIntoEuros(result);
    }

}