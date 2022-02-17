package lesson5.task5.sweets;

import java.util.Objects;

public abstract class Sweets implements SweetsManager {
    private String sweetName;
    private double sugar;
    protected double price;
    private String manufacturerName;

    public String getSweetName() {
        return sweetName;
    }

    public void setSweetName(String sweetName) {
        this.sweetName = sweetName;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweets sweets = (Sweets) o;
        return Double.compare(sweets.sugar, sugar) == 0 &&
                Double.compare(sweets.price, price) == 0 &&
                sweetName.equalsIgnoreCase(sweets.sweetName) &&
                manufacturerName.equalsIgnoreCase(sweets.manufacturerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sweetName, sugar, price, manufacturerName);
    }

    private boolean isSweetPriceValid(double price) {
        return price > 0;
    }

    private boolean isSweetNameValid(String sweetName) {
        return !sweetName.isBlank();
    }

    private boolean isSugarValueValid(double sugar) {
        return sugar > 0;
    }
    private boolean isManufacturerNameValueValid(String manufacturerName) {
        return !manufacturerName.isBlank();
    }

    @Override
    public String getInfoAboutSweet() {
        return "Sugar: " + this.sugar + "\n" +
                "Manufacturer Name: " + this.manufacturerName + "\n" +
                "Sweet Name: " + this.sweetName + "\n";
    }

    Sweets(double sugar, String manufacturerName, String sweetName, double price) {
        if (!isSugarValueValid(sugar)) {
            throw new IllegalArgumentException("Sugar: " + sugar + " is not valid input");
        }
        this.sugar = sugar;
        if (!isManufacturerNameValueValid(manufacturerName)) {
            throw new IllegalArgumentException("Manufacturer Name: " + manufacturerName + " is not valid input");
        }
        this.manufacturerName = manufacturerName;
        if (!isSweetNameValid(sweetName)) {
            throw new IllegalArgumentException("Sweet Name: " + sweetName + " is not valid input");
        }
        this.sweetName = sweetName;
        if (!isSweetPriceValid(price)) {
            throw new IllegalArgumentException("Sweet price: " + sweetName + "is not valid input");
        }
        this.price = price;
    }
}
