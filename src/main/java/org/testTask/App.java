package org.testTask;

import java.util.List;

public class App {
    public static void main(String[] args) {
        FileReader reader = new FileReader();
        MinMaxAverageCalculation calculator = new MinMaxAverageCalculation();
        String filePath = "10m.txt";
        double median;
        List<Integer> descendingSequence;
        List<Integer> increasingSequence;

        long startTime = System.nanoTime();
        List<Integer> fileData = reader.readDataFromFile(filePath);

        calculator.minMaxAverageCalculation(fileData);
        descendingSequence = LongestSubsequenceCalculator.findDescendingSequence(fileData);
        increasingSequence = LongestSubsequenceCalculator.findAscendingSequence(fileData);
        median = MedianCalculation.medianCalculation(fileData);

        long endTime = System.nanoTime();
        long executionTimeMillis = (endTime - startTime) / 1_000_000;

        System.out.println("Execution time: " + executionTimeMillis + " ms");
        System.out.println("Maximum value: " + calculator.max);
        System.out.println("Minimum value: " + calculator.min);
        System.out.println("Median: " + median);
        System.out.println("Arithmetic mean: " + calculator.arithmeticMean);
        System.out.println("Longest descending sequence: " + descendingSequence);
        System.out.println("Longest increasing sequence: " + increasingSequence);
    }
}
