package com.cptneemoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitSumCalculatorTest {

    @Test
    void digitsSumModulo() {
        assertEquals(15, DigitSumCalculator.sumDigitsModulo(12345));
        assertEquals(6, DigitSumCalculator.sumDigitsModulo(123));
    }

    @Test
    void digitsSumChar() {
        assertEquals(15, DigitSumCalculator.sumDigitsModulo(12345));
        assertEquals(6, DigitSumCalculator.sumDigitsModulo(123));
    }
}