package lesson3.StringAndStringBuilder.Task5;

import java.util.Scanner;

public class Main {
    public static int getLetterRepetitionsAmount(String str, char Letter) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Letter) {
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Amount of \"A\" repetitions: " + getLetterRepetitionsAmount(str, 'a'));
    }
}
