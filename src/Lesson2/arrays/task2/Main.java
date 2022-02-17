package Lesson2.arrays.task2;

import Lesson2.arrays.ArrayCreator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = ArrayCreator.inputArraySize();
        double[] array = ArrayCreator.createDoubleArray(n);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Z");
        double z = scanner.nextDouble();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                counter++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Replacements count " + counter);
    }
}
