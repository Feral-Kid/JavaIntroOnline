package Lesson4.Part1.Task10;

import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Airlines {
    private List<Airline> airlineList = new ArrayList<>();
    public Airlines getFlightsToDestination(String destination) {
        return new Airlines(this.airlineList.stream().filter(o -> destination
                        .contentEquals(o.getDestination()))
                        .collect(Collectors.toList()));
    }

    @Override
    public String toString() {
        return "Airlines{" +
                "airlineList=" + airlineList +
                '}';
    }

    public Airlines getFlightsForDaysOfWeek(DayOfWeek day) {
        return new Airlines(this.airlineList.stream().filter(o -> {
                    for (DayOfWeek dayOfWeek: o.getDays()) {
                        if (day == dayOfWeek)
                            return true;
                    }
                    return false;
                    })
                    .collect(Collectors.toList()));
    }

    public Airlines getFlightsForDaysOfWeek(DayOfWeek day, LocalTime startTimeToSearch) {
        return new Airlines(this.airlineList.stream().filter(o -> {
                    for (DayOfWeek dayOfWeek: o.getDays()) {
                        if ((day == dayOfWeek) && o.getDepartureTime().isAfter(startTimeToSearch))
                            return true;
                    }
                    return false;
                })
                .collect(Collectors.toList()));
    }

    public Airline get(int index) {
        return this.airlineList.get(index);
    }

    public List<Airline> getAirlinesAsList() {
        return new ArrayList<>(this.airlineList);
    }
    public void addAirline(Airline newArline) {
        this.airlineList.add(newArline);
    }

    public void removeAirline(Airline airline) {
        this.airlineList.remove(airline);
    }

    Airlines(List<Airline> airlines) {
        this.airlineList = new ArrayList<Airline>(airlines);
    }
    Airlines() {

    }
}
