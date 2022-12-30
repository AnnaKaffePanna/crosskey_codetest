package org.example;

public class LoanCalculator {
    private final ExchangeHandler exchangeHandler = new ExchangeHandler();

    public int calculateInterestRate(double interest, int months, int loanInCents) {
        int calculatedInterest = (int) (((interest/100)/months) * loanInCents); //We get the answer in euros, we exchange it to
                                                                    //cents before sending it back
        return calculatedInterest;
    }

    public double calculateMonthlyRate(int loan, int months, double interest){
        int result = loan / months;
        int result2 = result + calculateInterestRate(interest, months, loan);
        return exchangeHandler.centsIntoEuros(result2);
    }


    public double crosskeysFormula(double interest, int months, int loan){
        /*
        //int interestOnMonthlyBasis = calculateInterestRate(interest, months, loan);
        double interestOnMonthlyBasis = ((interest/100)/months);
        double thePower = powerTest(1+interestOnMonthlyBasis, months);
        double a = interestOnMonthlyBasis * thePower;
        double b = thePower -1;
        double d = a/b;
        //int c = exchangeHandler.eurosIntoCents(d);
        double  result = loan* d;*/


        //System.out.println(exchangeHandler.centsIntoEuros(result));
        double interestOnMonthlyBasis = ((interest/100)/months);
        double thePower = power((1+interestOnMonthlyBasis), months);

        double result = loan * (
                (interestOnMonthlyBasis * (powerTest(1+interestOnMonthlyBasis, months)) /
                (thePower-1)));



        return result;


    }
    public static double power(double base, int exponent) {
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

    public static double powerTest(double x, int n){
        if(n==0)
            return 1;

        if(n<0){
            x = 1.0/x;
            n = -n;
        }
        double ret = powerTest(x,n/2);
        ret = ret * ret;
        if(n%2!=0)
            ret = ret * x;
        return ret;
    }

    public double toThePowerOf(double base, int months){
        double result = 1;

        for (int power = months; power != 0; power--) {
            result = result * base;
        }
        System.out.println("Result =  " + result);

        return result;

    }

}