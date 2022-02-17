package lesson4.Part1.Task5;

public class DecimalCounter {
    private int currentValue = 0;
    public final int MIN_VALUE;
    public final int MAX_VALUE;

    public void inc() {
        if (currentValue + 1 > MAX_VALUE)
            throw new IllegalStateException("Going beyond the maximum range");
        currentValue++;
    }

    public void dec() {
        if (currentValue - 1 < MIN_VALUE)
            throw new IllegalStateException("Going beyond the minimum range");
        currentValue--;
    }

    public DecimalCounter(int currentValue, int MIN_VALUE, int MAX_VALUE) {
        this.currentValue = currentValue;
        this.MIN_VALUE = MIN_VALUE;
        this.MAX_VALUE = MAX_VALUE;
    }

    public DecimalCounter(int currentValue) {
        MIN_VALUE = currentValue;
        MAX_VALUE = currentValue + 100;
    }

    public DecimalCounter() {
        MIN_VALUE = 0;
        MAX_VALUE = 100;
        currentValue = 0;
    }

    public int getCurrentValue() {
        return currentValue;
    }
}
