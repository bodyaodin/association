package com.projects.accessories.engines;

public class PowerfulEngine implements Engine {

    private final int power;
    private boolean isRunning;

    public PowerfulEngine() {
        power = 200;
    }

    @Override
    public void start() {
        isRunning = true;
        System.out.println("Engine is running! Power is " + power + "!");
    }

    public int getPower() {
        return power;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
