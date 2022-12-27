package org.example;

public class LoanCalculator {
    private final ExchangeHandler exchangeHandler = new ExchangeHandler();

    public int calculateInterestRate(double interest, int months, int loan) {
        int calculatedInterest = (int) (((interest/100)/months) * loan); //We get the answer in euros, we exchange it to
                                                                    //cents before sending it back
        return calculatedInterest;
    }

    public double calculateMonthlyRate(int loan, int months, double interest){
        int result = loan / months;
        int result2 = result + calculateInterestRate(interest, months, loan);
        return exchangeHandler.centsIntoEuros(result2);
    }


    public double crosskeysFormula(double interest, int months, int loan){
/*        int interestOnMonthlyBasis = calculateInterestRate(interest, months, loan);
        int thePower = toThePowerOf(1+interestOnMonthlyBasis, months);
        int a = interestOnMonthlyBasis * thePower;
        int b = thePower -1;
        double d = (double)a/b;
        int c = exchangeHandler.eurosIntoCents(d);
        int result = loan * c;
        //System.out.println(exchangeHandler.centsIntoEuros(result));*/

        double interestOnMonthlyBasis = exchangeHandler.centsIntoEuros(calculateInterestRate(interest, months, loan));
        double thePower = toThePowerOf(1+interestOnMonthlyBasis, months);
        double a = interestOnMonthlyBasis * thePower;
        double b = thePower -1;
        double d = a/b;
        //int c = exchangeHandler.eurosIntoCents(d);
        double result = (loan /100) * d;
        //System.out.println(exchangeHandler.centsIntoEuros(result));v


        return result;
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