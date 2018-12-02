package com.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Printer printer = new UpperCasePrinter(new ReversedPrinter(new PrinterImpl()));
        printer.doPrint("Printer");
        Printer revPrinter = new ReversedPrinter(new UpperCasePrinter(new PrinterImpl()));
        revPrinter.doPrint("Reverse");
    }
}
