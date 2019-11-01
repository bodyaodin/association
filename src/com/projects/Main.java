package com.projects;

import com.projects.factories.ArmyFactory;
import com.projects.robots.*;

import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int armySize = 10;
        List<Robot> army = ArmyFactory.getArmy(armySize);

        Robot robot = army.get(new Random().nextInt(armySize));

        robot.start();
        robot.investigate();
        robot.action();
    }
}
