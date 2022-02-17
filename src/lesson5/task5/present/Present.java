package lesson5.task5.present;

import lesson5.task5.presentPackage.Package;
import lesson5.task5.sweets.SweetsManager;

import java.util.ArrayList;
import java.util.List;

public class Present {
    private List<SweetsManager> sweets;
    Package giftPackage;

    public double getPrice() {
        return this.sweets.stream().mapToDouble(SweetsManager::calculatePrice).sum();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Present:\n"+ giftPackage + "\n" + "Sweets:\n");
        for (SweetsManager sweetsManager: sweets) {
            stringBuilder.append(sweetsManager.getInfoAboutSweet());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public Present(List<SweetsManager> sweets, Package giftPackage) {
        this.sweets = new ArrayList<>(sweets);
        this.giftPackage = giftPackage;
    }

    public boolean addSweet(SweetsManager sweet) {
        return this.sweets.add(sweet);
    }

    public Present() {
        this.sweets = new ArrayList<>();
    }

    public List<SweetsManager> getSweets() {
        return List.copyOf(sweets);
    }

    public void setSweets(List<SweetsManager> sweets) {
        this.sweets = new ArrayList<>(sweets);
    }

    public Package getGiftPackage() {
        return giftPackage;
    }

    public void setGiftPackage(Package giftPackage) {
        this.giftPackage = giftPackage;
    }
}
