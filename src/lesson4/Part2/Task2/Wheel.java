package lesson4.Part2.Task2;

import lesson4.Part2.Task2.Exception.WheelException;

public class Wheel {
    private int wheelSpeed = 0;
    private boolean isBroken = false;
    private boolean isSpinning = false;
    private int lifeTimeInDays = 100;
    public void startSpinning() throws WheelException {
        if (isBroken) throw new WheelException("Wheel is broken");
    }

    public void stopSpinning() throws WheelException {
        if (!isSpinning) throw new WheelException("Wheel doesn't rotate");
    }

    public int getWheelSpeed() {
        return wheelSpeed;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public boolean isSpinning() {
        return isSpinning;
    }

    public int getLifeTimeInDays() {
        return lifeTimeInDays;
    }

}
