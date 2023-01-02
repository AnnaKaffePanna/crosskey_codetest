package org.example;

public class MortgageService {
    MathUtil mathUtil = new MathUtil();
    public void printMortgages(final Customers customers) {
        for (int i = 0; i < customers.getCustomersList().size(); i++) {
            System.out.println("*****************************************************" +
                    "***********************************************\n");
            System.out.println("Prospect " + (i + 1) + ": " + customers.getCustomersList().get(i).getName()
                    + " wants to borrow "
                    + customers.getCustomersList().get(i).getLoan()
                    + "€ for a period of "
                    + customers.getCustomersList().get(i).getMonths() / 12 + " years and pay "
                    + mathUtil.roundUp(customers.calculateCustomerLoanAtIndex(i))
                    + "0€ each month.");
            System.out.println("\n*****************************************************" +
                    "***********************************************\n");
        }
    }
}
