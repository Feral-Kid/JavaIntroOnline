package lesson3.StringAndStringBuilder.Task4;

public class Main {
    public static String makeNewWord(String str) {
        String newStr = str.charAt(7) + str.substring(3, 5) + str.charAt(7);
        return newStr;
    }
    public static void main(String[] args) {
        String str = "информатика";
        System.out.println(makeNewWord(str));
    }
}
