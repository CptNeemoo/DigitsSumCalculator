package com.cptneemoo;

import java.util.logging.Logger;

public class DigitSumCalculator {

    private static Logger log = Logger.getLogger(DigitSumCalculator.class.getName());

    public static void main(String[] args) {
        long number1 = 12345;
        long number2 = 10000000;
        log.info(String.format("The sum of number %d with modulo function is %d",
                number1, DigitSumCalculator.sumDigitsModulo(number1)));
        log.info(String.format("The sum of number %d with char function is %d",
                number1, DigitSumCalculator.sumDigitsChar(number1)));
        log.info(String.format("The sum of number %d with modulo function is %d",
                number2, DigitSumCalculator.sumDigitsModulo(number2)));
        log.info(String.format("The sum of number %d with char function is %d",
                number2, DigitSumCalculator.sumDigitsChar(number2)));
    }

    //function to count the sum of digits in the number with modulo operation
    static int sumDigitsModulo(long number) {
        int sum = 0;
        long tmpNumber = number;
        while (tmpNumber != 0) {
            sum += tmpNumber % 10;
            tmpNumber /= 10;
        }
        return sum;
    }

    static int sumDigitsChar(long number) {
        return Long.toString(number)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }
}
