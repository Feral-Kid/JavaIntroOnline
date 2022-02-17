package lesson4.Part1.Task6;

public class Time {
    static final int HOURS_PER_DAY = 24;

    static final int MINUTES_PER_HOUR = 60;

    static final int MINUTES_PER_DAY = MINUTES_PER_HOUR * HOURS_PER_DAY;

    static final int SECONDS_PER_MINUTE = 60;

    static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;

    static final int SECONDS_PER_DAY = SECONDS_PER_HOUR * HOURS_PER_DAY;

    private int currentHours = 0;

    private int currentMinutes = 0;

    private int currentSeconds = 0;

    @Override
    public String toString() {
        return "Time{" +
                "currentHours=" + currentHours +
                ", currentMinutes=" + currentMinutes +
                ", currentSeconds=" + currentSeconds +
                '}';
    }

    public Time(int currentHours, int currentMinutes, int currentSeconds) {
        this.currentHours = checkValidHoursValue(currentHours) ?  currentHours :  0;
        this.currentMinutes = checkValidMinutesValue(currentMinutes) ? currentMinutes : 0;
        this.currentSeconds = checkValidSecondsValue(currentSeconds) ? currentSeconds : 0;
    }

    public Time() {

    }

    private boolean checkValidSecondsValue(int value) {
        return (value < SECONDS_PER_MINUTE) && (value >= 0);
    }

    private boolean checkValidHoursValue(int value) {
        return (value < HOURS_PER_DAY) && (value >= 0);
    }

    private boolean checkValidMinutesValue(int value) {
        return (value < MINUTES_PER_HOUR) && (value >= 0);
    }

    public void plusHours(int hoursToAdd) {
        if (hoursToAdd != 0)
            this.currentHours = Math.abs((this.currentHours + hoursToAdd) % HOURS_PER_DAY);
    }

    public void plusMinutes(int minutesToAdd) {
        if (minutesToAdd != 0) {
            int tempMinutes = this.currentMinutes + minutesToAdd;
            if (tempMinutes > 0) {
                this.currentMinutes = tempMinutes % MINUTES_PER_HOUR;
                plusHours(tempMinutes / MINUTES_PER_HOUR);
            } else {
                this.currentMinutes = MINUTES_PER_HOUR - -tempMinutes % MINUTES_PER_HOUR;
                plusHours(tempMinutes / MINUTES_PER_HOUR - 1);
            }
        }
    }

    public void plusSeconds(int secondsToAdd) {
        if (secondsToAdd != 0) {
            int tempSeconds = (this.currentSeconds + secondsToAdd);
            if (tempSeconds > 0) {
                this.currentSeconds = tempSeconds % SECONDS_PER_MINUTE;
                plusMinutes(tempSeconds / SECONDS_PER_MINUTE);
            } else {
                this.currentSeconds = SECONDS_PER_MINUTE - -tempSeconds % SECONDS_PER_MINUTE;
                plusMinutes(tempSeconds / SECONDS_PER_MINUTE - 1);
            }
        }
    }

    public int getCurrentHours() {
        return currentHours;
    }

    public void setCurrentHours(int currentHours) {
        this.currentHours = checkValidHoursValue(currentHours) ?  currentHours :  0;
    }

    public int getCurrentMinutes() {
        return currentMinutes;
    }

    public void setCurrentMinutes(int currentMinutes) {
        this.currentMinutes = checkValidMinutesValue(currentMinutes) ? currentMinutes : 0;
    }

    public int getCurrentSeconds() {
        return currentSeconds;
    }

    public void setCurrentSeconds(int currentSeconds) {
        this.currentSeconds = checkValidSecondsValue(currentSeconds) ? currentSeconds : 0;
    }
}
