package lesson5.task5.factories;

import lesson5.task5.sweets.Lollipop;
import lesson5.task5.sweets.SweetsManager;

public class LollipopFactory implements SweetsFactory {
    @Override
    public SweetsManager getInstance(double sugar, String manufacturerName, String sweetName, double unitPrice) {
        return new Lollipop(sugar, manufacturerName, sweetName, unitPrice);
    }
}
