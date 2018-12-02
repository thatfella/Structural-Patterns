package com.composite;

public class Troop implements Unit {
    @Override
    public void move() {
        System.out.println("Troop is moving");
    }

    @Override
    public void attack() {
        System.out.println("Troop is attacking");
    }
}
