package com.andrewsotirov;

public class Gearbox {

    private boolean clutchIsIn;

    public void operateClutchIsIn (String inOrOut){
        clutchIsIn = inOrOut.equalsIgnoreCase("in");
    }
}
