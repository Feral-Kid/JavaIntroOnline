package Lesson2.arrays.task3;

import Lesson2.arrays.ArrayCreator;

public class Main {
    public static void main(String[] args) {
        int n = ArrayCreator.inputArraySize();
        double[] array = ArrayCreator.createDoubleArray(n);
        int positiveElementsCounter = 0;
        int negativeElementsCounter = 0;
        int zeroElementsCounter = 0;
        for (double v : array) {
            if (v > 0) {
                positiveElementsCounter++;
            } else {
                if (v < 0) {
                    negativeElementsCounter++;
                } else {
                    zeroElementsCounter++;
                }
            }
        }
        System.out.println("Positive elements count: " + positiveElementsCounter);
        System.out.println("Negative elements count: " + negativeElementsCounter);
        System.out.println("Zero elements count: " + zeroElementsCounter);
    }
}
