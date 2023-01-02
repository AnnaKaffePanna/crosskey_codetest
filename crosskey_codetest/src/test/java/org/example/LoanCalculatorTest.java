package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanCalculatorTest {
    LoanCalculator loanCalculator = new LoanCalculator();

    /**
     * Tests for calculateMonthlyInterest method
     */
    @Test
    void fivePercentYearlyInterestRateIntoMonthlyInterest(){
        assertEquals(0.004166666666666667, loanCalculator.calculateMonthlyInterest(5, 12));
    }
    @Test
    void monthlyInterestZeroTest(){
        assertEquals(0.0, loanCalculator.calculateMonthlyInterest(0, 0));
    }

    @Test
    void monthlyInterestNegativeValueTest(){
        assertEquals(0.0, loanCalculator.calculateMonthlyInterest(-1, -1));
    }

    @Test
    void zeroTestOnlyInterest(){
        assertEquals(0.0, loanCalculator.calculateMonthlyInterest(0, 12));
    }
    @Test
    void zeroTestOnlyMonths(){
        assertEquals(0.0, loanCalculator.calculateMonthlyInterest(5, 0));
    }

    @Test
    void negativeValueTestOnlyInterest(){
        assertEquals(0.0, loanCalculator.calculateMonthlyInterest(-1, 12));
    }

    @Test
    void negativeValueTestOnlyMonths(){
        assertEquals(0.0, loanCalculator.calculateMonthlyInterest(5, -1));
    }

    /**
     * Tests for calculateMonthlyRate method
     */

    @Test
    void calculateMonthlyRate(){
        assertEquals(85.60748178846744, loanCalculator.calculateMonthlyRate(5, 12, 1000));
    }

    @Test
    void calculateRateZeroTest(){
        assertEquals(0.0, loanCalculator.calculateMonthlyRate(0, 0, 0));
    }

    @Test
    void calculateRateNegativeValuesTest(){
        assertEquals(0.0, loanCalculator.calculateMonthlyRate(-1, -1, -1));
    }

    @Test
    void calculateRateWhenInterestIsZero(){
        assertEquals(0.0, loanCalculator.calculateMonthlyRate(0, 12, 1000));
    }

}