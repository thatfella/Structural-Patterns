package com.decorator;

public class PrinterDecorator implements Printer {
    private final Printer printer;

    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void doPrint(String str) {
        printer.doPrint(str);
    }
}
