package lesson5.task5.factories;

import lesson5.task5.sweets.SweetsManager;

public interface SweetsFactory {
    SweetsManager getInstance(double sugar, String manufacturerName, String sweetName, double price);
}
