package lesson5.task5.factories;

import lesson5.task5.sweets.Candy;
import lesson5.task5.sweets.SweetsManager;

public class CandyFactory implements SweetsFactory {
    @Override
    public SweetsManager getInstance(double sugar, String manufacturerName, String sweetName, double pricePerKilo) {
        return new Candy(sugar, manufacturerName, sweetName, pricePerKilo);
    }
}
