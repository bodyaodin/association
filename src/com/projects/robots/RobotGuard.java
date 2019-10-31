package com.projects.robots;

import com.projects.accessories.engines.WeakEngine;
import com.projects.weapons.Weapon;
import com.projects.accessories.cores.EnergyCore;
import com.projects.drones.Drone;

import java.util.Random;

public class RobotGuard extends Robot {

    private RobotGuard() {
        this(null, null);
    }

    public RobotGuard(EnergyCore energyCore, WeakEngine engine) {
        this(energyCore, engine, null);
    }

    public RobotGuard(EnergyCore energyCore, WeakEngine engine, Weapon weapon) {
        this(energyCore, engine, weapon, null);
    }

    public RobotGuard(EnergyCore energyCore, WeakEngine engine, Weapon weapon, Drone drone) {
        super(energyCore, engine, weapon, drone);
    }

    @Override
    public void start() {
        System.out.println("Guard activated!");
        super.start();
    }

    @Override
    public void investigate() {
        if (drone != null) {
            super.investigate();
        } else {
            territoryCheck();
        }
    }

    @Override
    protected void aiming() {
        System.out.println("Aim with a " + this.weapon.toString() + "...");
    }

    public void territoryCheck () {
        System.out.println("Checking territory for enemies...");

        if (new Random().nextInt(2) == 1) {
            target = true;
            System.out.println("Target found!");
        } else {
            target = false;
            System.out.println("Target not found!");
        }
    }
}
