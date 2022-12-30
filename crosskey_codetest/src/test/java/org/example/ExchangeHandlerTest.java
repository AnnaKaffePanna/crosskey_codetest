package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeHandlerTest {


    //Creating the ExchangeHandler, is used for all the testcases.
    ExchangeHandler exchangeHandler = new ExchangeHandler();

    /**
     * Testcases for methods handling exchanges from euro into cents
     */

    @Test
    void oneEuroIsOneHundredCents(){
        assertEquals(100, exchangeHandler.eurosIntoCents(1));
    }

    @Test
    void euroIntoCentsNullTest(){
        assertEquals(0, exchangeHandler.eurosIntoCents(0));
    }

    @Test
    void euroIntoCentsNegativeValueTest(){
        assertEquals(0, exchangeHandler.eurosIntoCents(-1));
    }

    /**
     * Testcases for methods handling exchanges from cents into euros
     */

    @Test
    void OneHundredCentsIsOneEuro(){
        assertEquals(1, exchangeHandler.centsIntoEuros(100));
    }

    @Test
    void centsIntoCentsNullTest(){
        assertEquals(0.0, exchangeHandler.centsIntoEuros(0));
    }

    @Test
    void centsIntoCentsNegativeValueTest(){
        assertEquals(0.0, exchangeHandler.centsIntoEuros(-100));
    }

    /**
     * Testcases for methods handling exchanges from year/years into months
     */

    @Test
    void oneYearIntoMonth(){
        assertEquals(12, exchangeHandler.yearsIntoMonths(1));
    }

    @Test
    void fifteenYearsIntoMonth(){
        assertEquals(180, exchangeHandler.yearsIntoMonths(15));
    }

    @Test
    void yearsIntoMonthNullTest(){
        assertEquals(0, exchangeHandler.yearsIntoMonths(0));
    }
    @Test
    void yearsIntoMonthNegativeValueTest(){
        assertEquals(0, exchangeHandler.yearsIntoMonths(-1));
    }

    /**
     * Testcases for methods handling exchanges from months into year/years
     */

    @Test
    void oneMonthIntoYears(){
        assertEquals(1, exchangeHandler.monthsIntoYears(12));
    }
    @Test
    void oneHundredAndEightyMonthsIntoYears(){
        assertEquals(15, exchangeHandler.monthsIntoYears(180));
    }

    @Test
    void monthsIntoYearsNullTest(){
        assertEquals(0, exchangeHandler.yearsIntoMonths(0));
    }
    @Test
    void monthsIntoYearsNegativeValueTest(){
        assertEquals(0, exchangeHandler.yearsIntoMonths(-1));
    }

    @Test
    void valueUnder12Months(){
        assertEquals(0, exchangeHandler.monthsIntoYears(1));
    }

}