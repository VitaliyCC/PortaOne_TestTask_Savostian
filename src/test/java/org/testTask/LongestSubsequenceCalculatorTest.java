package org.testTask;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubsequenceCalculatorTest {

    @Test
    void testFindDescendingSequence() {
        List<Integer> nums = Arrays.asList(1, 5, 3, 2, 1, 7, 6, 4, 3, 2);
        List<Integer> expected = Arrays.asList(7, 6, 4, 3, 2);
        List<Integer> result = LongestSubsequenceCalculator.findDescendingSequence(nums);
        assertEquals(expected, result);
    }

    @Test
    void testFindAscendingSequence() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 1, 2, 4, 5, 6, 2, 1);
        List<Integer> expected = Arrays.asList(1, 2, 4, 5, 6);
        List<Integer> result = LongestSubsequenceCalculator.findAscendingSequence(nums);
        assertEquals(expected, result);
    }

    @Test
    void testEmptyList() {
        List<Integer> nums = Arrays.asList();
        List<Integer> resultDesc = LongestSubsequenceCalculator.findDescendingSequence(nums);
        List<Integer> resultAsc = LongestSubsequenceCalculator.findAscendingSequence(nums);
        assertTrue(resultDesc.isEmpty());
        assertTrue(resultAsc.isEmpty());
    }

    @Test
    void testSingleElement() {
        List<Integer> nums = Arrays.asList(5);
        List<Integer> expected = Arrays.asList(5);
        List<Integer> resultDesc = LongestSubsequenceCalculator.findDescendingSequence(nums);
        List<Integer> resultAsc = LongestSubsequenceCalculator.findAscendingSequence(nums);
        assertEquals(expected, resultDesc);
        assertEquals(expected, resultAsc);
    }

    @Test
    void testAllEqualElements() {
        List<Integer> nums = Arrays.asList(3, 3, 3, 3, 3);
        List<Integer> expected = Arrays.asList(3);
        List<Integer> resultDesc = LongestSubsequenceCalculator.findDescendingSequence(nums);
        List<Integer> resultAsc = LongestSubsequenceCalculator.findAscendingSequence(nums);
        assertEquals(expected, resultDesc);
        assertEquals(expected, resultAsc);
    }

    @Test
    void testDescendingSequenceWithNegativeNumbers() {
        List<Integer> nums = Arrays.asList(-1, -2, -3, -4, 0, 1, 2);
        List<Integer> expected = Arrays.asList(-1, -2, -3, -4);
        List<Integer> result = LongestSubsequenceCalculator.findDescendingSequence(nums);
        assertEquals(expected, result);
    }

    @Test
    void testAscendingSequenceWithNegativeNumbers() {
        List<Integer> nums = Arrays.asList(-4, -3, -2, -1, 0, -5, -4);
        List<Integer> expected = Arrays.asList(-4, -3, -2, -1, 0);
        List<Integer> result = LongestSubsequenceCalculator.findAscendingSequence(nums);
        assertEquals(expected, result);
    }

    @Test
    void testMultipleEqualLengthSequences() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 5, 4, 3, 2, 6, 7, 8);
        List<Integer> expectedAsc = Arrays.asList(1, 2, 3,5);
        List<Integer> expectedDesc = Arrays.asList(5, 4, 3, 2);
        List<Integer> resultAsc = LongestSubsequenceCalculator.findAscendingSequence(nums);
        List<Integer> resultDesc = LongestSubsequenceCalculator.findDescendingSequence(nums);
        assertEquals(expectedAsc.size(), resultAsc.size());
        assertEquals(expectedDesc, resultDesc);
    }
}