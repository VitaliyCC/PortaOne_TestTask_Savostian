package org.testTask;

import java.util.List;

public class MinMaxAverageCalculation {
    Integer max;
    Integer min;
    long arithmeticMean;

    public void minMaxAverageCalculation (List<Integer>fileData){
        max = fileData.get(0);
        min = fileData.get(0);
        long sum = 0;

        for (Integer number : fileData) {
            int currentNumber = number;
            sum += number;
            if (currentNumber > max) {
                max = currentNumber;
            } else if (currentNumber < min) {
                min = currentNumber;
            }
        }

        arithmeticMean = sum / fileData.size();
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public long getArithmeticMean() {
        return arithmeticMean;
    }

    public void setArithmeticMean(long arithmeticMean) {
        this.arithmeticMean = arithmeticMean;
    }
}
