package Lesson3.StringAndStringBuilder.Task7;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void removeSpaces(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str.deleteCharAt(i);
                i--;
            }
        }
    }

    public static void removeDuplicateCharacters(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    str.deleteCharAt(j);
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scanner.nextLine());
        removeSpaces(str);
        removeDuplicateCharacters(str);
        System.out.println(str);
    }
}
