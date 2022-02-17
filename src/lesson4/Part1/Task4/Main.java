package lesson4.Part1.Task4;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Train[] trains = new Train[5];
        trains[0] = new Train("Moscow", 1, LocalTime.of(13, 0));
        trains[1] = new Train("London", 2, LocalTime.of(15, 30));
        trains[2] = new Train("Minsk", 2, LocalTime.of(12, 0));
        trains[3] = new Train("Moscow", 5, LocalTime.of(11, 15));
        trains[4] = new Train("Minsk", 3, LocalTime.of(13, 45));
        TrainManager.sortTrainsByNumbers(trains);
        System.out.println(Arrays.toString(trains));
        System.out.println("Enter train number to search: ");
        Scanner scanner = new Scanner(System.in);
        Optional<Train> train = TrainManager.getTrainByNumber(trains, scanner.nextInt());
        if (train.isPresent()) {
            System.out.println(train.get());
        } else {
            System.out.println("Train with this number is not present");
        }
        scanner.close();
    }
}
