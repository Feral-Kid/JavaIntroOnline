package lesson4.Part1.Task1;

public class Test1 {
    private int num1 = 0;
    private int num2 = 0;
    public int getMaxValue() {
        return Math.max(num1, num2);
    }

    public int getSum() {
        return num1 + num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    Test1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


}
