package com.projects.drones;

import java.util.Random;

public class SpyDrone implements Drone {

    private int charge;
    private int scanRadius;
    private boolean isTarget;

    public SpyDrone() {
        charge = 100;
        scanRadius = 500;
    }

    @Override
    public void investigate() {
        flyUp();
        scanning();
        flyDown();
    }

    @Override
    public void flyUp() {
        System.out.println("Drone took off! Charge - " + charge + " percent!");
    }

    @Override
    public void scanning() {
        System.out.println("Scanning radius - " + scanRadius +  " meters. Start scanning...");

        if (new Random().nextInt(2) == 1) {
            isTarget = true;
            System.out.println("Target found!");
        } else {
            isTarget = false;
            System.out.println("Target not found!");
        }
    }

    @Override
    public void flyDown() {
        charge -= new Random().nextInt(charge);
        System.out.println("Drone turns back! Charge - " + charge + " percent!");
    }

    @Override
    public boolean isTarget() {
        return isTarget;
    }

    public int getCharge() {
        return charge;
    }

    public int getScanRadius() {
        return scanRadius;
    }

    public void setScanRadius(int scanRadius) {
        this.scanRadius = scanRadius;
    }
}
