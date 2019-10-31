package com.projects.accessories.engines;

public class WeakEngine implements Engine {


    private final int power;
    private boolean isRunning;

    public WeakEngine() {
        power = 100;
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
