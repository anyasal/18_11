package org.example;
public class Fraction {
    private final int numerator;
    private final int denominator;
    public Fraction(int numerator, int denominator) throws NullDenominatorException {
        if (denominator == 0) {
            throw new NullDenominatorException("Знаменатель не может быть равным нулю.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    // Геттеры для числителя и знаменателя
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
}