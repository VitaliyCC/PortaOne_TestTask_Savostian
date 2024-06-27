package org.testTask;

import java.util.ArrayList;
import java.util.List;

public class LongestSubsequenceCalculator {

    public static List<Integer> findDescendingSequence(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        List<Integer> currentSequence = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            currentSequence.clear();
            currentSequence.add(nums.get(i));

            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(j) < nums.get(j - 1)) {
                    currentSequence.add(nums.get(j));
                } else {
                    break;
                }
            }

            if (currentSequence.size() > result.size()) {
                result.clear();
                result.addAll(currentSequence);
            }
        }
        return result;
    }

    public static List<Integer> findAscendingSequence(List<Integer> nums) {

        List<Integer> result = new ArrayList<>();
        List<Integer> currentSequence = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            currentSequence.clear();
            currentSequence.add(nums.get(i));

            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(j) > nums.get(j - 1)) {
                    currentSequence.add(nums.get(j));
                } else {
                    break;
                }
            }

            if (currentSequence.size() > result.size()) {
                result.clear();
                result.addAll(currentSequence);
            }
        }
        return result;
    }
}
