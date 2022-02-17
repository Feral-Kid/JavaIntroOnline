package lesson4.Part1.Task3;

import java.util.Scanner;

public class Main {
    public static void fillStudentsArray(Student students[]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.next();
            System.out.print("Enter student group: ");
            int group = scanner.nextInt();
            System.out.print("Enter student performance: ");
            int performance = scanner.nextInt();
            students[i] = new Student(name, group, performance);
        }
    }

    public static void printStudentsWithGoodPerformance(Student students[]) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].getSurnameAndInitials()
                    + "\nGroup: " + students[i].getGroup() + "\nPerformance: "
                    + students[i].getAcademicPerformance());
        }
    }
    public static void main(String[] args) {
        Student students[] = new Student[3];
        fillStudentsArray(students);
        printStudentsWithGoodPerformance(students);
    }
}
