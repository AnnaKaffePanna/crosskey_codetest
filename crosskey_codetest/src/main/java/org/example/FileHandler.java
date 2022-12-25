package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FileHandler {
    private final Customers customers = new Customers();
    private final ExchangeHandler exchangeHandler = new ExchangeHandler();


    void readFile() throws IOException {
        int count = 0;
        InputStream is = getClass().getClassLoader().getResourceAsStream("prospects.txt");
        assert is != null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        //StringBuilder out = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            if(count != 0  && !line.equals("") && !line.equals(".")) {
                String lineWithNoBrackets = line.replaceAll("\"", "");
                //out.append(lineWithNoBrackets);   // add everything to StringBuilder
                handleLine(lineWithNoBrackets);

            }
            count ++;
        }
        /*
        System.out.println(customers.getCustomersList().get(0).toString());
        System.out.println(customers.getCustomersList().get(1).toString());
        System.out.println(customers.getCustomersList().get(2).toString());
        System.out.println(customers.getCustomersList().get(3).toString());
        */
    }

    private void handleLine(String line){
        String[] lineArray = line.split(",");

        for(int i = 0; i < lineArray.length; i++){
            if(!Character.isDigit(lineArray[i].charAt(i))){
                if(!Character.isDigit(lineArray[i+1].charAt(i))){
                    lineArray[i] = lineArray[i] + " " + lineArray[i+1];
                    for(int j = i+1; j < lineArray.length; j++){
                        if(j != 4){
                            lineArray[j]= lineArray[j+1];
                        }
                    }
                    lineArray[lineArray.length-1] = null;

                    insertCustomerIntoList(lineArray);
                    return;
                }

                else {
                    insertCustomerIntoList(lineArray);
                    return;
                }
            }
        }
    }

    private void insertCustomerIntoList(String[] lineArray){
        double loan = Double.parseDouble(lineArray[1]);
        double interest = Double.parseDouble(lineArray[2]);
        int years = Integer.parseInt(lineArray[3]);

        Customer customer = new Customer(lineArray[0], loan, interest, years);
        customers.getCustomersList().add(customer);
    }

    public void printFile(){
        for(int i = 0; i < customers.getCustomersList().size(); i++) {
            System.out.println("*****************************************************" +
                                "***********************************************\n");
            System.out.println("Prospect " + (i+1) + ": "+ customers.getCustomersList().get(i).getName()
                                + " wants to borrow "
                                + exchangeHandler.centsIntoEuros(customers.getCustomersList().get(i).getLoanInCents())
                                + "€ for a period of "
                                + customers.getCustomersList().get(i).getMonths()/12 + " years and pay "
                                + customers.activateLoanCalculator(i) + "€ each month.");
            System.out.println("\n*****************************************************" +
                                "***********************************************\n");

        }

    }
}
