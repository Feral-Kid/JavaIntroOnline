package lesson5.task5.sweets;

import java.util.Objects;

public class Candy extends Sweets {
    private double weight;

    @Override
    public void add(double weightToAdd) {
        double newWight = weight + weightToAdd;
        if (newWight < 1)
            throw new IllegalArgumentException("New weight: " + newWight + " is below zero");
        this.weight = newWight;
    }

    public Candy(double sugar, String manufacture, String lollipopName, double pricePerKilo) {
        super(sugar, manufacture, lollipopName, pricePerKilo);
        this.weight = 0.1;
    }

    public double getWeight() {
        return this.weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Candy candy = (Candy) o;
        return Double.compare(candy.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    @Override
    public String getInfoAboutSweet() {
        return "Candy:\n" + super.getInfoAboutSweet() + "Weight: " + this.weight + "\n";
    }

    @Override
    public double calculatePrice() {
        return price * weight;
    }

}
