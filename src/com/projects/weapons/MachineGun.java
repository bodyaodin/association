package com.projects.weapons;

import java.util.Random;

public class MachineGun implements Weapon {

    private int ammo;
    private final int damage;

    public MachineGun() {
        ammo = 200;
        damage = 150;
    }

    @Override
    public void shoot() {
        System.out.print("Shot!!! ");
        ammo -= new Random().nextInt(ammo + 1);
        System.out.println(ammo + " ammo left!");

        if (ammo <= 0) reloading();
    }

    @Override
    public void reloading() {
        System.out.println("Reloading...");
        ammo = 200;
    }

    @Override
    public String toString() {
        return "Machine gun";
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
