package com.kata.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddFractionTestShould
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
        assertEquals(new Fraction(3), sum);
    }

    @Test
    public void sumIntegerPlusZero() {
        Fraction sum = new Fraction(1).add(new Fraction(0));
        assertEquals(new Fraction(1), sum);
    }

    @Test
    public void sumIntegerPlusInteger() {
        Fraction sum = new Fraction(1).add(new Fraction(2));
        assertEquals(new Fraction(3), sum);
    }

    @Test
    public void sumNegativePlusPositiveAndObtainPositiveResult() {
        Fraction sum = new Fraction(-1).add(new Fraction(5));
        assertEquals(new Fraction(4), sum);
    }

    @Test
    public void sumNegativePlusPositiveAndObtainNegativeResult() {
        Fraction sum = new Fraction(-5).add(new Fraction(2));
        assertEquals(new Fraction(-3), sum);
    }

    @Test
    public void sumPositivePlusNegativeAndObtainPositiveResult() {
        Fraction sum = new Fraction(7).add(new Fraction(-6));
        assertEquals(new Fraction(1), sum);
    }

    @Test
    public void sumPositivePlusNegativeAndObtainNegativeResult() {
        Fraction sum = new Fraction(8).add(new Fraction(-10));
        assertEquals(new Fraction(-2), sum);
    }

    @Test
    public void sumNonTrivialEqualsDenominators() {
        Fraction sum = new Fraction(1, 3).add(new Fraction(1, 3));
        assertEquals(new Fraction(2, 3), sum);
    }
}
