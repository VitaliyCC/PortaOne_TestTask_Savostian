package org.testTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class MinMaxAverageCalculationTest {

    private MinMaxAverageCalculation calculator;

    @BeforeEach
    void setUp() {
        calculator = new MinMaxAverageCalculation();
    }

    @Test
    void testMinMaxAverageCalculation() {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3, 7);
        calculator.minMaxAverageCalculation(numbers);

        assertEquals(9, calculator.getMax());
        assertEquals(1, calculator.getMin());
        assertEquals(5, calculator.getArithmeticMean());
    }

    @Test
    void testEmptyList() {
        List<Integer> emptyList = Arrays.asList();
        assertThrows(IndexOutOfBoundsException.class, () -> calculator.minMaxAverageCalculation(emptyList));
    }

    @Test
    void testSingleElementList() {
        List<Integer> singleElementList = Arrays.asList(42);
        calculator.minMaxAverageCalculation(singleElementList);

        assertEquals(42, calculator.getMax());
        assertEquals(42, calculator.getMin());
        assertEquals(42, calculator.getArithmeticMean());
    }

    @Test
    void testNegativeNumbers() {
        List<Integer> negativeNumbers = Arrays.asList(-5, -2, -8, -1, -9, -3, -7);
        calculator.minMaxAverageCalculation(negativeNumbers);

        assertEquals(-1, calculator.getMax());
        assertEquals(-9, calculator.getMin());
        assertEquals(-5, calculator.getArithmeticMean());
    }

    @Test
    void testMixedNumbers() {
        List<Integer> mixedNumbers = Arrays.asList(-5, 0, 8, -1, 9, -3, 7);
        calculator.minMaxAverageCalculation(mixedNumbers);

        assertEquals(9, calculator.getMax());
        assertEquals(-5, calculator.getMin());
        assertEquals(2, calculator.getArithmeticMean());
    }
}