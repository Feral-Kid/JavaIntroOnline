package lesson3.StringAndStringBuilder.Task8;

import java.util.Scanner;

public class Main {
    public static int maxWordLength(String str) {
        int maxWordLength = 0;
        int currentWordLength = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (maxWordLength < currentWordLength) {
                    maxWordLength = currentWordLength;
                }
                currentWordLength = 0;
            } else {
                currentWordLength++;
            }
        }
        return maxWordLength;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Max word length: " + maxWordLength(str));
    }
}
