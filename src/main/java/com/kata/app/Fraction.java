package com.kata.app;

/**
 * Hello world!
 *
 */
public class Fraction
{
    private final int integerValue;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }

    public Fraction add(Fraction that) {
            return new Fraction(this.integerValue + that.integerValue);
    }

    public int intValue() {
        return integerValue;
    }
}
