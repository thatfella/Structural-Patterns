package com.decorator;

public class UpperCasePrinter extends PrinterDecorator {
    public UpperCasePrinter(Printer printer) {
        super(printer);
    }

    public void doPrint (String str){
        super.doPrint(str.toUpperCase());
    }
}
