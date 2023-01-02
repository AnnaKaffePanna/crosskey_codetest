package org.example;


public class LoanCalculator {
    public double calculateMonthlyRate(final double yearlyInterest, final int months, final double loan){
        if(yearlyInterest <= 0 || months < 12 || loan <= 0){
            return 0.0;
        }

        double interestOnMonthlyBasis = calculateMonthlyInterest(yearlyInterest, months);

        return loan * (
                (interestOnMonthlyBasis * (MathUtil.ownPow(1+interestOnMonthlyBasis, months)) /
                (MathUtil.ownPow(1+interestOnMonthlyBasis, months) -1)));
    }

    public double calculateMonthlyInterest(final double yearlyInterest, final int months){
        if(yearlyInterest < 0 || months < 12){
            return 0.0;
        }
        return (yearlyInterest/100)/months;
    }
}