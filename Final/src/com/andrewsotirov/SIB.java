package com.andrewsotirov;

public class SIB {

    public static final String owner;

    static {
        owner = "tim";
        System.out.println("SIB Test");
    }

    public SIB() {
        System.out.println("SIB Constructor");
    }

    static {
        System.out.println("Second init");
    }

    public void someMethod(){
        System.out.println("Some method called");
    }

}
