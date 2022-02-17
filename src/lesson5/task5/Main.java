package lesson5.task5;

import lesson5.task5.factories.CandyFactory;
import lesson5.task5.factories.LollipopFactory;
import lesson5.task5.factories.SweetsFactory;
import lesson5.task5.presentPackage.Package;
import lesson5.task5.presentPackage.PackageColor;
import lesson5.task5.presentPackage.PackageType;
import lesson5.task5.present.Present;
import lesson5.task5.sweets.SweetsManager;

// Задание 5 - Реализовать приложение, позволяющее создавать подарки
// (объект, представляющий собой подарок).
// Составляющими целого подарка являются сладости и упаковка.
public class Main {
    public static void main(String[] args) {
        SweetsFactory sweetsFactory = new LollipopFactory();
        Present present = new Present();
        present.setGiftPackage(new Package(PackageType.BOX, 100.0, PackageColor.RED));
        present.addSweet(sweetsFactory
                .getInstance(100, "Konti", "Sweet Konti", 10));
        present.addSweet(sweetsFactory
                .getInstance(50, "Spartak", "Spartak", 5));
        sweetsFactory = new CandyFactory();
        present.addSweet(sweetsFactory.
                getInstance(100, "Kommunarka", "Stolichnie", 500));
        SweetsManager sweet = sweetsFactory
                .getInstance(100, "Kommunarka", "Yuznaya Noch'", 500);
        sweet.add(5);
        present.addSweet(sweet);
        System.out.println(present);
        System.out.println("Price: " + present.getPrice());
    }
}
