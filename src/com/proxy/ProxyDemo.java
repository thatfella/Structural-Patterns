package com.proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test");

        image.display();
        System.out.println("");

        image.display();
    }
}
