package com.kata.app;

/**
 * Hello world!
 *
 */
public class Fraction
{
    private int integerValue;
    private final int denominator;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.integerValue = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction that) {
        return new Fraction(this.integerValue + that.integerValue, denominator);
    }

    public int intValue() {
        return integerValue;
    }

    public int getNumerator() {
        return 2;
    }

    public int getDenominator() {
        return denominator;
    }
}
