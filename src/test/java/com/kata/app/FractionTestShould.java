package com.kata.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FractionTestShould
{
    @Test
    public void sumZeroPlusZero()
    {
        Fraction sum = new Fraction(0).add(new Fraction(0));
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumZeroPlusInteger() {
        Fraction sum = new Fraction(0).add(new Fraction(3));
        assertEquals(3, sum.intValue());
    }

    @Test
    public void sumIntegerPlusZero() {
        Fraction sum = new Fraction(1).add(new Fraction(0));
        assertEquals(1, sum.intValue());
    }

    @Test
    public void sumIntegerPlusInteger() {
        Fraction sum = new Fraction(1).add(new Fraction(2));
        assertEquals(3, sum.intValue());
    }

    @Test
    public void sumNegativePlusPositiveAndObtainPositiveResult() {
        Fraction sum = new Fraction(-1).add(new Fraction(5));
        assertEquals(4, sum.intValue());
    }

    @Test
    public void sumNegativePlusPositiveAndObtainNegativeResult() {
        Fraction sum = new Fraction(-5).add(new Fraction(2));
        assertEquals(-3, sum.intValue());
    }

    @Test
    public void sumPositivePlusNegativeAndObtainPositiveResult() {
        Fraction sum = new Fraction(7).add(new Fraction(-6));
        assertEquals(1, sum.intValue());
    }

    @Test
    public void sumPositivePlusNegativeAndObtainNegativeResult() {
        Fraction sum = new Fraction(8).add(new Fraction(-10));
        assertEquals(-2, sum.intValue());
    }
}
