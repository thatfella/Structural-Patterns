package com.adapter;

public class Cartesian2PolarAdapter implements Polar {

    //wrapping the "old" class of Cartesian interface
    private final Cartesian cartesian;

    public Cartesian2PolarAdapter(Cartesian cartesian) {
        this.cartesian = cartesian;
    }

    //this method belongs to "new" Polar interface
    @Override
    public void setPolarPoint(double r, double theta) {
        cartesian.setPoint(r * Math.cos(theta), r * Math.sin(theta));
    }
}
