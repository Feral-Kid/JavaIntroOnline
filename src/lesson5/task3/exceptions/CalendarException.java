package lesson5.task3.exceptions;

public class CalendarException extends Exception {
    public CalendarException(String message) {
        super(message);
    }

    public CalendarException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalendarException(Throwable cause) {
        super(cause);
    }
}
