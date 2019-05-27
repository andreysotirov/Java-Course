package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(20, 5, true);

        printer.fillToner(50);
        printer.printingPage(12);
    }
}
