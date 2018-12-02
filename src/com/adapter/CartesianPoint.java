package com.adapter;

public class CartesianPoint implements Cartesian {
    @Override
    public void setPoint(double x, double y) {
        System.out.println("coords" + x + " , " +y);
    }
}
