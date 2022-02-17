package lesson4.Part2.Task3;

public class City {
    private String name;

    @Override
    public String toString() {
        return "City " + name + '\n';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City(String name) {
        this.name = name;
    }

    public City() {
        this.name = "No name";
    }
}
