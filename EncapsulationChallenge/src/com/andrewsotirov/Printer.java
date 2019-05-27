package com.andrewsotirov;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;
    private int count = 0;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        if (tonerLevel > 100) {
            tonerLevel = 100;
        }
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int tonerFill) {
        System.out.println("Current toner level is " + tonerLevel + "%");
        if (tonerLevel < 100) {
            tonerLevel += tonerFill;
            System.out.println("You filled toner with " + tonerFill + "% and toner level is " + tonerLevel + "%");
        }
    }

    public void printingPage(int count) {
        System.out.println("Current number of printed pages is " + pagesPrinted + " pages.");

        if (isDuplex) {
            pagesPrinted += count / 2;
        } else {
            pagesPrinted += count;
        }
        System.out.println("You printed " + count + " more pages and total pages print is " + pagesPrinted);
    }
}
