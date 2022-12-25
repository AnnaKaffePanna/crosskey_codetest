package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileHandler {
    void test() throws IOException {
        int count = 0;
        InputStream is = getClass().getClassLoader().getResourceAsStream("prospects.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder out = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            if(count != 0  && !line.equals("")) {
                out.append(line);   // add everything to StringBuilder
            }
            count ++;
        }

        System.out.println(out);
    }
}
