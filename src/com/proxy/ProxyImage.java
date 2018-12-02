package com.proxy;


public class ProxyImage implements Image {
    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    private RealImage realImage;
    private String fileName;
    @Override
    public void display() {
        if(realImage == null) {
         realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
