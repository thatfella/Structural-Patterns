package com.composite;

import java.util.ArrayList;

public class UnitComposite implements Unit{



    private final ArrayList<Unit> units = new ArrayList<>();

    public void addUnit (Unit unit){
        units.add(unit);
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    @Override
    public void move() {
        units.forEach(Unit::move);
    }

    @Override
    public void attack() {
        units.forEach(Unit::attack);
    }
}
