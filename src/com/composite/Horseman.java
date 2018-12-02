package com.composite;

public class Horseman implements Unit {

    @Override
    public void move() {
        System.out.println("Horseman is moving");

    }

    @Override
    public void attack() {
        System.out.println("Horseman is attacking");
    }
}
