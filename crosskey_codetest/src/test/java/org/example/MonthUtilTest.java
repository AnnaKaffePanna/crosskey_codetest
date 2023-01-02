package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthUtilTest {

    /**
     * Testcases for methods handling exchanges from months into year/years and vise verse
     */

    @Test
    void oneMonthIntoYears(){
        assertEquals(1, MonthUtil.monthsIntoYears(12));
    }
    @Test
    void oneHundredAndEightyMonthsIntoYears(){
        assertEquals(15, MonthUtil.monthsIntoYears(180));
    }

    @Test
    void monthsIntoYearsNullTest(){
        assertEquals(0, MonthUtil.yearsIntoMonths(0));
    }
    @Test
    void monthsIntoYearsNegativeValueTest(){
        assertEquals(0, MonthUtil.yearsIntoMonths(-1));
    }

    @Test
    void valueUnder12Months(){
        assertEquals(0, MonthUtil.monthsIntoYears(1));
    }

}