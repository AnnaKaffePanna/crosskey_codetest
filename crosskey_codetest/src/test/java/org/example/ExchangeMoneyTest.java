package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeMoneyTest {

    ExchangeMoney exchangeMoney = new ExchangeMoney();
    /**
     * Testcases for methods handling exchanges from euro into cents
     */

    @Test
    void oneEuroIsOneHundredCents(){
        assertEquals(100, exchangeMoney.eurosIntoCents(1));
    }

    @Test
    void euroIntoCentsNullTest(){
        assertEquals(0, exchangeMoney.eurosIntoCents(0));
    }

    @Test
    void euroIntoCentsNegativeValueTest(){
        assertEquals(0, exchangeMoney.eurosIntoCents(-1));
    }

    /**
     * Testcases for methods handling exchanges from cents into euros
     */

    @Test
    void OneHundredCentsIsOneEuro(){
        assertEquals(1, exchangeMoney.centsIntoEuros(100));
    }

    @Test
    void centsIntoCentsNullTest(){
        assertEquals(0.0, exchangeMoney.centsIntoEuros(0));
    }

    @Test
    void centsIntoCentsNegativeValueTest(){
        assertEquals(0.0, exchangeMoney.centsIntoEuros(-100));
    }

}