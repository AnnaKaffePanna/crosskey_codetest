package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileHandler fileHandler = new FileHandler();
        fileHandler.readFile();
        fileHandler.printFile();

        /*
        LoanCalculator test = new LoanCalculator();
        System.out.println(test.crosskeysFormula(5, 24, 1000)); //HM
        */

    }
}