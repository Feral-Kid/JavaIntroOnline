package lesson4.Part1.Task8;

public class Main {
    public static void main(String[] args) {
        Customers customers = new Customers();
        customers.add(
                new Customer(1254, "Alex", "Kerchin",
                        "Olegovich", "Vitebsk...",
                        123, "2300-1444-2345"));
        customers.add(
                new Customer(3123, "Maxim", "Berkovich",
                        "Vladimirovich", "Minsk...",
                        100, "2230-1432-1525"));
        customers.add(
                new Customer(4233, "Yuri", "Voitovich",
                        "Sergeevich", "Grodno...",
                        189, "3468-4758-7487"));
        customers.add(
                new Customer(5342, "Michail", "Slobodov",
                        "Sergeevich", "Gomel...",
                        134, "5748-4789-5994"));
        System.out.println(customers.getCustomersInAlphabeticalOrder());
        System.out.println("In interval: ");
        System.out.println(customers.getCustomersWithCardNumberInInterval(150, 200));
    }
}
