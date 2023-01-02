package org.example;

public class MortgageService {
    MathUtils mathUtils = new MathUtils();
    public void printMortgages(final Customers customers) {
        //DecimalFormat df = new DecimalFormat();
        //df.setMaximumFractionDigits(2);
        for (int i = 0; i < customers.getCustomersList().size(); i++) {
            System.out.println("*****************************************************" +
                    "***********************************************\n");
            System.out.println("Prospect " + (i + 1) + ": " + customers.getCustomersList().get(i).getName()
                    + " wants to borrow "
                    + customers.getCustomersList().get(i).getLoan()
                    + "€ for a period of "
                    + customers.getCustomersList().get(i).getMonths() / 12 + " years and pay "
                    + mathUtils.roundUp(customers.calculateCustomerLoanAtIndex(i))
                    + "0€ each month.");
            System.out.println("\n*****************************************************" +
                    "***********************************************\n");
        }
    }
}
