package com.kata.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FractionEqualsTest {
    @Test
    public void sameNumeratorAndDenominator() {
        assertEquals(new Fraction(3, 5), new Fraction(3, 5));
    }

    @Test
    public void differentNumerator() {
        assertNotEquals(new Fraction(1, 5), new Fraction(2, 5));
    }

    @Test
    public void differentDenominator() {
        assertNotEquals(new Fraction(1, 5), new Fraction(1, 6));
    }

    @Test
    public void wholeNumberEqualsSameFraction() {
        assertEquals(new Fraction(5), new Fraction(5, 1));
    }

    @Test
    public void wholeNumberNotEqualToDifferentWholeNumber() {
        assertNotEquals(new Fraction(6), new Fraction(5));
    }
}
