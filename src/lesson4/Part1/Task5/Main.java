package lesson4.Part1.Task5;

public class Main {
    public static void main(String[] args) {
        DecimalCounter decimalCounter = new DecimalCounter(0);
        for (int i = decimalCounter.getCurrentValue(); i < decimalCounter.MAX_VALUE; i++) {
            System.out.println(decimalCounter.getCurrentValue());
            decimalCounter.inc();
        }
        for (int i = decimalCounter.getCurrentValue(); i >= decimalCounter.MIN_VALUE; i--) {
            System.out.println(decimalCounter.getCurrentValue());
            decimalCounter.dec();
        }
    }
}
