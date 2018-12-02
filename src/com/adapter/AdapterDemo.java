package com.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Polar adapter = new Cartesian2PolarAdapter(new CartesianPoint());

        adapter.setPolarPoint(4.0,Math.PI/2);
        adapter.setPolarPoint(2, 1);
        adapter.setPolarPoint(100, Math.PI);
    }


}
