package org.example;


public class LoanCalculator {
    private final MathUtils mathUtils = new MathUtils();
    public double calculateMonthlyRate(final double yearlyInterest, final int months, final double loan){
        double interestOnMonthlyBasis = calculateMonthlyInterest(yearlyInterest, months);

        return loan * (
                (interestOnMonthlyBasis * (MathUtils.ownPow(1+interestOnMonthlyBasis, months)) /
                (MathUtils.ownPow(1+interestOnMonthlyBasis, months) -1)));
    }

    public double calculateMonthlyInterest(final double yearlyInterest, final int months){
        return (yearlyInterest/100)/months;
    }
}