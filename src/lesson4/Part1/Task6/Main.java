package lesson4.Part1.Task6;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(14, 43, 12);
        System.out.println(time);
        time.plusHours(20);
        System.out.println(time);
        time.plusMinutes(-50);
        System.out.println(time);
        time.plusSeconds(6001);
        System.out.println(time);
    }
}
