package Lesson5.Task2;

import Lesson5.Task2.Calendar.Calendar;
import Lesson5.Task2.Calendar.TypeOfDay;
import Lesson5.Task2.Exceptions.CalendarException;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        calendar.add(LocalDate.of(2022, Month.APRIL, 2), TypeOfDay.HOLIDAY);
        calendar.add(LocalDate.of(2022, Month.FEBRUARY, 22), TypeOfDay.WEEKEND);
        calendar.add(LocalDate.of(2022, Month.JANUARY, 7), TypeOfDay.HOLIDAY);
        calendar.add(LocalDate.of(2022, Month.FEBRUARY, 5), TypeOfDay.WEEKEND);
        calendar.add(LocalDate.of(2022, Month.JULY, 23), TypeOfDay.HOLIDAY);
        calendar.add(LocalDate.of(2022, Month.JUNE, 11), TypeOfDay.WEEKEND);
        calendar.add(LocalDate.of(2022, Month.APRIL, 9), TypeOfDay.HOLIDAY);
        calendar.add(LocalDate.of(2022, Month.FEBRUARY, 18), TypeOfDay.WEEKEND);
        if (calendar.isPresent(LocalDate.of(2021, Month.APRIL, 2))) {
            try {
                System.out.println(calendar.getTypeOfDay(LocalDate.of(2022, Month.APRIL, 2)));
            } catch (CalendarException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Day with this date: " +
                    LocalDate.of(2022, Month.APRIL, 2) + " is not present");
        }
    }
}
