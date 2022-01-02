package Lesson3.StringAndStringBuilder.Task2;

import java.util.Scanner;

// В строке вставить после каждого символа 'a' символ 'b'
public class Main {
    public static void addSymbolAfterA(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                str.insert(i + 1, 'b');
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scanner.nextLine());
        addSymbolAfterA(str);
        System.out.println(str);
    }

}
