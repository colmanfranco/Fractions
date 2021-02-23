package com.kata.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddFractionTestShould
{
    @Test
    public void sumZeroPlusZero() {
        assertEquals(new Fraction(0), new Fraction(0).add(new Fraction(0)));
    }

    @Test
    public void sumZeroPlusInteger() {
        assertEquals(new Fraction(3), new Fraction(0).add(new Fraction(3)));
    }

    @Test
    public void sumIntegerPlusZero() {
        assertEquals(new Fraction(1), new Fraction(1).add(new Fraction(0)));
    }

    @Test
    public void sumIntegerPlusInteger() {
        assertEquals(new Fraction(3), new Fraction(1).add(new Fraction(2)));
    }

    @Test
    public void sumNegativePlusPositiveAndObtainPositiveResult() {
        assertEquals(new Fraction(4), new Fraction(-1).add(new Fraction(5)));
    }

    @Test
    public void sumNegativePlusPositiveAndObtainNegativeResult() {
        assertEquals(new Fraction(-3), new Fraction(-5).add(new Fraction(2)));
    }

    @Test
    public void sumPositivePlusNegativeAndObtainPositiveResult() {
        assertEquals(new Fraction(1), new Fraction(7).add(new Fraction(-6)));
    }

    @Test
    public void sumPositivePlusNegativeAndObtainNegativeResult() {
        assertEquals(new Fraction(-2), new Fraction(8).add(new Fraction(-10)));
    }

    @Test
    public void sumNonTrivialEqualsDenominators() {
        assertEquals(new Fraction(2, 3), new Fraction(1, 3).add(new Fraction(1, 3)));
    }

    @Test
    public void differentDenominator() {
        assertEquals(new Fraction(5, 6), new Fraction(1, 2).add(new Fraction(1, 3)));
    }
}
