package lesson4.Part1.Task10;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Airlines airlines = new Airlines();
        DayOfWeek[] dayOfWeeks = new DayOfWeek[3];
        dayOfWeeks[0] = DayOfWeek.MONDAY;
        dayOfWeeks[1] = DayOfWeek.THURSDAY;
        dayOfWeeks[2] = DayOfWeek.SATURDAY;
        airlines.addAirline
                (new Airline("Moscow", 210, "Type1",
                        LocalTime.of(12, 0), dayOfWeeks));
        airlines.addAirline
                (new Airline("France", 120, "Type2",
                        LocalTime.of(19, 12), new DayOfWeek[]{DayOfWeek.SATURDAY}));
        System.out.println(airlines.getFlightsForDaysOfWeek(DayOfWeek.FRIDAY));
        System.out.println(airlines.getFlightsToDestination("France"));
        System.out.println(airlines.getFlightsForDaysOfWeek(DayOfWeek.SATURDAY, LocalTime.of(13, 0)));
    }
}
