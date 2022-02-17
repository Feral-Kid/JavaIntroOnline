package Lesson2.arrays.task4;

import Lesson2.arrays.ArrayCreator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = ArrayCreator.inputArraySize();
        double[] array = ArrayCreator.createDoubleArray(n);
        int minElIndex = 0;
        int maxElIndex = 0;
        double minEl = 0;
        double maxEl = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minEl) {
                minEl = array[i];
                minElIndex = i;
            }
            if (array[i] > maxEl) {
                maxEl = array[i];
                maxElIndex = i;
            }
        }
        double temp = array[minElIndex];
        array[minElIndex] = array[maxElIndex];
        array[maxElIndex] = temp;
        System.out.println(Arrays.toString(array));
    }
}
