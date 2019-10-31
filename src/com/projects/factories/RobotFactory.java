package com.projects.factories;

import com.projects.accessories.cores.PlasmaEnergyCore;
import com.projects.accessories.engines.PowerfulEngine;
import com.projects.accessories.engines.WeakEngine;
import com.projects.drones.SpyDrone;
import com.projects.robots.Robot;
import com.projects.robots.RobotGuard;
import com.projects.robots.RobotSoldier;
import com.projects.robots.RobotTypes;
import com.projects.weapons.Flamethrower;
import com.projects.weapons.MachineGun;

public class RobotFactory {

    public static Robot getRobot (RobotTypes robotTypes) {
        if (robotTypes.equals(RobotTypes.SOLDIER)) {
            return new RobotSoldier(new PlasmaEnergyCore(), new PowerfulEngine(), new MachineGun(), new SpyDrone());
        } else {
            return new RobotGuard(new PlasmaEnergyCore(), new WeakEngine(), new Flamethrower());
        }
    }

}
