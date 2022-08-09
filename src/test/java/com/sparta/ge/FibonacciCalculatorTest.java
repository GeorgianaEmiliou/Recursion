package com.sparta.ge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FibonacciCalculatorTest {

    @Test
    @DisplayName("Give the number 8 return 21")
    public void giveTheNumber8(){
        int number = 8;
        int expectedAnswer = 21;
        int answer = FibonacciCalculator.getFibonacci(number);
        Assertions.assertEquals(expectedAnswer, answer);
    }
}
