package lesson3.StringAndStringBuilder.Task1;

import java.util.Scanner;

public class Main {
    public static int maximumSpacesCount(String str) {
        int maximumSpacesCount = 0;
        for (int i = 0; i < str.length(); i++) {
            int spacesCount = 0;
            if (str.charAt(i) == ' ') {
                for (int j = i; (j < str.length()) && (str.charAt(j) == ' '); j++) {
                    spacesCount++;
                }
                if (spacesCount > maximumSpacesCount) {
                    maximumSpacesCount = spacesCount;
                }
            }
        }
        return maximumSpacesCount;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Maximum spaces count = " + maximumSpacesCount(str));
    }
}
