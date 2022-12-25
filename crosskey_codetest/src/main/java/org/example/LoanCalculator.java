package org.example;

public class LoanCalculator {
    //private final ExchangeHandler exchangeHandler = new ExchangeHandler();

    public double calculateInterestRate(double interest, int months, int loan) {
        return ((interest / 100) / months) * loan;
    }

    public double calculateMonthlyRate(int loan, int months, double interest){
        //int result = (int) ((loan / months) + calculateInterestRate(interest, months, loan)); //Maybe wrong?
        return (loan / months) + calculateInterestRate(interest, months, loan);
    }

}