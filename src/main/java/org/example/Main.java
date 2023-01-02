package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final FileHandler fileHandler = new FileHandler();
        final Customers customers = fileHandler.readFile();

        final MortgageService mortgageService = new MortgageService();
        mortgageService.printMortgages(customers);
    }
}