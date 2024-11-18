package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestFraction {

    @Test(expected = NullDenominatorException.class)
    public void testZeroDenominator() throws NullDenominatorException {
        Fraction fraction = new Fraction(1, 0); // Ожидается исключение
    }

    @Test
    public void testValidFraction() throws NullDenominatorException {
        Fraction fraction = new Fraction(3, 7);
        assertEquals(3, fraction.getNumerator());
        assertEquals(7, fraction.getDenominator());
    }
}