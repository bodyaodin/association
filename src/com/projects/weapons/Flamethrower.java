package com.projects.weapons;

import java.util.Random;

public class Flamethrower implements Weapon{

    private int ammo;
    private final int damage;

    public Flamethrower() {
        ammo = 50;
        damage = 300;
    }

    @Override
    public void shoot() {
        System.out.print("Burn!!! ");
        ammo -= new Random().nextInt(ammo + 1);
        System.out.println(ammo + " liters of gas left!");

        if (ammo <= 0) reloading();
    }

    @Override
    public void reloading() {
        System.out.println("Reloading...");
        ammo = 50;
    }

    @Override
    public String toString() {
        return "Flame thrower";
    }

    public int getAmmo() {
        return ammo;
    }

    public int getDamage() {
        return damage;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }
}
