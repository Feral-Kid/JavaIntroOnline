package lesson4.Part2.Task2;

import lesson4.Part2.Task2.Exception.EngineException;

public class Engine {
    private boolean isEngineRunning = false;

    public boolean isEngineRunning() {
        return isEngineRunning;
    }

    public void startEngine() throws EngineException {
        if (isEngineRunning)
            throw new EngineException("Engine is running");
        isEngineRunning = true;
    }

    public void stopEngine() throws EngineException {
        if (!isEngineRunning)
            throw new EngineException("Engine isn't running");
        isEngineRunning = false;
    }

}
