package lesson5.task3.calendar;

import lesson5.task3.exceptions.CalendarException;

import java.time.LocalDate;
import java.util.*;

public class Calendar {
    private final List<Day> days;

    private class Day {
        private TypeOfDay typeOfDay;
        private LocalDate date;

        Day(LocalDate date, TypeOfDay typeOfDay) {
            Objects.requireNonNull(date);
            Objects.requireNonNull(typeOfDay);
            this.date = date;
            this.typeOfDay = typeOfDay;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Day day = (Day) o;
            return date.equals(day.date);
        }

        @Override
        public int hashCode() {
            return Objects.hash(date);
        }

        public TypeOfDay getTypeOfDay() {
            return typeOfDay;
        }

        public void setTypeOfDay(TypeOfDay typeOfDay) {
            Objects.requireNonNull(typeOfDay);
            this.typeOfDay = typeOfDay;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            Objects.requireNonNull(date);
            this.date = date;
        }
    }

    public boolean isPresent(LocalDate date) {
        try {
            contains(date);
        } catch (CalendarException e) {
            return false;
        }
        return true;
    }

    private Day contains(LocalDate date) throws CalendarException {
        Optional<Day> day = this.days.stream().filter(d -> d.getDate().equals(date)).findFirst();
        if (day.isEmpty()) {
            throw new CalendarException("Element with this date is not present");
        }
        return day.get();
    }

    public TypeOfDay getTypeOfDay(LocalDate date) throws CalendarException {
        Objects.requireNonNull(date);
        Day day = contains(date);
        return day.getTypeOfDay();
    }

    public boolean add(LocalDate date, TypeOfDay typeOfDay) {
        Objects.requireNonNull(date);
        try {
            contains(date);
        } catch (CalendarException e) {
            this.days.add(new Day(date, typeOfDay));
            return true;
        }
        return false;
    }

    public Calendar() {
        this.days = new ArrayList<>();
    }
}
