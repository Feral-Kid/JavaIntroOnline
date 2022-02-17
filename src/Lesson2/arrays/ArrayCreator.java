package Lesson2.arrays;

import java.util.Scanner;

public class ArrayCreator {
    public static double[] createDoubleArray(int size) {
        System.out.println("Input array elements");
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "]: ");
            array[i] = scanner.nextDouble();
        }
        return array;
    }

    public static double[][] createDoubleArray(int sizeX, int sizeY) {
        System.out.println("Input array elements");
        Scanner scanner = new Scanner(System.in);
        double[][] array = new double[sizeX][sizeY];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextDouble();
            }
        }
        return array;
    }

    public static int[][] createIntArray(int sizeX, int sizeY) {
        System.out.println("Input array elements");
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[sizeX][sizeY];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    public static int[] createIntArray(int size) {
        System.out.println("Input array elements");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int inputArraySize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array dimension");
        return scanner.nextInt();
    }
}
