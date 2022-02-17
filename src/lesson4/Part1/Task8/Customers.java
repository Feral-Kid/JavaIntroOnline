package lesson4.Part1.Task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Customers {
    private List<Customer> customerList = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Customer customer: customerList) {
            str.append(customer.toString());
            str.append("////////////////////////////////\n");
        }
        return str.toString();
    }

    public Customers getCustomersInAlphabeticalOrder() {
        return new Customers(customerList.stream().
                sorted(Comparator.comparing(Customer::getSurName)).collect(Collectors.toList()));
    }

    public Customers getCustomersWithCardNumberInInterval(int min, int max) {
        return new Customers(customerList.stream().
                filter(customer -> customer.getCreditCardNumber() >= min
                        && customer.getCreditCardNumber() <= max)
                .collect(Collectors.toList()));
    }

    public void add(Customer customerToAdd) {
        this.customerList.add(customerToAdd);
    }

    Customers(List<Customer> customerList) {
        this.customerList = new ArrayList<>(customerList);
    }

    Customers() {

    }
}
