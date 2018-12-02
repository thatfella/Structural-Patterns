package com.decorator;

public class PrinterImpl implements Printer {
    @Override
    public void doPrint(String str) {
        System.out.println(str);
    }
}
