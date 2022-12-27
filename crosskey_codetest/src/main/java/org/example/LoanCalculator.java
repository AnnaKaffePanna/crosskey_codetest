package org.example;

public class LoanCalculator {
    private final ExchangeHandler exchangeHandler = new ExchangeHandler();

    public int calculateInterestRate(double interest, int months, int loan) {
        double calculatedInterest = ((interest/100)/months) * loan; //We get the answer in euros, we exchange it to
                                                                    //cents before sending it back
        return exchangeHandler.eurosIntoCents(calculatedInterest);
    }

    public double calculateMonthlyRate(int loan, int months, double interest){
        int result = ((loan / months) + calculateInterestRate(interest, months, loan)); //Maybe wrong?
        return exchangeHandler.centsIntoEuros(result);
    }

    /*
    public void crosskeysFormula(int load, int months, double interest){
        int result;
        double

    }*/

}