package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthUtilTest {
    MonthUtil monthUtil = new MonthUtil();

    /**
     * Testcases for methods handling exchanges from months into year/years and vise verse
     */

    @Test
    void oneMonthIntoYears(){
        assertEquals(1, monthUtil.monthsIntoYears(12));
    }
    @Test
    void oneHundredAndEightyMonthsIntoYears(){
        assertEquals(15, monthUtil.monthsIntoYears(180));
    }

    @Test
    void monthsIntoYearsNullTest(){
        assertEquals(0, monthUtil.yearsIntoMonths(0));
    }
    @Test
    void monthsIntoYearsNegativeValueTest(){
        assertEquals(0, monthUtil.yearsIntoMonths(-1));
    }

    @Test
    void valueUnder12Months(){
        assertEquals(0, monthUtil.monthsIntoYears(1));
    }

}