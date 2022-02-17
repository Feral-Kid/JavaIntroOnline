package lesson3.StringAndStringBuilder.Task3;

import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String str) {
        boolean isPalindrome = true;
        for (int i = 0, j = str.length() - 1; isPalindrome && (i < (str.length() / 2)) && (j > str.length() / 2); i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(isPalindrome(str));
    }
}
