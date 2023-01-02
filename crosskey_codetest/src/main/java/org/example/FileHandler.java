package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileHandler {
    public Customers readFile() throws IOException {
        Customers customers = new Customers();

        int count = 0;
        InputStream is = getClass().getClassLoader().getResourceAsStream("prospects.txt");
        assert is != null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        String line;
        while ((line = reader.readLine()) != null) {
            if(count != 0  && !line.equals("") && !line.equals(".")) {
                String lineWithNoBrackets = line.replaceAll("\"", "");
                handleLine(lineWithNoBrackets, customers);
            }
            count ++;
        }

        return customers;
    }

    public void handleLine(String line, Customers customers){
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

                }
                insertCustomerIntoList(lineArray, customers);
                return;
            }
        }
    }

    public void insertCustomerIntoList(String[] lineArray, Customers customers){
        double loan = Double.parseDouble(lineArray[1]);
        double yearlyInterest = Double.parseDouble(lineArray[2]);
        int years = Integer.parseInt(lineArray[3]);

        Customer customer = new Customer(lineArray[0], loan, yearlyInterest, years);
        customers.getCustomersList().add(customer);
    }
}
