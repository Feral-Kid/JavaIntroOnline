package lesson4.Part2.Task3;

import java.util.ArrayList;
import java.util.List;

public class District {
    private String name;
    private List<City> cities;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("District " + name + ":\n");
        for (City city : cities) {
            stringBuilder.append(city);
        }
        return stringBuilder.toString();

    }

    public boolean addCity(City city) {
        return this.cities.add(city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCities() {
        return List.copyOf(cities);
    }

    public void setCities(List<City> cities) {
        this.cities = new ArrayList<>(cities);
    }

    public District(String name, List<City> cities) {
        this.name = name;
        this.cities = new ArrayList<>(cities);
    }

    public District() {
        this.name = "No name";
        this.cities = new ArrayList<>();
    }
}
