package lesson4.Part2.Task2.Exception;

public class WheelException extends Exception {

    public WheelException(String message) {
        super(message);
    }

    public WheelException(String message, Throwable cause) {
        super(message, cause);
    }

    public WheelException(Throwable cause) {
        super(cause);
    }
}
