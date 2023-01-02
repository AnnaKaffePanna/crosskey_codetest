package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    /**
     * Tests for roundUp method
     */

    @Test
    void roundUpToOne(){
        assertEquals(1.0, MathUtil.roundUp(0.95));
    }

    @Test
    void noRoundUp(){
        assertNotEquals(1.0, MathUtil.roundUp(0.94));
    }

    @Test
    void roundUpNullTest(){
        assertEquals(0, MathUtil.roundUp(0.00));
    }

    /**
     * Tests for ownPow method
     */

    @Test
    void baseTwoAndExponentTwoEqualsFour(){
        assertEquals(Math.pow(2,2), MathUtil.ownPow(2,2)); //Answer is 4
    }

    @Test
    void negativeBaseTwoAndExponentTwoEqualsPositiveFour(){
        assertEquals(Math.pow(-2,2), MathUtil.ownPow(-2, 2)); //Answer is 4
    }

    @Test
    void negativeBasTwoAndExponentThreeEqualsNegativeEight(){
        assertEquals(Math.pow(-2, 3), MathUtil.ownPow(-2, 3)); //Answer is -8
    }

    @Test
    void negativeBaseAndNegativeExponent() {
        assertEquals(Math.pow(-2, -2), MathUtil.ownPow(-2, -2)); //Answer is -0.25
    }

    @Test
    void ownPowNullTest(){
        assertEquals(Math.pow(0,0), MathUtil.ownPow(0,0));
    }

    @Test
    void onlyExponentIsNullEqualsOne(){
        assertEquals(Math.pow(2,0), MathUtil.ownPow(2,0)); //Answer is 1
    }
}