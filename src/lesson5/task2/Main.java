package lesson5.task2;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addProduct("Milk", 5);
        payment.addProduct("Chocolate", 10, 2);
        payment.addProduct("Beer", 15, 3);
        System.out.println(payment);
        payment.removeProduct("Milk");
        System.out.println(payment);
    }
}
