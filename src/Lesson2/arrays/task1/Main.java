package Lesson2.arrays.task1;

import Lesson2.arrays.ArrayCreator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = ArrayCreator.inputArraySize();
        int[] a = ArrayCreator.createIntArray(n);
        System.out.println("Input K");
        int k = scanner.nextInt();
        int sum = 0;
        for (int j : a) {
            if (j % k == 0) {
                sum += j;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Sum = " + sum);
    }
}
