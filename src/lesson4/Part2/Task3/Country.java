package lesson4.Part2.Task3;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;
    private City capital;
    private List<Region> regions;
    private double square;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Country " + name + ":\n" +
                "capital " + capital +
                "square " + square + "\n");
        for (Region region: regions) {
            stringBuilder.append(region);
        }
        return stringBuilder.toString();
    }

    public List<City> getAllRegionalCenters() {
        List<City> regionalCenters = new ArrayList<>();
        this.regions.stream().forEach( region -> regionalCenters.add(region.getRegionalCenter()));
        return regionalCenters;
    }

    public boolean addRegion(Region region) {
        return this.regions.add(region);
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public List<Region> getRegions() {
        return List.copyOf(regions);
    }

    public void setRegions(List<Region> regions) {
        this.regions = new ArrayList<>(regions);
    }

    public Country() {
        this.name = "No name";
        this.capital = new City();
        this.regions = new ArrayList<>();
    }

    public Country(String name, City capital, double square, List<Region> regions) {
        this.name = name;
        this.square = square;
        this.capital = capital;
        this.regions = new ArrayList<>(regions);
    }
}
