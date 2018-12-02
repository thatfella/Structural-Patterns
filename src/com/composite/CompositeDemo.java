package com.composite;

public class CompositeDemo {

    public static void main(String[] args) {

        UnitComposite composite = new UnitComposite();
        Unit troop1 = new Troop();
        Unit troop2 = new Troop();
        Unit horseman = new Horseman();
        composite.addUnit(troop1);
        composite.addUnit(troop2);
        composite.addUnit(horseman);

        composite.move();
        composite.attack();



    }
}
