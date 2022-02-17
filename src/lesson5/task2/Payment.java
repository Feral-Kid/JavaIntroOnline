package lesson5.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Payment {
    private List<Product> productList = new ArrayList<>();

    private class Product {
        private String name;
        private int price = 1;
        private int count = 1;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public Product(String name, int price, int count) {
            this.name = name;
            this.price = price;
            this.count = count;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", count=" + count +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return price == product.price && name.equals(product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, price);
        }
    }

    @Override
    public String toString() {
        return "Payment{" +
                "productList=" + productList +
                '}';
    }

    private void add(Product product) {
        Optional<Product> productOptional = this.productList.stream().filter(o -> o.equals(product)).findAny();
        if (productOptional.isPresent()) {
            productOptional.get().count++;
        } else {
            this.productList.add(product);
        }
    }

    public void addProduct(String name, int price) {
        Objects.requireNonNull(name);
        if (price <= 0) {
            throw new PaymentException("Item cost cannot be zero or a negative number, price: " + price);
        }
        Product product = new Product(name , price);
        add(product);
    }

    public void addProduct(String name, int price, int count) {
        Objects.requireNonNull(name);
        if (price <= 0) {
            throw new PaymentException("Item cost cannot be less than 1, price: " + price);
        }
        if (count <= 0) {
            throw new PaymentException("Item count cannot be less than 1 or greater than 100, count: " + count);
        }
        Product product = new Product(name, price, count);
        add(product);
    }

    public void removeProduct(String name) {
        Optional<Product> productOptional = this.productList.stream()
                .filter(o -> o.name.equals(name)).findAny();
        if (productOptional.isPresent()) {
            this.productList.remove(productOptional.get());
        } else {
            throw new PaymentException("Product with this name: " + name + " is not present");
        }
    }
}
