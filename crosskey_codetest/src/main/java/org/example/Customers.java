package org.example;

import java.util.ArrayList;
import java.util.List;

public class Customers {
    private final List<Customer> customersList = new ArrayList<>();

    public List<Customer> getCustomersList() {
        return customersList;
    }

    public double activateLoanCalculator(int index){
        LoanCalculator loanCalculator = new LoanCalculator();
        double result = loanCalculator.calculateMonthlyRate(customersList.get(index).getLoanInCents(),
                                                            customersList.get(index).getMonths(),
                                                            customersList.get(index).getInterest());

        return result;
    }
}
