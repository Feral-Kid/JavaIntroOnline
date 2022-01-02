package Lesson3.StringAndStringBuilder.Task6;

import java.util.Scanner;

public class Main {
    public static StringBuilder getDoubledString(String str) {
        StringBuilder newStr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            newStr.append(str.charAt(i));
            newStr.append(str.charAt(i));
        }
        return newStr;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder newStr = getDoubledString(str);
        System.out.println(newStr);
    }
}
