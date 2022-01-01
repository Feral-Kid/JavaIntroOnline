package Lesson1;

import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задания представлены в классе Lesson1Tasks
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Lesson 1: Please, enter lesson part number (0 - exit)");
            System.out.println("Part 1 - Linear programs");
            System.out.println("Part 2 - Branching");
            System.out.println("Part 3 - Cycles");
            int LessonPartNumber = scanner.nextInt();
            switch (LessonPartNumber) {
                case 0 -> {
                    isRunning = false;
                }
                case 1 -> {
                    System.out.println("Lesson 1: Part " + LessonPartNumber + " Please, enter task number (0 - exit)");
                    int taskNumber = scanner.nextInt();
                    switch (taskNumber) {
                        case 0 -> {
                            isRunning = false;
                            break;
                        }
                        case 1 -> {
                            System.out.println("Task 1:");
                            Lesson1Tasks.Part1.task1();
                            break;
                        }
                        case 2 -> {
                            System.out.println("Task 2:");
                            Lesson1Tasks.Part1.task2();
                            break;
                        }
                        case 3 -> {
                            System.out.println("Task 3:");
                            Lesson1Tasks.Part1.task3();
                            break;
                        }
                        case 4 -> {
                            System.out.println("Task 4:");
                            Lesson1Tasks.Part1.task4();
                            break;
                        }
                        case 5 -> {
                            System.out.println("Task 5:");
                            Lesson1Tasks.Part1.task5();
                            break;
                        }
                        case 6 -> {
                            System.out.println("Task 6:");
                            Lesson1Tasks.Part1.task6();
                            break;
                        }
                        default -> System.out.println("Incorrect number, please, try again");
                    }
                }
                case 2 -> {
                    System.out.println("Lesson 1: Part " + LessonPartNumber + " Please, enter task number (0 - exit)");
                    int taskNumber = scanner.nextInt();
                    switch (taskNumber) {
                        case 0 -> {
                            isRunning = false;
                            break;
                        }
                        case 1 -> {
                            System.out.println("Task 1:");
                            Lesson1Tasks.Part2.task1();
                            break;
                        }
                        case 2 -> {
                            System.out.println("Task 2:");
                            Lesson1Tasks.Part2.task2();
                            break;
                        }
                        case 3 -> {
                            System.out.println("Task 3:");
                            Lesson1Tasks.Part2.task3();
                            break;
                        }
                        case 4 -> {
                            System.out.println("Task 4:");
                            Lesson1Tasks.Part2.task4();
                            break;
                        }
                        case 5 -> {
                            System.out.println("Task 5:");
                            Lesson1Tasks.Part2.task5();
                            break;
                        }
                        default -> System.out.println("Incorrect number, please, try again");
                    }
                }
                case 3 -> {
                    System.out.println("Lesson 1: Part " + LessonPartNumber + " Please, enter task number (0 - exit)");
                    int taskNumber = scanner.nextInt();
                    switch (taskNumber) {
                        case 0 -> {
                            isRunning = false;
                            break;
                        }
                        case 1 -> {
                            System.out.println("Task 1:");
                            Lesson1Tasks.Part3.task1();
                            break;
                        }
                        case 2 -> {
                            System.out.println("Task 2:");
                            Lesson1Tasks.Part3.task2();
                            break;
                        }
                        case 3 -> {
                            System.out.println("Task 3:");
                            Lesson1Tasks.Part3.task3();
                            break;
                        }
                        case 4 -> {
                            System.out.println("Task 4:");
                            Lesson1Tasks.Part3.task4();
                            break;
                        }
                        case 5 -> {
                            System.out.println("Task 5:");
                            Lesson1Tasks.Part3.task5();
                            break;
                        }
                        case 6 -> {
                            System.out.println("Task 6:");
                            Lesson1Tasks.Part3.task6();
                            break;
                        }
                        case 7 -> {
                            System.out.println("Task 7:");
                            Lesson1Tasks.Part3.task7();
                            break;
                        }
                        case 8 -> {
                            System.out.println("Task 8:");
                            Lesson1Tasks.Part3.task8();
                            break;
                        }
                        default -> System.out.println("Incorrect number, please, try again");
                    }
                }
                default -> System.out.println("Please, Enter correct lesson part number");
            }


        }
        scanner.close();
    }
}
