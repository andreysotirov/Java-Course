package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(50, true);
        System.out.println("Initial pages printed " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was" + pagesPrinted + " new total print count is " + printer.getPagesPrinted());
    }
}
