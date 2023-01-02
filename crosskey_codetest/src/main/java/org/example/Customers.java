package org.example;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Customers {
    private final List<Customer> customersList = new ArrayList<>();

    public List<Customer> getCustomersList() {
        return customersList;
    }

    public double calculateCustomerLoanAtIndex(final int index) {
        final LoanCalculator loanCalculator = new LoanCalculator();

        return loanCalculator.calculateMonthlyRate(customersList.get(index).getYearlyInterest(),
                customersList.get(index).getMonths(),
                customersList.get(index).getLoan());
    }
}
