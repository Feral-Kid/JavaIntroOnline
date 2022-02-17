package lesson4.Part2.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Region> regions = new ArrayList<>();
        List<District> districts = new ArrayList<>();
        List<City> cities = new ArrayList<>();
        cities.add(new City("Gancevichi"));
        cities.add(new City("Guta"));
        districts.add(new District("District1", cities));
        City capital = new City("Minsk");
        regions.add(new Region("Minsk", capital, districts));
        regions.add(new Region("Gomel", new City("Gomel"), new ArrayList<>()));
        Country country = new Country("Belarus", capital, 207_600.0, regions);
        System.out.println(country);
        System.out.println("Regional centers:");
        country.getAllRegionalCenters().forEach(System.out::print);
        System.out.println("Square: " + country.getSquare());
        System.out.println("Regional centers count: " + country.getAllRegionalCenters().size());
    }
}
