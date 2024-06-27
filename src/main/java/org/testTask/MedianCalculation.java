package org.testTask;

import java.util.Collections;
import java.util.List;

public class MedianCalculation {

    public static double medianCalculation(List<Integer> nums) {
        int size = nums.size();

        if (size % 2 == 1) {
            return quickSelect(nums, 0, size - 1, size / 2);

        } else {
            double median1 = quickSelect(nums, 0, size - 1, size / 2 - 1);
            double median2 = quickSelect(nums, 0, size - 1, size / 2);
            return (median1 + median2) / 2.0;
        }
    }

    private static double quickSelect(List<Integer> nums, int low, int high, int k) {
        int pivotIndex = partition(nums, low, high);

        if (pivotIndex == k) {
            return nums.get(pivotIndex);
        } else if (pivotIndex < k) {
            return quickSelect(nums, pivotIndex + 1, high, k);
        } else {
            return quickSelect(nums, low, pivotIndex - 1, k);
        }
    }

    private static int partition(List<Integer> nums, int low, int high) {
        int pivot = nums.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (nums.get(j) <= pivot) {
                i++;
                Collections.swap(nums, i, j);
            }
        }

        Collections.swap(nums, i + 1, high);
        return i + 1;
    }
}
