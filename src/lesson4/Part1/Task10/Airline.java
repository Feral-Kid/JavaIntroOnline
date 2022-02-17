package lesson4.Part1.Task10;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Objects;

public class Airline {
    private String destination = "";
    private int flightNumber = 0;
    private String aircraftType = "";
    private LocalTime departureTime = null;
    private DayOfWeek[] days = null;

    public Airline(String destination, int flightNumber, String aircraftType, LocalTime departureTime, DayOfWeek[] days) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.days = days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return flightNumber == airline.flightNumber && Objects.equals(destination, airline.destination) && Objects.equals(aircraftType, airline.aircraftType) && Objects.equals(departureTime, airline.departureTime) && Arrays.equals(days, airline.days);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(destination, flightNumber, aircraftType, departureTime);
        result = 31 * result + Arrays.hashCode(days);
        return result;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraftType='" + aircraftType + '\'' +
                ", departureTime=" + departureTime +
                ", days=" + Arrays.toString(days) +
                '}';
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek[] getDays() {
        return days;
    }

    public void setDays(DayOfWeek[] days) {
        this.days = days;
    }
}
