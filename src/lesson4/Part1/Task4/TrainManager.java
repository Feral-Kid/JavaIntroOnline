package lesson4.Part1.Task4;

import java.util.Arrays;
import java.util.Optional;

public class TrainManager {

    public static Optional<Train> getTrainByNumber(Train[] trains, int number) {
        return Arrays.stream(trains).filter((o) -> o.getTrainNumber() == number).findFirst();
    }

    public static void sortTrainsByNumbers(Train trains[]) {
        Arrays.sort(trains,
                (o1, o2) ->
                        o1.getTrainNumber() == o2.getTrainNumber() ?
                                o1.getDepartureTime().compareTo(o2.getDepartureTime()) :
                                Integer.compare(o1.getTrainNumber(), o2.getTrainNumber()));
    }
}
