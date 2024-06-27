package org.testTask;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class MedianCalculationTest {

    @Test
    void testOddNumberOfElements() {
        List<Integer> nums = Arrays.asList(3, 1, 4, 1, 5, 9, 2);
        double result = MedianCalculation.medianCalculation(nums);
        assertEquals(3.0, result, 0.001);
    }

    @Test
    void testEvenNumberOfElements() {
        List<Integer> nums = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6);
        double result = MedianCalculation.medianCalculation(nums);
        assertEquals(3.5, result, 0.001);
    }

    @Test
    void testSingleElement() {
        List<Integer> nums = Arrays.asList(5);
        double result = MedianCalculation.medianCalculation(nums);
        assertEquals(5.0, result, 0.001);
    }

    @Test
    void testTwoElements() {
        List<Integer> nums = Arrays.asList(1, 2);
        double result = MedianCalculation.medianCalculation(nums);
        assertEquals(1.5, result, 0.001);
    }

    @Test
    void testNegativeNumbers() {
        List<Integer> nums = Arrays.asList(-5, -2, -8, -1, -9);
        double result = MedianCalculation.medianCalculation(nums);
        assertEquals(-5.0, result, 0.001);
    }

    @Test
    void testMixedNumbers() {
        List<Integer> nums = Arrays.asList(-5, 0, 8, -1, 9, -3, 7);
        double result = MedianCalculation.medianCalculation(nums);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    void testDuplicateNumbers() {
        List<Integer> nums = Arrays.asList(1, 1, 2, 2, 3, 3);
        double result = MedianCalculation.medianCalculation(nums);
        assertEquals(2.0, result, 0.001);
    }

    @Test
    void testEmptyList() {
        List<Integer> nums = Arrays.asList();
        assertThrows(IndexOutOfBoundsException.class, () -> MedianCalculation.medianCalculation(nums));
    }
}