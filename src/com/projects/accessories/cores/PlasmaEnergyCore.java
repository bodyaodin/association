package com.projects.accessories.cores;

public class PlasmaEnergyCore implements EnergyCore {

    private int energy;
    private boolean isEnable;

    public PlasmaEnergyCore() {
        energy = 100;
    }

    @Override
    public void enable() {
        isEnable = true;
        System.out.println("Plasma core enabled! Charge - " + energy + " percent!");
    }

    public int getEnergy() {
        return energy;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }
}
