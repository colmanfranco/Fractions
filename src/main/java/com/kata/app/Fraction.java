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
            return that;
        else
            return this;
    }

    public int intValue() {
        return integerValue;
    }
}
