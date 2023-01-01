package org.example;


public class LoanCalculator {
    ExchangeMoney exchangeMoney = new ExchangeMoney();

    public double calculateMonthlyRate(double interest, int months, int loan){
        double interestOnMonthlyBasis = calculateMonthlyInterest(interest, months);
        double result = loan * (
                (interestOnMonthlyBasis * (ownPow(1+interestOnMonthlyBasis, months)) /
                (ownPow(1+interestOnMonthlyBasis, months) -1)));

        return result;
    }

    public double calculateMonthlyInterest(double interest, int months){
        return (interest/100)/months;
    }

    public static double ownPow(double base, int exponent) {
        double ans = 1;
        if (exponent != 0) {
            int absExponent = exponent > 0 ? exponent : (-1) * exponent;
            for (int i = 1; i <= absExponent; i++) {
                ans *= base;
            }

            if (exponent < 0) {
                // For negative exponent, must invert
                ans = 1.0 / ans;
            }
        } else {
            // exponent is 0
            ans = 1;
        }

        return ans;
    }
}