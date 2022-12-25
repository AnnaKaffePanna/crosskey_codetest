package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FileHandler {
    Customers customers = new Customers();
    void test() throws IOException {
        int count = 0;
        InputStream is = getClass().getClassLoader().getResourceAsStream("prospects.txt");
        assert is != null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder out = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            if(count != 0  && !line.equals("") && !line.equals(".")) {
                out.append(line);   // add everything to StringBuilder
                insertIntoCustomerClass(line);

            }
            count ++;
        }
        //System.out.println(out);
        System.out.println(customers.getCustomersList().get(1).getName());
    }

    public void insertIntoCustomerClass(String line){
        String[] testArray = line.split(",");
        if(testArray.length > 3){

        }
        else {
            double loan = Double.parseDouble(testArray[1]);
            double interest = Double.parseDouble(testArray[2]);
            int years = Integer.parseInt(testArray[3]);

            Customer customer = new Customer(testArray[0], loan, interest, years);
            customers.getCustomersList().add(customer);
        }

        System.out.println(Arrays.toString(testArray));
    }



}
