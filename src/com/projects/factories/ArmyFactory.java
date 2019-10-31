package com.projects.factories;

import com.projects.robots.Robot;
import com.projects.robots.RobotTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArmyFactory {

    public static List<Robot> getArmy (int armySize) {
        List<Robot> army = new ArrayList<>();

        for (int i = 0; i < armySize; i++) {
            army.add(
                    (new Random().nextInt(2) == 1 ?
                            RobotFactory.getRobot(RobotTypes.SOLDIER) :
                            RobotFactory.getRobot(RobotTypes.GUARD))
            );
        }

        return army;
    }

}
