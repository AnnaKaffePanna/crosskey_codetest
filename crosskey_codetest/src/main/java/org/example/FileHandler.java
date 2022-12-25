package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FileHandler {
    void test() throws IOException {
        int count = 0;
        InputStream is = getClass().getClassLoader().getResourceAsStream("prospects.txt");
        assert is != null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder out = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            if(count != 0  && !line.equals("")) {
                out.append(line);   // add everything to StringBuilder
                insertIntoCustomerClass(line);

            }
            count ++;
        }

        System.out.println(out);
    }

    public void insertIntoCustomerClass(String line){
        String[] testArray = line.split(",");
        if(testArray.length < 3){

        }
        else {
            Customer customer = new Customer(testArray[0], testArray[1], testArray[2], testArray[3]);
        }
            /*
            boolean flag = Character.isDigit(line.charAt(i));
            //checks if one character is a letter or number
            if(flag){
                char result = 0;
                for(int j = 0; j < i; j++){
                    result += line.charAt(j);
                }
                 //testArrayString[0] = r


*/
        System.out.println(Arrays.toString(testArray));
    }



}
