package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeYearsAndMonthsTest {
    ExchangeYearsAndMonths exchangeYearsAndMonths = new ExchangeYearsAndMonths();

    /**
     * Testcases for methods handling exchanges from months into year/years
     */

    @Test
    void oneMonthIntoYears(){
        assertEquals(1, exchangeYearsAndMonths.monthsIntoYears(12));
    }
    @Test
    void oneHundredAndEightyMonthsIntoYears(){
        assertEquals(15, exchangeYearsAndMonths.monthsIntoYears(180));
    }

    @Test
    void monthsIntoYearsNullTest(){
        assertEquals(0, exchangeYearsAndMonths.yearsIntoMonths(0));
    }
    @Test
    void monthsIntoYearsNegativeValueTest(){
        assertEquals(0, exchangeYearsAndMonths.yearsIntoMonths(-1));
    }

    @Test
    void valueUnder12Months(){
        assertEquals(0, exchangeYearsAndMonths.monthsIntoYears(1));
    }

}