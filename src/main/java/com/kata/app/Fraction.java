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
        if (that.integerValue > 0)
            return new Fraction(this.integerValue + that.integerValue);
        else
            return this;
    }

    public int intValue() {
        return integerValue;
    }
}
