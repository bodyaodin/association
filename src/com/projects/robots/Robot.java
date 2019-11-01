package com.projects.robots;

import com.projects.interfaces.Scannable;
import com.projects.accessories.cores.EnergyCore;
import com.projects.accessories.engines.Engine;
import com.projects.drones.Drone;
import com.projects.weapons.Weapon;

public abstract class Robot implements Mechanism, Scannable {

    protected EnergyCore energyCore;
    protected Engine engine;
    protected Weapon weapon;
    protected Drone drone;

    protected boolean target;

    public Robot(EnergyCore energyCore, Engine engine, Weapon weapon, Drone drone) {
        this.energyCore = energyCore;
        this.engine = engine;
        this.weapon = weapon;
        this.drone = drone;
    }

    @Override
    public void start() {
        energyCore.enable();
        engine.start();
    }

    @Override
    public void investigate() {
        if (drone != null) {
            drone.investigate();
            target = drone.isTarget();
        } else {
            System.out.println("Drone have not found!");
        }
    }

    @Override
    public void action() {
        if (weapon != null) {
            if (target) {
                aiming();
                weapon.shoot();
            }
        } else {
            System.out.println("Weapon have not found!");
        }
    }

    protected void aiming() {
        System.out.println("Aiming...");
    }

    public EnergyCore getEnergyCore() {
        return energyCore;
    }

    public Engine getEngine() {
        return engine;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Drone getDrone() {
        return drone;
    }

    public void setDrone(Drone drone) {
        this.drone = drone;
    }
}
