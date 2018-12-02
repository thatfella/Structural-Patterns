package com.decorator;

public class ReversedPrinter extends PrinterDecorator {
    public ReversedPrinter(Printer printer) {
        super(printer);
    }

    public String reverseString(String string) {
        char[] symbols = string.toCharArray();
        String reversed = new String();
        for (int i = symbols.length-1; i >= 0; i--) {
            reversed = reversed.concat(String.valueOf(symbols[i]));
        }
        return reversed;
    }

    public void doPrint(String str) {
        System.out.println("reversed " + reverseString(str));
    }
}
