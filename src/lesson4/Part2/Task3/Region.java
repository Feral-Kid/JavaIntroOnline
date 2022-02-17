package lesson4.Part2.Task3;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private String name;
    private City regionalCenter;
    private List<District> districts;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Region " + name + ":\n" +
                "Regional Center " + regionalCenter);
        for (District district: districts) {
            stringBuilder.append(district);
        }
        return stringBuilder.toString();
    }

    public boolean addDistrict(District district) {
        return this.districts.add(district);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(City regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public List<District> getDistricts() {
        return List.copyOf(districts);
    }

    public void setDistricts(List<District> districts) {
        this.districts = new ArrayList<>(districts);
    }

    public Region(String name, City regionalCenter, List<District> districts) {
        this.name = name;
        this.regionalCenter = regionalCenter;
        this.districts = districts;
    }

    public Region() {
        this.name = "No name";
        this.regionalCenter = new City();
        this.districts = new ArrayList<>();
    }
}

