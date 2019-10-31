package com.projects.robots;

import com.projects.accessories.cores.EnergyCore;
import com.projects.accessories.engines.PowerfulEngine;
import com.projects.weapons.Weapon;
import com.projects.drones.Drone;

public class RobotSoldier extends Robot {

    private RobotSoldier() {
        this (null, null);
    }

    public RobotSoldier(EnergyCore energyCore, PowerfulEngine engine) {
        this(energyCore, engine, null);
    }

    public RobotSoldier(EnergyCore energyCore, PowerfulEngine engine, Weapon weapon) {
        this(energyCore, engine, weapon, null);
    }

    public RobotSoldier(EnergyCore energyCore, PowerfulEngine engine, Weapon weapon, Drone drone) {
        super(energyCore, engine, weapon, drone);
    }

    @Override
    public void start() {
        System.out.println("Soldier activated!");
        super.start();
    }

    @Override
    protected void aiming() {
        System.out.println("Aim with a " + this.weapon.toString() + "...");
    }
}

